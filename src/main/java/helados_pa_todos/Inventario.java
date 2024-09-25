package helados_pa_todos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * La clase inventario representa el sistema de almacenamiento de
 * información de la heladería Helados Pa'todos.
 */

public class Inventario {

    private ArrayList<Usuario> usuario = new ArrayList<>();
    private Map<String, Usuario> passwords = new HashMap<>();
    private ArrayList<Producto> aperturaProgramada = new ArrayList<>();
    private ArrayList<Producto> abierto = new ArrayList<>();
    private ArrayList<Producto> vendido = new ArrayList<>();
    private Queue chocolate_10;
    private Queue chocolate_5;
    private Queue vainilla_10;
    private Queue vainilla_5;
    private Queue fresa_10;
    private Queue fresa_5;
    private Map<Integer, Integer> pedidoProgramado = new HashMap<>();
    private Map<Integer, Integer> pedidoLlegado = new HashMap<>();

    
    // Tabla Hash donde almacenaremos los sku
    // Cada clave sera un sku(Int) y el valor contenido es un Producto
    // El producto contenido por cada sku es un producto base para crear los productos que
    // entran al inventario.

    private final Map<Integer, Producto> tablaSku = new HashMap<>();

    
    public Inventario() {
        this.chocolate_10 = new Queue();
        this.chocolate_5 = new Queue();
        this.vainilla_10 = new Queue();
        this.vainilla_5 = new Queue();
        this.fresa_10 = new Queue();
        this.fresa_5 = new Queue();
        this.tablaSku.put(101, new Producto("chocolate", "10", "CremHelado", 101, this.chocolate_10));
        this.tablaSku.put(102, new Producto("chocolate", "5", "CremHelado", 102, this.chocolate_5));
        this.tablaSku.put(103, new Producto("chocolate", "10", "Colombina", 103, this.chocolate_10));
        this.tablaSku.put(104, new Producto("chocolate", "5", "Colombina", 104, this.chocolate_5));
        this.tablaSku.put(105, new Producto("fresa", "10", "CremHelado", 105, this.fresa_10));
        this.tablaSku.put(106, new Producto("fresa", "5", "CremHelado", 106, this.fresa_5));
        this.tablaSku.put(107, new Producto("fresa", "10", "Colombina", 107, this.fresa_10));
        this.tablaSku.put(108, new Producto("fresa", "5", "Colombina", 108, this.fresa_5));
        this.tablaSku.put(109, new Producto("vainilla", "10", "CremHelado", 109, this.vainilla_10));
        this.tablaSku.put(110, new Producto("vainilla", "5", "CremHelado", 110, this.vainilla_5));
        this.tablaSku.put(111, new Producto("vainilla", "10", "Colombina", 111, this.vainilla_10));
        this.tablaSku.put(112, new Producto("vainilla", "5", "Colombina", 112, this.vainilla_5));
        Usuario user = new Usuario("Jeronimo","admin","123","1005259443");
        Usuario user1 = new Usuario("Isa","Cajera","123","1");
        Usuario user2 = new Usuario("Ana","Encargada del inventario","123","12");
        Usuario user3 = new Usuario("Juan","Cajera","123","13");
        Usuario user4 = new Usuario("Vale","admin","123","14");
        user.getPermisos().add(1);
        user.getPermisos().add(2);
        user.getPermisos().add(3);
        user1.getPermisos().add(1);
        user1.getPermisos().add(2);
        user1.getPermisos().add(3);
        user2.getPermisos().add(1);
        user2.getPermisos().add(2);
        user2.getPermisos().add(3);
        user3.getPermisos().add(1);
        user3.getPermisos().add(2);
        user3.getPermisos().add(3);
        user4.getPermisos().add(1);
        user4.getPermisos().add(2);
        user4.getPermisos().add(3);
        this.usuario.add(user);
        this.usuario.add(user1);
        this.usuario.add(user2);
        this.usuario.add(user3);
        this.usuario.add(user4);
    
    }
    
