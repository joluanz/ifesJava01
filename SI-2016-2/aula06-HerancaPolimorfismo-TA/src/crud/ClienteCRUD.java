/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import database.Database;
import domain.Cliente;
import java.util.ArrayList;
/**
 *
 * @author Rafael S. Guimarães <rafaelg@ifes.edu.br>
 */
public class ClienteCRUD {
    public void inserir(Cliente cliente){
        Database.lstClientes.add(cliente);
    }
    public ArrayList<Cliente> ler(){
        return Database.lstClientes;
    }
    public void remover(Cliente cliente){
        Database.lstClientes.remove(cliente);
    }
}
