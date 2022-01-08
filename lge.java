import java.util.Scanner;

public class lge {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a");
         int a=sc.nextInt();
         System.out.println("enter b");
         int b=sc.nextInt();
         if(a==b){
             System.out.println("equal");
         }
         
             else if(a<b){
                 System.out.println("less");
             }

                
             
         
         else{
             System.out.println("greater");
         
         }
    sc.close();
}
    
}
