package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.logica_ventana;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txt_nombres;
	public JTextField txt_apellidos;
	public JButton btn_mensaje;
	public JLabel lbl_mensaje;
	public JRadioButton rbtn_masculino;
	public JRadioButton rbtn_femenino;
	public JLabel lbl_genero;
	public JLabel lbl_apellidos;
	public JLabel lbl_nombre;
	public JLabel lbl_idioma;
	public JComboBox cmb_idioma;
	private ButtonGroup genero;
	
	

	public ResourceBundle bundle=ResourceBundle.getBundle("idiomas/es_ES.propierties");
	        

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		
		setTitle("INTERNACIONALIZACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 596, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 562, 213);
		contentPane.add(panel);
		
		lbl_idioma = new JLabel(bundle.getString("lbl_idioma"));
		lbl_idioma.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_idioma.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		cmb_idioma = new JComboBox();
		
		lbl_nombre = new JLabel(bundle.getString("lbl_nombre"));
		lbl_nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_nombre.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		txt_nombres = new JTextField();
		txt_nombres.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txt_nombres.setColumns(10);
		
		lbl_apellidos = new JLabel(bundle.getString("lbl_apellidos"));
		lbl_apellidos.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_apellidos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		txt_apellidos = new JTextField();
		txt_apellidos.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txt_apellidos.setColumns(10);
		
		lbl_genero = new JLabel(bundle.getString("lbl_genero"));
		lbl_genero.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_genero.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		rbtn_femenino = new JRadioButton(bundle.getString("rbtn_femenino"));
		rbtn_femenino.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		rbtn_masculino = new JRadioButton(bundle.getString("rbtn_masculino"));
		rbtn_masculino.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		
		genero=new ButtonGroup();
		genero.add(rbtn_femenino);
		genero.add(rbtn_masculino);
		
		lbl_mensaje = new JLabel(bundle.getString("lbl_mensaje"));
		lbl_mensaje.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_mensaje.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		btn_mensaje = new JButton(bundle.getString("btn_mensaje"));
		btn_mensaje.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(334)
							.addComponent(lbl_idioma, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmb_idioma, 0, 70, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbl_nombre, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txt_nombres, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbl_apellidos, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txt_apellidos, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lbl_genero, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(rbtn_masculino, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addComponent(rbtn_femenino, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addGap(254)))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(206, Short.MAX_VALUE)
					.addComponent(lbl_mensaje, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn_mensaje)
					.addGap(27))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_idioma)
						.addComponent(cmb_idioma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_nombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_nombre, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txt_apellidos, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_apellidos, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_genero, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbtn_femenino))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rbtn_masculino, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbl_mensaje, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_mensaje, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		new logica_ventana(this);
	}
}
