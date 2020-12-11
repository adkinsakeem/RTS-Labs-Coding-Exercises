public class Values_For_Above_And_Below{

	public static void main(String[] args){
		
		int[] newArray = getArray();
		int initNumber = 9;
		/*Sends the variables to the Array_2_InitValue_Check function in the Above_And_Below class*/
		Above_And_Below.Array_2_InitValue_Check(initNumber, newArray);
	}

	private static int[] getArray(){

		/*A list of arrays that can be used to test the Above_And_Below class*/
		int[] newArray = {11, 15, 14, 4, 24, 8, 19, 10, 17, 13, 11, 16, 25, 3, 2, 25, 26, 7};
		// int[] newArray = {30, 10, 2, 5, 23, 26};
		// int[] newArray = {16, 11, 10, 27, 20, 7, 23, 11, 5, 4};
		// int[] newArray = {15};
		// int[] newArray = {5, 16, 9, 4, 3, 8, 14, 2, 19};
		// int[] newArray = {14, 6, 12, 22};
		// int[] newArray = {6, 8, 3, 9, 5};

		return newArray;
	}
}