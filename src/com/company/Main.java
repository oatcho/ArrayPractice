package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double[] dailyAverageTemp = new double[7];
        double n = dailyAverageTemp.length;
        double sumF = 0;
        double averageF;

        System.out.println("Please enter the temperatures in Fahrenheit for the next 7 days: ");

        dailyAverageTemp[0] = key.nextDouble();
        dailyAverageTemp[1] = key.nextDouble();
        dailyAverageTemp[2] = key.nextDouble();
        dailyAverageTemp[3] = key.nextDouble();
        dailyAverageTemp[4] = key.nextDouble();
        dailyAverageTemp[5] = key.nextDouble();
        dailyAverageTemp[6] = key.nextDouble();

        for (int i=0; i<dailyAverageTemp.length; i++) {
            System.out.println (dailyAverageTemp [i]);
            sumF = sumF + dailyAverageTemp[i];
            }

        averageF =  sumF / n;

        System.out.println ("Average temperature in Fahrenheit for the week is: " + averageF);



    }
}
