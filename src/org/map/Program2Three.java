package org.map;

import java.util.Map;
import java.util.TreeMap;

public class Program2Three {
public static void main(String[] args) {
	Map m= new TreeMap();
	m.put("!",10);
	m.put("@",20);
	m.put("#",30);
	m.put("$",40);
	m.put("%",50);
	m.put("^",60);
	m.put("&",10);
	m.put("*",50);
	m.put("(", 40);
	System.out.println(m);
	System.out.println(m.get("!"));
	System.out.println(m.get("@"));
	System.out.println(m.get("#"));
	System.out.println(m.get("$"));
	System.out.println(m.get("%"));
	System.out.println(m.get("^"));
	System.out.println(m.get("&"));
	System.out.println(m.get("*"));
	System.out.println(m.get("("));
	
	
	
}
}
