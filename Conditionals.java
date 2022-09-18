import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {


        Scanner i = new Scanner(System.in);

        char ch = i.next().trim().charAt(0);

        if (ch >='a' && ch <= 'z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("UpperCase");
        }



        //        int salary = 23000;
//
//        if (salary < 10000){
//            salary += 1000;
//        }else if (salary < 20000){
//            salary += 3000;
//        }else {
//            salary += 5000;
//        }
//        System.out.println(salary);


        // Q: Print numbers 1 to 100;


//        int a = i.nextInt();
//        int b = i.nextInt();
//        int c = i.nextInt();
//
//        int max = a;
//
//        if (b > max){
//            max = b;
//        }
//
//        if (c > max){
//            max = c;
//        }
//
//        System.out.print(max);

//        int n = i.nextInt();

//        for (int num = 1; num <=n ; num += 1) {
//            System.out.print(num + " ");
//        }


//        while loop

//        float numb = 1.9f;
//        while (numb <= 10.5){
//            System.out.println(numb);
//            numb++;
//        }

    }
}
