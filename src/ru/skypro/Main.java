package ru.skypro;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        {
            int[] weightOne = new int[]{1, 2, 3};
            for (int i = 0; i < weightOne.length; i++) {
                if (i == weightOne.length - 1) {
                    System.out.print(weightOne[i]);
                }
                 else {
                    System.out.print(weightOne[i] + ", ");
                }
            }
            System.out.println("");
        }
        //первый массив
        int[] weight = new int[]{1, 2, 3};
        int res = weight.length -1;
        while (res >=0){
            if (res == 0){
                System.out.print(weight[res] + " ");
            }
            else {
                System.out.print(weight[res] + ", ");
            }
            res--;
        }
        System.out.println("");
        {
            System.out.println("Массив 1");
            double[] weigthsTwo = new double[]{1.57, 7.654, 9.986};
            for (int i = 0; i < weigthsTwo.length; i++) {
                if (i == weigthsTwo.length - 1) {
                    System.out.print(weigthsTwo[i]);
                } else {
                    System.out.print(weigthsTwo[i] + ", ");
                }
            }
        }
        System.out.println("");
            //второй массив
            double[] weigthsTwo = new double[]{1.57, 7.654, 9.986};
            int rec = weigthsTwo.length - 1;
            while (rec >= 0) {
                if (rec == 0) {
                    System.out.print(weigthsTwo[rec]);
                } else {
                    System.out.print(weigthsTwo[rec] + ", ");
                }
                    rec--;
                }
        System.out.println("");

        System.out.println("Массив 2");
        {
            int[] bullets = new int[]{10, 4, 6, 5};
            for (int i = 0; i < bullets.length; i++) {
                if (i == bullets.length - 1) {
                    System.out.print(bullets[i]);
                }
                else {
                    System.out.print(bullets[i] + ", ");
                }
            }
            System.out.println("");
            {
                //массив 3
                int[] bulletsOne = new int[]{10, 4, 6, 5};
                int rew = bulletsOne.length - 1;
                while (rew >= 0) {
                    if (rew == 0) {
                        System.out.print(bulletsOne[rew]);
                    }
                    else{
                    System.out.print(bulletsOne[rew] + ", ");
                }
                    rew--;
                }
            }
            System.out.println("");

                System.out.println("Массив 3");

            }
            //задание 3
        int[] popcorn = new int[]{1, 2, 3};
        int a = popcorn.length -1;
        for (int i = 0; i <= a; i++) {
            if (popcorn[i] % 2 == 1){
                popcorn[i] += 1;
        }
            System.out.print(popcorn[i] + ", ");
        }
        System.out.println("Массив 4");
            }
            }


