package firstpackage;

public class ElectricVehicle {
	String brandName;
	String modelName;
	int modelYear;
	String mileageValue;
	String engineType;
	boolean isBackupCameraPresent;

	void caroftheYear() {
		System.out.println("Electric vehicle of the year " + brandName + modelName + modelYear );
		
	}
	void topinMileage() {
		System.out.println("mileage of the vehicle on full charge " + mileageValue );
	}
	void backingCamera() {
		System.out.println("Camera is 360 degree " + isBackupCameraPresent );
	}
	void poweroftheEngine() {
		System.out.println("Engine specifications " + engineType);
	}
}
