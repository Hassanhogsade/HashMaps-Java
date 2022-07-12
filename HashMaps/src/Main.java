import java.util.HashMap;
// above i have imported the HashMap util, so i can use it to create my HashMap below
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create a HashMap object called errors that will store Integer values and String keys
		HashMap <Integer, String> errors = new HashMap<Integer, String> ();
//to add items to it, i used the put() method after my errors variable	
		errors.put(203, "Non-Authoritative Information");
		errors.put(204, "No Content");
		errors.put(305, "Use Proxy");
		errors.put(306, "Switch Proxy");
		errors.put(400, "Bad Request");
		errors.put(401, "Unauthorized");
		errors.put(402, "Payment Required");
		errors.put(408, "Request Time Out");
		errors.put(407, "Proxy Authentication Required");
		errors.put(406, "Not Acceptable");		
//below i have println to print out 3 different strings 	
		System.out.println("Below are error codes and it's description");
		System.out.println("Amount of error Codes identified: " + errors.size());
		System.out.println(errors);
		
	}

}
