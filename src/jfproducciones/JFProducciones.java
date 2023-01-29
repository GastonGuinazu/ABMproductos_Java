
package jfproducciones;

import Controlador.ControladorProduccion;
import Vista.JFMenu;


public class JFProducciones {

    
    public static void main(String[] args) throws ClassNotFoundException {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           
           new JFMenu(new ControladorProduccion()).setVisible(true);
       }catch(Exception e){
       
       } 
        
        
    }
    
}
