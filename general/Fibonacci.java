class Fibonacci{
	
	/* Formula: next = currentNumber + prevNumber; */
	
	public static void main(String args[]){
		//System.out.println("This is a test!");
		int num = 0;
		int prev = 0;
		int next = 1;		
		int newNum = 0;
		while( num <= 10 ){
		
			System.out.print(newNum+" ");
				
			newNum = prev + next;
			prev = next;
			next = newNum;
			num++;
		
		}
		
	}
//	System.out.println("End");
}
