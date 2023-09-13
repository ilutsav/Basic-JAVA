import java.util.*;
public class firstprogram {

    public static void main(String[] args) {
       System.out.println("Enter number to test");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        if(n==0){
        System.out.println("number is zero");
       }
       else if(n/2==1){
        System.out.println("number is even");
       }
       else{
        System.out.println("number is odd");
       }

       int s = 3%2;
       System.out.println(s);
       
    }
}