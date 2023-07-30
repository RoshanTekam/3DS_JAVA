package BlogApplication.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import BlogApplication.blog.entities.PostEntity;

public class Dao {
//	private static final String query = "select* from post";
	private static final String query = "select postId,title,content from post where id =?";;
	static Scanner scanner = new Scanner(System.in);

	public static void printData() {

		Connection connection = null;
		ResultSet resultSet = null;
		String q = "select* from post";

		try {
			connection = DataBaseConnection.createConnection();

			PreparedStatement statement = connection.prepareStatement(q);

			resultSet = statement.executeQuery();

			System.out.println("rs ready ");
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String title = resultSet.getString(2);
				String content = resultSet.getString(3);

				System.out.println(id + " " + title + " " + content);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void insertData(PostEntity post) {
		Connection connection = null;
		PreparedStatement statement;
		String q = "INSERT INTO post" + "  (postId,title,content) VALUES " + " (?, ?, ?);";

		try {
			connection = DataBaseConnection.createConnection();
			statement = connection.prepareStatement(q);
			statement.setInt(1, post.getPostId());
			statement.setString(2, post.getTitle());
			statement.setString(3, post.getContent());
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	public static void updateData(PostEntity post) {
		Connection connection = null;
		PreparedStatement statement = null;
		String q = "update post set title = ?,content = ? where postId = ?;";

		try {
			connection = DataBaseConnection.createConnection();
			statement = connection.prepareStatement(q);

			statement.setString(1, post.getTitle()); //
			statement.setString(2, post.getContent());
			statement.setInt(3, post.getPostId()); // row no

			statement.executeUpdate();
			System.out.println("Data successful added to the database ....");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteData(int id) {
		Connection connection = null;
		Statement statement = null;
		String postId = String.valueOf(id);
		String q = "delete from post where postId = " + postId + ";";
		System.out.println(q + " " + postId);

		try {
			connection = DataBaseConnection.createConnection();
			statement = connection.createStatement();
			int result = statement.executeUpdate(q);
			System.out.println("Successful deleted data from database ....");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean checkDuplicateData(PostEntity post) {
		Connection connection = null;
		ResultSet resultSet = null;
		String q = "select* from post";
		boolean flag = false;

		try {
			connection = DataBaseConnection.createConnection();

			PreparedStatement statement = connection.prepareStatement(q);

			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String title = resultSet.getString(2);
				String content = resultSet.getString(3);
				if (title.equals(post.getTitle()) && content.equals(post.getContent())) {
					System.out.println("this is checked and found duplicate ....");
					flag = true;
					break;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
