package ProxyPattern;

public interface EmployeeDao {
	
	public void create(String client, EmployeeDao emlpoyeeDao) throws Exception;
	public void delete(String client, int id) throws Exception;
	public EmployeeDao get(String client, int id) throws Exception;

}
