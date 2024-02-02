package com.example.travel.repository;

import com.example.travel.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travel.model.Review;
import com.example.travel.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByUser(User user);

    List<Review> findByTour(Tour Tour);

    void deleteByUser(User user);

    void deleteByTour(Tour tour);

}
