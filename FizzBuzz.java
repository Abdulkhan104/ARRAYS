
import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        
        System.out.print("Enter The Num Between 3 And 5 multiple :: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 15 == 0){
            System.out.print("FizzBuss");
        }else if(num % 5 == 0){
            System.out.println("Buss");
        }else if(num % 3 == 0){
            System.out.println("Fizz ");
        }else{
            System.out.println(" sorry !! Num not valid ");
        }
    }
}
