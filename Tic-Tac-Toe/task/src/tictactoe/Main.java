package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
            }
        }
        print(arr);
        for (int i = 1; i <= 9; i++) {
            char[][] result;
            if (i % 2 == 0) {
                result = input(arr, 'O');
            } else {
                result = input(arr, 'X');
            }
            print(result);
            String a = outcome(result);
            if (a != null) {
                System.out.println(a);
                i = 10;
            }
        }
    }

    public static char[][] input(char arr[][], char a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates:");
        int fcor, scor, x, y;
        boolean b0 = true;
        while (b0) {
            try {
                fcor = sc.nextInt();
                scor = sc.nextInt();
                while (fcor > 3 || scor > 3 || fcor < 1 || scor < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    System.out.println("Enter the coordinates:");
                    fcor = sc.nextInt();
                    scor = sc.nextInt();
                }
                x = 3 - scor;
                y = fcor - 1;
                while (arr[x][y] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    System.out.println("Enter the coordinates:");
                    fcor = sc.nextInt();
                    scor = sc.nextInt();
                    while (fcor > 3 || scor > 3 || fcor < 1 || scor < 1) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        System.out.println("Enter the coordinates:");
                        fcor = sc.nextInt();
                        scor = sc.nextInt();
                    }
                    x = 3 - scor;
                    y = fcor - 1;
                }
                arr[x][y] = a;
                b0 = false;

            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                System.out.println("Enter the coordinates:");
                sc.nextLine();
            }
        }
        return arr;
    }

    public static void print(char arr[][]) {
        System.out.println("---------");
        System.out.println("         ");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("         ");
        System.out.println("---------");
    }

    public static String outcome(char arr[][]) {
        String xx = "X wins";
        String oo = "O wins";
        String drw = "Draw";
        String str = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                str += arr[i][j];
            }
        }
        String xlist = "", olist = "", slist = "";
        String ansList1 = "012";
        String ansList2 = "345";
        String ansList3 = "678";
        String ansList4 = "036";
        String ansList5 = "147";
        String ansList6 = "258";
        String ansList7 = "048";
        String ansList8 = "246";
        boolean xWin = false;
        boolean oWin = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                xlist += i;
            } else if (str.charAt(i) == 'O') {
                olist += i;
            } else {
                slist += i;
            }
        }
        if (check(xlist, ansList1) || check(xlist, ansList2) || check(xlist, ansList3) || check(xlist, ansList4) || check(xlist, ansList5) || check(xlist, ansList6) || check(xlist, ansList7) || check(xlist, ansList8)) {
            xWin = true;
        }
        if (check(olist, ansList1) || check(olist, ansList2) || check(olist, ansList3) || check(olist, ansList4) || check(olist, ansList5) || check(olist, ansList6) || check(olist, ansList7) || check(olist, ansList8)) {
            oWin = true;
        }

        if (xWin) {
            return xx;
        } else if (oWin) {
            return oo;
        } else if (slist.equals("")) {
            return drw;
        } else {
            return null;
        }
    }

    public static boolean check(String first, String second) {
        int l1 = first.length();
        int l2 = second.length();
        int k = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (first.charAt(i) == second.charAt(j)) {
                    k++;
                    j = l2;
                    break;
                }
            }
        }
        if (k == 3) {
            return true;
        } else {
            return false;
        }
    }

}