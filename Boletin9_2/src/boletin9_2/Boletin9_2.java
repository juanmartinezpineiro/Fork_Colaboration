package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SumasEntre10y90 calculaSuma = new SumasEntre10y90();
        
//        calculaSuma.producto();
//        calculaSuma.suma();
        
        JOptionPane.showMessageDialog(null,"El producto es: "+calculaSuma.producto()+ "\n la suma es: "+calculaSuma.suma());
                
        


    }

}
