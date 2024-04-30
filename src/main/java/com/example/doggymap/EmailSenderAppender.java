package com.example.doggymap;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class EmailSenderAppender extends AppenderBase<ILoggingEvent> {

    public JavaMailSenderImpl javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("dimaderen1@gmail.com");
        mailSender.setPassword("apvl bavu epky wpue");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        return mailSender;
    }

    @Override
    protected void append(ILoggingEvent eventObject) {
        if (eventObject.getLevel() == Level.ERROR) {
            try {
                JavaMailSender javaMailSender = javaMailSender();
                MimeMessage message = javaMailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message, true);

                helper.setTo("dimaderen1@gmail.com");
                helper.setSubject("Критическая ошибка");
                helper.setText(eventObject.getFormattedMessage());
                javaMailSender.send(message);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }

    }
}