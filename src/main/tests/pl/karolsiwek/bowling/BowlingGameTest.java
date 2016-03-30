package pl.karolsiwek.bowling;

import org.junit.Test;

public class BowlingGameTest {

    @Test(expected = IllegalArgumentException.class)
    public void bowlingGame_shouldThrowException_onNullArg() {
        BowlingGame game = new BowlingGame(null);
    }
//
//    //i know, easy and boring ;)
//    @Test(expected = IllegalArgumentException.class)
//    public void bowlingGame_shouldThrowException_onEmptyArrayOfUsers() {
//        BowlingGame game = new BowlingGame(new ArrayList<String>());
//    }

//    //do we need to keep players names? naaah...
//    @Test
//    public void getScores_shouldReturnZeroForSingleUser_atTheBegginingOfTheGame() {
//        //given
//        BowlingGame game1 = new BowlingGame(Arrays.asList("onlyOneUser"));
//
//        //when
//        //nothing
//
//        //then
//        assertArrayEquals(Arrays.asList(0).toArray(), game1.getScores().values().toArray());
//    }
//
//    @Test
//    public void getScores_shouldReturnZeroForManyUsers_atTheBegginingOfTheGame() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2", "user3"));
//
//        //when
//        //nothing
//
//        //then
//        assertArrayEquals(Arrays.asList(0,0,0).toArray(), game.getScores().values().toArray());
//    }
//
//    //ok now we need player name...
//    @Test
//    public void getScores_shouldReturnRoundScore_afterOneRound() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1"));
//
//        //when
//        game.shot(5);
//
//        //then
//        assertEquals((Integer) 5, game.getScores().get("user1"));
//    }
//
//    //another function!
//    @Test
//    public void whoseTurn_shouldReturnFirstUser_atTheBegginingOfTheGame() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        //nothing
//
//        //then
//        assertEquals("user1", game.whoseTurn());
//    }
//
//
//    //funny emoticon for today: ಠ.ಠ
//    @Test
//    public void whoseTurn_shouldReturnSecondUser_afterFirstScoresStrike() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(10);
//
//        //then
//        assertEquals("user2", game.whoseTurn());
//    }
//
//    //no comment over here...
//    @Test
//    public void whoseTurn_shouldReturnFirstUser_afterEveryoneStrikes() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(10);
//        game.shot(10);
//
//        //then
//        assertEquals("user1", game.whoseTurn());
//    }
//
//    //maybe keep players data in separate class?
//    @Test
//    public void whoseTurn_shouldReturnFirstUser_whenHeDidnStrike() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(9);
//
//        //then
//        assertEquals("user1", game.whoseTurn());
//    }
//
//    //more logic...
//    @Test
//    public void whoseTurn_shouldReturnSecondUser_whenFirstOneDidTwoTries() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(2);
//        game.shot(2);
//
//        //then
//        assertEquals("user2", game.whoseTurn());
//    }
//
//    //does this test makes sense?
//    @Test
//    public void whoseTurn_shouldReturnFirstUser_afterFullTwoRounds() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(10);
//        game.shot(10);
//        game.shot(2);
//        game.shot(2);
//        game.shot(2);
//        game.shot(2);
//
//        //then
//        assertEquals("user1", game.whoseTurn());
//    }

//
//    //back to getScores!
//    @Test
//    public void getScores_shouldReturnSumOfScoriesOfOnePlayer_afterOneRound() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(2);
//        game.shot(2);
//
//        //then
//        assertThat(game.getScores().get("user1"), is(4));
//    }
//
//    //that bowling!
//    @Test
//    public void getScores_shouldAddScoresFromSecondFrameToFirstOne_onStrike() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(10);//one strikes
//        game.shot(2);
//        game.shot(3);
//        game.shot(9);
//
//        //then
//        assertThat(game.getScores().get("user1"), is(28));
//    }
//
//    //TBH this is the first time I really learned what is the difference between strike and spare...
//    @Test
//    public void getScores_shouldAddScoresFromFirstThrowOfSecondFrameToFirstFrame_onSpare() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(5);
//        game.shot(5);//spare!
//        game.shot(0);
//        game.shot(0);
//        game.shot(5);
//        game.shot(5);
//
//        //then
//        assertThat(game.getScores().get("user1"), is(25));
//        assertThat(game.getScores().get("user2"), is(0));
//    }
//
//    // pro tip: smile to random person to make his/her day better :) (and be considered a weirdo)
//    @Test
//    public void getScores_shouldAddScoresFromBothShotsFromSecondFrameToFirstOne_onStrike() {
//        //given
//        BowlingGame game = new BowlingGame(Arrays.asList("user1", "user2"));
//
//        //when
//        game.shot(10);//one strikes
//        game.shot(0);
//        game.shot(0);
//        game.shot(5);
//        game.shot(5);
//
//        //then
//        assertThat(game.getScores().get("user1"), is(30));
//        assertThat(game.getScores().get("user1"), is(0));
//    }
//
//
//    //DIY TDD workshops
//    @Test
//    public void isFinished_shouldReturnFalse_onTheBegginingOfTheGame() {}
//
//    @Test
//    public void isFinished_shouldReturnFalse_afterOneRoundOnSinglePlayerGame() {}
//
//    @Test
//    public void isFinished_shouldReturnFalse_afterOneRoundOnMultiPlayerGame() {}
//
//    @Test
//    public void isFinished_shouldReturnTrue_afterTenRoundsForSinglePlayerGame() {}
//
//    @Test
//    public void isFinished_shouldReturnFalse_whenSpareInLastRound() {}
//
//    @Test
//    public void isFinished_shouldReturnTrue_whenSpareInLastRoundAndAdditionalShotMade() {}
//
//    @Test
//    public void getWinner_shouldReturnNull_whenGameIsNotFinished() {}
//
//    @Test
//    public void getWinner_shouldReturnPlayer_whenSinglePlayerGameIsFinished() {}
//
//    @Test
//    public void getWinner_shouldReturnPlayerWithHighestScore_whenMultiPlayerGameIsFinished() {}

}