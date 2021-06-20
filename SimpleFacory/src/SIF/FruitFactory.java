package SIF;

public class FruitFactory {
	public static Fruit produceFruit(String brand) {
		if(brand.equalsIgnoreCase("Apple")) {
			return new Apple();
		}
		else if(brand.equalsIgnoreCase("Bannana")) {
			return new Bannana();
		}
		else {
			return null;
		}
		
	}
}
