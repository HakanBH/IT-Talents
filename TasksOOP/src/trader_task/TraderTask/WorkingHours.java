package TraderTask;

public class WorkingHours {
	int openingHour;
	int closingHour;
	
	WorkingHours(int opens, int closes){
		if(opens<closes){
			setOpeningHour(opens);
			setClosingHour(closes);
		}
	}
	
	void setOpeningHour(int hour){
		if(hour<=24 && hour >= 0){
			this.openingHour=hour;
		}
	}
	
	void setClosingHour(int hour){
		if(hour<=24 && hour >= 0){
			this.closingHour=0;
		}
	}
}
