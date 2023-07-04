package org.map;

import java.util.Hashtable;
import java.util.Map;

public class Program2Four {
public static void main(String[] args) {
	Map m=new Hashtable();
	m.put("Vel","Selenium");
	m.put("Ganesh","framework");
	m.put("Dinesh","oracle");
	m.put("Vengat","corejava");
	m.put("subash","jira");
	System.out.println(m);
	System.out.println(m.get("Vel"));
	System.out.println(m.get("Ganesh"));
	System.out.println(m.get("Dinesh"));
	System.out.println(m.get("Vengat"));
	System.out.println(m.get("subash"));
}
}
