/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

/**
 *
 * @author lukii
 */
@Stateful
public class StatefulEJB implements Serializable {

    private int contador = 0;

    public StatefulEJB() {
        System.out.println("Criando Stateful...");
    }

    public int invocar() {
        System.out.println("Invocando Stateful...");
        return ++contador;
    }
    
    @PostConstruct
    public void iniciar(){
        System.out.println("Iniciando Stateful...");
    } 
    
    @PostActivate
    public void ativar(){
        System.out.println("Ativando Stateful...");
    } 
    
    @PrePassivate
    public void desativar(){
        System.out.println("Desativando Stateful...");
    } 
    
    @PreDestroy
    public void finalizar(){
        System.out.println("Finalizando Stateful...");
    } 
}
