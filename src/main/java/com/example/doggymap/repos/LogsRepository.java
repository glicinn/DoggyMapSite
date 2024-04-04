package com.example.doggymap.repos;

import com.example.doggymap.models.Logs;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LogsRepository extends JpaRepository<Logs,Long> {
//    Logs findByID(Long id);
}
