package com.tinkertailor;

import java.util.ArrayList;
import java.util.List;

public class TinkerTailor {


    public List<Integer> solve(int playerNum, int countOut) {

        List<Integer> people = new ArrayList<>(playerNum);
        List<Integer> answerSequence = new ArrayList<>();

        for (int i = 0; i < playerNum; i++) people.add(i + 1);

        while (!people.isEmpty()) {
            for (int i = 1; i < countOut; i++) {
                people.add(people.get(0));
                people.remove(0);
            }
            answerSequence.add(people.get(0));
            people.remove(0);

        }

        return answerSequence;


    }


}
