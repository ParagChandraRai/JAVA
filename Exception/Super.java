/* 11.16 (Catching Exceptions with Superclasses) Use inheritance to create
an exception superclass (called ExceptionA) and exception subclasses
ExceptionB and ExceptionC, where ExceptionB inherits from
ExceptionA and ExceptionC inherits from ExceptionB. Write a
program to demonstrate that the catch block for type ExceptionA
catches exceptions of types ExceptionB and ExceptionC. */


public class ExceptionA extends Exception {

	public ExceptionA() {
		super("Exception A");
	}

	public ExceptionA(String message) {
		super(message);
	}
}
public class ExceptionB extends ExceptionA {

	public ExceptionB(String message) {
		super(message);
	}
}
public class ExceptionC extends ExceptionB {

	public ExceptionC(String message) {
		super(message);
	}
}

public class Test {

	public static void main(String[] args) {
		try {
			throw new ExceptionB("Exception B");
		} catch (ExceptionA e) {
			e.printStackTrace();
		}

		try {
			throw new ExceptionC("Exception C");
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
	}

}
