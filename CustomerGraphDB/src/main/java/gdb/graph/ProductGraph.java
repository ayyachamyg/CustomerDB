package gdb.graph;

import java.util.Set;

import gdb.GDBException;
import gdb.InMemoryGraph;

public class ProductGraph implements InMemoryGraph,GraphQuery{

	@Override
	public Set<Integer> customerByRegion(int regionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Integer> customerByRegionAgeGroup(int regionId, int ageGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Integer> customerByListOfRegionAgeGroup(Set<Integer> regionId, Set<Integer> ageGroupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCutomer(int id, String name, int ageGroup, int region) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute() throws GDBException {
		// TODO Auto-generated method stub
		
	}

}
