
public class Euler1 {
	
   public static void main(String[] args){
	   Euler1 problem = new Euler1();
	   problem.eulerProb1(1000);
   }
	
	public void eulerProb1(int maxnum) {
		   int finalAnswer = 0;
		   int multiplier3 = 3;
		   int multiplier5 = 5;
		   long timeStarted = System.currentTimeMillis();
		   long totalTime;
	
		    // Add all numbers which are multiples of 3 but NOT of 5
		    for( ;multiplier3 < maxnum; multiplier3 += 3){
		      if(multiplier3 % 5 != 0){
		         finalAnswer += multiplier3;
		      } 
		    }
		    // Add all numbers which are multiples of 5
		    for( ;multiplier5 < maxnum; multiplier5 += 5){
		      finalAnswer += multiplier5;
		    } 
	
		    totalTime = System.currentTimeMillis() - timeStarted;
		    System.out.println("Time: " + totalTime + " milliseconds");
		    System.out.println("Answer is : " + finalAnswer);
		}
}
