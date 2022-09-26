
package datos;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import dominio.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ednad
 */
public class ClienteDaoJDBC {
    
//creamos los querys
private static final String SQL_SELECT = "SELECT id_cliente, nombre,apellido, telefono, emai, saldo FROM cliente";
private static final String SQL_SELECT_BY_ID =     "SELECT id_cliente, nombre,apellido, telefono, emai, saldo FROM cliente WHERE id_cliente=?";
private static final String SQL_INSERT =     "INSERT INTO cliente (nombre,apellido, telefono, emai, saldo) VALUES(?,?,?,?) ";
private static final String SQL_UPDATE =     "UPDATE cliente SET nombre =?,apellido= ?, telefono = ?, emai = ?, saldo = ? WHERE id_cliente=?";
private static final String SQL_DELETE =     "DELETE FROM cliente WHERE id_cliente=?";
    

//listamos

public List<Cliente> listas(){
    Connection conn=null;
    PreparableStatement stmt=null;
    ResultSet rs = null;
    Cliente cliente= null;
    List<Cliente> clientes = new ArrayList<Cliente>();
    
    try {
        conn=Conexion.getConnection();
        stmt=(PreparableStatement) conn.prepareStatement(SQL_SELECT);
        rs=(ResultSet) stmt.execute();
        while (rs.next()){
            int idCliente=rs.getInt("id_cliente");
            String nombre=rs.getString("nombre");
            String apellido=rs.getString("apellido");
            String email=rs.getString("email");
            String telefono=rs.getString("telefono");
            double saldo=rs.getDouble ("saldo");
            
            clientes.add(new Cliente(idCliente, nombre,apellido, telefono, email, saldo));
        }
    } catch (Exception e) {
        e.printStackTrace(System.out);
    }finally{
        Conexion.Close(rs);
        Conexion.Close((ResultSet) stmt);
        Conexion.Close(conn);
    }
    return clientes;
}
}
