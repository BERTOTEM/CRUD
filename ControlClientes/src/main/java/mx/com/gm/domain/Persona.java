/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 * clase entidad
 * se usa Data para crear los get,set,toString automaticamente 
 * Table se usa para identificar el nombre de la tabla en la base de datos en que se trabaja
 * @author julian mazo
 */
@Data
@Entity
@Table(name ="contacts")
public class Persona implements Serializable {
    /**
     * 
     */
    private static  final long serialVersionUID = 1L;
    /**
     * Notaciones para identificar la llave primaria de la tabla contacts
     */
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idPersona;
    private String name;
    private String date_of_birth;
    private String email;
    private String phone;

   
}
