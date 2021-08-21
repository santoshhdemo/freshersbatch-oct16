package assignment2java;

abstract class Abs{
	public abstract void animals();
	public abstract void birds();
}
class animal{
	public void animals() {
		System.out.println("Animals are part of nature");
	}
}
abstract class sparrow extends Abs{
	public abstract void birds();
}
class Bird extends Abs{
	public void birds() {
		System.out.println("Birds are called ecological handyman");
	}

	public void animals() {
			}

}
public class Absclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a=new animal();
		a.animals();
		Bird b=new Bird();
		b.birds();
	}

}
