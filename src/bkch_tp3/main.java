package bkch_tp3;

import classes.ProgramFactory;
import classes.ProgramInterface;

public class main {

	public static void main(String[] args) {
		
		ProgramFactory factory = new ProgramFactory();
		ProgramInterface programe = factory.factory(4);
		System.err.println("Hello");
		
		programe.go();
	}

}
