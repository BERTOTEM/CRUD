

package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *CrudRepository que contiene métodos para operaciones CRUD
 * @author julian mazo
 */

public interface PersonaDao extends CrudRepository<Persona,Long>{
    
    
}
