/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansStateful;
import BeansStateful.BeanLocal.ICalculo;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author Michael Torres
 */

@Stateful
public class Contar implements IContador{
    private int item;
    
    @Override
    public void agregarItem(){
        item++;
    }
    
    @Override
    public void borrarItem(){
        item--;
    }
    
    @Override
    public int contarItem(){
        
        return 0;
        
    }
    
    @Override
    public void borrarTodo(){
        item--;
    }
    
    @Override
    public String test(){
        
        return null;
    }
    
/*
    @EJB
    private ICalculo iCalculo;
    
    @Override
    public String test(){
        return "Hola desde EJB Remoto + " + iCalculo.mensaje();
    } */
    
}
