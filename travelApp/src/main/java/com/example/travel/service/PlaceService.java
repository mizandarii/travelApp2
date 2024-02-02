package com.example.travel.service;

import com.example.travel.model.Guide;
import com.example.travel.model.Place;
import com.example.travel.model.User;
import com.example.travel.repository.PlaceRepository;
import com.example.travel.repository.TourRepository;
import com.example.travel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    @Autowired
    private PlaceRepository placeRepository;

    public List<Place> getAllPlaces(){
        return placeRepository.findAll();
    }

    public Guide geGuideById(long id){
        return guideRepository.findById(id).orElse(null);
    }

    public Guide createGuide(Guide guide){
        return guideRepository.save(guide);
    }

    public void deleteGuide (Long guideId){
        guideRepository.deleteById(guideId);
    }


}
