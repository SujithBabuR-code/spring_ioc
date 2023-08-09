package springioc_basics.basic1.setterinjection;

public class Laptop {
private String brand;
private int cost;
private String color;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", cost=" + cost + ", color=" + color + "]";
}
}
