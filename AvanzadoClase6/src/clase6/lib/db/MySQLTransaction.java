package clase6.lib.db;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import clase6.exceptions.LogWriter;

public class MySQLTransaction  implements Itransaction<Class>{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}
		catch (Exception e){
			System.out.println("failed connection :( ");
			LogWriter.writelog(e.getMessage());
		}
		return con;
	}

	@Override
	public Class getByID(int id, String table, Class objectClass) {
		try {
			Properties pp= new Properties();
			FileInputStream file= new FileInputStream("application.properties");
			pp.load(file);
			String query= pp.getProperty("insert_persona");
			PreparedStatement ps=(PreparedStatement)getConnection().prepareStatement(pp.getProperty("select")
					+objectClass.getSimpleName()+"where id="+id);
			ResultSet rs=ps.executeQuery();
			Class instance =(Class)objectClass.newInstance();
			while (rs.next()) {
				Field[] fields= objectClass.getDeclaredFields();
				for (Field item : fields) {
					item.setAccessible(true);
					item.set(instance, rs.getObject(item.getName()));
					//item.getName();
					//rs.getObject(item.getName());
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<Class> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Class t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int id, Class t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Class t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Class insert(Class t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(int id, Class t) {
		// TODO Auto-generated method stub
		
	}

}
