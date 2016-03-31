package pl.karolsiwek.bowling;

/**
 * Created by karolsi on 31/03/2016.
 */
public class Player {
    private String name;
    private Integer score;

    public Player(String name){
        this.name=name;
        score=0;
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
}
