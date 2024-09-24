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

    private ArrayList<Producto> usuario = new ArrayList<>();
    private ArrayList<Producto> aperturaProgramada = new ArrayList<>();
    private ArrayList<Producto> abierto = new ArrayList<>();
    private ArrayList<Producto> vendido = new ArrayList<>();
    private Queue chocolate_10;
    private Queue chocolate_5;
    private Queue vainilla_10;
    private Queue vainilla_5;
    private Queue fresa_10;
    private Queue fresa_5;
    private Map<Integer, Integer> pedidosRealizados = new HashMap<>();
    private Map<Integer, Integer> pedidosLlegados = new HashMap<>();

    
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

    
   

    public ArrayList<Producto> getAperturasProgramadas() {
        return aperturaProgramada;
    }

    public ArrayList<Producto> getAbiertos() {
        return abierto;
    }

    public ArrayList<Producto> getVendidos() {
        return vendido;
    }
    
    

    
    public ArrayList<Producto> getUsuario() {
		return usuario;
	}


	public void setUsuario(ArrayList<Producto> usuario) {
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
    

    public Producto agregarProducto(int sku) {
        
    	
    	if (this.tablaSku.get(sku) != null) {
    		Producto producto_base = this.tablaSku.get(sku);
    		Producto producto_nuevo = new Producto(producto_base.getSabor(), producto_base.getPresentacion(),
    				producto_base.getMarca(), producto_base.getSku());
                
    		producto_base.getCola().enqueue(producto_nuevo);
                return producto_nuevo;

    		


    	} else {
    		System.out.println("Sku no existente");
                return null;
    	}

    }
    
    public void programarApertura(int sku) {
    	
    	if(this.tablaSku.get(sku) != null) {
    		this.aperturaProgramada.add(this.tablaSku.get(sku).getCola().dequeue());
    		System.out.println("Producto programado para la apertura");
    	}else {
    		System.out.println("Sku no válido");
    	}
    	
    }
    
    public Producto venderProducto(int sku) {
    	
    	if (this.tablaSku.get(sku) != null) {
    		Producto temp = this.tablaSku.get(sku).getCola().dequeue();
    		temp.vender();
    		this.vendido.add(temp);
                return temp;
    	}
    	else {
    		System.out.println("Sku no válido");
                return null;
    	}
    
    	}
    
    public Producto abrirProducto(int sku) {
    	
    	if (this.tablaSku.get(sku) != null) {
    		Producto temp = this.tablaSku.get(sku).getCola().dequeue();
    		temp.abrir();
    		this.abierto.add(temp);
                return temp;
    	}
    	else {
    		System.out.println("Sku no válido");
                return null;
    	}
    	
    }
    
    public ArrayList<Producto> realizarApertura() {
    	ArrayList<Producto> productos = new ArrayList<>();
    	Iterator<Producto> iterador = this.aperturaProgramada.iterator();
    	while(iterador.hasNext()) {
    		Producto producto = iterador.next();
    		iterador.remove();
    		producto.abrir();
    		this.abierto.add(producto);
                productos.add(producto);
    		System.out.println("Producto a abrir: ");
    		System.out.println(producto);
    	}
        return productos;
    }
 // FUNCIONALIDAD 6
    public void consultarProductosConPocaExistencia() {
        System.out.println("Consultando productos con poca existencia...");

        // Listas de colas de productos según el sabor y presentación
        Queue[] colasProductos = {chocolate_10, chocolate_5, fresa_10, fresa_5, vainilla_10, vainilla_5};
        String[] descripciones = {"Chocolate 10 litros", "Chocolate 5 litros", "Fresa 10 litros", "Fresa 5 litros", "Vainilla 10 litros", "Vainilla 5 litros"};

        // Recorremos cada cola
        for (int i = 0; i < colasProductos.length; i++) {
            Queue cola = colasProductos[i];

            // Verificar si tiene 2 o menos productos
            if (cola.size() <= 2) {
                System.out.println("Pocas existencias para: " + descripciones[i] + " (" + cola.size() + " unidades restantes)");

                // Recorremos la cola para mostrar los productos
                NodoSimple nodo = cola.data.first();
                while (nodo != null) {
                    Producto producto = nodo.getData();
                    
                    // Mostrar la información relevante del producto
                    System.out.println("Producto: " + producto.getSabor());
                    System.out.println("Presentación: " + producto.getPresentacion() + " litros");
                    System.out.println("SKU: " + producto.getSKU());
                    System.out.println("Fecha de ingreso: " + producto.getFechaIngreso());
                    System.out.println("------------------------------");
                    
                    nodo = nodo.getNext(); // Avanzar al siguiente producto en la cola
                }
            }
        }
    }
    
    //  Se va a mostrar solo cantidad de disponible dependiendo del sku
    // El sku de cualquier chocolate de 10 lts dará acceso a todos los 
    // chocolates de 10 lts sin distinción de marca
    public int mostrarDisponible(int sku) {
    	
            Producto temp = this.tablaSku.get(sku);
            return temp.getCola().size();
    }
    
    public void mostrarSku() {
        System.out.println("SKU Disponibles:");
        System.out.println("101: Sabor Chocolate, CremHelado, 10 Litros");
        System.out.println("102: Sabor Chocolate, CremHelado, 5 Litros");
        System.out.println("103: Sabor Chocolate, Colombina, 10 Litros");
        System.out.println("104: Sabor Chocolate, Colombina, 5 Litros");
        System.out.println("105: Sabor Vainilla, CremHelado, 10 Litros");
        System.out.println("106: Sabor Vainilla, CremHelado, 5 Litros");
        System.out.println("107: Sabor Vainilla, Colombina, 10 Litros");
        System.out.println("108: Sabor Vainilla, Colombina, 5 Litros");
        System.out.println("109: Sabor Fresa, CremHelado, 10 Litros");
        System.out.println("110: Sabor Fresa, CremHelado, 5 Litros");
        System.out.println("111: Sabor Fresa, Colombina, 10 Litros");
        System.out.println("112: Sabor Fresa, Colombina, 5 Litros");
    }
    //ACA
    //Parte de la funcionalidad 9
    public void registrarPedidoLlegado(int sku, int cantidad) {
    pedidosLlegados.put(sku, cantidad);

    // Ciclo para agregar 'cantidad' de productos al inventario
    for (int i = 0; i < cantidad; i++) {
        agregarProducto(sku); // Agrega el producto al inventario 'cantidad' veces
    }
    System.out.println("Pedido registrado: SKU " + sku + ", Cantidad llegada: " + cantidad);
}

    
    public void registrarPedido(int sku, int cantidad) {
        pedidosRealizados.put(sku, cantidad);
        System.out.println("Pedido registrado: SKU " + sku + ", Pedida: " + cantidad);
    }
    
    //¿EL PEDIDO CUANDO SE HACE?
    //EL PEDIDO EN ESTE CASO SOLO SE HACE CUANDO HAY POCAS EXISTENCIAS
    public void PedidoProgramado() {
	    	
    if (this.getChocolate_10().isEmpty()) {
	registrarPedido(1001, 10);
	}
    
    if (this.getChocolate_5().isEmpty()) {
	registrarPedido(1002, 10);
	    	}
	    	
    if(this.getVainilla_10().isEmpty()) {
	registrarPedido(1003, 10);
	    	}
	    	
    if (this.getVainilla_5().isEmpty()) {
	registrarPedido(1004, 10);
	    	}
	    	
    if (this.getFresa_10().isEmpty()) {
	registrarPedido(1005, 10);
	    	}
    if (this.getFresa_5().isEmpty()) {
	registrarPedido(1006, 10);
	}
     }
    
    ///ESTO ES LO IMPORTANTE DE LA FUNCIONALIDAD 9 DEVUELVE NOMBRE SKU CANTIDAD PEDIDA Y CANTIDAD LLEGADA
public boolean compararPedidoConLlegada() {
    boolean todosCompletos = true; // Inicialmente, asumimos que todos los pedidos están completos
    
    for (Map.Entry<Integer, Integer> pedidoRealizado : pedidosRealizados.entrySet()) {
        int sku = pedidoRealizado.getKey();
        int cantidadPedida = pedidoRealizado.getValue();
        int cantidadLlegada = pedidosLlegados.getOrDefault(sku, 0);
        
        String nombreProducto = obtenerNombreSKU(sku);
        System.out.println("SKU: " + sku + " (" + nombreProducto + "), Cantidad pedida: " + cantidadPedida + ", Cantidad llegada: " + cantidadLlegada);
        
        if (cantidadPedida != cantidadLlegada) {
            int cantidadFaltante = cantidadPedida - cantidadLlegada;
            System.out.println("Cantidad faltante para SKU " + sku + ": " + cantidadFaltante);
            todosCompletos = false; // Si hay diferencias, indicamos que no todos los pedidos están completos
            registrarPedido(sku,10);
        }
    }
    
    // Vaciar los mapas después de la comparación
    pedidosRealizados.clear();
    pedidosLlegados.clear();

    return todosCompletos; // Retorna true si todos los pedidos fueron completados, false si alguno no lo fue
}


    private String obtenerNombreSKU(int sku) {
    switch (sku) {
        case 1001: return "Chocolate 10";
        case 1002: return "Chocolate 5";
        case 1003: return "Vainilla 10";
        case 1004: return "Vainilla 5";
        case 1005: return "Fresa 10";
        case 1006: return "Fresa 5";
        default: return "Desconocido";
    }
}

}
