package fr.diginamic.entites;

public class Cercle {
	
	private float rayon;
	
	public Cercle(float rayon) {
		this.rayon = rayon;
	}
	
	public float getRayon() {
		return rayon;
	}
	
	public float perimetre() {
		return 2* ((float)Math.PI)*(getRayon());
	}
	
	public float surface() {
		return ((float)Math.PI)* (float)Math.pow(getRayon(), 2.0);
	}

}
