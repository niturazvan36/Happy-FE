package com.example.demo.services;

import com.example.demo.entity.Poll;
import org.springframework.stereotype.Service;


import java.util.List;
@Service

public class PollService {


    public List<Poll> getPolls(){
        return List.of(new Poll(1,20));
    }
}
