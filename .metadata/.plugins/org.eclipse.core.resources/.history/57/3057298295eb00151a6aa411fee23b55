package mobile.jdbc;

import java.sql.*;
import mobile.model.*;

public class UserDAO implements IUserDAO {
	Connection connection = DBConnection.getInstance().getConnection();

	private static final String LOGIN_QUERY = "select * from users where email like ? and password like ?";
	private static final String INSERT_USER_QUERY = "insert into users values(null, ?,?,?,?,?);";
	private static final String SELECT_USER_BY_ID = "select * from users where user_id = ?";
	private static final String CHECK_EMAIL_QUERY = "select email from users where email like ?";

	@Override
	public User getUserByID(int userID) throws Exception {
		Connection connection = DBConnection.getInstance().getConnection();
		try (PreparedStatement searchByID = connection.prepareStatement(SELECT_USER_BY_ID)) {
			searchByID.setInt(1, userID);
			ResultSet result = searchByID.executeQuery();
			result.next();

			return new User(result.getString(2), result.getString(3), result.getString(4), result.getString(5),
					result.getString(6));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("User with that id cannot be found.", e);
		}
	}

	@Override
	public void register(User u) throws Exception {
		if (u != null) {
			try (Connection connection = DBConnection.getInstance().getConnection();
					PreparedStatement register = connection.prepareStatement(INSERT_USER_QUERY,
							PreparedStatement.RETURN_GENERATED_KEYS);) {
				register.setString(1, u.getEmail());
				register.setString(2, u.getPassword());
				register.setString(3, u.getFirstName());
				register.setString(4, u.getLastName());
				register.setString(5, u.getRegion());
				register.executeUpdate();

				ResultSet res = register.getGeneratedKeys();
				res.next();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error. Please try again", e);
			}
		} else {
			throw new Exception("Sorry! An error accured. Please try again.");
		}
	}

	@Override
	public int login(String email, String password) throws Exception {
		if (email == null || password == null) {
			throw new Exception("Sorry. An error accured. Please try again.");
		}
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			PreparedStatement login = connection.prepareStatement(LOGIN_QUERY);
			login.setString(1, email);
			login.setString(2, password);

			ResultSet res = login.executeQuery();
			res.next();
			int userId = res.getInt(1);
			return userId;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Invalid email or password!", e);
		}
	}
}
