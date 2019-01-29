
package Clase;

import java.util.ArrayList;


public class SocioFamiliar extends Socio{

    public SocioFamiliar(String nombre, String apellido, String Telefono, String CorreoElectronico) {
        super(nombre, apellido, Telefono, CorreoElectronico);
    }

    public SocioFamiliar() {
    }

    public ArrayList<Hijo> getListaHijos() {
        return listaHijos;
    }

    public void setListaHijos(ArrayList<Hijo> listaHijos) {
        this.listaHijos = listaHijos;
    }
    
    private ArrayList<Hijo>listaHijos;
    
}
