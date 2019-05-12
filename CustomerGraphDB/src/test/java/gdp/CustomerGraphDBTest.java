package gdp;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import gdb.GDBException;
import gdb.GraphImpl;
import gdb.graph.CustomerGraph;
import junit.framework.TestCase;

class CustomerGraphDBTest extends TestCase{

	public void setUp() throws Exception {
		super.setUp();
		initializeGraph();
		
	}
	static GraphImpl graph;
	CustomerGraph cg;
	
	public void initializeGraph() throws GDBException {
		cg = new CustomerGraph();
		cg.execute();
		
	}
	@Test
	void testCustomerByRegion() throws GDBException {
		initializeGraph();
		Set<Integer> cId = cg.customerByRegion(2);
		System.out.print("testcustomerByRegion -> ");
		cId.forEach(id -> System.out.print(id+","));
		
		
	}
	
	@Test
	void testCustomerByAgeRegion() throws GDBException {
		initializeGraph();
		Set<Integer> cId = cg.customerByRegionAgeGroup(2, 3);
		System.out.print("testCustomerByAgeRegion -> ");
		cId.forEach(id -> System.out.print(id+","));
		
		
	}
	
	@Test
	void testCustomerByListOfAgeRegion() throws GDBException {
		initializeGraph();
		Set<Integer> region = new HashSet<Integer>(); region.add(2);region.add(3);
		Set<Integer> ageGroup = new HashSet<Integer>(); ageGroup.add(2);ageGroup.add(3);
		Set<Integer> cId = cg.customerByListOfRegionAgeGroup(region, ageGroup);
		System.out.print("testCustomerByListOfAgeRegion -> ");
		cId.forEach(id -> System.out.print(id+","));
		
		
	}
	
	

}
