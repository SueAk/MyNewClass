package NewBatch;

public class SwichConditions {

	public static void main(String[] args) {

		int Month = 7;
		System.out.print("The Year Is : ");
		switch (Month) {

		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("February");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("June");
			break;

		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;

		case 10:
			System.out.println("October");
			break;

		case 11:
			System.out.println("November");
			break;

		case 12:
			System.out.println("December");
			break;

		default:
			System.out.println("Invalid Year Number");

		}

	}

}
//Note: The Java switch statement only works with:

//Primitive data types: byte, short, char, and int
//Enumerated types
//String Class
//Wrapper Classes: Character, Byte, Short, and Integer.