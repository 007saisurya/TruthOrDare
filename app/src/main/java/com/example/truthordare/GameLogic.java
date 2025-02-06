package com.example.truthordare;

import java.util.ArrayList;
import java.util.Random;

public class GameLogic {
    private final ArrayList<String> truthQuestions;
    private final ArrayList<String> dareChallenges;
    private final Random random;

    public GameLogic() {
        random = new Random();
        truthQuestions = new ArrayList<>();
        dareChallenges = new ArrayList<>();

        // Sample Truth Questions
        truthQuestions.add("What's your biggest secret?");
        truthQuestions.add("Have you ever cheated on a test?");
        truthQuestions.add("Who was your first crush?");
        truthQuestions.add("What’s the most embarrassing thing you’ve done?");
        truthQuestions.add("What’s the last lie you told?");

        // Sample Dare Challenges
        dareChallenges.add("Do 10 push-ups.");
        dareChallenges.add("Send a flirty text to the last person you messaged.");
        dareChallenges.add("Dance for 30 seconds with no music.");
        dareChallenges.add("Take a selfie making a funny face and send it to a random contact.");
        dareChallenges.add("Act like a monkey for 1 minute.");
    }

    // Method to get a random truth question
    public String getRandomTruth() {
        return truthQuestions.get(random.nextInt(truthQuestions.size()));
    }

    // Method to get a random dare challenge
    public String getRandomDare() {
        return dareChallenges.get(random.nextInt(dareChallenges.size()));
    }
}
