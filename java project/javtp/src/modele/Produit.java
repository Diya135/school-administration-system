package modele;

import java.util.Objects;

public class Produit {
	private String ref;
	private String nom;
	private int prix;
	private int quantité;
	public Produit(String ref, String nom, int prix, int quantité) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.prix = prix;
		this.quantité = quantité;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom, prix, quantité, ref);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return Objects.equals(nom, other.nom) && prix == other.prix && quantité == other.quantité
				&& Objects.equals(ref, other.ref);
	}
	@Override
	public String toString() {
		return "Produit [ref=" + ref + ", nom=" + nom + ", prix=" + prix + ", quantité=" + quantité + "]";
	}
	

}
