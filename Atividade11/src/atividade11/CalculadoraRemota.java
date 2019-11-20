package atividade11;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculadoraRemota extends Remote{
    int somar(int a, int b) throws RemoteException;
    int subtrair(int a, int b) throws RemoteException;
    int multiplicar(int a, int b) throws RemoteException;
    int dividir(int a, int b) throws RemoteException;
}
