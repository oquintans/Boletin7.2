


package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {
    private short numero1;
    private short numero2;
    
    public Condicional(){
        
    }
    public Condicional(short num1,short num2){
        numero1=num1;
        numero2=num2;
    }
    public short getNumero(){
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        short valor = Short.parseShort(respuesta);
        return valor;
    }
    public void comparar(short n1, short n2){
        numero1=n1;
        numero2=n2;
        if(n1>=n2){
            JOptionPane.showMessageDialog(null,n1-n2);
        }else{
            JOptionPane.showMessageDialog(null, n2+n1);
        }
    }
}
