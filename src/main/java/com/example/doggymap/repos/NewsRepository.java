package com.example.doggymap.repos;

import com.example.doggymap.models.News;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NewsRepository extends JpaRepository<News,Long> {
    News findByName(String name);
}
