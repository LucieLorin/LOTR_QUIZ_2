package com.company.GameBrain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {

    private String prompt;
    private String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    private static final String Q1 = "\"Kolik prstenů Moci obdrželi vládci lidí od Saurona?\n" +
            "(A - 8)\n + (B - 5)\n + (C - 3)";

    private static final String Q2 = "Jak se jmenuje pavoučice?\n" +
            "(A - Gothmog)\n + (B - Hilga)\n + (C - Odula)";

    private static final String Q3 = "Jak se jmenoval hobit, kterého Glum zabil pro prsten?\n" +
            "(A - Bilbo)\n + (B - Sméagol)\n + (C - Déagol)";

    private static final String Q4 = "Kolik Oscarů získal film PÁN PRSTENŮ - DVĚ VĚŽE?\"\n" +
            "(A - 4)\n + (B - 2)\n + (C - 1)";

    private static final String Q5 = "Poslední otázka. Jaký význam má slovo NILDO či MELLON?\n" +
            "(A - Voda)\n + (B - Kamarád)\n + (C - Prsten)";

    Question[] questions = {
            new Question(Q1, "A"),
            new Question(Q2, "C"),
            new Question(Q3, "C"),
            new Question(Q4, "B"),
            new Question(Q5, "B")
    };

}
