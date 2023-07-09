package waterTank;

public class TankClass {

final int tankFullCapacity = 100;
final int bucketCapacity = 10;
int tankRisingLevel = 0;
int bucketCount = 0;
void TankClassMethod() 
{
	System.out.println("Filling the tank with water...");
	while(tankRisingLevel < tankFullCapacity) {
		if(tankRisingLevel + bucketCapacity > tankFullCapacity)
		{
			System.out.println("Bucket capacity exceeds");
			int remainingSpace = tankFullCapacity - tankRisingLevel;
			tankRisingLevel += remainingSpace;
		}
		else
		{
			tankRisingLevel += bucketCapacity;
		}
		bucketCount++;
		System.out.println("Tank Level: "+tankRisingLevel+" litres ");
		
		if(tankRisingLevel == tankFullCapacity)
		{
			System.out.println("Tank is full");
			break;
		}
	}
	System.out.println("Total number of bucket used: "+bucketCount);
}
}
