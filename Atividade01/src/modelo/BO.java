package modelo;

import java.util.List;

public interface BO<T> {
    
    void validar(T entidade) throws AlunoException;
    
    void inserir(T entidade) throws AlunoException;
    
    void alterar(T entidade) throws AlunoException;
    
    void excluir(T entidade) throws AlunoException;
    
    T consultar(int id) throws AlunoException;
    
    List<T> listar() throws AlunoException;
    
}