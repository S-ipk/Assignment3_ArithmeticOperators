package Assignment3_ArithmeticOperators;

public class Question5 {

	public static void main(String[] args) {
		
		//first we have to convert given seconds into hours,minutes,seconds
		
		int inputSecond, hour, minute, second;
		inputSecond = 3695;
		hour = inputSecond % 60;
		minute = inputSecond / 60;
		second = minute % 60;
		minute = minute / 60;
		
		System.out.println(minute + " hours " + second + " minutes " + hour + " seconds");
		
		
		
		
		
		
		
		
		

	}

}
