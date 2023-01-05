import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner rolls = new Scanner(System.in);
            System.out.println("What dice would you like to roll?: ");

            String input = rolls.nextLine();
            StringTokenizer inputTokenizer = new StringTokenizer(input, "d");
            int numDice = Integer.parseInt(inputTokenizer.nextToken());
            int diceVal = Integer.parseInt(inputTokenizer.nextToken());
            int dicetotal = 0;
            ArrayList<Integer> rollLog = new ArrayList<Integer>(numDice);

            for (int i = 0; i < numDice; i++) {
                int newRoll = ThreadLocalRandom.current().nextInt(1, diceVal + 1);
                dicetotal = Integer.sum(dicetotal, newRoll);
                rollLog.add(newRoll);
            }

            System.out.println(dicetotal + " " + rollLog);
        }
    }
}