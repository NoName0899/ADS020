package managedbean;

import ejb.StatelessEJB;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("ControladorMB")
@RequestScoped
public class ControladorMB implements Serializable {

    @EJB
    private StatelessEJB ejb;

    public StatelessEJB getEjb() {
        return ejb;
    }

    public void setEjb(StatelessEJB ejb) {
        this.ejb = ejb;
    }

    public ControladorMB() {
        System.out.println("Criando o controlador...");
    }

}
