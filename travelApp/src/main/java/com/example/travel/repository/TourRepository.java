package com.example.travel.repository;

import com.example.travel.model.Guide;
import com.example.travel.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travel.model.Tour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
    List<Tour> findByPlace(Place place);

    List <Tour> findByGuide(Guide guide);

    //List<Tour> findAllByOrderByUsers();

    @Query("SELECT t FROM Tour t JOIN t.users u GROUP BY t.id ORDER BY COUNT(u) DESC")
    List<Tour> findAllOrderByUserCount();
}
