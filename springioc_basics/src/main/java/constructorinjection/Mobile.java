package constructorinjection;

public class Mobile {
	private String model;
	private String brand;
	private int cost;

	public Mobile(String model, String brand, int cost) {
		super();
		this.model = model;
		this.brand = brand;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", cost=" + cost + "]";
	}
}
