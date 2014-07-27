/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nap.soft.project.additionneur.implementation;

import nap.soft.project.additionneur.architecturemvc.AdditionneurModele;
import nap.soft.project.additionneur.architecturemvc.AdditionneurOverflowException;
import nap.soft.project.additionneur.architecturemvc.AdditionneurVue;
import nap.soft.project.additionneur.architecturemvc.Etat;
import nap.soft.project.additionneur.architecturemvc.Termes;
import java.util.ArrayList;
import java.util.List;

/**
 * Une implémentation du modèle de l'additionneur
 */
public class Additionneur implements AdditionneurModele {
    private List<AdditionneurVue> vues ;
    private Etat etat ; 
    
    public Additionneur() {
        vues = new ArrayList<>() ;
        etat = new Etat();  
    }

    @Override
    public void addAdditionneurListener(AdditionneurVue vue) {
        vues.add(vue) ;  
        fire() ;
    }

    @Override
    public void calcule(Termes t) throws AdditionneurOverflowException {
        int somme = t.getTerme1() + t.getTerme2() ;
        etat=new Etat(t.getTerme1(),t.getTerme2(), somme);
        fire() ; 
        
    }

    @Override
    public Etat getEtat() {
        return etat ; 
    }


    @Override
    public void removeAdditionneurListener(AdditionneurVue vue) {
        vues.remove(vue);
        fire() ;
    }
    
    private void fire() {
        for (AdditionneurVue vue : vues) {
            vue.notifieChangement();
        }        
    }

    @Override
    public int getListeners() {
        return vues.size();
    }

}
