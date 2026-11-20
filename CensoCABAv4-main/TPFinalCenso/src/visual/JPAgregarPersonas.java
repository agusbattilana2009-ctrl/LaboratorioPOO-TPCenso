package visual;

import javax.swing.JPanel;
import java.time.LocalDate;
import modelo.SistemaCenso;
import modelo.Barrio;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import modelo.SituacionLaboral;
import modelo.Comuna;
import modelo.Persona;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class JPAgregarPersonas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JTextField tfDni;
	private JTextField txNacimiento;

	/**
	 * Create the panel.
	 */
	public JPAgregarPersonas(SistemaCenso s) {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(50, 115, 127, 24);
		add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBounds(50, 175, 215, 25);
		add(lblDni);
		
		JLabel lblFechaNac = new JLabel("Fecha de nacimiento");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaNac.setBounds(50, 235, 127, 24);
		add(lblFechaNac);
		
		JLabel lblSituacion = new JLabel("Situación laboral");
		lblSituacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSituacion.setBounds(50, 295, 215, 20);
		add(lblSituacion);
		
		JLabel lblBarrio = new JLabel("Barrio");
		lblBarrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBarrio.setBounds(50, 349, 82, 21);
		add(lblBarrio);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(180, 117, 159, 25);
		add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(180, 403, 159, 39);
		add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Agregar personas");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(31, 39, 234, 32);
		add(lblTitulo);
		
		tfDni = new JTextField();
		tfDni.setColumns(10);
		tfDni.setBounds(180, 177, 159, 25);
		add(tfDni);
		
		txNacimiento = new JTextField();
		txNacimiento.setColumns(10);
		txNacimiento.setBounds(180, 237, 159, 25);
		add(txNacimiento);
		
		JComboBox cbSituacion = new JComboBox();
		cbSituacion.setBounds(180, 293, 159, 24);
		add(cbSituacion);
		cbSituacion.addItem(SituacionLaboral.DESOCUPADO);
		cbSituacion.addItem(SituacionLaboral.OCUPADO);
		cbSituacion.addItem(SituacionLaboral.SUBOCUPADO);
		
		JComboBox cbBarrio = new JComboBox();
		cbBarrio.setBounds(180, 346, 159, 24);
		add(cbBarrio);
		
		for (Comuna c : s.getComunas()) {
			for (Barrio b : c.getBarrios()) {
			cbBarrio.addItem(b.getNombreBarrio());
		    }
		}

		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setBounds(31, 477, 109, 25);
		add(btnVolver);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Persona p = new Persona(tfNombre.getText(), tfDni.getText(), LocalDate.parse(txNacimiento.getText()), (SituacionLaboral) cbSituacion.getSelectedItem(), (Barrio) cbBarrio.getSelectedItem());
			}
		});
	}
}
