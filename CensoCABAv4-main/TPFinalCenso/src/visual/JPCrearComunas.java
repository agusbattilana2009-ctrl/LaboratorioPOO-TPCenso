package visual;

import java.awt.Color;
import dao.daoComuna;
import modelo.Barrio;
import java.util.ArrayList;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.SituacionLaboral;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import modelo.Comuna;
import javax.swing.JSpinner;
public class JPCrearComunas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfSede;

	/**
	 * Create the panel.
	 */
	public JPCrearComunas() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		JSpinner jsNum = new JSpinner();
		jsNum.setBounds(187, 179, 58, 20);
		add(jsNum);
		JLabel lblsede = new JLabel("Nombre de sede");
		lblsede.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsede.setBounds(50, 115, 127, 24);
		add(lblsede);
		
		JLabel lblNum = new JLabel("Número");
		lblNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNum.setBounds(50, 175, 100, 25);
		add(lblNum);
		


		
		JLabel lblTitulo = new JLabel("Crear comuna");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(31, 39, 234, 32);
		add(lblTitulo);
		
		tfSede = new JTextField();
		tfSede.setColumns(10);
		tfSede.setBounds(187, 117, 122, 25);
		add(tfSede);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(10, 473, 133, 32);
		add(btnVolver);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ArrayList<Barrio> barrios = new ArrayList<Barrio>();
				Comuna c = new Comuna((int)jsNum.getValue(), tfSede.getText(),barrios);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(165, 242, 170, 39);
		add(btnNewButton);
		

	}

}
