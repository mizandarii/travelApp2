package com.example.travel.repository;

import com.example.travel.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travel.model.Place;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

    List<Place> findByName(String name);

    List<Place> findByType(Type type);

    List<Place> findAllByType(Type type);

    void deleteByName(String name);


}
