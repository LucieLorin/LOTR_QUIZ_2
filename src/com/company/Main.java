package com.company;

import com.company.GameBrain.GameBrain;
import com.company.GameBrain.Question;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GameBrain gameBrain = new GameBrain();
        Question[] questions = new Question[0];

        System.out.println("Vítej, příteli. Jaké je tvé jméno?");
        Scanner keyboardReaction = new Scanner(System.in);
        String nameOfFriend = keyboardReaction.next();

        System.out.println(nameOfFriend + ", to je hezké jméno. Ráda tě poznávám." +
                "Prověříme tvoje znalosti Pána prstenů. Tvým cílem je odpověďět " +
                "správně na co nejvíce otázek. ");

    }

}
