import java.util.regex.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main{
  
  public static void main(String[]args){
    File file = new File(sd.txt);
    Scanner input = new Scanner(file);
    String x;;

    while(input.hasNext()) {
    x += input.nextLine();
    }

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