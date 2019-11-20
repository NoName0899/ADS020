package atividade11;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraServer extends UnicastRemoteObject implements CalculadoraRemota {

    public CalculadoraServer() throws RemoteException {

    }

    @Override
    public int somar(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) throws RemoteException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            CalculadoraServer calc = new CalculadoraServer();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("CalculadoraServer", calc);
            System.out.println("Calculadora ligada");
        } catch (Exception ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
}
