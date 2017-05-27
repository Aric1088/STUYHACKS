import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RegexMain{
  
  ArrayList<String> main;
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    }
  
  public ArrayList<String> findInt(int x, int y, String input){
    String pattern = "(["+x+"-"+y+"]+)";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(input);
    ArrayList<String> lol = new ArrayList<String>();
    while (m.find()){
      lol.add(m.group());
      
    }
    return lol;
    }

 
}