package com.example.demo.Dtos;


import java.util.List;

public class PollDto {

    private Long id;

    private int initiator;

    private List<String> comments;


    private List<Integer> hasVoted;

    private double score;//timestamp

    public PollDto() {
    }

    public PollDto(Long id, int initiator, List<String> comments, List<Integer> hasVoted, double score) {
        this.id = id;
        this.initiator = initiator;
        this.comments = comments;
        this.hasVoted = hasVoted;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInitiator() {
        return initiator;
    }

    public void setInitiator(int initiator) {
        this.initiator = initiator;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<Integer> getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(List<Integer> hasVoted) {
        this.hasVoted = hasVoted;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
