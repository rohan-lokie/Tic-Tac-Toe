import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        if(n1%2==0)
        {
            n1/=2;
        }
        else
        {
            n1=(n1/2)+1;
        }
        if(n2%2==0)
        {
            n2/=2;
        }
        else
        {
            n2=(n2/2)+1;
        }
        if(n3%2==0)
        {
            n3/=2;
        }
        else
        {
            n3=(n3/2)+1;
        }
        System.out.println(n1+n2+n3);
    }
}