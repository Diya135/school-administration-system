package dao;
import java.util.*;
import java.sql.SQLException;
public interface IDAO<T>{
	void add(T object)throws SQLException;
	List<T> getAll()throws SQLException;
	Object getByTd(Object id)throws SQLException;
	void update(T object)throws SQLException;
	void delete(T object)throws SQLException;

}
