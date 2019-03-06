package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[arraySize];
        for (int i = 0; i <arraySize ; i++) {
            input[i] = scanner.nextLine();
        }

        DataStructureDetective detective = new DataStructureDetective();
        String[] operations = detective.getOperations(input);
        int[] values = detective.getValues(input);

        //de her to kommenterede for-loops har jeg brugt for at teste. De er ikke væsentlige for programmet.
        /*for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        for (int i = 0; i < operations.length; i++) {
            System.out.println(operations[i]);
        }*/

        if (detective.isQueue(operations,values)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        if (detective.isStack(operations,values)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        if (detective.isSmallestFirstQueue(operations,values)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
