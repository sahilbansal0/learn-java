public class dog {
    public static void main(String[] args) {
        
        boolean barking=shouldWakeUp(true, 23);
        System.out.println(barking);
        
    }
    public static boolean shouldWakeUp(boolean barking,int hoursofDay){
        if(hoursofDay>=0 && hoursofDay<=23){

        
        if(barking==true && (hoursofDay<8 || hoursofDay>22)){
            barking=true;

        }
        else{
            barking=false;
        }
    }
    else{
        barking=false;
    }
    return barking;
        
    }
}    

       


    

    

