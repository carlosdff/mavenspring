

package com.fuentes.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author T107
 */
public class ProbarPersonas {

   
    public static void main(String[] args) {
        
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ServicioFuentes.class);
     Persona p=ctx.getBean(Persona.class);
    System.out.println( p.ejecutarGracia());
     
    }
    
}
