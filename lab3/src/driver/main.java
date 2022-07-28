package driver;

import service.BalancingBrackets;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		
		String bracketExpression = "([[{}]])";
	
		Boolean result;
     
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result)
		{
			System.out.println("The Entered String contains Balanced brackets");
		}
		else
			System.out.println("The Entered String does not contains Balanced brackets");
}
	
}
