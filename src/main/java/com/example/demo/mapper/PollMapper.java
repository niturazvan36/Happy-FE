package com.example.demo.mapper;

import com.example.demo.Dtos.PollDto;
import com.example.demo.entity.Poll;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class PollMapper {

    public static Poll toEntity(PollDto pDto)
    {
        Poll poll = new Poll();
        poll.setComments(pDto.getComments());
        poll.setHasVoted(pDto.getHasVoted());
        poll.setInitiator(pDto.getInitiator());
        poll.setScore(pDto.getScore());
        return poll;
    }

    public static PollDto toDto(Poll poll)
    {
        PollDto pollDto = new PollDto();
        pollDto.setComments(poll.getComments());
        pollDto.setInitiator(poll.getInitiator());
        pollDto.setScore(poll.getScore());
        pollDto.setHasVoted(poll.getHasVoted());
        return pollDto;
    }

    public static List<Poll> toEntityList(List<PollDto> pollDtoList)
    {
        List<Poll> pollList = new ArrayList<>();
        Iterator<PollDto> it = pollDtoList.iterator();
        while (it.hasNext())
        {
            Poll u=toEntity(it.next());
            pollList.add(u);
        }
        return pollList;
    }

    public static List<PollDto> toDtoList(List<Poll> pollList)
    {
        List<PollDto> pollDtoList =  new ArrayList<>();
        Iterator<Poll> it =pollList.iterator();
        while (it.hasNext())
        {
            PollDto p =toDto(it.next());
            pollDtoList.add(p);
        }

        return pollDtoList;
    }

}
