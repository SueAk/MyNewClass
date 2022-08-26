package NewBatch;

public class Operators {

	public static void main(String[] args) {
		// int a, b, c;// declaration
		// a = 10;// assignment
		// b = 15;// assignment
		// c = a * b;// process
		// System.out.println(c);// output

		int a, b;
		a = 10;
		b = 15;

		// Arithmetic Operators----> + - * % /
		System.out.println("------------Arithmetic Operators----------");
		System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
		System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
		System.out.println("Substraction " + a + " and " + b + " is " + (a - b));
		System.out.println("Division " + a + " and " + b + " is " + (a / b));
		System.out.println("Modula Div." + a + " and " + b + " is " + (a % b));

		// Relational Operators(Comparison Operators)----> == < > <= >= !=
		System.out.println("------------Relational Operators----------");
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);

		// Logical Operators-----> && || !
		// Work between to Boolean

		boolean x = true;
		boolean y = false;
		System.out.println("------------Logical Operators----------");
		System.out.println(x && y);// both should be True/false
		System.out.println(x || y);// One of them should be True , || means OR
		System.out.println(!x);// if X is true then !x is false
		System.out.println(!y);// if y is false then !Y is true

		// Unary operators
		// Increment/Decrements Operators-----> ++ --

		a = 10;
		a++; // a=a+1;
		System.out.println("------------Increment/Decrement Operators----------");
		System.out.println(a);

		b = 10;
		b--; // b=b-1;
		System.out.println(b);

		//-------
		//System.out.println("Unary operators");
		//int d = 10;
		//System.out.println("d=" + d);// 10
		//System.out.println("++d=" + ++d);// 11
		//System.out.println("d++=" + d++);// 11
		//System.out.println("d=" + d);// 12

		// Ternary Operator
		int marks = 40;
		String result;
		result = (marks > 39) ? "pass" : "fail";
		System.out.println("Result:" + result);

	}

}
