
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ContoladoraPersistencia;
import java.util.List;


public class Contoladora {
       
    ContoladoraPersistencia ContoladoraPersis = new ContoladoraPersistencia();
    
    public void agergarAtomovil(String modelo, String marca, String motor, 
            String color, String patente, int cantPuertas) {
        
        Automovil auto= new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);


            ContoladoraPersis.agergarAtomovil(auto);
     
    }

    public List<Automovil> traerAutos() {
        
        return ContoladoraPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
     
          ContoladoraPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAutos(int idauto) {
       return ContoladoraPersis.traerAutos(idauto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, 
            String motor, String color, String patente, int cantPuertas) {
        
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        
        //le pido a la persistencia que modifique
        ContoladoraPersis.modificarAuto(auto);
        
        
    }
    
}
