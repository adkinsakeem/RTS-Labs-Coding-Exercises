public class Above_And_Below{

	public static void Array_2_InitValue_Check(int initNumber, int[] arrNumbers){
		int aboveNum = 0;
		int belowNum = 0;


		for(int arrSingleNum : arrNumbers){
			if(arrSingleNum > initNumber)
				aboveNum++;
			else if(arrSingleNum < initNumber)
				belowNum++;
		}
		System.out.println("above: " + aboveNum + ", below: " + belowNum);
	}
}