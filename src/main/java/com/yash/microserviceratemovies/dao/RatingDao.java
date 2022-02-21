package com.yash.microserviceratemovies.dao;

import com.yash.microserviceratemovies.model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.math.BigInteger;

@Repository
public interface RatingDao extends JpaRepository<RatingModel, BigInteger> {

}
