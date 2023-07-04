package org.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program2Two {
public static void main(String[] ags) {
	Map m= new LinkedHashMap();
	m.put(10,10);
	m.put(20, 20);
	m.put(30, 30);
	m.put(40,40);
	m.put(50,50);
	m.put(60,60);
	m.put(10,10);
	m.put(50,50);
	m.put(40,40);
	System.out.println(m);
	System.out.println(m.get(10));
	System.out.println(m.get(20));
	System.out.println(m.get(30));
	System.out.println(m.get(40));
	System.out.println(m.get(50));
	System.out.println(m.get(60));
	System.out.println(m.get(10));
	System.out.println(m.get(50));
	System.out.println(m.get(40));
	
}
}
