package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import controlador.Operaciones;
import model.TEstaciones;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateEstacionesNumeros {

	private JFrame frame;
	private JTextField tfNumAccesos;
	private JTextField tfNumLineas;
	private JTextField tfNumViajesDestino;
	private JTextField tfNumViajesProcedencia;
	private JButton btAccesos;
	private JButton btLineas;
	private JButton btViajesDestino;
	private JButton btViajesProcedencia;
	private JTextField tfNumEstacion;
	private JLabel lblNombreEstacion;
	private JLabel lblViajesProcedencia;
	private JButton btnBuscar;
	private TEstaciones estacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEstacionesNumeros window = new UpdateEstacionesNumeros();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateEstacionesNumeros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		estacion=null;
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		lblViajesProcedencia = new JLabel("Editar Estaci\u00F3n");
		GridBagConstraints gbc_lblViajesProcedencia = new GridBagConstraints();
		gbc_lblViajesProcedencia.insets = new Insets(0, 0, 5, 5);
		gbc_lblViajesProcedencia.gridx = 3;
		gbc_lblViajesProcedencia.gridy = 0;
		frame.getContentPane().add(lblViajesProcedencia, gbc_lblViajesProcedencia);
		
		JLabel lblNewLabel = new JLabel("Introduce el id de la estaci\u00F3n");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		tfNumEstacion = new JTextField();
		GridBagConstraints gbc_tfNumEstacion = new GridBagConstraints();
		gbc_tfNumEstacion.insets = new Insets(0, 0, 5, 5);
		gbc_tfNumEstacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNumEstacion.gridx = 3;
		gbc_tfNumEstacion.gridy = 1;
		frame.getContentPane().add(tfNumEstacion, gbc_tfNumEstacion);
		tfNumEstacion.setColumns(10);
		
		btnBuscar = new JButton("Buscar Estaci\u00F3n");
		btnBuscar.setName("btBuscarEstacion");
		
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 7;
		gbc_btnBuscar.gridy = 1;
		frame.getContentPane().add(btnBuscar, gbc_btnBuscar);
		
		lblNombreEstacion = new JLabel(" ");
		lblNombreEstacion.setName("lblNombreEstaci\u00F3n");
		GridBagConstraints gbc_lblNombreEstacion = new GridBagConstraints();
		gbc_lblNombreEstacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreEstacion.gridx = 1;
		gbc_lblNombreEstacion.gridy = 2;
		frame.getContentPane().add(lblNombreEstacion, gbc_lblNombreEstacion);
		
		JLabel lblNewLabel_1 = new JLabel("Accesos");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfNumAccesos = new JTextField();
		GridBagConstraints gbc_tfNumAccesos = new GridBagConstraints();
		gbc_tfNumAccesos.insets = new Insets(0, 0, 5, 5);
		gbc_tfNumAccesos.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNumAccesos.gridx = 3;
		gbc_tfNumAccesos.gridy = 3;
		frame.getContentPane().add(tfNumAccesos, gbc_tfNumAccesos);
		tfNumAccesos.setColumns(10);
		
		btAccesos = new JButton("Update");
		
		GridBagConstraints gbc_btAccesos = new GridBagConstraints();
		gbc_btAccesos.insets = new Insets(0, 0, 5, 5);
		gbc_btAccesos.gridx = 7;
		gbc_btAccesos.gridy = 3;
		frame.getContentPane().add(btAccesos, gbc_btAccesos);
		
		JLabel lblNewLabel_2 = new JLabel("Lineas");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tfNumLineas = new JTextField();
		GridBagConstraints gbc_tfNumLineas = new GridBagConstraints();
		gbc_tfNumLineas.insets = new Insets(0, 0, 5, 5);
		gbc_tfNumLineas.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNumLineas.gridx = 3;
		gbc_tfNumLineas.gridy = 5;
		frame.getContentPane().add(tfNumLineas, gbc_tfNumLineas);
		tfNumLineas.setColumns(10);
		
		btLineas = new JButton("Update");
		GridBagConstraints gbc_btLineas = new GridBagConstraints();
		gbc_btLineas.insets = new Insets(0, 0, 5, 5);
		gbc_btLineas.gridx = 7;
		gbc_btLineas.gridy = 5;
		frame.getContentPane().add(btLineas, gbc_btLineas);
		
		JLabel lblNewLabel_3 = new JLabel("Viajes Destino");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tfNumViajesDestino = new JTextField();
		GridBagConstraints gbc_tfNumViajesDestino = new GridBagConstraints();
		gbc_tfNumViajesDestino.insets = new Insets(0, 0, 5, 5);
		gbc_tfNumViajesDestino.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNumViajesDestino.gridx = 3;
		gbc_tfNumViajesDestino.gridy = 7;
		frame.getContentPane().add(tfNumViajesDestino, gbc_tfNumViajesDestino);
		tfNumViajesDestino.setColumns(10);
		
		btViajesDestino = new JButton("Update");
		GridBagConstraints gbc_btViajesDestino = new GridBagConstraints();
		gbc_btViajesDestino.insets = new Insets(0, 0, 5, 5);
		gbc_btViajesDestino.gridx = 7;
		gbc_btViajesDestino.gridy = 7;
		frame.getContentPane().add(btViajesDestino, gbc_btViajesDestino);
		
		JLabel lblNewLabel_4 = new JLabel("Viajes Procedencia");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 9;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		tfNumViajesProcedencia = new JTextField();
		GridBagConstraints gbc_tfNumViajesProcedencia = new GridBagConstraints();
		gbc_tfNumViajesProcedencia.insets = new Insets(0, 0, 0, 5);
		gbc_tfNumViajesProcedencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNumViajesProcedencia.gridx = 3;
		gbc_tfNumViajesProcedencia.gridy = 9;
		frame.getContentPane().add(tfNumViajesProcedencia, gbc_tfNumViajesProcedencia);
		tfNumViajesProcedencia.setColumns(10);
		
		btViajesProcedencia = new JButton("Update");
		GridBagConstraints gbc_btViajesProcedencia = new GridBagConstraints();
		gbc_btViajesProcedencia.insets = new Insets(0, 0, 0, 5);
		gbc_btViajesProcedencia.gridx = 7;
		gbc_btViajesProcedencia.gridy = 9;
		frame.getContentPane().add(btViajesProcedencia, gbc_btViajesProcedencia);
		
		//Codigo importante apartado 4
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				estacion=null;
				try {
					int codEstacion=Integer.parseInt(tfNumEstacion.getText());
					Operaciones operacion=new Operaciones();
					estacion= operacion.buscarEstacion(codEstacion);	
					if(estacion!=null) {
						lblNombreEstacion.setText(estacion.getNombre());
						tfNumAccesos.setText(estacion.getNumaccesos()+"");
						tfNumLineas.setText(estacion.getNumlineas()+"");
						tfNumViajesDestino.setText(estacion.getNumviajesdestino()+"");
						tfNumViajesProcedencia.setText(estacion.getNumviajesprocedencia()+"");
					}else {
						JOptionPane.showMessageDialog(null,"No existe la estacion");
						lblNombreEstacion.setText("");
					}
					
				}catch(NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");
					tfNumEstacion.setText("");
				}
			}
		});
		
		btAccesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(estacion!=null) {
					try{
						int num=Integer.parseInt(tfNumAccesos.getText());
						Operaciones operacion=new Operaciones();
						if(operacion.updateNumAccesos(estacion.getCodEstacion(), num)>0) {
							JOptionPane.showMessageDialog(null, "Accesos actualizados satisfactoiamente");
						}
					}catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");
						tfNumAccesos.setText("");
					}
				}
			}
		});
		
		btLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(estacion!=null) {
					try{
						int num=Integer.parseInt(tfNumLineas.getText());
						Operaciones operacion=new Operaciones();
						if(operacion.updateNumLineas(estacion.getCodEstacion(), num)>0) {
							JOptionPane.showMessageDialog(null, "Lineas actualizadas satisfactoiamente");
						}
					}catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");
						tfNumLineas.setText("");
					}
				}
			}
		});
		btViajesDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(estacion!=null) {
					try{
						int num=Integer.parseInt(tfNumViajesDestino.getText());
						Operaciones operacion=new Operaciones();
						if(operacion.updateViajesDestino(estacion.getCodEstacion(), num)>0) {
							JOptionPane.showMessageDialog(null, "Destinos actualizados satisfactoiamente");
						}
					}catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");
						tfNumViajesDestino.setText("");
					}
				}
			}
		});
		
		btViajesProcedencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(estacion!=null) {
					try{
						int num=Integer.parseInt(tfNumViajesProcedencia.getText());
						Operaciones operacion=new Operaciones();
						if(operacion.updateViajesProcedencia(estacion.getCodEstacion(), num)>0) {
							JOptionPane.showMessageDialog(null, "Procedencias actualizadas satisfactoiamente");
						}
					}catch(NumberFormatException nfe) {
						JOptionPane.showMessageDialog(null, "Solo se pueden introducir numeros");
						tfNumViajesProcedencia.setText("");
					}
				}
			}
		});
	}

}
