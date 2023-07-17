package librerias;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializadoraGen{
            
    public static void serializar ( String sNombreArchivo, 
                                Object  obj ) {
        try {
            ObjectOutputStream escritor = 
              new  ObjectOutputStream (
                      new FileOutputStream (sNombreArchivo));
            escritor.writeObject(obj);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
       
    public static Object deserializar  (String sNombreArchivo) {
        Object  obj  = new Object ();
        try{
            ObjectInputStream lector = 
                new ObjectInputStream(
                        new FileInputStream(sNombreArchivo)); 
            obj  = (Object)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return obj;    
    
    }
public static List<Object> deserializarTodos(String sNombreArchivo) {
    List<Object> objetos = new ArrayList<>();

    try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo))) {
        while (true) {
            try {
                Object obj = lector.readObject();
                objetos.add(obj);
            } catch (EOFException e) {
                break; // Se alcanzó el final del archivo
            }
        }
    } catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

    return objetos;
}



}

