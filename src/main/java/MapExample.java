import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
public static void main(String args[])
{
	Map <Integer,String> employeeDetails=new HashMap<Integer,String>();
	employeeDetails.put(1,"pretti");
	employeeDetails.put(2,"mayank");
	
	Set entries=employeeDetails.entrySet();
	Iterator i=entries.iterator();
	while(i.hasNext()) 
	{
	Map.Entry<Integer,String>e1=(Entry<Integer, String>) i.next();
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
	}
	
	}
}
