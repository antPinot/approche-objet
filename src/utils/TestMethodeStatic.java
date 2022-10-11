package utils;

//TestMethodeStatic est une classe sans variables d'instance ==> Classe Stateless

public class TestMethodeStatic {

	public static void main(String[] args) {
		
		String chaine = "11";
		
		int chaineEntier = Integer.parseInt(chaine);
		
		int a = 15;
		
		int b = 12;
		
		System.out.println(Integer.max(a, b));
	}

}
