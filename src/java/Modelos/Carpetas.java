/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author WCARO
 */
public class Carpetas {
    String Nombre;
    String Ubicacion;
    Date FechaCreacion;
    
    public Carpetas() {
        super();
    }

    public Carpetas(String Nombre, String Ubicacion, Date FechaCreacion) {
        this.Nombre = Nombre;
        this.Ubicacion = Ubicacion;
        this.FechaCreacion = FechaCreacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    
}
