package BlogApplication.blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/blogging";
		String username = "root";
		String password = "Roshan1020@";

		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}

		return con;
	}

}
