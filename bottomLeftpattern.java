
public class bottomLeftpattern{
    
    public static void bottomLeftpattern(int n){

        int curr_star =1;
        int stars = 1;
        int spaces= n-1;

        while(curr_star <= n){
            
            for(int i=1;i<=spaces;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars++;
            curr_star++;
        }
    }
    public static void main(String[] args) {
        int n =5;
        bottomLeftpattern(n);
    }
}