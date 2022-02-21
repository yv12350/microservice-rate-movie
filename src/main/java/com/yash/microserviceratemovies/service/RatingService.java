package com.yash.microserviceratemovies.service;

import com.yash.microserviceratemovies.dao.RatingDao;
import com.yash.microserviceratemovies.model.MovieModel;
import com.yash.microserviceratemovies.model.RatingModel;
import com.yash.microserviceratemovies.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    RatingDao ratingDao;

    public RatingModel addRatings(UserModel userModel, MovieModel movieModel) throws Exception {
        try {
            RatingModel ratingModel = new RatingModel();
            ratingModel.setUsername(userModel.getUsername());
            ratingModel.setMoviename(movieModel.getMovieName());
            ratingModel.setRemarks("TestRemarks");
            ratingModel.setRating(3);
            return ratingDao.save(ratingModel);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
