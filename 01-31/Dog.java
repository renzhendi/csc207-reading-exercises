
public class Dog {
	
	public String dogBreed;
	public int dogAge;
	public double dogWeight;
	public double dogHeight;
	public String dogName;
	public String ownerName;
	
	public Dog(String dogBreed, int dogAge, String dogName, String ownerName) {
		this.dogBreed = dogBreed;
		this.dogAge = dogAge;
		this.dogWeight = 1.1; // start at 0.5 kg = 1.1 pounds
		this.dogHeight = 7.8; // start at 20 cm = 7.8 inches
		this.dogName = dogName;
		this.ownerName = ownerName;
		// TODO Auto-generated constructor stub
	}
	
	public void growOlder(){
		this.dogAge += 1;
	}
	
	public void growLarger(){
		this.dogWeight += 2.2; // 1 kg = 2.2 pounds
		this.dogHeight += 0.39; // 1 cm = 0.39 inch
	}

}