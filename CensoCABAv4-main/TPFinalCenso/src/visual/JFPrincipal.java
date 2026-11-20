package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class JFPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFPrincipal frame = new JFPrincipal();
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
	public JFPrincipal() {
		getContentPane().setBackground(new Color(192, 185, 215));
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Sistema de Censo CABA");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblTitulo.setBounds(30, 23, 323, 69);
		getContentPane().add(lblTitulo);
		
		JButton btnBarrio = new JButton("Barrios");
		btnBarrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBarrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBarrio.setBounds(254, 231, 161, 39);
		getContentPane().add(btnBarrio);
		
		JButton btnComuna = new JButton("Comunas");
		btnComuna.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnComuna.setBounds(254, 159, 161, 39);
		getContentPane().add(btnComuna);
		
		JButton btnPersonas = new JButton("Personas");
		btnPersonas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPersonas.setBounds(254, 305, 161, 39);
		getContentPane().add(btnPersonas);
		
		JLabel lblSubtitulo = new JLabel("TP final");
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSubtitulo.setBounds(30, 75, 188, 17);
		getContentPane().add(lblSubtitulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 533);

	}
}
