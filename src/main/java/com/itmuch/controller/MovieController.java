package com.itmuch.controller;

import com.itmuch.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author evanYang
 * @version 1.0
 * @date 2019/06/17 22:10
 */
@RequestMapping("/movie")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        User user = this.restTemplate.getForObject("http://localhost:8000/user/{id}", User.class,id);
        return user;

    }
}
