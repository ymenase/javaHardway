import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "You are: " );
		if (age < 13 ) {
			System.out.println( "\tToo young to create a Facebook account" );
		}		
		if (age >= 13 ) {
			System.out.println( "\tOld enough to create a Facebook account" );
		}
		if (age < 15 ) {
			System.out.println( "\tToo young to get a driver's license" );
		}	
		if (age >= 15 ) {
			System.out.println( "\tOld enough to get a driver's license" );
		}
		if ( age < 18 ) {
			System.out.println( "\ttoo young to get a tattoo" );
		}	
		if ( age >= 18 ) {
			System.out.println( "\tOld enough to get a tattoo" );
		}	
		if ( age < 35 ) {
			System.out.println( "\ttoo young to run for President of the U.S." );
		}	
		if ( age >=35 ) {
			System.out.println( "\tOld enough to run for President of the U.S." );
		}
		if ( age >= 65 ) {	
			System.out.println( "\tYou are old enough to retire!" );
		}
		if (age <  65 ) {
			System.out.println( "\tYou are too young to retire!" );
			System.out.println( "\t\t(How sad!)" );
		}
	}
}