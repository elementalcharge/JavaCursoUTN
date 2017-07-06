package clase6.lib.db;

import java.sql.Connection;
import java.util.List;

public interface Itransaction<T> {
	public Connection getConnection();
	
	public List<T> getAll();
	public boolean update(T t);
	public boolean update(int id,T t);
	public boolean delete (int id);
	public boolean delete(T t);
	public T insert(T t);
	public void insert(int id, T t);
	public T getByID(int id, String table, T objectClass);
	
}
