package nap.soft.project.additionneur.architecturemvc;

import java.io.Serializable;

/**
 * État de l'additionneur. Cet état peut transiter du modèle à une vue.
 *
 * Il s'agit d'un DTO (data transfer Object) dont le seul rôle est le stockage de données en vue de transfert.
 * 
 */
public class Etat implements Serializable{
    private int terme1;
    private int terme2;
    private int somme;
    private int nbListeners;

    /** Creates a new instance of Etat */
    public Etat() {
        terme1 = 0;
        terme2 = 0;
        somme = 0;
    }
    /** Creates a new instance of Etat */
    public Etat(int t1, int t2, int s){
        terme1 = t1;
        terme2 = t2;
        somme = s;
    }

    /**
     * retourne le premier terme de l'addition
     */
    public int getTerme1() {
        return terme1;
    }

    /**
     * positionne le premier terme de l'addition à l'entier fourni
     * @param terme1 
     */
    void setTerme1(int terme1) {
        this.terme1 = terme1;
    }

    /**
     * retourne le deuxième terme de l'addition
     */
    public int getTerme2() {
        return terme2;
    }

    /**
     * positionne le deuxième terme de l'addition à l'entier fourni
     */
    void setTerme2(int terme2) {
        this.terme2 = terme2;
    }

    /**
     * retourne le résultat de la dernière addition
     */
    public int getSomme() {
        return somme;
    }

    /**
     * poistionne le résultat de la dernière addition effectuée
     */
    void setSomme(int somme) {
        this.somme = somme;
    }

    /**
     * retourne le nombre d'observateurs enregistrés du modèle
     */
    public int getNbListeners() {
        return nbListeners;
    }

    /**
     * poisitionne le nb d'observateurs du modèle
     */
    void setNbListeners(int nbListeners) {
        this.nbListeners = nbListeners;
    }
}
