/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class StatelessEJB {
    private int num = 0;
    private int contador;
    
    public StatelessEJB(){
        System.out.println("Criando Stateless...");
    }
    
    public int invocar(){
        System.out.println("Invocando Stateless...");
        return ++contador;
    }
    
    @PostConstruct
    public void iniciar(){
        System.out.println("Iniciando Stateless...");
    } 
    
    @PreDestroy
    public void finalizar(){
        System.out.println("Finalizando Stateless...");
    } 
}
