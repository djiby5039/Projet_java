package com.app.produit.entities;

import com.app.produit.types.Type;

public class Produit {
	public static final double PRIX_UNITAIRE = 250.75f;
	private int code;
	private int quantite;
	private double  prixUnitaire;
	private int type ;
	
	
	
	
	/**
	 * 
	 */
	public Produit() {
		this(1,10,PRIX_UNITAIRE,Type.ALIMENTAIRE);
	}

	/**
	 * @param code
	 * @param quantite
	 * @param prixUnitaire
	 * @param type
	 */
	public Produit(int code, int quantite, double prixUnitaire, int type) {
		this.code = code;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Produit [code=" + code + ", quantite=" + quantite + ", prixUnitaire=" + prixUnitaire + ", type=" + type
				+ "]";
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPrix() {
		return prixUnitaire * quantite;
	}
	public void affiche() {
		System.out.println(this);
	}
	
	

}
