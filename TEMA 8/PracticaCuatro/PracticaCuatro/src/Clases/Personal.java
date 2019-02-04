
package Clases;


public class Personal {

  public String usuario;
   public String contraseña;

    public Personal() {
    }

    public Personal(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}

