package org.uv.tpcsw.practica01;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MensajeConcreto {
    
    private String name="";
    
    public MensajeConcreto(String name){
        this.name = name;
    }
    
    public MensajeConcreto(){
        this.name = "Nombre";
        Logger.getLogger(MensajeConcreto.class.getName()).
                log(Level.INFO,"constructor en ejecucion");
    }
    
    
    
    public void imprimir(){
        Logger.getLogger(MensajeConcreto.class.getName()).
                log(Level.INFO, "{0} : Mensaje...",name);
    }
}
