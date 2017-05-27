import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RegexMain{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String pattern = "([0-9]+)";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(input);
    while (m.find()){
      System.out.println(m.group());
    }
    
  }
 
}