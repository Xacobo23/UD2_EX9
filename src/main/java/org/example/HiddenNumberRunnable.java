package org.example;


public class HiddenNumberRunnable implements Runnable{

    int numeroRandom;

    public HiddenNumberRunnable(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }


    @Override
    public void run() {
        int n = 0;
        while (n != -1)
            for (int i = 0; i < 101; i++) {
                n = new HiddenNumber(numeroRandom).numberGuess(i);
            }
    }
}
