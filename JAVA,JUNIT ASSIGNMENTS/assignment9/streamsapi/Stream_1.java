package streamsapi;

public class Stream_1{
	String name;
	int calories;
	int price;
	String color;
	
	public Stream_1(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
}
