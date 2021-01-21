/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author 37067
 */
public class Namas implements Elektra, Vent, Vanduo {
    private boolean dega = false;
    
    public void ijunk() {
        dega = true;
    }
    public void isjunk() {
        dega = false;
    }
    public void pusk() {
        System.out.println("Pucia pucia juru vejas");
    }
    public String toString() {
        return "Namas{" + "dega " + dega + '}';
    }

    @Override
    public void atsuk(){
        System.out.println("Vanduo bega");
    }

    @Override
    public void uzsuk() {
        System.out.println("Vanduo uzsuktas");
    }

    @Override
    public void nuleisk() {
        System.out.println("Vanduo nuleistas");
    }
}
