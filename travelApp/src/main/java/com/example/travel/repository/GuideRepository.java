package com.example.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.travel.model.Guide;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Long> {

    List<Guide> findByFirstname(String firstname);

    List<Guide> findByLastname(String lastname);

    List<Guide> findByEmail(String email);

    List<Guide> findByFirstnameAndLastname(String firstname, String lastname);

    @Query("SELECT g FROM Guide g JOIN FETCH g.tours t GROUP BY g.id ORDER BY COUNT(t) DESC")
    List<Guide> findAllByOrderByTourCount();
}
