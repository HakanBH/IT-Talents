package mobile.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import mobile.model.*;

public class AdvertDAO implements IAdvertDAO {	
	private static final String INSERT_ADVERT_QUERY = "insert into adverts values(null, ?, ?, ?, ?, ?, ?, null, null);";
	Connection connection = DBConnection.getInstance().getConnection();
	/**
	 * Inserts the given {@link Advert} into the database and returns the id of
	 * the advert.
	 * @throws Exception 
	 */
	@Override
	public int insertAdvert(Advert advert) throws SQLException {
		try(PreparedStatement insertAdvert = connection.prepareStatement(INSERT_ADVERT_QUERY,
				PreparedStatement.RETURN_GENERATED_KEYS);) {
			insertAdvert.setString(1, advert.getPhoneNumber());
			insertAdvert.setString(2, advert.getEmail());
			insertAdvert.setString(3, advert.getRegion());
			insertAdvert.setString(4, advert.getCity());
			insertAdvert.setInt(5, advert.getExpirationTime());
			insertAdvert.setString(6, advert.getExtraInfo());
			insertAdvert.executeUpdate();
			ResultSet res = insertAdvert.getGeneratedKeys();
			res.next();
			return res.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e);
		}
	}

	@Override
	public void addExtras(List<Extra> extras, Vehicle v) {
		
	}
	
	

	/**
	 * Inserts the given {@link Vehicle} into the database. Vehicle's id is
	 * equal to the advert id returned by {@link #insertAdvert(Advert)} due to
	 * the fact that every add refers to only one vehicle.
	 * @throws Exception 
	 */
	@Override
	public void insertVehicle(Advert advert, Vehicle vehicle) throws SQLException {
		connection.setAutoCommit(false);
		int advertID = insertAdvert(advert);
		
		PreparedStatement insertVehicle = connection
				.prepareStatement("insert into vehicles values(?, ?, ?, ?, ?, ?, ?, ?);");
		insertVehicle.setInt(1, advertID);
		insertVehicle.setString(2, vehicle.getCondition());
		insertVehicle.setString(3, vehicle.getBrand());
		insertVehicle.setString(4, vehicle.getModel());
		insertVehicle.setInt(5, vehicle.getPrice());
		insertVehicle.setString(6, vehicle.getCurrency());
		insertVehicle.setInt(7, vehicle.getYear());
		insertVehicle.setString(8, vehicle.getMonth());
		insertVehicle.executeUpdate();

		if (vehicle instanceof MotorVehicle) {
			MotorVehicle mv = (MotorVehicle) (vehicle);
			PreparedStatement insertMotorVehicle = connection
					.prepareStatement("insert into motor_vehicles values(?, ?, ?, ?, ?, ?);");
			insertMotorVehicle.setInt(1, advertID);
			insertMotorVehicle.setString(2, mv.getEngineType());
			insertMotorVehicle.setString(3, mv.getGearboxType());
			insertMotorVehicle.setString(4, mv.getColor());
			insertMotorVehicle.setString(5, mv.getCategory());
			insertMotorVehicle.setInt(6, mv.getMileage());
			insertMotorVehicle.executeUpdate();

			if (vehicle instanceof Car) {
				PreparedStatement insertCar = connection.prepareStatement("insert into cars values(?);");
				insertCar.setInt(1, advertID);
				insertCar.executeUpdate();
				connection.commit();
			} 
			if (vehicle instanceof Jeep) {
				PreparedStatement insertJeep = connection.prepareStatement("insert into jeeps values(?);");
				insertJeep.setInt(1, advertID);
				insertJeep.executeUpdate();
				connection.commit();
			}
		}
		connection.setAutoCommit(true);
	}
	
	public int searchCar(Car c, int minPrice, int maxPrice, int minYear, int maxYear){
		try {
			PreparedStatement searchCar = connection.prepareStatement(
					"select V.vehicle_id from cars C "
					+ "join motor_vehicles M on (C.car_id = M.motor_vehicle_id)"
					+ "join vehicles V on (C.car_id = V.vehicle_id)"
					+ "  where (M.engine = ?) and (M.gearbox = ?) and (V.brand = ?) and "
					+ "    (V.model = ?) and (V.condition = ?) and"
					+ "    (V.year between ? and ?) and (V.price between ? and ?);");
			searchCar.setString(1, c.getEngineType());
			searchCar.setString(2, c.getGearboxType());
			searchCar.setString(3, c.getCondition());
			searchCar.setString(4, c.getBrand());
			searchCar.setString(5, c.getModel());
			searchCar.setInt(6, minYear);
			searchCar.setInt(7, maxYear);
			searchCar.setInt(8, minPrice);
			searchCar.setInt(9, maxPrice);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;	
	}
	
	
	@Override
	public int searchVehicle(Vehicle v) throws SQLException {
		String mainCategory = v.getCategory();
		PreparedStatement search = connection.prepareStatement
				("select vehicle_id from ? C "
				+"join on motor_vehicles M on(C." + mainCategory + "_id);
		return 0;
	}
}
