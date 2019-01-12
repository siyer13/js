package training.statictype;

public class StaticExample {

	public static void main(String[] args) {
		
		new StaticExample().callMeToo();
		StaticExample.callMe();
		new StaticExample().jdbcMethod();
	}
	
	public static void callMe() {
		System.out.println("Static Method is called");
	}
	
	public void callMeToo() {
		System.out.println("Non Static method called");
	}
	
	public void jdbcMethod() {
		// 
		System.out.println(DatabaseQuery.SELECT_QUERY);
		//DatabaseQuery.SELECT_QUERY = "UPDATE TABLE table_name";
		System.out.println(DatabaseQuery.SELECT_QUERY);
	}
}
