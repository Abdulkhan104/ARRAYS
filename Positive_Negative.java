import java.util.*;

public class Positive_Negative {

    public static void main(String[] args) {

        System.err.print("Enter The Number :: ");
        
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");

        }

    }
}