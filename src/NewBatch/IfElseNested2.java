package NewBatch;

public class IfElseNested2 {

	public static void main(String[] args) {

		int age = 15;
		String city = "pune";
		boolean hasAadharcard =true;

		if (city == "pune") {
			System.out.println("The person is in Pune");

			if (age >18) {
				System.out.println("He/She eligible to vote but check Aadhar Card");
			}
			//if (hasAadharcard == true) {
				//System.out.println("He/She eligible to vote");
			//} 
		else {
				System.out.println("The peson is in Pune but not eligible for vote");
			}
		} else {
			System.out.println("He/She not eligible to vote ");
		}

	}

}
