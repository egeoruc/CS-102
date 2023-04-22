
public class DriverLicenseTest {

	public static void main(String[] args){
		DriverLicense driver = new DriverLicense("meric","1234","01.01.2020","a");
		
		driver.increasePenalty(50);
		System.out.println(driver);
		
		driver.increasePenalty(51);
		System.out.println(driver);
		
		driver.decreasePenalty(90);
		System.out.println(driver);
		
		driver.decreasePenalty(15);
		System.out.println(driver);
	}
}
