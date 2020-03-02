import java.util.*;

public class MakePalindrome{
   public static void main(String[] args){
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter you string: ");
      String s = kbd.nextLine();
      String s3 = String.reverse(s);
      String s2 = s + s3;
      System.out.println("Palindrome string is: " + s2 );
        
   }
   public static String reverseString(String s){
       String [] list = s.split(" ");
       String s1;
      for(int i = list.length - 1; i > 0; i--){
         s = s + list[i] + " ";
      }
      s = s + list[0];
      
      return(s);
      

   
   }
}