package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PersonasOpciones extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PersonasOpciones() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblPersonas = new JLabel("Personas");
		lblPersonas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPersonas.setBounds(48, 42, 234, 32);
		add(lblPersonas);
		
		JButton btnVerPersonas = new JButton("Ver personas");
		btnVerPersonas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerPersonas.setBounds(240, 173, 161, 39);
		add(btnVerPersonas);
		
		JButton btnGuardarPersonas = new JButton("Guardar personas");
		btnGuardarPersonas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardarPersonas.setBounds(240, 246, 161, 39);
		add(btnGuardarPersonas);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(23, 473, 133, 32);
		add(btnVolver);
	}

}
