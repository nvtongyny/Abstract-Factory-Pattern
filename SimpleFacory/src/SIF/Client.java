package SIF;

public class Client {
	public static void main(String[] args) {
		String brandName="Apple";
		Fruit fruit = FruitFactory.produceFruit(brandName);
		fruit.eat();
	}
}
