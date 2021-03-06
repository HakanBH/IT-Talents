package CourtTask;

public class CivilCase extends Case{
	final static int NUMBER_OF_JURORS = 3; 
	private Accuser accuser;
	
	CivilCase(Judge judge, Defendant defendant, Accuser accuser){
		super(judge, defendant);
		if(accuser!=null){
			this.accuser = accuser;
		}
		setJury(NUMBER_OF_JURORS);
	}
	
	@Override
	public void increaseCasesOfAll() {
		super.increaseCasesOfAll();
		accuser.increaseCasesOfLawyers();
	}
	
	@Override
	public void conduct() {
		this.increaseCasesOfAll();
		for(int i=0;i<accuser.getNumberOfLawyers();i++){
			accuser.getLawyers()[i].askMultipleQuestions(super.getDefendant(),3);
		}
		if(super.getNumberOfWitnesses()>0){
			for(int i=0;i<accuser.getNumberOfLawyers();i++)
				for(int j=0; j<super.getNumberOfWitnesses();j++){
					accuser.getLawyers()[i].askMultipleQuestions(super.getWitnesses()[j],2);
			}
			for(int i=0; i<super.getDefendant().getNumberOfLawyers(); i++)
				for(int j=0; j<super.getNumberOfWitnesses();j++){
					super.getDefendant().getLawyers()[i].askMultipleQuestions(super.getWitnesses()[j], 5);
			}
			if(super.getJury().isGuilty()){
				super.getJudge().giveSentence();
			}
		}
		
		
		
	}
}
