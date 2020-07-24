import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // put your code here
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int k=0;
        if(a>0)
        {
            k++;
        }
        if(b>0)
        {
            k++;
        }
        if(c>0)
        {
            k++;
        }
        if(k==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}