package com.yash.microserviceratemovies.controller;

import com.yash.microserviceratemovies.model.MovieModel;
import com.yash.microserviceratemovies.model.UserModel;
import com.yash.microserviceratemovies.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@RestController
@RequestMapping("api/v1/rate")
public class RateMovieController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RatingService ratingService;

    @GetMapping("rate-movie")
    public ResponseEntity rateMovies(@RequestParam("userId")String userId, @RequestParam("movieId") String movieId) {
        try {
            UserModel[] userModel = restTemplate.getForObject(new URI("http://user-registration-service/api/v1/user/get-user/"+userId), UserModel[].class);
            MovieModel[] movieModel = restTemplate.getForObject(new URI("http://add-movie-service/api/v1/movie/get-movie/"+movieId), MovieModel[].class);
            return new ResponseEntity(ratingService.addRatings(userModel[0], movieModel[0]), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);

        }

    }
}
