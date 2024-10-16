package decorator;

public class SpoilerDecorator extends Car{

	private Car client;

	public SpoilerDecorator(Car car) {
		super("",0);
		client = car;
	}
	
	public String getDescription() {
		return (client.getDescription()+" with a spoiler");
	}
	
	public float getPrice() {
		return (client.getPrice()+200);
	}

}
