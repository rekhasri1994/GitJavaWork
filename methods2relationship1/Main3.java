package methods2relationship1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) throws NumberFormatException {
Scanner scan= new Scanner(System.in);
List<Integer> noOfEvents= new ArrayList<Integer>();
System.out.println("Enter the number of halls:");
int n= Integer.parseInt(scan.nextLine());
System.out.println("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)");
EventType3 et= new EventType3();
Hall3 h= new Hall3();
for(int i=0;i<n;i++)
{
String str= scan.nextLine();
String b[]= str.split(",");
Hall3 h1= new Hall3(b[0],Integer.parseInt(b[1]));
et.addToHallList(h1);
h.addToHallList(h1);
h.addToNoOfEvents(b.length-2);
for(int j=2;j<b.length;j++)
{
EventType3 e= new EventType3(b[j]);
h.addToEventTypeList(e);
}
}
System.out.println("Enter the event name to get the halls:");
String event= scan.nextLine();
        System.out.println("Event Name:"+event);
System.out.println("Halls:");
h.checkEvent(event);
}
}