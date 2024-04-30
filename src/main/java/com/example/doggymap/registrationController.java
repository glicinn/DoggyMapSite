package com.example.doggymap;

import com.example.doggymap.models.User;
import com.example.doggymap.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.SecureRandom;
import java.util.Base64;

@Controller
public class registrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    private String RegView() {
        return "regis";
    }

    @PostMapping("/registration")
    private String Reg(User user, Model model) {
        User user_from_db = userRepository.findByEmail(user.getEmail());
        if (user_from_db != null) {
            model.addAttribute("message", "Пользователь с таким логином уже существует");
            return "regis";
        }

        // Генерация случайной соли
        byte[] saltBytes = generateSalt();
        String salt = Base64.getEncoder().encodeToString(saltBytes);

        // Добавление соли к паролю и его шифрование
        String saltedPassword = salt + user.getPassword();
        String hashedPassword = new BCryptPasswordEncoder().encode(saltedPassword);

        // Сохранение зашифрованного пароля и соли в БД
        user.setPassword(hashedPassword);
        user.setSalt(salt);

        user.setRole("user");
        userRepository.save(user);
        return "redirect:/login";
    }

    // Метод для генерации случайной соли
    private byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}