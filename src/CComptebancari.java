


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pekesituu
 */
public class CComptebancari {
    private int numero;
    private CPersona propietari;
    private float saldo;
    private static int saldo_inicial=10;
    private static int seguent_compte=1234;
    
    public static void modificarSaldoInicial(int num){
        saldo_inicial=num;
    }
    public float consultar_Saldo(){
        return this.saldo;
    }
    public boolean comprovar_Num_Secret(int compte1,int compte2){
        if(compte1==compte2){
            return true;
        }else{
            return false;
        }
    }
    public boolean ingressar(int quantitat,int numsecret){
        if(this.numero==numsecret){
            this.saldo = this.saldo + quantitat;
            System.out.println("Ingrés correcte");
            return true;
        }else{
            System.out.println("Els numeros de compte no coincideixen");
            return false;
        }
    }
    public boolean extreure(int quantitat,int numsecret){
        if(this.numero==numsecret){
            this.saldo = this.saldo - quantitat;
            System.out.println("Extracció correcte");
            return true;
        }else{
            System.out.println("Els numeros de compte no coincideixen");
            return false;
        }
    }
    public CComptebancari(CPersona propietari) {
        this.numero = seguent_compte;
        this.propietari = propietari;
        this.saldo = saldo_inicial;
        seguent_compte++;
    }
    public CComptebancari(CComptebancari obj) {
        this.numero = obj.numero;
        this.propietari = obj.propietari;
        this.saldo = obj.saldo;
        seguent_compte++;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CPersona getPropietari() {
        return this.propietari;
    }

    public void setPropietari(CPersona propietari) {
        this.propietari = propietari;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static int getSaldo_inicial() {
        return saldo_inicial;
    }

    public static void setSaldo_inicial(int saldo_inicial) {
        CComptebancari.saldo_inicial = saldo_inicial;
    }

    public static int getSeguent_compte() {
        return seguent_compte;
    }

    public static void setSeguent_compte(int seguent_compte) {
        CComptebancari.seguent_compte = seguent_compte;
    }
    
    public void saludo2(){
        System.out.println("saluditooos");
    }
    
}
