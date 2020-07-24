import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int oneDay = a - b;
        int time = (h - a) / oneDay;
        if (oneDay == 0 || h == 0) {
            System.out.println("0");
        } else if (a >= h) {
            System.out.println("1");
        } else if (time * oneDay == (h - a)) {
            System.out.println(time + 1);
        } else {
            System.out.println(time + 2);
        }
    }
}