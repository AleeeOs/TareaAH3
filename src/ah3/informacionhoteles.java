package ah3;

import java.util.LinkedList;

public class informacionhoteles {
 
public static LinkedList <informacionhoteles> info = new LinkedList<>();  
    
    
 private int usuario_id;
 private String nombre;
 private String apellido;
 private char direccion;
 private char correo_electronico;
 private char fecha_nacimiento;
 private char contrasenia;
 private char telefono;

    public informacionhoteles(int usuario_id, String nombre, String apellido, char direccion, char correo_electronico, char fecha_nacimiento, char contrasenia) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.fecha_nacimiento = fecha_nacimiento;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
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

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public char getCorreo_electronico() {
        return correo_electronico;
    }
    
    public int gettelefono() {
        return telefono;
    }

    public void setCorreo_electronico(char correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public char getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(char fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public char getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(char contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void settelefono(char telefono) {
        this.telefono = telefono;
    }






}


