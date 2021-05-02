package com.GeekTech;

import java.util.*;
import java.util.Random;

public class Main {



    public static void main(String[] args) {



        double[] homeWork = {generateRandomAge(), generateRandomAge(), -5.15, -6.56, -8.17, -5, generateRandomAge(),
                2.1, -1.5, generateRandomAge(), generateRandomAge(), 10.10, generateRandomAge(), generateRandomAge(), generateRandomAge()};
        double result = 0;
        double count = 0;
        int count1=0;
        for (double i : homeWork) {
            if (i > 0 && count1>0) {
                result += i;
                count++;
            }
            else if (i<0){
                count1++;
            }

        }



        System.out.println("Сренднее арифметическое " + result / count);
        swap();
    }


    public static void swap() {

        int[] arrayI = {10, 2, 10, 3, 1, 2, 5};
        Arrays.sort(arrayI);
        System.out.println(Arrays.toString(arrayI));

    }
    public  static  int generateRandomAge(){
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        return randomNumber;}


}















