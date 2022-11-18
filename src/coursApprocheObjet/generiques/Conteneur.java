package coursApprocheObjet.generiques;

import java.util.Objects;

public class Conteneur <T, U>{
	
	private T identifiant;
	
	private U valeur;

	/**
	 * @param identifiant
	 * @param valeur
	 */
	public Conteneur(T identifiant, U valeur) {
		this.identifiant = identifiant;
		this.valeur = valeur;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteneur other = (Conteneur) obj;
		return Objects.equals(identifiant, other.identifiant) && Objects.equals(valeur, other.valeur);
	}


	@Override
	public String toString() {
		return "Conteneur [identifiant=" + identifiant + ", valeur=" + valeur + "]";
	}

	/**Getter pour l'attribut identifiant
	 * @return the identifiant
	 */
	public T getIdentifiant() {
		return identifiant;
	}

	/**Setter pour l'attribut identifiant
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(T identifiant) {
		this.identifiant = identifiant;
	}

	/**Getter pour l'attribut valeur
	 * @return the valeur
	 */
	public U getValeur() {
		return valeur;
	}

	/**Setter pour l'attribut valeur
	 * @param valeur the valeur to set
	 */
	public void setValeur(U valeur) {
		this.valeur = valeur;
	}
	
	

}
