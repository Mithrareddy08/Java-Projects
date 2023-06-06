public class Main {
    public static void main(String[] args) {
        int i = 123456, r=0;
        while(i != 0)

        {
            int d = i % 10;
            r = r * 10 + d;
            i /= 10;
        }
        System.out.println("reverse of a number:" + r);

    }
    }

// Conditional Statements:

// write a program to return a number
//input: 123456
//output: 654321
