package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class BarriosOpciones extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public BarriosOpciones() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Barrios");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(49, 44, 234, 32);
		add(lblTitulo);
		
		JButton btnVerBarrios = new JButton("Ver barrios");
		btnVerBarrios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerBarrios.setBounds(232, 169, 161, 39);
		add(btnVerBarrios);
		
		JButton btnGuardarBarrios = new JButton("Guardar barrios");
		btnGuardarBarrios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardarBarrios.setBounds(232, 235, 161, 39);
		add(btnGuardarBarrios);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(23, 476, 133, 32);
		add(btnVolver);
	}

}
