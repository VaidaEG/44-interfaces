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
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Namas n = new Namas();
        System.out.println(n);
        n.ijunk();
        System.out.println(n);
        n.isjunk();
        System.out.println(n);
        n.pusk();
        
        Palapine p = new Palapine();
        
        Elektra e = n;
        
        e.ijunk();
        
        Vent v = n;
        v.pusk();
        
        Virdulys vir = new Virdulys();
        
        System.out.println(e);
        System.out.println(n);
        
        pazaiskSuElektra(vir);
        pazaiskSuElektra(p);
       
        Object o = p;
        
        System.out.println(o instanceof Palapine);
        System.out.println(o instanceof Vanduo);
        System.out.println(o instanceof Vent);
        System.out.println(o instanceof Elektra );
    }
    
    public static void pazaiskSuElektra(Elektra e) {
        e.ijunk();
        e.isjunk();
        e.ijunk();
        e.isjunk();
    }
}
