package seleniumexample1;

public class BaseFunction {
	public static void launchURL(String appURL) {
		driver.get(appURL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofseconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofseconds(30));
		
		
	}
     public static void sleep() {
    	 try {
    		 Thread.sleep(2000);
    	 }catch(InterruptedException e) {
    		 e.printStackTrace();
    	 }
     }
	
	public static void  takeScreenShots() {
		try {
			sleep();
			TakeScreenShot ts=
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
