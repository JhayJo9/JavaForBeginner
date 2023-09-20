import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        byte number;
        int userIntered;
        System.out.println("FIZZBUZZ");

        do {
        System.out.print("Enter number : ");
        number  = scan.nextByte();
        
        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if(number % 5 == 0){
            System.out.println("Fizz");
        }
        else if(number % 3 == 0){
            System.out.println("Buzz");
        }
        else if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(number);
        }
        System.out.println("Enter 1 to repeat otherwise enter any enteger to stop : ");
        userIntered = scan.nextInt();
    }while(userIntered == 1);   
    }
}
