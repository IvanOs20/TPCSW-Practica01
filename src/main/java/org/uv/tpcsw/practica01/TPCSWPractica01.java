package org.uv.tpcsw.practica01;

public class TPCSWPractica01 {

    public static void main(String[] args) {
        
        
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            System.out.println(s1);
            System.out.println(s2);
            
            
//          Singleton s1 = new Singleton();
//          Singleton s2 = new Singleton();
//          System.out.println(s1);
//          System.out.println(s2);


//           IMensaje msgv = new Saludo2();
//           msgv.imprimir();
//           
//           msgv = new Despedida2();
//           msgv.imprimir();
//           
//           //Lanmda
//           msgv = () -> {
//               System.out.println("Otro mensaje...");
//           };
//           msgv.imprimir();
        
//        Mensaje msgV=null;
//        
//        msgV = new Saludo();
//        
//        msgV.imprimir();
//        
//        msgV = new Despedida();
//        
//        msgV.imprimir();
//        
//        msgV=new Mensaje(){
//            @Override
//            protected void msg(){
//                System.out.println("Otro mensaje");
//            }
//        };
//        msgV.imprimir();
//        
        
//        MensajeConcreto msg=null;
//        msg = new MensajeConcreto("Otro");
//        msg.imprimir();
//        System.out.println("Hello World!");
    }
}
