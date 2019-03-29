package Modelo.BD;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public class GenericoBD {
       /* Clase que contiene los método necesarios para trabajar
    con la base de datos */
    
    private static ObjectContainer con;
        
    public static void abrirBD() throws Exception
    { 
       con = Db4o.openFile("bdAcontecimientos");
    }
    
    public static void cerrarBD() throws Exception
    {    
        con.close();
    }

    public static ObjectContainer getCon() 
    {
        return con;
    }
}
