import java.util.Scanner;

public class floop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int b=sc.nextInt();
        System.out.println("table of "+b+" is:");
        for(int a=1;a<11;a++){
            System.out.println(a*b);
            sc.close();
        }


    }
    
}
