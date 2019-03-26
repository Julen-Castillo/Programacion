package Modelo.BD;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

import java.sql.Connection;
import java.sql.DriverManager;

public class GenericoBD {
    /* Clase que contiene los método necesarios para trabajar
    con la base de datos */
private ObjectContainer oc;

    public GenericoBD() throws Exception{
          oc = Db4o.openFile("bdejemplo");
    }
   // public void cerrar(){
   //     oc.close();
  //  }
    public ObjectContainer getConexion(){
        return oc;
    }
}
