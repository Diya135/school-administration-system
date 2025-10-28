package dao;
import java.sql.*;
import java.util.*;

import modele.*;
class CategorieDAO implements IDAO<Categorie> {
	public void add(Categorie c)throws SQLException {
		Connection cx=SingletonConnection.getInstance();
		String req="insert into categorie(nom)values(?)";
		PreparedStatement ps;
		ps=cx.prepareStatement(req);
		ps.setString(1,c.getNom());
		ps.executeUpdate();
		ps.close();
	}

	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getByTd(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Categorie object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Categorie object) {
		// TODO Auto-generated method stub
		
	}

}
