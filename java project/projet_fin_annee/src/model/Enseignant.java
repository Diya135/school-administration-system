package model;

import java.util.Objects;

public class Enseignant extends Utilisateur {
	private String domaine;
	public Enseignant(int id, String login, String nom, String prenom, String mdp, String role, String email, String domaine) {
		super(id, login, nom, prenom, mdp, role, email);
		this.domaine=domaine;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	@Override
	public String toString() {
		return "Enseignant [domaine=" + domaine + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(domaine);
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
		Enseignant other = (Enseignant) obj;
		return Objects.equals(domaine, other.domaine);
	}
	

	

}
