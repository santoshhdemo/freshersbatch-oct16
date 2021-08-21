package assignment2java;

abstract class persistence{
	abstract void persist();
}

class FilePersistence extends persistence{

	@Override
	void persist() {
		System.out.println("File Persistence");	
	}	
}

class DatabasePersistence extends persistence{

	@Override
	void persist() {
		System.out.println("Database Persistence");
	}	
}

public class Persistence {

	public static void main(String[] args) {
		
		persistence FP=new FilePersistence();
		persistence DP=new DatabasePersistence();
		
		FP.persist();
		DP.persist();

	}
}