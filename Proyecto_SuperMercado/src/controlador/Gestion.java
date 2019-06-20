/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Bernardo
 */
public class Gestion {
    
     String rol;
     String per_nombre;
     
     int per_id;

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }
     
     

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
     
    
    
    
   List<Integer> lisx(String cedula){
     List<Integer>lista=new ArrayList<>();
        List<Integer>lista1=new ArrayList<>();
        int sum=0;
        int cont=1;
        
        for (int i = 0; i < cedula.length(); i++) {
            lista.add(Integer.parseInt(cedula.substring(i, i+1)));
            
        }
    
    
    return lista;
    } 
    
    int Suma(List<Integer>lista){
        int sum=0;
        int cont=1;
    for (int i = 0; i < lista.size()-1; i++) {
            
            if(cont%2==0){
              sum=sum+lista.get(i);
            
            }else {
                 
             sum=sum+res(lista.get(i));
                //System.out.println(res(lista.get(i)));
            
              
            
            }
            cont++;
                
            
        }
    return sum;
    }
    
    
    
    
    int res(int num ){
        if(num*2>=10){
         return (num*2)-9;
            
        }else {
        
        return num*2;
        }
        
     
        }
    int modulo (int num){
      return num%10;
    }
    
    int resta(int num){
       //JOptionPane.showMessageDialog(null,num);
        if(num!=0){
        return 10-num;
        }else {
         
         return 0;
        }
    
   
    }
    
    public boolean Cedula(String num){
      
        
        int ultimo=lisx(num).get(lisx(num).size()-1);
        
        
         if( resta(modulo(Suma(lisx(num))))==ultimo){
         return true;
         
         }else {
         return false;
         }
        
        
        
        
    
    
    }
    
    
}
