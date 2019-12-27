package methods2relationship1;

import java.util.ArrayList;
import java.util.List;
public class Hall3 {
    
private String name;
private int costPerDay;
private List<EventType3> eventTypeList= new ArrayList<EventType3>();
public Hall3() {
super();
}
List<Integer> noOfEvents= new ArrayList<Integer>();
    public Hall3(String name, int costPerDay) {
super();
this.name = name;
this.costPerDay = costPerDay;
}
     
    public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getCostPerDay() {
return costPerDay;
}
public void setCostPerDay(int costPerDay) {
this.costPerDay = costPerDay;
}
public List<EventType3> getEventTypeList() {
return eventTypeList;
}
public void setEventTypeList(List<EventType3> eventTypeList) {
this.eventTypeList = eventTypeList;
}
void addToNoOfEvents(int n)
    {
    noOfEvents.add(n);
    }
    
    void addToEventTypeList(EventType3 eventType)
    {
    eventTypeList.add(eventType);
    }
   
    private List<Hall3> hallList=new ArrayList<Hall3>();
    void addToHallList(Hall3 hall)
{
hallList.add(hall);
}
    
   public void checkEvent(String event)
    {
    int i=0,j=0,k=0;
    EventType3 ep= new EventType3();
    /*System.out.println(hallList.size());
    for (Hall2 hall2 : hallList) {
System.out.println(hall2.getName());
}*/
    for (EventType3 eventType : eventTypeList) {
    if(noOfEvents.get(j)==k)
    {
    k=0;
    j++;
    }
if(eventType.getName().equals(event))
{
System.out.println(hallList.get(j).getName());
i++;
}
k=k+1;
}
    if(i==0)
    {
    System.out.println("No halls are available for the event type");
    }
    
}
}