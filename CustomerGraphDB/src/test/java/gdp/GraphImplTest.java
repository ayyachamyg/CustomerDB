package gdp;

import org.junit.jupiter.api.Test;

import gdb.GraphImpl;
import gdb.Vertex;
import gdb.entity.Customer;
import gdb.entity.Region;

class GraphImplTest {

	@Test
	void testAddEdge() {
		GraphImpl graph=GraphImpl.getInstance();
		Vertex r = new Region(2, "Ban", "Region");
		Vertex c1 = new Customer(2, "Sel", "Customer",1,2);
		Vertex c2 = new Customer(4, "Yog", "Customer",2,2);
		graph.addEdge(r, c1);
		graph.addEdge(r, c2);
		System.out.println("TestAddEdge :");
		graph.printGraph();
	}
	
	@Test
	void testAddVertex() {
		GraphImpl graph=GraphImpl.getInstance();
		//Vertex r = new Region(2, "Ban", "Region");
		Vertex c1 = new Customer(2, "Sel", "Customer",1,2);
		Vertex c2 = new Customer(4, "Yog", "Customer",2,2);
		graph.addVertex(c1);
		graph.addVertex(c2);
		System.out.println("TestAddVertex :");
		graph.printGraph();
	}
	
	@Test
	void testRemoveVertex() {
		GraphImpl graph=GraphImpl.getInstance();
		//Vertex r = new Region(2, "Ban", "Region");
		Vertex c1 = new Customer(2, "Sel", "Customer",1,2);
		Vertex c2 = new Customer(4, "Yog", "Customer",2,2);
		graph.addVertex(c1);
		graph.addVertex(c2);
		graph.removeVertex(c1);
		System.out.println("TestRemoveVertex :");
		graph.printGraph();
	}
	
	@Test
	void testget() {
		GraphImpl graph=GraphImpl.getInstance();
		Vertex r = new Region(2, "Ban", "Region");
		Vertex c1 = new Customer(2, "Sel", "Customer",1,2);
		Vertex c2 = new Customer(4, "Yog", "Customer",2,2);
		graph.addEdge(r, c1);
		graph.addEdge(r, c2);
		System.out.println("TestGet :");
		graph.get(r).forEach(v -> System.out.print(v.id+","));
		System.out.println();
	}

}
