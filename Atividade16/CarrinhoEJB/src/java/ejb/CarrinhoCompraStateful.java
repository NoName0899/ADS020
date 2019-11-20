/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author lukii
 */
@Stateful
@LocalBean
public class CarrinhoCompraStateful implements CarrinhoCompraLocal{
    private ArrayList<String> array;
    private List<String> lista = array;

    @Override
    public void adicionarItem(String item) throws EJBException {
        String lista = item;
        System.out.println("Item " + item + "adicionado no carrinho");
    }

    @Override
    public List<String> listarItens() throws EJBException {
        return lista;
    }
    
    
    
}
