/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;

/**
 *interfaz que contiene todos los metodos a implementar en Personaservicelmpl
 * @author julian mazo
 */
public interface PersonaService {
    /**
     *metodo para mostrar todo en tabla
     * @return un lista de objetos tipo persona
     */
    public List<Persona> listcontacts();
    /**
     * metodo quue guarda un contacto
     * @param persona 
     */
    public void save_Contact(Persona persona);
    /**
     * metodo que elimina un contacto
     * @param persona 
     */
    public void remove(Persona persona);
    /**
     * metodo que encuentra un contacto
     * @param persona
     * @return un objeto tipo persona
     */
    public Persona findContact(Persona persona);
    
}
