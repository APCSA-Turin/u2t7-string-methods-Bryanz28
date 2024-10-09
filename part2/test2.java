package part2;
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      System.out.println("enter a string");
        String str1 = scan.nextLine();
      System.out.println("enter another string");
      String str2 = scan.nextLine();
        boolean eq = str1.equals(str2);
      if (eq==true) {
        System.out.println("the strings are equal");
      } else {
        System.out.println("the strings are not equal");
      }

      int comp = str1.compareTo(str2);

      if (comp>0) {
        System.out.println(str1 + " is after " + str2);
      } 

      else if(comp<0){
        System.out.println(str1 + " is before " + str2);
      }
      
      
        scan.close();
}
}