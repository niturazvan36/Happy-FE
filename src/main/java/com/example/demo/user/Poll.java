package com.example.demo.user;

import javax.persistence.*;
import java.util.List;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int initiator;
    @ElementCollection
    private List<String> comments;

    @ElementCollection
    private List<Integer> hasVoted;

    private double score;

    public Poll(int initiator, List<String> comments, List<Integer> hasVoted, double score) {
        this.initiator = initiator;
        this.comments = comments;
        this.hasVoted = hasVoted;
        this.score = score;
    }

    public Poll(int initiator, List<String> comments, double score) {
        this.initiator = initiator;
        this.comments = comments;
        this.score = score;
    }

    public Poll() {
    }

    public int getInitiator() {
        return initiator;
    }

    public List<String> getComments() {
        return comments;
    }

    public List<Integer> getHasVoted() {
        return hasVoted;
    }

    public double getScore() {
        return score;
    }

    public void setInitiator(int initiator) {
        this.initiator = initiator;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void setHasVoted(List<Integer> hasVoted) {
        this.hasVoted = hasVoted;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "id=" + id +
                ", initiator=" + initiator +
                ", comments=" + comments +
                ", hasVoted=" + hasVoted +
                ", score=" + score +
                '}';
    }

    public boolean userVoted(User user, Poll poll)
    {
        if(poll.getHasVoted().contains(user.getId()))
        {
            return true;
        }
        return false;
    }
}
