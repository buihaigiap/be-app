package com.example.sis.service;

import com.example.sis.model.Place;
import com.example.sis.repository.PlaceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}
