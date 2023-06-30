package firstpackage;

public class VehicleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ElectricVehicle V1 = new ElectricVehicle();
V1.brandName = "Hyundai";
V1.modelName = "Ioniq";
V1.modelYear = 2023;
V1.mileageValue = "700km";
V1.isBackupCameraPresent = true;
V1.engineType = "4 litre turbo";

// invoking the method
V1.caroftheYear();
V1.topinMileage();
V1.backingCamera();
V1.poweroftheEngine();


ElectricVehicle V2 = new ElectricVehicle();
V2.brandName = "Tesla";
V2.modelName = "modelS";
V2.modelYear = 2023;
V2.mileageValue = "650";
V2.isBackupCameraPresent = true;
V2.engineType = "4 Litre Dual motor ";

//invoking V2
V2.caroftheYear();
V2.topinMileage();
V2.backingCamera();
V2.poweroftheEngine();

	}

}
