package com.example.travel.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "guides")
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String firstname;
    @Column(nullable = false, length = 50)
    private String lastname;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 50)
    private String phone;

    @Column(length = 250)
    private String bio;

    @OneToMany(mappedBy = "guide")
    private List<Tour> tours;

    /**
    @OneToMany(mappedBy = "guide")
    private List<Review> reviews;
**/



}