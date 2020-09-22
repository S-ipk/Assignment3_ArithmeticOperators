package Assignment3_ArithmeticOperators;

public class Question4 {

	public static void main(String[] args) {
		
		//Swap numbers 
		
		int Num1 =  10, Num2 = 20;
		
		System.out.println("->Before swap<-");
		System.out.println("First number = "  + Num1);
		System.out.println("Second number =" + Num2);
		
		//value of second is assigned to temporary
		
		int temporaryNum = Num1;
		
		//value of second is assigned to first
		
		Num1 = Num2;
		
		//then temporary number is assigned to second number
		
		Num2 = temporaryNum;
		
		System.out.println("->After swap<-");
		System.out.println("First number = "  + Num1);
		System.out.println("Second number =" + Num2);
	
	

	}

}
