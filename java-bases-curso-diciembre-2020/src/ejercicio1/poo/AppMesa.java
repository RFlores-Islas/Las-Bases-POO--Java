package ejercicio1.poo;

import javax.swing.JOptionPane;

public class AppMesa{

	public static void main(String []args) {
		MesaDespacho mesa = new MesaDespacho(4, "Madera", 2);
		System.out.println(mesa.getMaterial());
		JOptionPane.showMessageDialog(null,"Esta mesa tiene "+ mesa.getNumero_patas()+ " patas");
	}
}
