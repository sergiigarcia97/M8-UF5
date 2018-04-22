
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Pekesituu
 */
public class main {
    public static void main(String [] args){
        int op;
        int contador_comptes=0;
        int consultarcompte=0;
        int consultarsecret=0; 
        boolean sortir=false;
        ArrayList comptes = new ArrayList();
        Iterator iter = null;
        while(!sortir){
            System.out.println("1. Crear nou compte");
            System.out.println("2. Modificar compte");
            System.out.println("3. Eliminar compte");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Ingressar");
            System.out.println("6. Extreure");
            System.out.println("7. Modificar numero secret");
            System.out.println("8. Sortir");
            op = cLlegir.datoInt();
            switch(op){
                case 1:
                    System.out.println("Introdueix el nom:");
                    String nom = cLlegir.dato();
                    System.out.println("Introdueix el primer cognom:");
                    String cognom1 = cLlegir.dato();
                    System.out.println("Introdueix el segon cognom");
                    String cognom2 = cLlegir.dato();
                    System.out.println("Introdueix el numero secret");
                    int numsec = cLlegir.datoInt();
                    CPersona p = new CPersona(nom,cognom1,cognom2,numsec);
                    CComptebancari b = new CComptebancari(p);
                    comptes.add(b);
                    System.out.println("Compte creada");
                    System.out.println("Numero compte:"+b.getNumero());
                    contador_comptes++;
                    break;
                case 2:
                    consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec = cLlegir.datoInt();
                   /* System.out.println("Introdueix el nom:");
                    String mnom = cLlegir.dato();
                    System.out.println("Introdueix el primer cognom:");
                    String mcognom1 = cLlegir.dato();
                    System.out.println("Introdueix el segon cognom");
                    String mcognom2 = cLlegir.dato();
                    CPersona comprovar = new CPersona(mnom,mcognom1,mcognom2,mnumsec);
                    */
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte){
                            if(c.comprovar_Num_Secret(mnumsec, c.getPropietari().getNum_secret())){
                                System.out.println("Escriu el nou nom");
                                String nnom = cLlegir.dato();
                                c.getPropietari().setNom(nnom);
                                System.out.println("Nom modificat");
                                break;
                            }else{
                                consultarsecret++;
                            }
                        }else{
                            consultarcompte++;
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                       
                       
                    
                    
                    
                    break;
                case 3:
                    consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte1 = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec1 = cLlegir.datoInt();
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte1){
                            if(c.comprovar_Num_Secret(mnumsec1, c.getPropietari().getNum_secret())){
                                comptes.remove(c);
                                System.out.println("Compte eliminada");
                                break;
                            }else{
                                consultarsecret++;
                            }
                        }else{
                            consultarcompte++;
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                    
                    break;
                case 4:
                    consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte2 = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec2 = cLlegir.datoInt();
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte2){
                            if(c.comprovar_Num_Secret(mnumsec2, c.getPropietari().getNum_secret())){
                                System.out.println("Saldo actual:"+c.consultar_Saldo());
                                break;
                            }else{
                                consultarsecret++;
                            }
                        }else{
                           consultarcompte++;
                           /* break; */
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                    break;
                case 5:
                    consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte3 = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec3 = cLlegir.datoInt();
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte3){
                            if(c.comprovar_Num_Secret(mnumsec3, c.getPropietari().getNum_secret())){
                                System.out.println("Saldo actual:"+c.consultar_Saldo());
                                System.out.println("Quant vols ingresar?");
                                int ingres = cLlegir.datoInt();
                                c.ingressar(ingres, mnumsec3);
                                float ingressat = c.getSaldo();
                                System.out.println("Saldo ingressat, total:"+ingressat);
                                break;
                            }else{
                               consultarsecret++;
                            }
                        }else{
                            consultarcompte++;
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                    break;
                case 6:
                     consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte4 = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec4 = cLlegir.datoInt();
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte4){
                            if(c.comprovar_Num_Secret(mnumsec4, c.getPropietari().getNum_secret())){
                                System.out.println("Saldo actual:"+c.consultar_Saldo());
                                System.out.println("Quant vols extreure?");
                                int extreure = cLlegir.datoInt();
                                if(c.getSaldo()-extreure<0){
                                    System.out.println("No tens suficient per extreure "+extreure);
                                    break;
                                }else{
                                    c.extreure(extreure, mnumsec4);
                                    
                                }
                                float extret = c.getSaldo();
                                System.out.println("Saldo extret, total:"+extret);
                            }else{
                                consultarsecret++;
                            }
                        }else{
                            consultarcompte++;
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                    break;
                case 7:
                     consultarcompte=0;
                    consultarsecret=0;
                    System.out.println("Introdueix el numero de compte");
                    int mnumcompte5 = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    int mnumsec5 = cLlegir.datoInt();
                    iter = comptes.iterator();
                    while(iter.hasNext()){
                        CComptebancari c = (CComptebancari) iter.next();
                        if(c.getNumero()==mnumcompte5){
                            if(c.comprovar_Num_Secret(mnumsec5, c.getPropietari().getNum_secret())){
                                System.out.println("Introdueix el nou numero secret");
                                int nnumsec = cLlegir.datoInt();
                                c.getPropietari().setNum_secret(nnumsec);
                                System.out.println("Numero canviat");
                                break;
                            }else{
                                consultarsecret++;
                            }
                        }else{
                            consultarcompte++;
                        }
                    }
                    if(consultarcompte==contador_comptes){
                        System.out.println("No s'ha trobat cap compte amb aquest numero");
                    }
                    if(consultarsecret==contador_comptes){
                        System.out.println("El numero secret no es correcte");
                    }
                    break;
                case 8:
                    sortir=true;
                    break;
            }
        }
    }
}
