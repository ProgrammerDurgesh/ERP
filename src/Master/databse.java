package Master;

import java.sql.Connection;
import java.sql.DriverManager;

public class databse 
{
	public void databasemethode()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	
				
	}
	

}
