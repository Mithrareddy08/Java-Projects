import java.util.Scanner;

public class Main {
    static int Fib(int n){
        if(n<=1)
        {
            return n;
        }
        else
        return Fib(n-1) + Fib(n-2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n1 = s.nextInt();
        for (int i=0;i<n1;i++)
        System.out.println(Fib(i));
    }
}