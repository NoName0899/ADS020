
package ejb;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CalculadoraRemota.class)
public class CalculadoraEJB implements CalculadoraRemota {
   
    public CalculadoraEJB() throws EJBException {
        
    }

    @Override
    public int somar(int a, int b) throws EJBException {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) throws EJBException {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws EJBException {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) throws EJBException {
        return a / b;
    }
}
