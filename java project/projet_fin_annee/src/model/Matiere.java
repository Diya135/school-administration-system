package model;

import java.util.Objects;

public class Matiere {
	private int id;
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Matiere(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matiere other = (Matiere) obj;
		return id == other.id && Objects.equals(nom, other.nom);
	}
	@Override
	public String toString() {
		return "Matiere [id=" + id + ", nom=" + nom + "]";
	}
	

}
