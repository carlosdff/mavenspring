/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fuentes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Controller
@RequestMapping("/hola2")
public class ControladorHola {
    @RequestMapping(value="/mensaje",method = RequestMethod.GET,headers = {"Accept=text/html"})
    public @ResponseBody String algo(){
        String facil="mi primer mensajito en java con REST y Spring";
        return facil;
        
        
    }
    
}
