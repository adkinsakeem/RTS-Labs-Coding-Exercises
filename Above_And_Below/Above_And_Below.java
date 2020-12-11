public class Above_And_Below{

	public static void Array_2_InitValue_Check(int initNumber, int[] arrNumbers){
		int aboveNum = 0;
		int belowNum = 0;

		for(int arrSingleNum : arrNumbers){
			if(arrSingleNum > initNumber)     /*Checks if the numbers in the Array is greater than the initNumber variable*/
				aboveNum++;	    /*Adds to the aboveNum variable if it is*/
			else if(arrSingleNum < initNumber)
				belowNum++;      /*Adds to the belowNum variable if it is not*/
		}
		System.out.println("above: " + aboveNum + ", below: " + belowNum);      /*Prints the results*/
	}
}