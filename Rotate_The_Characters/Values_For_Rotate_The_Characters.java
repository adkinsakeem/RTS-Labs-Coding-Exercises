public class Values_For_Rotate_The_Characters{
	


	public static void main(String[] args){
		int rotate_Num = 2; 
		String inputString = "MyString";

		String newString = Rotate_The_Characters.rotate_Characters_Forward(rotate_Num, inputString);

		System.out.println("The original string was " + inputString + ".");
		System.out.println("The new string was " + newString + ".");
	} 
}