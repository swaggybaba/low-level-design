package ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao {

	EmployeeDaoImpl employeeDao;
	
	public EmployeeDaoProxy() {
		employeeDao = new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String client, EmployeeDao emlpoyeeDao) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDao.create(client, emlpoyeeDao);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int id) throws Exception {
		if(client.equals("ADMIN")) {
			employeeDao.delete(client, id);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public EmployeeDao get(String client, int id) throws Exception {
		if(client.equals("ADMIN") || client.equals("USER")) {
			return employeeDao.get(client, id);
		}
		throw new Exception("Access Denied");
	}

}
