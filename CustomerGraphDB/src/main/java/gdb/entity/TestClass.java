package gdb.entity;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import gdb.GraphImpl;
import gdb.Vertex;

public class TestClass {

	static ConcurrentHashMap<Vertex,String> s1= new ConcurrentHashMap<Vertex, String>();
	public static void main(String[] args) {
		GraphImpl graph=GraphImpl.getInstance();
		// TODO Auto-generated method stub
		Vertex c1 = new Region(1, "20-30", "Age");
		Vertex c2 = new Region(2, "20-31", "Age");
		
		Set<Vertex> s = new HashSet<Vertex>();
		s.add(c1);
		System.out.println(s.contains(c2));
		s.add(c2);
		System.out.println(s.size());
		
		 
		s1.put(c1, "a");
		System.out.println(s1.containsKey(c1));
		s1.put(c2, "b1");
		System.out.println(s1.size());
		
		graph.addVertex(c1);
		System.out.println(graph.isVertexExists(c2));
	}

}
