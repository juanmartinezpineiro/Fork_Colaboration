package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class TablaMultiplicar {

    public void tablaMultiplicar (){
       int numero;
       do{
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número del que desea su tabla de multiplicar: "));
       if(numero>0) {
           System.out.println("Tabla de multiplicar de "+numero);
           for (int i = 0; i < 11; i++) {
               System.out.println(numero+ " * " +i+ " = " +numero*i);
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Número invalido, por favor vuelva a introducir un número que cumpla los parametros");
       }
       }while(numero!=0);
       
    }
    
}
