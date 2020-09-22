package Assignment3_ArithmeticOperators;

public class Question7 {

	public static void main(String[] args) {
		
		
		int cent,change,quarter, dime, nickles;
		
		//1 dollar is 100 cents
        cent = 95;
        change = 100-cent;
        
        //1 quarter is 25 cents
        quarter = change/25;
        change = change%25;
        
        //1 dimes is 10 cents
        dime = change/10;
        change = change % 10;
        
        //1 nickel is 5 cents
        nickles = change /5;
        change = change % 5;
 
	    System.out.println("Your change is " + quarter + " quarters " + dime + " dimes " + nickles + " nickles");
	    



	}

}
