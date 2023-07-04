package org.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program1Two {
public static void main(String[] args) {
	Map h= new LinkedHashMap();
	h.put("10",10);
	h.put("20",20);
	h.put("30",30);
	h.put("40",40);
	h.put("50",50);
	h.put("60",60);
	h.put("10",10);
	h.put("50",50);
	h.put("40",40);
	System.out.println(h);
}
}
