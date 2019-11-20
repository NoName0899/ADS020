/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import ejb.StatefulEJB;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("ControladorMB")
@RequestScoped
public class ControladorMB implements Serializable{
    @EJB
    private StatefulEJB ejb;

    public StatefulEJB getEjb() {
        return ejb;
    }

    public void setEjb(StatefulEJB ejb) {
        this.ejb = ejb;
    }
    
    public ControladorMB(){
        System.out.println("Criando o controlador...");
    }
}
