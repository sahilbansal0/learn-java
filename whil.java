
import java.util.Scanner;

public class whil {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
