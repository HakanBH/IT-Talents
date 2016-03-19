package mobile.jdbc;

import java.sql.SQLException;
import java.util.List;

import mobile.model.Advert;
import mobile.model.Extra;
import mobile.model.Vehicle;

public interface IAdvertDAO {
	public abstract int insertAdvert(Advert advert) throws SQLException;
	
	public abstract void insertVehicle(Advert advert, Vehicle vehicle) throws SQLException;
	
	public abstract void addExtras(List<Extra> extras, Vehicle v);
	
//	public abstract void uploadPictures();
}
