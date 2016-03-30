package pl.karolsiwek;

import pl.karolsiwek.bowling.BowlingGame;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "                         ! ! ! !\n" +
                "                      .\" ! ! !  /\n" +
                "                    .\"   ! !   /\n" +
                "                  .\"     !    /\n" +
                "                .\"           /\n" +
                "              .\"     o      /\n" +
                "            .\"             /\n" +
                "          .\"              /\n" +
                "        .\"               /\n" +
                "      .\"      . '.      /\n" +
                "    .\"      '     '    /\n" +
                "  .\"                  / \n" +
                ".\"     0 |           /\n" +
                "       |/\n" +
                "      /|\n" +
                "      / |\n" +
                "\n   ___  ____ _      ____   _____  _______\n" +
                "  / _ )/ __ \\ | /| / / /  /  _/ |/ / ___/\n" +
                " / _  / /_/ / |/ |/ / /___/ //    / (_ / \n" +
                "/____/\\____/|__/|__/____/___/_/|_/\\___/  \n" +
                "                                         ");
        System.out.println("Please provide Player names (comma separated)");
        String line = scanner.nextLine();

        BowlingGame game=new BowlingGame(Arrays.asList(line.split(",")));

        while(game.isFinished()==false){
            System.out.println(game.whoseTurn()+"'s turn! (please enter the result");
            game.shot(scanner.nextInt());
        }
        System.out.println("WINNER IS:"+game.getWinner());
    }

}
