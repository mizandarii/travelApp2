package com.example.travel.model;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(length = 250)
    private String bio;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @ManyToMany(mappedBy = "users")
    private List<Tour> tours;
}