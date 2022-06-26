/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * clase controlador que se encarga de hacer las funciones del CRUD
 * @author julian mazo
 */
@Slf4j
@Controller
public class controladorInicio {
    
    @Autowired
    private  PersonaService personaService;
    /**
     * metodo inicio con sentencia get para obtener todo el contenido de la tabla contacts
     * @param model
     * @return template de index
     */
    @GetMapping("/")
    public String beginning(Model model){
        var personas = personaService.listcontacts();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
    /**
     * metodo add con sentencia get para agregar contenido a la tabla contacts
     * @param persona toda la informacion del contacto qeu se desea agregar
     * @return template de modificar
     */
    @GetMapping("/agregar")
    public String add(Persona persona){
        return "modificar";
    }
    /**
     * metodo save con sentencia post para enviar y guardar lo agregado en el metodo add contenido a la tabla contacts
     * @param persona
     * @return 
     */
    @PostMapping("/guardar")
    public String save(Persona persona){
        personaService.save_Contact(persona);
        return "redirect:/";
    }
    /**
     * Metodo Edit con sentencia get que me muestra la informacion del contacto para luego editar el apartado que desee
     * @param persona contacto que se desea editar
     * @param model
     * @return 
     */
    @GetMapping("/editar/{idPersona}")
    public String Edit(Persona persona, Model model){
        persona= personaService.findContact(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    /**
     * Metodo guardar con sentencia get que me muestra la informacion del contacto para luego editar el apartado que desee
     * @param persona
     * @return 
     */
    @GetMapping("/eliminar/{idPersona}")
    public String remove(Persona persona){
        personaService.remove(persona);
        return "redirect:/";
    }
    
}
