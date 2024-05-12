package com.learning.java.dsa;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        System.out.print("Enter the name of player1: ");
        String player1Name = scanner.next();
        System.out.print("Enter the name of player2: ");
        String player2Name = scanner.next();
        System.out.printf("%s to choose between x and o: ", player1Name);
        String player1Char = scanner.next();
        while (!("x".equals(player1Char) || "o".equals(player1Char))) {
            System.out.println("enter either x or o...");
            player1Char = scanner.next();
        }
        String player2Char = player1Char.equals("x") ? "o" : "x";
        System.out.printf("%s is playing with %s\n", player1Name, player1Char);
        System.out.printf("%s is playing with %s\n", player2Name, player2Char);
        Map<String, String> pmap = new HashMap<>();
        pmap.put(player1Name, player1Char);
        pmap.put(player2Name, player2Char);
        String[][] array = new String[3][3];
        int numberofInputsRead = 0;
        boolean player1Turn = true;
        while (true) {
            if (numberofInputsRead == 9) {
                System.out.println("Draw!");
                return;
            }
            printArr(array);
            String currPlayer = player1Turn ? player1Name : player2Name;
            System.out.printf("%s's turn: ", currPlayer);
            int rowIdx = scanner.nextInt();
            int colIdx = scanner.nextInt();
            if (rowIdx < 0 || rowIdx >= array.length || colIdx < 0 || colIdx >= array.length
                || Objects.nonNull(array[rowIdx][colIdx])) {
                System.out.println("invalid position, enter again...");
                continue;
            }
            array[rowIdx][colIdx] = pmap.get(currPlayer);
            if (matchRows(array) || matchDiagonals(array) || matchColumns(array)) {
                System.out.printf("%s won!", currPlayer);
                return;
            }
            numberofInputsRead++;
            player1Turn = !player1Turn;
        }

    }

    private static boolean matchDiagonals(String[][] array) {
        String first = array[0][0];
        boolean one = true;
        for (int i = 1; i < 3; ++i) {
            if (Objects.isNull(first) || !first.equals(array[i][i])) {
                one = false;
                break;
            }
        }
        String second = array[0][2];
        boolean two = true;
        for (int i = 0; i < 2; ++i) {
            if (Objects.isNull(second) || !second.equals(array[2 - i][i])) {
                two = false;
                break;
            }
        }
        return one || two;
    }

    private static boolean matchRows(String[][] array) {
        for (int i = 0; i < 3; ++i) {
            String first = array[i][0];
            boolean flag = true;
            for (int j = 1; j < 3; ++j) {
                if (Objects.isNull(first) || !first.equals(array[i][j])) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }

    private static boolean matchColumns(String[][] array) {
        for (int i = 0; i < 3; ++i) {
            String first = array[0][i];
            boolean flag = true;
            for (int j = 1; j < 3; ++j) {
                if (Objects.isNull(first) || !first.equals(array[j][i])) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return true;
        }
        return false;
    }


    private static void printArr(String[][] array) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
