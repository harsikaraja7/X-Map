package org.map;

import java.util.Map;
import java.util.TreeMap;

public class Program1Three {
public static void main(String[] args) {
	Map h = new TreeMap();
	h.put("!", 10);
	h.put("@", 20);
	h.put("#",30);
	h.put("$",40);
	h.put("%", 50);
	h.put("^", 60);
	h.put("&",10);
	h.put("*",50);
	h.put("(",40);
	System.out.println(h);
}
}
