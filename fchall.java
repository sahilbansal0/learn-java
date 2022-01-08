public class fchall {
    
    public static void main(String[] args) {
        
       int d=calc(1000);
       displayhighscoreposition("sahil",d);
        
    }
    public static void displayhighscoreposition(String name,int position){
        System.out.println(name+" managed to get into position  "+position+" on the table");

    }
    public static int calc(int score){
        if(score>=1000){
            return 1;
        }
        else if(score>=500 && score<1000){
            return 2;
        }
        else if(score>=100 && score<500){
            return 3;
        }
        else{
            return 4;
        }

    }
}
