import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ist no.");
        int a=sc.nextInt();
        System.out.println("enter 2 no.");
        int b=sc.nextInt();
        System.out.println("write");
        System.out.println("+ for add\n-for sub \n* for mul \n/for div");
        String c=sc.next();
        switch(c){
            case "+":
            System.out.println(a+b);
            break;
        
            case "-":
            System.out.println(a-b);
            break;
            case "*":
            System.out.println(a*b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            default:
            System.out.println("wrong choice");
            sc.close();

        }

    }
    
}
