package tiempo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.datos;

public class Tiempo {

    static ArrayList<datos> alumnos = new ArrayList<datos>();
   
    public static void main(String[] args) {
    
        alumnos.add(new datos("Leper", "Matematicas"));
        alumnos.add(new datos("Jesus", "Matematicas"));
        alumnos.add(new datos("Nicolas", "Matematicas"));        
        
        String busqueda;
        String nombreImput; 
        String claseImput; 
        String ingresos;
        
        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese una opción: "
                                                                 +"\n 1. Lista alumnos"
                                                                 +"\n 2. Ingresar nuevo alumno"
                                                                 +"\n 3. Modificar registro"
                                                                 +"\n 4. Quitar registro"
                                                                 +"\n 5. Salir"));
          
            switch(opcion){
          
                case 1:
                    for (int i =0; i<alumnos.size();i++){   
                        JOptionPane.showMessageDialog(null, alumnos.get(i).getNombre() + " " + alumnos.get(i).getClase() );
                    }
                    break;        
          
                case 2:
                    nombreImput = JOptionPane.showInputDialog("Digite el nombre");
                    claseImput = JOptionPane.showInputDialog("Digite la clase");
                
                    alumnos.add( new datos(nombreImput, claseImput));
                
                    break;
              
                case 3: 
                    busqueda = JOptionPane.showInputDialog("Digite el nombre del estudiante que desea modificar la clase"); 
                    for (int i =0; i<alumnos.size();i++){
                        if(alumnos.get(i).getNombre().equals(busqueda)){
                            ingresos = JOptionPane.showInputDialog("digite el nombre de la nueva clase");
                            alumnos.get(i).setClase(ingresos);
                        break;    
                        }
                        else{ JOptionPane.showMessageDialog(null,"El nombre no existe");
                        }
                    }   
                    break;
                case 4: 
                    busqueda = JOptionPane.showInputDialog("Digite el nombre del estudiante que desea eliminar"); 
                    for (int i =0; i<alumnos.size();i++){
                        if(alumnos.get(i).getNombre().equals(busqueda)){
                            alumnos.remove(i);  
                        break;
                        }
                        else{ JOptionPane.showMessageDialog(null,"El nombre no existe");
                        
                        }
                    }    
                    break; 
                case 5:
                    System.exit(0);
                    break;
                }
            }
            while( true );
                
         
        
    }    
}
        

