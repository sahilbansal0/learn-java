import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<num-1;i++)

        {
            if(num%i==0){
                System.out.println("not prime");
               
                flag=true;
                break;
            }
        }
        {
            if(flag==false){
                System.out.println("prime");
            }
            
        }
       sc.close();
    }

    
}
