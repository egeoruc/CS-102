
public class DriverLicense {
	private String driverName;
	private String driverID;
	private String expirationDate;
	private String bloodType;
	private int penalty;
	private boolean status;
	
	public DriverLicense(String driverName, String driverID, String expirationDate, String bloodType){
		this.driverName = driverName;
		this.driverID = driverID;
		this.expirationDate = expirationDate;
		this.bloodType = bloodType;
		this.penalty = 0;
		this.status = true;
	}
	
	public void increasePenalty(int penaltyPoints){
		this.penalty += penaltyPoints;
		setStatus();
	}
	
	public void decreasePenalty(int penaltyPoints){
		if(this.penalty - penaltyPoints > 0){
			this.penalty -= penaltyPoints;
		}
		else{
			this.penalty = 0;
		}
		setStatus();
	}
	
	private void setStatus(){
		if(penalty >= 100){
			status = false;
		}
		else if(!status && penalty < 20){
			status = true;
		}
	}
		
	public void setExpirationDate(String expirationDate){
		this.expirationDate = expirationDate;
	}
	
	public String toString(){
		return " Name : " + driverName + 
				"\n Id : " + driverID +
				"\n Expiration Date : " + expirationDate +
				"\n Blood Type : "  + bloodType +
				"\n Penalty : " + penalty +
				"\n Status : " + status + 
				"\n -------------";
	}
}

