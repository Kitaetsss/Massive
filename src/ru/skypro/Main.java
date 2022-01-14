package ru.skypro;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //первый массив
        int[] weight = new int[]{1, 2, 3};
        int res = weight.length -1;
        while (res >=0){
            System.out.print(weight[res] + ", ");
            res--;
        }
        System.out.println("Массив 1");
        //второй массив
        double[] weigthsTwo = new double[]{1.57, 7.654, 9.986};
            int rec = weigthsTwo.length -1;
            while (rec >=0){
                System.out.print(weigthsTwo[rec] + ", ");
                rec--;
        }
        System.out.println("Массив 2");
        {
            //массив 3
            int[] bullets = new int[]{10, 4, 6, 5};
            int rew = bullets.length -1;
            while (rew >=0){
                System.out.print(bullets[rew] + ", ");
                rew--;
            }
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


