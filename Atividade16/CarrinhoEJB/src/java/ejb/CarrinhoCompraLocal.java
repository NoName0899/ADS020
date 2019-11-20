package ejb;

import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;

@Local
public interface CarrinhoCompraLocal{
    
    public void adicionarItem(String item) throws EJBException;
        
    public List<String> listarItens() throws EJBException;
    
    
}