    public void añadirContraseñas(){
        
        for(int i = 0; i < this.getUsuario().size(); i++){
            this.getPasswords().put(this.getUsuario().get(i).getDocumento(), this.getUsuario().get(i));
        }
    }

    public Map<String, Usuario> getPasswords() {
        return passwords;
    }
    
    public Usuario login(String id, String contrasena){
        if(this.getPasswords().get(id) != null && this.getPasswords().get(id).getContraseña().equals(contrasena)){
            return this.getPasswords().get(id);
        } else {
            return null;
        }
          
    }
    
    

    public void mostrarApertura() {
    	for (int i = 0; i < this.getAperturaProgramada().size(); i++) {
    		System.out.println(this.getAperturaProgramada().get(i));
    	}
    }
    
    public void mostrarAbierto() {
    	for (int i = 0; i < this.getAbierto().size(); i++) {
    		System.out.println(this.getAbierto().get(i));
    	}
    }
    
    public void mostrarVendido() {
    	for (int i = 0; i < this.getVendido().size(); i++) {
    		System.out.println(this.getVendido().get(i));
    	}
    }

    public ArrayList<Producto> getAbiertos() {
        return abierto;
    }

    public ArrayList<Producto> getVendidos() {
        return vendido;
    }
    
    

    
    public ArrayList<Usuario> getUsuario() {
		return usuario;
	}


	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}


	public ArrayList<Producto> getAperturaProgramada() {
		return aperturaProgramada;
	}


	public void setAperturaProgramada(ArrayList<Producto> aperturaProgramada) {
		this.aperturaProgramada = aperturaProgramada;
	}


	public ArrayList<Producto> getAbierto() {
		return abierto;
	}


	public void setAbierto(ArrayList<Producto> abierto) {
		this.abierto = abierto;
	}


	public ArrayList<Producto> getVendido() {
		return vendido;
	}


	public void setVendido(ArrayList<Producto> vendido) {
		this.vendido = vendido;
	}

	public Queue getChocolate_10() {
		return chocolate_10;
	}


	public void setChocolate_10(Queue chocolate_10) {
		this.chocolate_10 = chocolate_10;
	}


	public Queue getChocolate_5() {
		return chocolate_5;
	}


	public void setChocolate_5(Queue chocolate_5) {
		this.chocolate_5 = chocolate_5;
	}


	public Queue getVainilla_10() {
		return vainilla_10;
	}


	public void setVainilla_10(Queue vainilla_10) {
		this.vainilla_10 = vainilla_10;
	}


	public Queue getVainilla_5() {
		return vainilla_5;
	}


	public void setVainilla_5(Queue vainilla_5) {
		this.vainilla_5 = vainilla_5;
	}


	public Queue getFresa_10() {
		return fresa_10;
	}


	public void setFresa_10(Queue fresa_10) {
		this.fresa_10 = fresa_10;
	}


	public Queue getFresa_5() {
		return fresa_5;
	}


	public void setFresa_5(Queue fresa_5) {
		this.fresa_5 = fresa_5;
	}


	public void mostrarInventario() {
        System.out.println("Productos por abrir: " + aperturaProgramada.size());
        System.out.println("Abiertos: " + abierto.size());
        System.out.println("Vendidos: " + vendido.size());
    }
    

    public Producto agregarProducto(int sku, Usuario user) {
        
    	if (this.tablaSku.get(sku) != null && user.getPermisos().contains(1)) {
    		Producto producto_base = this.tablaSku.get(sku);
    		Producto producto_nuevo = new Producto(producto_base.getSabor(), producto_base.getPresentacion(),
    				producto_base.getMarca(), producto_base.getSku());
                
    		producto_base.getCola().enqueue(producto_nuevo);
                user.registrarAccion("Agregó " + producto_nuevo.toString());
                return producto_nuevo;

    		


    	} else {
                return null;
    	}

    }
    
    public Producto programarApertura(int sku, Usuario user) {
    	
    	if(this.tablaSku.get(sku) != null && user.getPermisos().contains(2)) {
                Producto temp = this.tablaSku.get(sku).getCola().dequeue();
    		this.aperturaProgramada.add(temp);
                user.registrarAccion("Programó apertura");
    		return temp;
    	}else {
    		return null;
    	}
    	
    }
    
    public Producto venderProducto(int sku, Usuario user) {
    	
    	if (this.tablaSku.get(sku) != null && user.getPermisos().contains(2)) {
    		Producto temp = this.tablaSku.get(sku).getCola().dequeue();
    		temp.vender();
    		this.vendido.add(temp);
                user.registrarAccion("Vendió " + temp.toString());
                return temp;
    	}
    	else {
    		
                return null;
    	}
    
    	}
    
    public Producto abrirProducto(int sku, Usuario user) {
    	
    	if (this.tablaSku.get(sku) != null && user.getPermisos().contains(2)) {
    		Producto temp = this.tablaSku.get(sku).getCola().dequeue();
    		temp.abrir();
    		this.abierto.add(temp);
                user.registrarAccion("Abrió " + temp.toString());
                return temp;
    	}
    	else {
    		
                return null;
    	}
    	
    }
    
    public ArrayList<Producto> realizarApertura(Usuario user) {
        
        if (user.getPermisos().contains(1)){
    	ArrayList<Producto> productos = new ArrayList<>();
    	Iterator<Producto> iterador = this.aperturaProgramada.iterator();
    	while(iterador.hasNext()) {
    		Producto producto = iterador.next();
    		iterador.remove();
    		producto.abrir();
    		this.abierto.add(producto);
                productos.add(producto); 
        }
        user.registrarAccion("Realizó apertura");
        return productos;
        } else {
            return null;
        }
    }
 // FUNCIONALIDAD 6
    public Map<String,Integer> consultarProductosConPocaExistencia(Usuario user) {
        
        if(user.getPermisos().contains(3)){
        Map<String, Integer> pocaExistencia = new HashMap<>();
        // Listas de colas de productos seg ún el sabor y presentación
        Queue[] colasProductos = {chocolate_10, chocolate_5, fresa_10, fresa_5, vainilla_10, vainilla_5};
        String[] descripciones = {"Chocolate 10 litros", "Chocolate 5 litros", "Fresa 10 litros", "Fresa 5 litros", "Vainilla 10 litros", "Vainilla 5 litros"};

        // Recorremos cada cola
        for (int i = 0; i < colasProductos.length; i++) {
            Queue cola = colasProductos[i];

            // Verificar si tiene 2 o menos productos
            if (cola.size() <= 2) {
                pocaExistencia.put(descripciones[i], cola.size());
            }
        }
        return pocaExistencia;
    } else {
            return null;
        }
    }
    
    //  Se va a mostrar solo cantidad de disponible dependiendo del sku
    // El sku de cualquier chocolate de 10 lts dará acceso a todos los 
    // chocolates de 10 lts sin distinción de marca
    public int mostrarDisponible(int sku) {
    	
            Producto temp = this.tablaSku.get(sku);
            return temp.getCola().size();
    }
    
    public String mostrarSku() {
        return "SKU Disponibles:" + "\n" +
        "101: Sabor Chocolate, CremHelado, 10 Litros" + "\n" +
        "102: Sabor Chocolate, CremHelado, 5 Litros" + "\n" +
        "103: Sabor Chocolate, Colombina, 10 Litros" + "\n" +
        "104: Sabor Chocolate, Colombina, 5 Litros" + "\n" +
        "105: Sabor Vainilla, CremHelado, 10 Litros" + "\n" +
        "106: Sabor Vainilla, CremHelado, 5 Litros" + "\n" +
        "107: Sabor Vainilla, Colombina, 10 Litros" + "\n" +
        "108: Sabor Vainilla, Colombina, 5 Litros" + "\n" +
        "109: Sabor Fresa, CremHelado, 10 Litros" + "\n" +
        "110: Sabor Fresa, CremHelado, 5 Litros" + "\n" +
        "111: Sabor Fresa, Colombina, 10 Litros" + "\n" +
        "112: Sabor Fresa, Colombina, 5 Litros" + "\n";
    }
    //ACA
    //Parte de la funcionalidad 9
    public boolean registrarPedidoLlegado(int sku, int cantidad, Usuario user) {
        
        if(user.getPermisos().contains(1)){
        pedidoLlegado.put(sku, cantidad);

        // Ciclo para agregar 'cantidad' de productos al inventario
        for (int i = 0; i < cantidad; i++) {
        agregarProducto(sku, user); // Agrega el producto al inventario 'cantidad' veces
        }
        user.registrarAccion("Registró pedido");
        return true;
        } else {
            return false;
        }
    
}

    
    public boolean registrarPedido(int sku, int cantidad, Usuario user) {
        
        if (user.getPermisos().contains(2)){
             pedidoProgramado.put(sku, cantidad);
             user.registrarAccion("Programó producto: Sku " + sku + "Cantidad " + cantidad);
             return true;
        } else {
            return false;
        }
       
        
    }
    
    //¿EL PEDIDO CUANDO SE HACE?
    //EL PEDIDO EN ESTE CASO SOLO SE HACE CUANDO NO HAY EXISTENCIAS
    public boolean PedidoProgramado(Usuario user) {
	 
    if (user.getPermisos().contains(2)){
    if (this.getChocolate_10().isEmpty()) {
	registrarPedido(101, 5, user);
        registrarPedido(103, 5, user);
	}
    
    if (this.getChocolate_5().isEmpty()) {
	registrarPedido(102, 5, user);
        registrarPedido(104, 5, user);
	    	}
	    	
    if(this.getVainilla_10().isEmpty()) {
	registrarPedido(105, 5, user);
        registrarPedido(107, 5, user);
	    	}
	    	
    if (this.getVainilla_5().isEmpty()) {
	registrarPedido(106, 5, user);
        registrarPedido(108, 5, user);
	    	}
	    	
    if (this.getFresa_10().isEmpty()) {
	registrarPedido(109, 5, user);
        registrarPedido(111,5, user);
	    	}
    if (this.getFresa_5().isEmpty()) {
	registrarPedido(110,5, user);
        registrarPedido(112,5, user);
	}
    
    return true;
     } else {
        return false;
    }
    }
    
    ///ESTO ES LO IMPORTANTE DE LA FUNCIONALIDAD 9 DEVUELVE NOMBRE SKU CANTIDAD PEDIDA Y CANTIDAD LLEGADA
    public Boolean compararPedidoConLlegada(Usuario user) {
    if (user.getPermisos().contains(1)){
        boolean iguales = pedidoProgramado.equals(this.pedidoLlegado);
    
    if (iguales){
        this.pedidoLlegado.clear();
        this.pedidoProgramado.clear();
        return iguales;
    } else {
        return false;
    }
    } else {
        return null;
    }
}

public Map diferenciaPedido(Boolean v){
    
    if (v){
        Map<String,String> dif = new HashMap<>();
        dif.put("No hay","diferencia");
        return dif;
    }else if(v == false){
        Map<Integer,Integer> diferencia = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : pedidoProgramado.entrySet()) {
            Integer sku = entry.getKey();
            int cantidadPedida = entry.getValue();
            int cantidadRecibida = pedidoLlegado.getOrDefault(sku, 0); 

            if (cantidadPedida != cantidadRecibida) {
                diferencia.put(sku, cantidadPedida - cantidadRecibida); 
                pedidoProgramado.put(sku,cantidadPedida-cantidadRecibida);
            }
        } 
           
        this.pedidoProgramado = diferencia;
        return diferencia;
        } 
        
        return null;
    }

    public Map<Integer, Integer> getPedidoProgramado() {
        return pedidoProgramado;
    }

    public Map<Integer, Producto> getTablaSku() {
        return tablaSku;
    }

    public Map<Integer, Integer> getPedidoLlegado() {
        return pedidoLlegado;
    }
    
    
    
    
   
    
}


