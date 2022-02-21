package com.yash.microserviceratemovies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="rate_movie_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "username")
    private String username;
    @Column(name = "movie_name")
    private String moviename;
    @Column(name = "rating")
    private int rating;
    @Column(name = "remarks")
    private String remarks;

}
