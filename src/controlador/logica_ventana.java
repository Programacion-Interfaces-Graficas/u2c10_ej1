package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import vista.ventana;

public class logica_ventana implements ActionListener, ItemListener {

	private ventana delegado;
	private String nombre, titulo, saludo;

	public logica_ventana(ventana delegado) {
		super();
		this.delegado = delegado;
		this.delegado.btn_mensaje.addActionListener(this);
		this.delegado.cmb_idioma.addItemListener(this);
		cargarIdiomas("es_ES","en_EN");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		nombre=this.delegado.txt_nombres.getText();
		titulo=delegado.bundle.getString("titulo");
		saludo=delegado.bundle.getString("saludo");
		JOptionPane.showMessageDialog(delegado, saludo+"\t"+nombre, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	private void cargarIdiomas(String...idiomas) {
		for(String idioma:idiomas) {
			this.delegado.cmb_idioma.addItem(idioma);
		}
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==1) {
			delegado.bundle=ResourceBundle.getBundle("idiomas/"+delegado.cmb_idioma.getSelectedItem());
			delegado.lbl_idioma.setText(delegado.bundle.getString("lbl_idioma"));
			delegado.lbl_nombre.setText(delegado.bundle.getString("lbl_nombre"));
			delegado.lbl_apellidos.setText(delegado.bundle.getString("lbl_apellidos"));
			delegado.lbl_genero.setText(delegado.bundle.getString("lbl_genero"));
			delegado.rbtn_femenino.setText(delegado.bundle.getString("rbtn_femenino"));
			delegado.rbtn_masculino.setText(delegado.bundle.getString("rbtn_masculino"));
			delegado.lbl_mensaje.setText(delegado.bundle.getString("lbl_mensaje"));
			delegado.btn_mensaje.setText(delegado.bundle.getString("btn_mensaje"));			
		}
	}
	
}
