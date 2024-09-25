package helados_pa_todos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	protected String nombre;
	protected String tipo;
	protected String contraseña;
	protected String documento;
	protected List<Integer> permisos;
	protected List<RegistroModificaciones> registros;

    public Usuario(String nombre, String tipo, String contraseña, String documento) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.contraseña = contraseña;
        this.documento = documento;
        this.permisos = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<Integer> getPermisos() {
        
       
            return permisos;
        
       
    }

    public boolean agregarPermiso(int permiso, Usuario user) {
        if (user.getTipo().equals("admin") && 1 <= permiso && permiso <= 3){
            this.permisos.add(permiso);
            return true;
        }else{
            return false;
        }
              
        
    }

    public boolean removerPermiso(int permiso, Usuario user) {
        if(user.getTipo().equals("admin") && 1 <= permiso && permiso <= 3){
            this.permisos.remove(permiso);
            return true;
        }else{
            return false;
        }
        
    }

    public List<RegistroModificaciones> getRegistros() {
        return registros;
    }

    public void registrarAccion(String accion) {
        RegistroModificaciones registro = new RegistroModificaciones(this.nombre, accion);
        this.registros.add(registro);
    }
}