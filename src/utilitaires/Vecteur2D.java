package utilitaires;

import java.util.*;
import java.lang.Math;


public class Vecteur2D {

	private double x = 0;
	private double y = 0;
	
	/**
	 * Initialization des variables privé du classe Vecteur avec des valeurs de 
	 * défaut.
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public Vecteur2D()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Initialization des variables privé du classe Vecteur2D avec des valeurs
	 * donné par l'utilisateur.
	 * 
	 * @param x, y
	 * 
	 * @author Daniel Colalillo Amir Yousef

	 */
	public Vecteur2D(double x, double y){
		
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Copier les valeurs d'un objet de type Vecteur2D.
	 *  
	 * @param Vecteur2D
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 * @since 10/23/2018
	 * @version 1.0.0
	 */
	public Vecteur2D(Vecteur2D vecteur){
		
		this.x = vecteur.x;
		this.y = vecteur.y;
	}
	
	/**
	 * Definir le valeur de x.
	 * 
	 * @param x
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	
	// retourne la longueur du vecteur
	public static double getLongueur(Vecteur2D vecteur) {
		
	    return Math.sqrt( vecteur.getX() * vecteur.getX() + 
	    		vecteur.getY()*vecteur.getY());
	}
	
	public static double getAngle(Vecteur2D vecteur) {

	    return Math.atan2(vecteur.getX(), vecteur.getY());
	}
	
	//Vecteur2D difference(Vecteur2D)
	//Cette méthode reçoit un Vecteur2D positionFin. Elle crée un nouveau Vecteur2D qui
	//contient la différence entre positionFin et le vecteur this.
	public Vecteur2D VecteurDifference(Vecteur2D positionFin) {

		Vecteur2D vecteurDif = null;
		
		vecteurDif.setX(positionFin.getX() - this.getX());
	    vecteurDif.setY(positionFin.getY() - this.getY());

	    return vecteurDif;
	}
	
	// reçoit un facteur de division, a.
	// modifie l’état de la classe,
	public void diviser(double a) {
		
		this.setX(this.getX()/a);
		this.setY(this.getY()/a);
	}

	//reçoit un Vecteur2D
	//crée un nouveau Vecteur2D qui contient
	//la somme du vecteur existant et du vecteur reçu.
	 public double ajouter(Vecteur2D vecteur) {

		 Vecteur2D vecteurAjoute = vecteur + ;
		 
	 }
	
	public void setX(double x)
	{
		this.x = x;
}
	/**
	 * Definir le valeur de y.
	 * 
	 * @param y
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public void setY(double y)
	{
		this.y = y;
}
	
	/**
	 * Obternir le valeur de x.
	 * 
	 * @return x
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public double getX(){
		return this.x;
	}
	
	/**
	 * Obternir le valeur de y.
	 * 
	 * @return y
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public double getY(){
		return this.y;
	}
	
	/**
	 * Cloner cet objet dans un autre objet de type Vecteur2D.
	 * 
	 * @param vecteur
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public void cloneVecteur(Vecteur2D vecteur)
	{
		vecteur.x = this.x;
		vecteur.y = this.y;
	}
	
	/**
	 * Convertir les variables d'objet vecteur en chaine de
	 * caractere et retourne un chaine de character avec les
	 * varaibles.
	 * 
	 * @return string
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public String toString()
	{
		return this.x+ " " + this.y;
	}
	
	/**
	 * Compare un autre objet de type Vecteur2D avec ce vecteur et 
	 * verifier s'ils sont egal.
	 * 
	 * @param vecteur
	 * @return vrai ou faux
	 * 
	 * @author Daniel Colalillo Amir Yousef
	 */
	public boolean equals(Vecteur2D vecteur)
	{
		return this.x == vecteur.x && this.y == vecteur.y; 
	}
		
}
