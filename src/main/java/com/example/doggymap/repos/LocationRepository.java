package com.example.doggymap.repos;

import com.example.doggymap.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location,Long> {
    Location findByName(String name);
}
