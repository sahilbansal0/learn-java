import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fac=1;
        for(int i=0;i<n;i++){
           fac=fac*(n-i);
        
        }
        System.out.println("factorial of "+n+" is " +fac);
        sc.close();

    }
    
}
