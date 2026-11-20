package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class ComunasOpciones extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ComunasOpciones() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblComunas = new JLabel("Comunas");
		lblComunas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblComunas.setBounds(41, 39, 234, 32);
		add(lblComunas);
		
		JButton btnVer = new JButton("Ver comunas");
		btnVer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVer.setBounds(229, 172, 161, 39);
		add(btnVer);
		
		JButton btnCrear = new JButton("Guardar comunas");
		btnCrear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCrear.setBounds(229, 236, 161, 39);
		add(btnCrear);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(21, 471, 133, 32);
		add(btnVolver);
	}
}
