import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){

        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number(n) : ");
        int n = inp.nextInt();
        System.out.println(fibonacci(n));
    }
}
