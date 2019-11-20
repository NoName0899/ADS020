package atividade11;

import java.rmi.Naming;

public class ClienteRMI {

    public static void main(String[] args) {
        try {
            CalculadoraRemota obj = (CalculadoraRemota)Naming.lookup("//127.0.0.1:1099/CalculadoraServer");
            System.out.println("2 + 2 é igual a " + obj.somar(2, 2));
            System.out.println("2 - 2 é igual a " + obj.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + obj.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + obj.dividir(2, 2));
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
    
}


