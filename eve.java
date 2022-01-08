import java.util.Scanner;

public class eve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write any number");

        int n=sc.nextInt();
        System.out.println("even numbers are:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);

            }
            
        }
        sc.close();

    }
  
}
