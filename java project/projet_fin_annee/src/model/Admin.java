package model;

import java.util.Objects;

public class Admin extends Utilisateur{
	private String poste;
	private int telephone;
	public Admin(int id, String login, String nom, String prenom, String mdp, String role, String email, String poste,
			int telephone) {
		super(id, login, nom, prenom, mdp, role, email);
		this.poste = poste;
		this.telephone = telephone;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Admin [poste=" + poste + ", telephone=" + telephone + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(poste, telephone);
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
		Admin other = (Admin) obj;
		return Objects.equals(poste, other.poste) && telephone == other.telephone;
	}
	
	

}
