/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remirc;

import dao.GenericDao;
import formularios.CadastroUsuario;
import formularios.CadastroCidades;
import formularios.loginUsuarios;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import tabelas.Cidades;
import tabelas.Estados;



/**
 *
 * @author Douglas
 */
public class RemIRC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        GenericDao g = new GenericDao();
        List<Object> l = g.listar(Estados.class);
        List<Object> le = g.listar (Cidades.class);
        new loginUsuarios().setVisible(true);
        
        //new CadastroCidades(l).setVisible(true);
        
    }
    
}
