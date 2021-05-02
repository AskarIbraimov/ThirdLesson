package com.GeekTech;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        lles();

//        double[] array = {7, 10, -7.61, -10.5464, 4.567, 3, 3.3, 2.1, -45, 1.8, 18, 5, 7.25, 17, 8, 6};
//        double result = 0;
//        double[] checkArray = {};
//        int index = 0;
//
//        for (double item : array) {
//            checkArray = Arrays.copyOfRange(array, index, array.length - 1);
//            boolean check = true;
//
//            for (double itemTwo : checkArray) {
//                if (check) { check = itemTwo > 0; }
//            }
//
//            if (check) {
//                System.out.println(Arrays.toString(checkArray));
//
//                for (double itemResult : checkArray) { result += itemResult; }
//
//                result = result / checkArray.length;
//                break;
//            }
//            index++;
//        }
//
//        System.out.println(result);
//
//

    }

    public static void lles() {
        double[] array = {7, 10, -7.61, -10.5464, 4.567, 3, 3.3, 2.1, -45, 1.8, 18, 5, 7.25, 17, 8, 6};
        double result = Double.MAX_VALUE;
        double[] checkArray = {};
        int index = 0;

        for (double item : array) {
            checkArray = Arrays.copyOfRange(array, index, array.length);

            if (checkArray[0] < 0) {
                System.out.println(Arrays.toString(checkArray));
                result = 0;
                int negativeNumber = 0;

                for (double itemTwo : checkArray) {
                    if (itemTwo > 0) {
                        result = result + itemTwo;
                    } else {
                        negativeNumber++;
                    }
                }

                result = result / (checkArray.length - negativeNumber);
            }

            if (result != Double.MAX_VALUE) {
                break;
            }

            index++;
        }

        System.out.println(result);
    }

    public static int removeNegativeNumbers(double[] num) {
        int k = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] >= 0) {
                num[k++] = num[i];
            }
        }

        return k;
    }

    public static void swp() {
        int[] arrayI = {10, 2, 10, 3, 1, 2, 5};
        Arrays.sort(arrayI);
        System.out.println(Arrays.toString(arrayI));
    }
}

















