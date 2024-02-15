
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContoladoraPersistencia {
       AutomovilJpaController autoJpa = new  AutomovilJpaController();
    public void agergarAtomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
       return autoJpa.findAutomovilEntities();
        
        
    }

    public void borrarAuto(int idAuto) {

           try {
               autoJpa.destroy(idAuto);
           } catch (NonexistentEntityException ex) {
               Logger.getLogger(ContoladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }

    public Automovil traerAutos(int idauto) {
       return autoJpa.findAutomovil(idauto);
    }

    public void modificarAuto(Automovil auto) {
           try {
               autoJpa.edit(auto);
           } catch (Exception ex) {
               Logger.getLogger(ContoladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
}
