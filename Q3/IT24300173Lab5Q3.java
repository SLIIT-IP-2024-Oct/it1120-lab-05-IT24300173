import java.util.Scanner;

public class IT24300173Lab5Q3{
	public static void main(String[] args) {

	final int RoomChargePerDay = 48000;
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter Start Date (1-31):");
	int startDate = scanner.nextInt();
	
	System.out.print("Enter End Date (1-31):");
	int endDate = scanner.nextInt();
	
	if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
		System.out.println("Error: Days must be between 1 and 31");

	} else if (startDate >= endDate) {
		System.out.println("Error: Start Date must be less than End Date");
		
		} else {

			int daysReserved = endDate - startDate;
			
			int discountRate;
			if (daysReserved < 3) {
				discountRate = 0;
			} else if (daysReserved <= 4) {
				discountRate = 10;
			} else {
				discountRate = 20;
			}
			
			int totalAmount = daysReserved * RoomChargePerDay;
			int discountAmount = totalAmount * discountRate / 100;
			int amountToBePaid = totalAmount - discountAmount;

			System.out.println("Number of Days Reserved: " + daysReserved);
			System.out.println("Total amount to be paid: " + amountToBePaid);
		}
	}
}