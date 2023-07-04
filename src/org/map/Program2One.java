package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program2One {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put(10,"java");
	m.put(20,"spq");
	m.put(30,"oops");
	m.put(40,"sql");
	m.put(50,"oracle");
	m.put(60,"DB");
	m.put(10,"selenium");
	m.put(50,"psql");
	m.put(40,"Hadoop");

	System.out.println(m.get(10));
	System.out.println(m.get(20));
	System.out.println(m.get(30));
	System.out.println(m.get(40));
	System.out.println(m.get(50));
	System.out.println(m.get(60));
	System.out.println(m.get(10));
	
	
}
}

