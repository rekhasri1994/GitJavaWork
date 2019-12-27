
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
public class Mainxsdg {
   public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of words:");
		Integer i1=br.read();
	    String str = br.readLine();
        String[] strArray = str.split("\\s+");
        Map<String, String> hMap = new LinkedHashMap<String, String>();
        for(int i = 0; i < strArray.length ; i++ ) {
         if(!hMap.containsKey(strArray[i])) {
            hMap.put(strArray[i],"Unique");
         }         
      }
      System.out.println(hMap);		
   }
}