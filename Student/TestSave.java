import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSave {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "INSERT INTO student VALUES(5, 'rahul', 'rp@gmail.com')";
		Connection connection = null;
		
		// Step 1: Load/Register the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step 2: Establish connection
			connection = DriverManager.getConnection(url, username, password);
			
			//step 3: Establish statement
			Statement statement = connection.createStatement();
			
			//step 4: execute the statement
			statement.execute(sql);
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// step 5: connection close
				connection.close();
				System.out.println("all good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
