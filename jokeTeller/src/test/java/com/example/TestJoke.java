package com.example;

import com.casasw.jokeTeller.Joke;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;

/**
 * Created by Junior on 12/01/2017.
 * Testing joke teller
 */

public class TestJoke {

    @Test
    public void testJoke() {
        int rep=0; int i =0, seq =0;
        String joke = "", aux = "";
        HashMap<String, String> jokes = new HashMap<String, String>();
        for (;i<100;i++) {
            joke = Joke.getJoke();
            if (aux.equals(joke))
                seq++;
            if (!jokes.containsValue(joke)) {
                jokes.put(joke, joke);
            } else
                rep++;
            aux = joke;
        }
        assertFalse(i<rep);
        System.out.println("Rep: "+rep+" Seq: "+seq);
    }

    @Test
    public void testMultiJoke() {
        int rep=0; int i =0, seq =0;
        int repT=0, seqT =0;
        String joke = "", aux = "";
        HashMap<String, String> jokes = new HashMap<String, String>();
        for (int j = 0; j<100; j++) {
            rep=0; i =0; seq =0;
            for (;i<100;i++) {
                joke = Joke.getJoke();
                if (aux.equals(joke))
                    seq++;
                if (!jokes.containsValue(joke)) {
                    jokes.put(joke, joke);
                } else
                    rep++;
                aux = joke;
            }
            assertFalse(i<rep);
            repT+=rep; seqT+=seq;
            //System.out.println("Rep: "+rep+" Seq: "+seq);
        }
        System.out.println("RepT: "+repT+" SeqT: "+seqT);
    }
}
