/*
 * Td7 du cours d'ALG2G.
 */
package nap.soft.project.additionneur.vue;

import nap.soft.project.additionneur.architecturemvc.AdditionneurModele;
import nap.soft.project.additionneur.architecturemvc.AdditionneurVue;
import javax.swing.JComponent;

/**
 * Implémentation de comportement communs à l'ensemble des vues implémentées dans ce package
 */
public abstract class AbstractAdditionneurVue extends JComponent
        implements AdditionneurVue {

    private AdditionneurModele modele;

    /**
     * fournit le modèle à la vue
     */
    public void setModele(AdditionneurModele modele) {       
        if (this.modele != null) {
            this.modele.removeAdditionneurListener(this);
        }
        this.modele = modele;
        modele.addAdditionneurListener(this);

    }

    /**
     * retourne le modèle actuel 
     * @return
     */
    public AdditionneurModele getModele() {
        return modele;
    }

    /**
     * Permet d'ôter la vue de la liste des vues lorsque l'on ôte le composant
     */
    @Override
    public void removeNotify() {
        super.removeNotify();
        if (modele != null) {
            modele.removeAdditionneurListener(this);
        }
    }
}
