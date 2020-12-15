public class Rotate_The_Characters{

	/***Rotates nummbers Forward***/
	public static String rotate_Characters_Forward(int rotate_Num, String inputString){
		StringBuilder newInputString = new StringBuilder();

		/***Finds where to begin the string rotation***/
		int rotate_Count = (inputString.length() - (rotate_Num % inputString.length()));

		for(int x=0;x<inputString.length();x++){
			/***If the rotate_Count goes beyon the inputString length, then reset the rotate_Count to zero***/
			if(rotate_Count >= inputString.length())
				rotate_Count = 0;

			newInputString.append(inputString.charAt(rotate_Count));
			rotate_Count++;
			
		}
		return(newInputString.toString());
	}



	/***Rotates nummbers Backward***/
	public static String rotate_Characters_Backward(int rotate_Num, String inputString){
		StringBuilder newInputString = new StringBuilder();

		/***Finds where to begin the string rotation***/
		int rotate_Count = (rotate_Num % inputString.length());

		for(int x=0;x<inputString.length();x++){
			/***If the rotate_Count goes beyon the inputString length, then reset the rotate_Count to zero***/
			if(rotate_Count >= inputString.length())
				rotate_Count = 0;

			newInputString.append(inputString.charAt(rotate_Count));
			rotate_Count++;
		}

		return(newInputString.toString());
	}
}