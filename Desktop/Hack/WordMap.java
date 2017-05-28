import java.util.*;

public class WordMap{

  public static void main(String[]args){
    String dong = "My blood hath been too cold and temperate, Unapt to stir at these indignities, And you have found me; for accordinglyYou tread upon my patience: but be sureI will from henceforth rather be myself,Mighty and to be fear'd, than my condition";
    printMap(setIntegertoCount(parseText(dong), inputStringtoHashMap(parseText(dong))));
     
    //Map<String, Integer> n = new HashMap<String, Integer>();
  }
  
  
  
  
  
  
  
  
  
  
  
  public static String[] parseText(String s){
    String lmao = s;
    lmao.replaceAll(",","");
    lmao.replaceAll(".","");
    lmao.replaceAll("\"","");
    lmao.replaceAll("!","");
    lmao.replaceAll(","," ");
    lmao.replaceAll(":"," ");
    return lmao.split(" ");
  }
  
  public static HashMap<String, Integer> inputStringtoHashMap(String[] s){
    HashMap<String, Integer> n = new HashMap<String, Integer>();
    for(String x: s){
      n.put(x, 1);
    }
    return n;
  }
  
  public static HashMap<String, Integer> setIntegertoCount(String[] s, HashMap<String, Integer> m){
    int count = 0;
    String str = s[count];
    for (int x= 0; x<s.length; x++){
      str = s[count];
      if (m.containsKey(s[x]))
            {
                m.put(str, m.get(str)+1);
            } 
            else
            {
                m.put(str, 1);
            }
            count++;
       }
    return m;
  }
  
  public static void printMap(HashMap<String, Integer> m){
    for (String name: m.keySet()){
      
      String key = name.toString();
      String value = m.get(name).toString();
      System.out.println(key + " " + value);
    }
  }
    
      

      
    
    
    
}
    
    
    //accept txt
    
    //part text into string
    //string split
    //array--> hashmap
    //sort hashmap
    //print all strings
    