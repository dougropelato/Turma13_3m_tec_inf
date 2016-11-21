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

public class RemIRC {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        GenericDao g = new GenericDao();
        List<Object> l = g.listar(Estados.class);
        List<Object> le = g.listar (Cidades.class);
        new loginUsuarios().setVisible(true);
        
    }
    
}
