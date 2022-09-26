
package dominio;

/**
 *
 * @author ednad
 */
public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double salto;

    //crea constructor cliente 
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    //constructor de parametro
    public Cliente(){
        
    }

    //constructor para inicializar las variables
    public Cliente(int idCliente, String nombre, String apellido, String email, String telefono, double salto) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.salto = salto;
    }
    
    public Cliente( String nombre, String apellido, String email, String telefono, double salto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.salto = salto;
    }

    
    //metodos con get y set
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalto() {
        return salto;
    }

    public void setSalto(double salto) {
        this.salto = salto;
    }

    
    //entidad
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", salto=" + salto + '}';
    }
    
    
    
    
}
