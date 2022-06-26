/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * clase que implementa todos los metodos para la construcción del crud
 * se inyecta la notacion @sevice para que Spring lo reconozca y posteriormente se pueda inyectar esta clase en el controlador
 */
@Service
public class PersonaServiceImpl  implements PersonaService{
    
    @Autowired
    private PersonaDao PersonaDao;
    
    
   /**
    * metodo que muestra el listado de personas(todos los contactos)
    * @return un listado de objeto persona
    */
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listcontacts() {
        return(List<Persona>) PersonaDao.findAll();
    }
     /**
     * metodo quue guarda un contacto
     * @param persona 
     */
    @Override
    @Transactional
    public void save_Contact(Persona persona) {
        PersonaDao.save(persona);
    }
    /**
     * metodo que elimina un contacto
     * @param persona 
     */
    @Override
    @Transactional
    public void remove(Persona persona) {
        PersonaDao.delete(persona);
    }
    /**
     * metodo que encuentra un contacto por medio de la llave principar de la trabla
     * @param persona
     * @return un objeto tipo persona
     */
    @Override
    @Transactional(readOnly = true)
    public Persona findContact(Persona persona) {
       return PersonaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}
