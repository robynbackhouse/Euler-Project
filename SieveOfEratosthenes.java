import java.util.ArrayList;


public class SieveOfEratosthenes {

	public static void main(String[] args){
		SieveOfEratosthenes problem = new SieveOfEratosthenes();
		System.out.println(problem.seiveOfEratosthenes(100));
	}
	
	public ArrayList <Integer>seiveOfEratosthenes(int n){
		ArrayList <Integer>result = new ArrayList<Integer>();
		ArrayList <Integer>origNumbers = new ArrayList<Integer>();
		populateEratosthenesArray(result, n);
		populateEratosthenesArray(origNumbers, n);

		for(int counter = 0; counter < origNumbers.size(); counter++){
	    	for(int i = 0; i < origNumbers.size();i++){
	    		if (result.contains(origNumbers.get(counter) * origNumbers.get(i))){
	    			result.remove(result.indexOf(origNumbers.get(counter) * origNumbers.get(i)));
	    		}
	    	}
	    } 
		return result;
	}

	private void populateEratosthenesArray(ArrayList <Integer>result, int n ){
		// Creates a list of all numbers between 2 and n
		result.ensureCapacity(n);
		for(int i = 2; i <= n; i++){
			result.add(i);
		}
	}
}
