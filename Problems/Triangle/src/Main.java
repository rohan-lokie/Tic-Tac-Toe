import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        if(i<=0 || j<=0 || k<=0)
        {
            System.out.println("NO");
        }
        else if((i+j>k) && (i+k>j) && (j+k>i))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}