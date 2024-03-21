package ProxyPattern;

public class Client {
	public static void main(String[] args) {
		try {
			EmployeeDao employeeDao = new EmployeeDaoProxy();
			employeeDao.create("ADMIN",new EmployeeDaoImpl());
			System.out.println("Operation Successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
