package CourtTask;
import java.util.Scanner;

public abstract class Case implements ICase{
	Scanner in = new Scanner(System.in);
	final static int MAX_WITNESSES = 10;

	private Judge judge;
	private Jury jury;
	private Defendant defendant;
	private Witness[] witnesses;
	private int numberOfWitnesses;
	
	public Case(Judge judge, Defendant defendant) {
		if(judge!=null){
			this.judge = judge;
		}
		if(defendant!=null){
			this.defendant = defendant;
		}
		witnesses = new Witness[MAX_WITNESSES];
	}
	
	public void setJury(int howMany){
		jury = new Jury(howMany);
	}
	
	@Override
	public void increaseCasesOfAll() {
		judge.increaseNumberOfCases();
		defendant.increaseCasesOfLawyers();
		jury.increaseNumberOfCases();
	}
		
	public Defendant getDefendant() {
		return defendant;
	}
	
	public Witness[] getWitnesses() {
		return witnesses;
	}
	
	public Jury getJury(){
		Jury newJury = jury;
		return newJury;
	}
	
	public Judge getJudge(){
		Judge newJudge = judge;
		return newJudge;
	}
	boolean hasWitness(Witness witness){
		for(int i=0;i<numberOfWitnesses;i++){
			if(witnesses[i].equals(witness)){
				return true;
			}
		}
		return false;
	}
	
	void addWitness(Witness witness){
		if(!hasWitness(witness)){
			witnesses[numberOfWitnesses]=witness;
			numberOfWitnesses++;
		}
		else{
			System.out.println("Witness already added.");
		}
	}
	
	public int getNumberOfWitnesses() {
		return numberOfWitnesses;
	}
	
	public void conduct() {
		this.increaseCasesOfAll();
	}
}