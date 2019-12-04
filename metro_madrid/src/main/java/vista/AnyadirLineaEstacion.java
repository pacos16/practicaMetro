package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Operaciones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnyadirLineaEstacion extends JFrame {

	private JPanel contentPane;
	private JTextField tfLinea;
	private JTextField tfEstacion;
	private JTextField tfOrden;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnyadirLineaEstacion frame = new AnyadirLineaEstacion();
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
	public AnyadirLineaEstacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLinea = new JLabel("Numero Linea");
		lblLinea.setBounds(54, 132, 96, 15);
		contentPane.add(lblLinea);
		
		JLabel lblEstacion = new JLabel("Numero Estacion");
		lblEstacion.setBounds(54, 172, 112, 15);
		contentPane.add(lblEstacion);
		
		JLabel lblOrden = new JLabel("Orden");
		lblOrden.setBounds(54, 215, 73, 13);
		contentPane.add(lblOrden);
		
		JLabel lblNewLabel_3 = new JLabel("Nueva Linea Estacion");
		lblNewLabel_3.setBounds(155, 37, 129, 15);
		contentPane.add(lblNewLabel_3);
		
		tfLinea = new JTextField();
		tfLinea.setBounds(245, 129, 96, 19);
		contentPane.add(tfLinea);
		tfLinea.setColumns(10);
		
		tfEstacion = new JTextField();
		tfEstacion.setBounds(245, 169, 96, 19);
		contentPane.add(tfEstacion);
		tfEstacion.setColumns(10);
		
		tfOrden = new JTextField();
		tfOrden.setBounds(245, 212, 96, 19);
		contentPane.add(tfOrden);
		tfOrden.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operaciones operacion=new Operaciones();
				boolean correcto= false;
				try {
				int codLinea=Integer.parseInt(tfLinea.getText());
				int codEstacion=Integer.parseInt(tfEstacion.getText());
				int orden= Integer.parseInt(tfOrden.getText());
				correcto= operacion.addLineaEstacion(codLinea,codEstacion, orden);
				}catch(NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Pon numeros marica");
				}
				if(!correcto) {
					JOptionPane.showMessageDialog(null, "Algo ha fallado, revisa tus numeros");
				}else {
					JOptionPane.showMessageDialog(null, "Bien hecho loquete");
				}
				
				
			}
		});
		btnNewButton.setBounds(155, 301, 85, 21);
		contentPane.add(btnNewButton);
	}
}
