

package com.fuentes.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author T107
 */
public class ProbarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ServicioFuentes.class);
     Persona p=ctx.getBean(Persona.class);
    System.out.println( p.ejecutarGracia());
     
    }
    
}
