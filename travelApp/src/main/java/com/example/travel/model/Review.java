package com.example.travel.model;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    @Column (nullable = false)
    private int tourRating;

    @Column(length = 500)
    private String tourComment;


    /**
    //change to many2many
    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @Column (nullable = false)
    private int placeRating;

    @Column(length = 500)
    private String placeComment;




    @ManyToOne
    @JoinColumn(name = "guide_id")
    private Guide guide;

    @Column (nullable = false)
    private int guideRating;

    @Column(length = 500)
    private String guideComment;
    **/
}