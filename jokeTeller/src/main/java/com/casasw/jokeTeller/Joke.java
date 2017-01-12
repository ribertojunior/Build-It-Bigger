package com.casasw.jokeTeller;

public class Joke {

    public static String getJoke() {
        String[] jokes = {
                "TL;DL",
                "Why are you punching yourself?",
                "I dreamt I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
                "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
                "I\'d like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",
                "It is so cold outside I saw a politician with his hands in his own pockets.",
                "It\'s hard to explain puns to kleptomaniacs because they always take things literally.",
                "I used to think the brain was the most important organ. Then I thought, look what\'s telling me that.",
                "The midget fortune teller who kills his customers is a small medium at large.",
                "A farmer in the field with his cows counted 196 of them, but when he rounded them up he had 200.",
                "What does a nosey pepper do? Get jalapeno business."
        };
        int i = (int) (Math.random() * 11);
        return jokes[i];

    }
}
