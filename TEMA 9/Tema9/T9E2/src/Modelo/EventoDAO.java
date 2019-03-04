
package Modelo;

import com.mysql.jdbc.*;


public class EventoDAO {
     private Connection con;
    private Evento evento;

    public EventoDAO() {
    }

    public EventoDAO(Connection con) {
        this.con = con;
    }
   
    
    
}
