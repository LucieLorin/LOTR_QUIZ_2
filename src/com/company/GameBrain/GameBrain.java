package com.company.GameBrain;

import java.util.Scanner;

public class GameBrain {

    public void runTheGame(Question[] questions) {

        int currentScore = 0;
        Scanner readerOfThePlayersAnswer = new Scanner(System.in);

        for (Question value : questions) {
            System.out.println(value.getPrompt());

            String answer = readerOfThePlayersAnswer.nextLine();

            if (answer.equals(value.getAnswer())) {
                currentScore = currentScore + 1;
            }
        }
    }
}
