package FirstPackage;

public class MobileMain {

	public static void main(String[] args) {
		
		// Instancing a class
		MobilePhone iPhone = new MobilePhone();
	    
		      // Assigning values to the variables
			  iPhone.brandName = "I Phone";
			  iPhone.modelNumber = 12;
			  iPhone.screenSizeInInches = 6.1;
			  iPhone.isCameraPresent = true;
			  
			  // Calling the method or Invoking the method
			  
			  iPhone.makeCalls();
			  iPhone.sendTextMessage();
			  iPhone.takePictures();
			  
			  
		  
			  System.out.println("****************");
			  
			// Instancing a class  
		  MobilePhone samsung = new MobilePhone();
		  		samsung.brandName = "Samsung";
		  		samsung.modelNumber = 10;
		  		samsung.isCameraPresent = true;
		  		samsung.screenSizeInInches = 16;
		  
			  

				  // Calling the method or Invoking the method
				  
				  samsung.makeCalls();
				  samsung.sendTextMessage();
				  samsung.takePictures();
		
            
	}

}
