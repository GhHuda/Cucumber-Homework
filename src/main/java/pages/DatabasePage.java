package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String coulmnValue;

	public String getDataFromDB(String coulmnName) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/april_2023";
			String sqlUsename = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "SELECT * FROM users;";

			connection = DriverManager.getConnection(sqlUrl, sqlUsename, sqlPassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {

				coulmnValue = resultSet.getString(coulmnName);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {

			if (resultSet != null)
				;
			try {
				resultSet.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

		if (connection != null) {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return coulmnValue;

	}

}
