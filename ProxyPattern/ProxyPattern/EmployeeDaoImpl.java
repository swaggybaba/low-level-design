package ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String client, EmployeeDao emlpoyeeDao) {
		//create a new row in employetable
		System.out.println("Created a new row in Employee Table");
	}

	@Override
	public void delete(String client, int id) {
		//delete row in employetable
		System.out.println("Deleted row in Employee Table with id: "+id);
	}

	@Override
	public EmployeeDao get(String client, int id) {
		//fetch row
		System.out.println("Fetching data from DB of EmployeeId: "+id);
		return new EmployeeDaoImpl();
	}

}
