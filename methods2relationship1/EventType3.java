package methods2relationship1;

import java.util.ArrayList;
import java.util.List;
public class EventType3 {
    private String name;
private List<Hall3> hallList=new ArrayList<Hall3>();
public EventType3() {
super();
}
public EventType3(String name) {
super();
this.name = name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
void addToHallList(Hall3 hall)
{
hallList.add(hall);
}
public List copyNoOfevents()
{
return hallList;
}
}