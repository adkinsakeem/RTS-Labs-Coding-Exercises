public class Rotate_The_Characters{

	public static String rotate_Characters_Forward(int rotate_Num, String inputString){
			StringBuilder newInputString = new StringBuilder();

			rotate_Num = (inputString.length() - (rotate_Num % inputString.length()));

for(int x=0;x<inputString.length();x++){
	if(rotate_Num >= inputString.length())
		rotate_Num = 0;

	newInputString.append(inputString.charAt(rotate_Num));
	rotate_Num++;
	



}
			return(newInputString.toString());
	}

	public static String rotate_Characters_Backward(int rotate_Num, String inputString){
			StringBuilder newInputString = new StringBuilder();

			rotate_Num = (rotate_Num % inputString.length());


			for(int x=0;x<inputString.length();x++){
	if(rotate_Num >= inputString.length())
		rotate_Num = 0;

	newInputString.append(inputString.charAt(rotate_Num));
	rotate_Num++;
}

			return(newInputString.toString());

	}





}