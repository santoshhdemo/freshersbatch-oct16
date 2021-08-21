package collection;
import java.util.*;

class Contact{
	private String name;
	private long phoneNo;
	private String email;
	private String gender;
	
	public Contact(String name, long phoneNo, String email, String gender) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender= gender;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", gender=" + gender + "]";
	}
}

public class Collection_1 {

	public static void main(String[] args) {
		Map<Long, Contact> map= new TreeMap<>(Collections.reverseOrder());
		map.put(1234567890L, new Contact("Ramesh", 1234567890L, "ramesh@gmail.com","Male"));
		map.put(9876543210L, new Contact("Suresh", 9876543210L, "suresh@gmail.com","Male"));
		map.put(9889788745L, new Contact("raju", 9889788745L, "raju@gmail.com","Male"));
		map.put(9985544864L, new Contact("Naveen",9985544864L, "naveen@gmail.com","male"));
		
		for(Map.Entry<Long, Contact> e: map.entrySet())
			System.out.println(e.getKey()+"\t"+e.getValue());
	}

}