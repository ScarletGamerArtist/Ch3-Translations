package AlannaTranslation;
/*
 * Alanna Botscharow
 * 9/18
 * Translate
 */
public class TranslationExample {

	public static void main(String[] args) {
		//Declare a double variable. miles = 100
		double miles;
		miles = 100;
		
		//Declare double constant. KILOMETERS_PER_MILE = 1.609.
		final double KILOMETERS_PER_MILE;
		KILOMETERS_PER_MILE = 1.609;
		
		//Declare double variable kilometers. Multiply miles and KILOMETERS_PER_MILE. Assign result to kilometers.
		double kilometers;
		kilometers = KILOMETERS_PER_MILE * miles;
		
		
		//Display kilometers to the console. 
		System.out.print(kilometers);

	}

}
