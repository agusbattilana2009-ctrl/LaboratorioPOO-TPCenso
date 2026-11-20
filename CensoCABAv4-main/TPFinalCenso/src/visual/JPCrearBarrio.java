package visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.SituacionLaboral;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
public class JPCrearBarrio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public JPCrearBarrio() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblsede = new JLabel("Nombre");
		lblsede.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsede.setBounds(25, 102, 127, 24);
		add(lblsede);
		
		JLabel lblnumero = new JLabel("Superficie");
		lblnumero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblnumero.setBounds(25, 139, 215, 25);
		add(lblnumero);
		
		JLabel lblCantBarrios = new JLabel("Comuna");
		lblCantBarrios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCantBarrios.setBounds(25, 175, 127, 24);
		add(lblCantBarrios);
		

		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(240, 392, 170, 39);
		add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Crear barrio");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitulo.setBounds(31, 39, 234, 32);
		add(lblTitulo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 104, 159, 25);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 141, 159, 25);
		add(textField_1);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setBounds(25, 474, 109, 25);
		add(btnVolver);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 178, 159, 22);
		add(comboBox);
		
		JLabel lblTipoDeBarrio = new JLabel("Tipo de barrio");
		lblTipoDeBarrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeBarrio.setBounds(25, 210, 109, 24);
		add(lblTipoDeBarrio);


		
		JLabel lblcantEdif = new JLabel("Cantidad de edificios");
		lblcantEdif.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblcantEdif.setBounds(25, 265, 153, 24);
		add(lblcantEdif);
		
		JLabel lblAsfalto = new JLabel("Asfalto en calles");
		lblAsfalto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAsfalto.setBounds(25, 300, 153, 24);
		add(lblAsfalto);
		
		JSpinner JSCantEdif = new JSpinner();
		JSCantEdif.setBounds(177, 269, 52, 20);
		add(JSCantEdif);
		
		JSpinner JSAsfalto = new JSpinner();
		JSAsfalto.setBounds(177, 304, 52, 20);
		add(JSAsfalto);
		
		JLabel lblLey = new JLabel("Número de ley");
		lblLey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLey.setBounds(240, 265, 153, 24);
		add(lblLey);
		
		JLabel lblmonoblocks = new JLabel("Cantidad de monoblocks");
		lblmonoblocks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmonoblocks.setBounds(450, 265, 153, 24);
		add(lblmonoblocks);
		
		JSpinner JSNLey = new JSpinner();
		JSNLey.setBounds(361, 269, 52, 20);
		add(JSNLey);
		
		JSpinner JSMonoblocks = new JSpinner();
		JSMonoblocks.setBounds(613, 269, 52, 20);
		add(JSMonoblocks);
		
		JCheckBox chkConformidad = new JCheckBox("Tiene conformidad");
		chkConformidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkConformidad.setBackground(new Color(192, 185, 215));
		chkConformidad.setBounds(240, 301, 200, 23);
		add(chkConformidad);
		
		JCheckBox ckbConsorcio = new JCheckBox("Tiene consorcio");
		ckbConsorcio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ckbConsorcio.setBackground(new Color(192, 185, 215));
		ckbConsorcio.setBounds(450, 301, 200, 23);
		add(ckbConsorcio);
		
		
		JComboBox cbTipoDeBarrio = new JComboBox();
		cbTipoDeBarrio.setBounds(144, 213, 159, 22);
		add(cbTipoDeBarrio);
		cbTipoDeBarrio.addItem("COMPLEJO HABITACIONAL");
		cbTipoDeBarrio.addItem("TRAZADO FORMAL");
		cbTipoDeBarrio.addItem("URBANIZANIZACION PLANIFICADA");

		

	}
}
