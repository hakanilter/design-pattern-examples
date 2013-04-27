package operational.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class DBTemplate<T> 
{
	protected abstract T processRow(ResultSet rs);
	
	public List<T> execute(String sql) throws SQLException
	{
		List<T> result = new ArrayList<T>();
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:hsql://localhost", "sa", "");
			stmt = connection.createStatement();
			stmt.executeQuery(sql);
			while (rs.next()) {
				T object = processRow(rs);
				if (object != null) {
					result.add(object);
				}
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
}
