package part2;
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int pts=0;
        System.out.println("enter a string:");
            String str1 = scan.nextLine();

        while (pts<49){
            System.out.println("enter another string:");
            String str2 = scan.nextLine();
            int var = str1.compareTo(str2);
            int var2 = str1.length();
            var2=var2-3;
            String var3 = str1.substring(var2);
            String var4 = str2.substring(0, 2);
            String var5 = str1.substring(0,1);
            int var6 = str1.indexOf(var5);
            int var7 = str1.length();
            int var8 = str2.length();

            if (var<0) {
                System.out.println("plus 2 points "+str1+" is after "+str2);
                pts=pts+2;
            } 
            
             if (var>0) {
                System.out.println("minus 5 points "+str1+" is before "+str2);
                pts=pts-5;
            }
             if (var==0) {
                System.out.println("minus 10 points "+str1+" the same as "+str2);
                pts=pts-10;
            }

             if(var3==var4){
                System.out.println("plus 5 points, the last two letters of "+str1+" match the first two letters of"+str2);
                pts=pts+5;
            }

           if(var6>=0){
                System.out.println("plus 3 points "+str1+" is found in "+str2);
                pts=pts+3;
            }
            str1=str2;
            

            if (var7==var8){
                System.out.println("plus 10 points, the two words are the same length");
                pts=pts+10;
            }
            System.out.println("you have "+pts+" points");
        }
      
      System.out.println("you win");
        scan.close();
}
}