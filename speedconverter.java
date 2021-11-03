public class speedconverter{
    public static void main(String[] args) {
       // tomilesperhour(0.0);
    double d=  tomilesperhour(0.0);
     System.out.println(d);
   //  printconversion(0.0);
        
    }
    public static double tomilesperhour(double kilometersperhour){
        if(kilometersperhour<0){
            return  -1;
        }

    
    else{
            //1 km=0.62150404miles
        double milesperhour=((0.62150404)*kilometersperhour);
          //System.out.println(Math.round(milesperhour));
         
          
   
          return (Long)Math.round(milesperhour);

          
        }

    }
  /*  public static void printconversion(double kilometersperhour){
        double milesperhour=  tomilesperhour(kilometersperhour);

        System.out.println(kilometersperhour+"km/h="+milesperhour+"mi/h");
        if(kilometersperhour<0){
            System.out.println("invalid value");
        }
        
        
    }*/
}
