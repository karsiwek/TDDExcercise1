package pl.karolsiwek.bowling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karolsi on 31/03/2016.
 */
public class Player {
    private String name;
    private Integer score;
    private List<Integer> tries = new ArrayList<Integer>();
    private List<Integer> lastRoundTries = new ArrayList<Integer>();
    private Integer roundNumber = 0;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public boolean isRoundFinished() {
        return (tries.size()==1 && tries.get(0)==10) || tries.size()==2;
    }

    public void shot(Integer result) {
        if(lastRoundTries.size()>0 && lastRoundTries.get(0)==10){
            score += 2*result;
        } else {
            score +=result;
        }


        tries.add(result);
    }

    public void newRound() {
       lastRoundTries = tries;
       tries = new ArrayList<Integer>();

    }
}
