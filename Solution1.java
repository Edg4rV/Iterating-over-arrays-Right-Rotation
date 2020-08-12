package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner  scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] convertedArr = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .toArray();
        int shift = scanner.nextInt();
        if (shift > convertedArr.length) {
            shift = shift % convertedArr.length;
        }
        int index = shift;
        int move = 0;

        int[] result =  new int[convertedArr.length];
        for (int i = 0; i < shift; i++) {
            result[i] = convertedArr[convertedArr.length - index];
            index--;
        }
        for (int i = shift; i < convertedArr.length; i++) {
            result[i] = convertedArr[move];
            move++;
        }
        System.out.println(Arrays.toString(result));
        for (int x:result) {
            System.out.print(x + " ");
        }
    }
}
