import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner fibo = new Scanner(System.in);
        int n = fibo.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count += 1;
        }
        System.out.println(b);
    }
}
