package com.yash.microserviceratemovies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor


public class UserModel {

    private Integer userId;

    private String firstName;

    private String lastName;

    private String username;
}
