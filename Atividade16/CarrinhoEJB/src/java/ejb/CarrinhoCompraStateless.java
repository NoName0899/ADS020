/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;
import javax.ejb.EJBException;

/**
 *
 * @author lukii
 */
@Stateless
@Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateless implements CarrinhoCompraLocal{
    
    
    private ArrayList<String> array;
    private List<String> lista = array;

    @Override
    public void adicionarItem(String item) throws EJBException {
        String lista = item;
        System.out.println("Item " + item + "adicionado no carrinho");
    }

    @Override
    public List<String> listarItens() throws EJBException {
        System.out.println("Listando itens do carrinho");
        return lista;
    }
 
}
