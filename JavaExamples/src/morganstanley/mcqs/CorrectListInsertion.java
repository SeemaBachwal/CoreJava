package morganstanley.mcqs;

import java.util.ArrayList;
import java.util.List;

public class CorrectListInsertion {

	public static void main(String[] args) {
		
		// INSERT HERE
		
		// below options give compilation error
		
		// List<List<Integer>> table = new List<List<Integer>>();
		// List<List, Integer> table = new List<List , Integer>();
		// List<List, Integer> table = new ArrayList<List , Integer>();
		// List<List, Integer> table = new List<ArrayList , Integer>();
		
		
		// below declaration works fine
		List<List<Integer>> table = new ArrayList<List<Integer>>();
		
		for (int i = 0; i <= 10; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j <= 10; j++) 
				row.add(i * j);
				table.add(row);
			
		}
		
		for (List<Integer> row : table)
			System.out.println(row);
	}
}
