package model;

import java.util.Objects;

public class Etudiant extends Utilisateur{
	private String filiere;
	private int niveau;
	public Etudiant(int id, String login, String nom, String prenom, String mdp, String role, String email,String filiere,int niveau) {
		super(id, login, nom, prenom, mdp, role, email);
		this.filiere=filiere;
		this.niveau=niveau;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	@Override
	public String toString() {
		return "Etudiant [filiere=" + filiere + ", niveau=" + niveau + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(filiere, niveau);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return Objects.equals(filiere, other.filiere) && niveau == other.niveau;
	}
	

}
