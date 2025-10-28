package dao;

import java.sql.SQLException;

public interface IDAO <T> {
    public void Connecter() throws SQLException ;
    public void Deconnecter() throws SQLException;


}