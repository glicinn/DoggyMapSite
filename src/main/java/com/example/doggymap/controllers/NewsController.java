package com.example.doggymap.controllers;

import com.example.doggymap.models.News;
import com.example.doggymap.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }


    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("news-list")
    public String findAll(Model model) {
        List<News> news = newsService.findAll();
        model.addAttribute("news", news);
        return "news-list";
    }

    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("NewsPage")
    public String findAllForPage(Model model) {
        List<News> news = newsService.findAll();
        model.addAttribute("news", news);
        return "site/NewsPage";
    }


    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/create")
    public String createNewsForm(News news) {
        return "news-create";
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping("/create")
    public String createNews(News news) {
        newsService.saveNews(news);
        return "redirect:/news";
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/update/{id}")
    public String updateNewsForm(@PathVariable Long id, Model model) {
        News news = newsService.findById(id);
        model.addAttribute("news", news);
        return "news-update";
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @PostMapping("/update")
    public String updateNews(News news) {
        newsService.saveNews(news);
        return "redirect:/news";
    }
    @PreAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/delete/{id}")
    public String deleteNews(@PathVariable Long id) {
        newsService.deleteById(id);
        return "redirect:/news";
    }
}
