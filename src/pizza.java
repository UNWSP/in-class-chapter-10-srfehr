
public class pizza {
	private String description;
	private double price;
	public pizza (String desc, double pr) {
		description = desc;
		price = pr;		
	}
	public void display(){
		System.out.println(description + " $" + price);
	}
	
	
}
