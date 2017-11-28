import java.util.regex.*;
import java.util.ArrayList;

public class Main{
  
  public static void main(String[]args){
    String lol = "0 002 2 3 3 3 3 3 3 3 3 3 3 3    33     33 ji";
    String pattern = "([0-9]+)";
    Pattern r = Pattern.compile(pattern);
    ArrayList<String> list= new ArrayList<String>();
    Matcher m = r.matcher(lol);
    while(m.find( )){
      list.add(m.group());
    }
    for(String x: list)
    {
      System.out.println(x);
    }
    
  }
}