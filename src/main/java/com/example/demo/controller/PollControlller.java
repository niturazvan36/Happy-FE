package com.example.demo.controller;

import com.example.demo.entity.Poll;
import com.example.demo.services.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Poll")

public class PollControlller {

    private final PollService pollService;

    @Autowired
    public PollControlller(PollService pollService) {this.pollService = pollService;}

    @GetMapping
    public List<Poll> getPolls(){
        return pollService.getPolls();
    }
}
