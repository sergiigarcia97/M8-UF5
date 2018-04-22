/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekesituu
 */
public class CPersona {
    private String nom;
    private String cognom1;
    private String cognom2;
    private int num_secret;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return this.cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }
    
    public String getCognom2() {
        return this.cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public int getNum_secret() {
        return this.num_secret;
    }

    public void setNum_secret(int num_secret) {
        this.num_secret = num_secret;
    }

    public CPersona(String nom, String cognom1,String cognom2, int num_secret) {
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.num_secret = num_secret;
    }
    
    public CPersona(CPersona obj) {
        this.nom = obj.nom;
        this.cognom1 = obj.cognom1;
        this.cognom2 = obj.cognom2;
        this.num_secret = obj.num_secret;
    }
    
    
}
