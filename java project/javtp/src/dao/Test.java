package dao;
import java.sql.*;
import modele.*;
public class Test {
	public static void main(String[]args) {
		try {
		CategorieDAO cdao=new CategorieDAO();	
		Categorie c= new Categorie(0,"Informatique");
		cdao.add(c);
		
	}
	catch(SQLException e) {
		System.out.println(" immposible"+e);
	}
	}
}
