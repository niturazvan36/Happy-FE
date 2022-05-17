package com.example.demo.repository;

import com.example.demo.user.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends CrudRepository<Poll,Long> {
}
