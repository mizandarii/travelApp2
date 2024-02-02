package com.example.travel.repository;

import com.example.travel.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travel.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsernameIgnoreCase(String username);

    void deleteByUsernameIgnoreCase(String username);

    List<User> findByTour(Tour tour);

    @Query("SELECT u FROM User u JOIN FETCH u.tours t GROUP BY u.id ORDER BY COUNT(t) DESC")
    List<User> findAllOrderByTourCount();
}
