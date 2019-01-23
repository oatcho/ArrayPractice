package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double[] dailyAverageTemp = new double[7];
        double[] dailyAverageTempInCel = new double [7];
        double n = dailyAverageTemp.length;
        double sumF = 0;
        double averageF;
        double sumC = 0;
        double averageC;

        System.out.println("Please enter the temperatures in Fahrenheit for the next 7 days: ");

        dailyAverageTemp[0] = key.nextDouble();
        dailyAverageTemp[1] = key.nextDouble();
        dailyAverageTemp[2] = key.nextDouble();
        dailyAverageTemp[3] = key.nextDouble();
        dailyAverageTemp[4] = key.nextDouble();
        dailyAverageTemp[5] = key.nextDouble();
        dailyAverageTemp[6] = key.nextDouble();

//        for (int i=0; i<dailyAverageTemp.length; i++) {
////            System.out.println (dailyAverageTemp [i]);
//            sumF = sumF + dailyAverageTemp[i];
//            }

        for (double tempInF: dailyAverageTemp) {
            sumF = sumF + tempInF;
//            System.out.println(tempInF);
        }

//        for (double i = 0; i<dailyAverageTemp.length; i++) {
//
//            i=(((i-32)/1.8));
//            System.out.println(i);
//            break;
//        }

        for (double tempInC: dailyAverageTemp) {

            tempInC=((tempInC-32)/1.8);
            System.out.println(dailyAverageTempInCel);
//            System.arraycopy(dailyAverageTemp, 0, dailyAverageTempInCel, 0, 7);
//            System.out.println(dailyAverageTempInCel);
        }

        averageF = sumF / n;
        averageC = sumC / n;

//        System.out.println ("The average temperature in Fahrenheit for the week is: " + averageF);

//        System.out.println ("The average temperature in Celcius for the week is: " + averageC);



    }
}
