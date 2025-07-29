package Game;
import java.util.Scanner;
public class N_G {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int AI_num = (int)(Math.random()*100)+1;
        int U_num=0;
        do{
            System.out.println("Enter number between 1-100 :");
            U_num=sc.nextInt();
            if(U_num == AI_num){
                System.out.println("Whoo hoo !! u guessed right number ");
                break;
            }
            else if(U_num>AI_num){
                System.out.println("Your number is Greater than AI number");
                break;
            }
            else{
                System.out.println("Your number is smaller");
                break;
            }
        
        }
        while(U_num>=0);
        System.out.println("User num is : "+U_num);
        System.out.println("AI num is :"+AI_num);

    }
}
