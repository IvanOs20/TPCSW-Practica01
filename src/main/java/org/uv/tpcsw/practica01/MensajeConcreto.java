package org.uv.tpcsw.practica01;

public class MensajeConcreto {
    
    private String name="";
    
    public MensajeConcreto(String name){
        this.name = name;
    }
    
    public MensajeConcreto(){
        this.name = "Nombre";
        System.out.println("Se ejecuta el constructor");
    }
    
    
    
    public void imprimir(){
        System.out.println(name+":"+" Mensaje...");
    }
}
