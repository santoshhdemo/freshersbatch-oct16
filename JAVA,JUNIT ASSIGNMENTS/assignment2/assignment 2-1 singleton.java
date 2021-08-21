import java.util.*;
public class Singleton 
{
	static Singleton obj = new Singleton();
	private Singleton() 
	{
		
	}
	public static Singleton getobj()
	{
		return obj;
		
	}
	
}
class Subclass extends Singleton
{
	public static void main(String[] args)
	{
	Subclass act= new act();
	act.getobj();
	}
	
}