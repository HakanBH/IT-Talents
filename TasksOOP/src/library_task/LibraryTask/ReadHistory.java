package LibraryTask;
import java.time.LocalDateTime;

public class ReadHistory {
	private LocalDateTime takenTime;
	private LocalDateTime returnedTime;

	public ReadHistory(LocalDateTime takenTime) {
		this.setTakenTime(takenTime);
	}

	public LocalDateTime getTakenTime() {
		return takenTime;
	}

	public void setTakenTime(LocalDateTime takenTime) {
		this.takenTime= takenTime;
	}

	public LocalDateTime getReturnedTime() {
		return returnedTime;
	}

	public void setReturnedTime(LocalDateTime returnedTime) {
		this.returnedTime = returnedTime;
	}
}
