
package helados_pa_todos;
import interfaz_grafica.Menu;
import interfaz_grafica.CrearIdentificador;
import interfaz_grafica.ConsultarDisponibilidad;
import interfaz_grafica.ResgistraVendidos;
import interfaz_grafica.ResgistraAbiertos;
import interfaz_grafica.ProgramarApertura;
import interfaz_grafica.Login;
import interfaz_grafica.ConsultarPocaExistencia;
import interfaz_grafica.ConsultarProductosProgramados;
import interfaz_grafica.ProgramarProductoProximoPedido;
import interfaz_grafica.CompararProducto;
import interfaz_grafica.LlevarRegistroUsuarios;


public class main {
        
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.añadirContraseñas();
        Login login = new Login(inventario);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }

            
}
