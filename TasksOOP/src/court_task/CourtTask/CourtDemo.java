package CourtTask;

import java.util.Arrays;

public class CourtDemo {
	public static void main(String[] args) {
		Judge judge = new Judge("Tomitov");
		Defendant def = new Defendant("Hakan" , "Sezam", 21);
		Accuser acc = new Accuser("Obvinitel", " nz ", 19);
		Prosecutor pro = new Prosecutor("Prosecutor");

		Lawyer lawyerOfDefendant = new Lawyer("Lawyer of Defendant");
		Lawyer lawyerOfAccuser = new Lawyer("Lawyer of accuser");
		
		def.addLawyer(lawyerOfDefendant);
		acc.addLawyer(lawyerOfAccuser);
		
		System.out.println("NEW CIVIL CASE!");
		CivilCase c = new CivilCase(judge, def, acc);
		c.addWitness(new Witness("Svidetel", "asd",0));
		c.conduct();

//		System.out.println("New Criminal Case:");
		//CriminalCase case2 = new CriminalCase(judge,def,pro);
		
	}
}
