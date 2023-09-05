import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpUpdate {
public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		Connection connection = null;
		
		// Step 1: Load/Register the driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step 2: Establish connection
			connection = DriverManager.getConnection(url, username, password);
			
			//step 3: Establish statement
			Statement statement = connection.createStatement();
			
			//step 4: execute the statement
			int a = statement.executeUpdate("UPDATE employee SET name='rahul', email ='rahul@gmail.com' WHERE ID = 4");

			if(a>0) {
				System.out.println("updated");
			}
			else {
				System.out.println("not updated");
			}

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



