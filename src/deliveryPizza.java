
public class deliveryPizza extends pizza{
	
	private String address;
	private double deliveryFee;
	private final int LOW = 3;
	private final int HIGH = 5;
	private final int SET = 15;

	public deliveryPizza(String desc, double pr, String address) {
		super(desc, pr);
		this.address = address;
		if(pr>SET)
			deliveryFee = LOW;
		else
			deliveryFee = HIGH;
		
}}
