class Leap_year{  
	public static void main(String args[]){  
	int year=2000;
		if(year%400 == 0)
			System.out.println("it is leap year");
		else if(year%100== 0)
			System.out.println("it is not leap year");
		else if(year%4== 0)
			System.out.println("it is leap year");	
	}
}	