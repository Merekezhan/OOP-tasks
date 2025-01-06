package task2;

public class Device {
	 String brand;
	 String model;

	 public Device(String brand, String model) {
	     this.brand = brand;
	     this.model = model;
	 }
	
	 public void sell() {
	     System.out.println("Selling the iPhone.");
	 }


	 public void plugging() {
	     System.out.println("iPhone is plugged in.");
	 }


	 public void charge() {
	     System.out.println("iPhone is powering on.");
	 }
	}


