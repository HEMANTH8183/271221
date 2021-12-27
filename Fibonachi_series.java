class Fibonachi_series{  
	public static void main(String args[]){  
	int number=30;
		int first_term=1, second_term=1, third_term;
			System.out.println(first_term);
			System.out.println(second_term);
				for(int index=3; index<=number; index++){
					third_term= first_term+second_term;
				 System.out.println(third_term);
					first_term=second_term;
					second_term=third_term;
				}	
	}
}	