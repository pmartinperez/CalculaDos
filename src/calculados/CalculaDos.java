/*
 * Se introducen dos numeros float y se elige una operacion(+,-,*,/). Se muestra el resultado.
 */
package calculados;

import javax.swing.JOptionPane;

/**
 *
 * @author Patripon
 */
public class CalculaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo contenedor =  new Modelo();
        
        contenedor.setNum1(Float.parseFloat(JOptionPane.showInputDialog("Numero1")));
        contenedor.setNum2(Float.parseFloat(JOptionPane.showInputDialog("Numero2")));
        
        String operacion = JOptionPane.showInputDialog("Operacion");
        if(operacion.equals("+")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("-")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("*")){
            contenedor.setOperacion(operacion);
        }else if(operacion.equals("/")){
            contenedor.setOperacion(operacion);
        }
    }

    
    public void realizaOperacion(Modelo contenedor){
        float resultado = contenedor.resultado;
        switch(contenedor.getOperacion()){
            case "+": 
                 resultado = contenedor.getNum1()+contenedor.getNum2();
            break;
            case "-": 
                 resultado = contenedor.getNum1()-contenedor.getNum2();
            break;
            case "*": 
                 resultado = contenedor.getNum1()*contenedor.getNum2();
            break;
            case "/": 
                 resultado = contenedor.getNum1()/contenedor.getNum2();
            break;
        }
    }
    
    }
    

