import javax.swing.JOptionPane;

public class TesteInterpretador {
	public static void main(String[] args) {
        
       String cod= JOptionPane.showInputDialog("Digite o Codigo");
		int vl = Integer.parseInt(cod);
        Operador codigo = new Codigo(new Numero(vl));
        
        if(vl!=222 & vl!=333){
        	JOptionPane.showMessageDialog( null, "Codigo Invalido");
        	System.exit(0);
        }else{
       String cod1 = JOptionPane.showInputDialog( null, codigo.interpretar10());
        int vl1 = Integer.parseInt(cod1);
        Operador codigo1 = new Codigo1(new Numero(vl1));
       JOptionPane.showMessageDialog( null, codigo1.interpretar11());}
        System.exit(0);    } 
}
