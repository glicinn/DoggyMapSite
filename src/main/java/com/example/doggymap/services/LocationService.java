package com.example.doggymap.services;

import com.example.doggymap.models.Location;
import com.example.doggymap.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location findById(Long id) {
        return locationRepository.findById(id).orElse(null);
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    public void deleteById(Long id) {
        locationRepository.deleteById(id);
    }
}
