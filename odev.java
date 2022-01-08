import java.util.Scanner;

public class odev { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int c=sc.nextInt();
        if(c%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
    
}
