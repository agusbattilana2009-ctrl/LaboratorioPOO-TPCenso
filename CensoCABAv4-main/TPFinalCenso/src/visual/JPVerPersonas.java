package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPVerPersonas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tfBuscarNombre;
	private JButton btnEliminar;
	private JButton btnActualizar;

	/**
	 * Create the panel.
	 */
	public JPVerPersonas() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 154, 395, 275);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		tfBuscarNombre = new JTextField();
		tfBuscarNombre.setText("Ingrese el DNI");
		tfBuscarNombre.setColumns(10);
		tfBuscarNombre.setBounds(181, 118, 159, 25);
		add(tfBuscarNombre);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscar.setBounds(78, 124, 109, 19);
		add(lblBuscar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEliminar.setBounds(499, 190, 149, 39);
		add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnActualizar.setBounds(499, 259, 149, 39);
		add(btnActualizar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setBounds(41, 454, 109, 25);
		add(btnVolver);
		
		JButton btnConsultar = new JButton("Consultar ");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultar.setBounds(499, 326, 149, 39);
		add(btnConsultar);
	}
}
