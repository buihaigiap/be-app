package com.example.sis.controller;

import com.example.sis.model.Place;
import com.example.sis.service.PlaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/places")
@CrossOrigin("*") // Cho phép gọi API từ Flutter
public class PlaceController {
    private final PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/getAllPlace")
    public List<Place> getAllPlace() {
        return placeService.getAllPlaces();
    }
}
