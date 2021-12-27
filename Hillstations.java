class Hillstations{
	public static void main(String [] trecking){
		int num =0;
		for (int index =0; index<trecking.length;index++){
			if(num == 8){
				System.out.println();
				num = 0;
			}
			trecking[2] = "nandhihills";
			System.out.print(trecking[index]+"\t");
			
			num = num+1;
			

		}
	}
}