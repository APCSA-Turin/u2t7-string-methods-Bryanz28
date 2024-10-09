package WarmUp;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first string");
        String string1 = scanner.nextLine();  
       
        int str1Length = string1.length();

        
        System.out.println("enter your seccond string");
        String string2 = scanner.nextLine();  
       
        int str2Length = string2.length();

       if (str1Length>str2Length) {
        System.out.println(string1 + " is longer");
       } 
       
       else if(str2Length>str1Length){
        System.out.println(string2 + " is longer");
       }
       
       else {
        System.out.println("Both strings have the same length");
       }

       int str1FirstHalf = str1Length/2;
       String Fsub1 = string1.substring(0,str1FirstHalf);
       System.out.println("first half:" + Fsub1);
       String Ssub1 = string1.substring(str1FirstHalf);
       System.out.println("second half:" + Ssub1);

       int str2FirstHalf = str2Length/2;
       String Fsub2 = string2.substring(0,str2FirstHalf);
       System.out.println("first half:" + Fsub2);
       String Ssub2 = string2.substring(str2FirstHalf);
       System.out.println("second half:" + Ssub2);

       int index = string1.indexOf(string2);

       if (index== -1) {
        System.out.println(string2 + " is not in " + string1);
       } else {
        System.out.println(string2 + " is in " + string1);
       }

       scanner.close();
    }
}
