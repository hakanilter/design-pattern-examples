package operational.template;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDBTemplate extends DBTemplate<Customer> 
{
	@Override
	protected Customer processRow(ResultSet rs) throws SQLException {
		return new Customer(rs.getString("name"), rs.getString("email"));
	}
}
