package FirstPackage;

public class MobilePhone {
	
	String brandName;
	int modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;
	
		
	void makeCalls()
	{
		
		System.out.println("Making calls from "+brandName+modelNumber );
	}

	void sendTextMessage()
	{
		System.out.println("Send text message from "+brandName+modelNumber);
		
	}
	
	void takePictures()
	
	{
		System.out.println("Taking Pictures from "+brandName+modelNumber);
	}
	
	
}
