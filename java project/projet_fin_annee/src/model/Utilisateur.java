package model;

import java.util.Objects;

public class Utilisateur{
	protected int id;
    protected String login;
    protected String nom;
    protected String prenom;
    protected String mdp;
    protected String role;
    protected String email;
	public Utilisateur(int id, String login, String nom, String prenom, String mdp, String role, String email) {
		super();
		this.id = id;
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.role = role;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", login=" + login + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp
				+ ", role=" + role + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, login, mdp, nom, prenom, role);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(login, other.login)
				&& Objects.equals(mdp, other.mdp) && Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom) && Objects.equals(role, other.role);
	}
    
    

}
