package modele;
import java.util.*;
public class Categorie {
	private int code;
	private String nom;
	public Categorie(int code, String nom) {
		this.code = code;
		this.nom = nom;
	}
	public Categorie(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
