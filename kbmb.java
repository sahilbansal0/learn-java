public class kbmb {
    public static void main(String[] args) {
        printMegaBytesAndKilloBytes(0);
        
    }
    public static void printMegaBytesAndKilloBytes(int kiloBytes){
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else{
            int mb=Math.round(kiloBytes/1024);
            int kb=(kiloBytes%1024);
            System.out.println(+kiloBytes+" KB = "+mb+" MB and "+kb+" KB ");
        }
    }
    
}
