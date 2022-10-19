package coursApprocheObjet.tri;

import java.util.Comparator;

public class UserNomPrenomComparator implements Comparator<User> {
	
	public int compare(User o1, User o2) {
		
		int resultat = o1.getNom().compareTo(o2.getNom());
		if (resultat !=0) {
			return resultat;
		}
		else {
			return o1.getPrenom().compareTo(o2.getPrenom());
		}
	}

}
