package atividade11;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculadoraClient {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        CalculadoraRemota obj = (CalculadoraRemota) Naming.lookup("//127.0.0.1:1099/CalculadoraServer");

        try {
            System.out.println("2 + 2 é igual a " + obj.somar(2, 2));
            System.out.println("2 - 2 é igual a " + obj.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + obj.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + obj.dividir(2, 2));
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }

}
