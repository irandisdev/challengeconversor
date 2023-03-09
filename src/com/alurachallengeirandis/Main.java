package com.alurachallengeirandis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;
import javax.swing.*;

public class Main extends EntradaDelUsuario {
	public Main(double recibidoInput) {
		super(recibidoInput);//coming from parent class
	}
	static boolean clickTemperatura = false;
	static boolean clickMoneda = false;
	static boolean dropTemp = false;
	static boolean dropMon = false;
	
	
	// ----------------- Lista ComboBox DropDowns
	
	static String[] optionsConvertir = {"      ","Una Moneda", "Temperatura"};
	static JComboBox<String> convertirDropdown = new JComboBox<>(optionsConvertir);
	
	
	static String[] optionsMon = { "RD", "US", "MX", "KRW" };
	static JComboBox<String> convertirDeDropdownMon = new JComboBox<>(optionsMon);
	static JComboBox<String> convertirADropdownMon = new JComboBox<>(optionsMon);
	
	static String[] optionsTemp = { "Farenheit", "Celcius" };
	static JComboBox<String> convertirDeDropdownTemp = new JComboBox<>(optionsTemp);
	static JComboBox<String> convertirADropdownTemp = new JComboBox<>(optionsTemp);
	// ----------------- Lista ComboBox DropDowns
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel cuadro1 = new JPanel();
		JPanel cuadroSaludos = new JPanel();
		JButton iconDiscordButton = new JButton();
		JButton iconLinkedinButton = new JButton();
		JButton boton = new JButton(); // Temperatura-boton
		JButton boton2 = new JButton(); // Moneda-boton
		ImageIcon insideImage = new ImageIcon("insideImage.png");
		ImageIcon discord = new ImageIcon("Discord2.png");
		ImageIcon linkedin = new ImageIcon("LinkedinLogo2.png");

		JTextField inputField = new JTextField(10);
		JTextField nombre = new JTextField();
		JLabel menu = new JLabel();
		JLabel saludos = new JLabel();
		JLabel queConvertiras = new JLabel();
		JLabel entraCantidad = new JLabel();
		JLabel lblIngresaTuNombre = new JLabel();
		JLabel lblConvertirDe = new JLabel();
		JLabel lblConvertirA = new JLabel();
		JLabel footer = new JLabel();
		JPanel cuadro4 = new JPanel();
		JLabel resultadoConvertido = new JLabel();

		// cuadro1
		cuadro1.setBackground(Color.gray);
		cuadro1.setBounds(0, 5, 255, 495);
		cuadro1.setLayout(null);
		
		// Dropdown Convertir
		convertirDropdown.setSelectedIndex(0);
		convertirDropdown.setBounds(126, 70, 118, 26);
		cuadro1.add(convertirDropdown);
		convertirDropdown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String seleccionDelDrop = (String)convertirDropdown.getSelectedItem();
				if(seleccionDelDrop.equals("      ")) {
					boton.setEnabled(false);
					boton2.setEnabled(false);
					cuadro1.remove(convertirADropdownTemp);
					cuadro1.remove(convertirDeDropdownTemp);
					cuadro1.remove(convertirADropdownMon);
					cuadro1.remove(convertirDeDropdownMon);
					cuadro1.revalidate();
					frame.setVisible(true);
				} else if(seleccionDelDrop.equals("Una Moneda")) {
					boton.setEnabled(false);
					boton2.setEnabled(true);
					cuadro1.remove(convertirADropdownTemp);
					cuadro1.remove(convertirDeDropdownTemp);
					convertirDeDropdownMon.setBounds(126, 160, 118, 26);
					convertirADropdownMon.setBounds(126, 182, 118, 26);
					cuadro1.add(convertirDeDropdownMon);
					cuadro1.add(convertirADropdownMon);
					cuadro1.revalidate();
					frame.setVisible(true);
				}else if(seleccionDelDrop.equals("Temperatura")) {
					boton2.setEnabled(false);
					boton.setEnabled(true);
					cuadro1.remove(convertirADropdownMon);
					cuadro1.remove(convertirDeDropdownMon);
					convertirDeDropdownTemp.setBounds(126, 160, 118, 26);
					convertirADropdownTemp.setBounds(126, 182, 118, 26);
					cuadro1.add(convertirDeDropdownTemp);
					cuadro1.add(convertirADropdownTemp);
					cuadro1.revalidate();
					frame.setVisible(true);
				}
			}
		});

		// Labels Convertir
		queConvertiras.setVerticalTextPosition(SwingConstants.CENTER);
		queConvertiras.setText("¿Que convertiras?");
		queConvertiras.setHorizontalTextPosition(SwingConstants.CENTER);
		queConvertiras.setForeground(Color.white);
		queConvertiras.setFont(new Font("Lato", Font.BOLD, 12));
		queConvertiras.setBounds(6, 70, 110, 20);
		cuadro1.add(queConvertiras);
		entraCantidad.setVerticalTextPosition(SwingConstants.CENTER);
		entraCantidad.setText("¿Que cantidad?");
		entraCantidad.setHorizontalTextPosition(SwingConstants.CENTER);
		entraCantidad.setForeground(Color.white);
		entraCantidad.setFont(new Font("Lato", Font.BOLD, 12));
		entraCantidad.setBounds(12, 104, 110, 20);
		cuadro1.add(entraCantidad);
		
		//Input a convertir@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		inputField.setBounds(128, 100, 118, 26);
		inputField.setFont(new Font("Lato",Font.PLAIN,18));
		cuadro1.add(inputField);
		
		//Convertir de a: ----Los fields de estos estan condicionados dependiendo de la opcion seleccionada en el dropdown (dentro del action listener)
		lblConvertirDe.setVerticalTextPosition(SwingConstants.CENTER);
		lblConvertirDe.setText("Convertir de:");
		lblConvertirDe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblConvertirDe.setForeground(Color.BLACK);
		lblConvertirDe.setFont(new Font("Lato", Font.PLAIN, 12));
		lblConvertirDe.setBounds(6, 161, 110, 20);
		cuadro1.add(lblConvertirDe);
		lblConvertirA.setVerticalTextPosition(SwingConstants.CENTER);
		lblConvertirA.setText("Convertir A:");
		lblConvertirA.setHorizontalTextPosition(SwingConstants.CENTER);
		lblConvertirA.setForeground(Color.BLACK);
		lblConvertirA.setFont(new Font("Lato", Font.BOLD, 12));
		lblConvertirA.setBounds(6, 183, 110, 20);
		cuadro1.add(lblConvertirA);

		// Temperatura-Boton
		boton.setBounds(119, 300, 94, 34);
		boton.setText("Temperatura");
		boton.setEnabled(false);
		boton.setFocusable(false);
		boton.setFont(new Font("Segoe UI", Font.BOLD, 10));
		boton.addActionListener(new ActionListener() {
			// Convertir Temperatura
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					clickTemperatura = true;
					double entradaAConvertir = Double.parseDouble(inputField.getText());
					if(clickTemperatura) {		
						String convertirDeTemperatura = (String) convertirDeDropdownTemp.getSelectedItem();
						String convertirATemperatura = (String) convertirADropdownTemp.getSelectedItem();
						EntradaDelUsuario inputConversion = new EntradaDelUsuario(entradaAConvertir);
						inputConversion.convertirTemperatura(convertirDeTemperatura, convertirATemperatura);
						double totalConvertido = inputConversion.total;
						resultadoConvertido.setText(""+totalConvertido+" \nDe "+convertirDeTemperatura+" A "+convertirATemperatura);
						resultadoConvertido.setForeground(Color.BLACK);
						resultadoConvertido.setBounds(25, 250, 230, 20);
						resultadoConvertido.setFont(new Font("Roboto", Font.BOLD, 18));
						cuadro1.add(resultadoConvertido);
						cuadro1.revalidate();
						cuadro1.repaint();
					}
				} catch (NumberFormatException | NullPointerException errorNoNumero) {
					JOptionPane.showMessageDialog(frame,
							nombre.getText() + " ¡Por favor ingresa números para la conversion de Temperatura!",
							"Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});

		// Moneda-Boton
		boton2.setBounds(22, 300, 94, 34);
		boton2.setText("Moneda");
		boton2.setEnabled(false);
		boton2.setFocusable(false);
		boton2.setFont(new Font("Segoe UI", Font.BOLD, 10));
		boton2.addActionListener(new ActionListener() {
			// Convertir Temperatura
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					clickMoneda = true;
					double entradaAConvertir = Double.parseDouble(inputField.getText());
					if(clickMoneda) {		
						String convertirDeMoneda= (String) convertirDeDropdownMon.getSelectedItem();
						String convertirAMoneda = (String) convertirADropdownMon.getSelectedItem();
						
						EntradaDelUsuario inputConversion = new EntradaDelUsuario(entradaAConvertir);
						inputConversion.convertirMoneda(convertirDeMoneda, convertirAMoneda);
						
						double totalConvertido = inputConversion.total;
						resultadoConvertido.setText("$"+totalConvertido+" \nDe "+convertirDeMoneda+" A "+convertirAMoneda);
						resultadoConvertido.setForeground(Color.BLACK);
						resultadoConvertido.setBounds(25, 250, 230, 20);
						resultadoConvertido.setFont(new Font("Roboto", Font.BOLD, 18));
						cuadro1.add(resultadoConvertido);
						cuadro1.revalidate();
						cuadro1.repaint();
					}
				} catch (NumberFormatException | NullPointerException errorNoNumero) {
					JOptionPane.showMessageDialog(frame,
							nombre.getText() + " ¡Por favor ingresa números para la conversion de Monedas!",
							"Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				frame.setVisible(true);
			}
		});

		

		// nombre-field
		nombre.setBounds(126, 10, 118, 26);
		nombre.setFont(new Font("Lato",Font.PLAIN,18));
		cuadro1.add(nombre);
		nombre.setColumns(10);
		nombre.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e) {
				String texto = nombre.getText();
				menu.setVisible(false);
				saludos.setText("¡Hey, "+texto+"! Vamos a convertir.");
				nombre.setEditable(false);
				nombre.setBackground(Color.GRAY);
				nombre.setForeground(Color.white);
				cuadroSaludos.setBackground(Color.white);
				cuadro1.add(cuadroSaludos);
				lblIngresaTuNombre.setText("Tu nombre es:");
				lblIngresaTuNombre.setBounds(30, 12, 118, 20);
				cuadroSaludos.add(saludos);
				cuadroSaludos.revalidate();
				cuadroSaludos.repaint();
			}
			@Override
			public void focusGained(FocusEvent e) {
				nombre.setEditable(true);
				nombre.setBackground(Color.white);
				nombre.setForeground(Color.BLACK);
				nombre.setCaretPosition(nombre.getDocument().getLength());
			}
		});
		lblIngresaTuNombre.setVerticalTextPosition(SwingConstants.CENTER);
		lblIngresaTuNombre.setText("Ingresa tu nombre:");
		lblIngresaTuNombre.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIngresaTuNombre.setForeground(Color.BLACK);
		lblIngresaTuNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		lblIngresaTuNombre.setBounds(6, 12, 118, 20);
		cuadro1.add(lblIngresaTuNombre);

		//Titulo-cuadro1
		menu.setLocation(50, 42);
		menu.setSize(200, 20);
		menu.setText("Hola, ¿Como te llamas?");
		menu.setHorizontalTextPosition(JLabel.CENTER);
		menu.setVerticalTextPosition(JLabel.CENTER);
		menu.setForeground(new Color(0, 0, 0));
		menu.setFont(new Font("Dialog", Font.TYPE1_FONT, 12));
		saludos.setLocation(65,42);
		saludos.setSize(200,20);
		saludos.setFont(new Font("Dialog", Font.TYPE1_FONT, 12));
		cuadroSaludos.setBounds(0, 40, 255, 30);
		
		
		//Follow me buttons
		iconDiscordButton.setIcon(discord);
		iconDiscordButton.setBounds(25, 440, 50, 40);
		iconDiscordButton.setFocusable(false);
		iconLinkedinButton.setIcon(linkedin);
		iconLinkedinButton.setBounds(165, 440, 50, 40);
		iconLinkedinButton.setFocusable(false);
		
		//OBVIOUSLY the footer duh! lol 
		footer.setIcon(insideImage);
		footer.setBackground(Color.white);
		footer.setOpaque(true);
		footer.setVerticalAlignment(JLabel.CENTER);
		footer.setHorizontalAlignment(JLabel.CENTER);
		footer.setBounds(0, 0, 650, 155);

		frame.setTitle("Irandis Ditren - Java Challenge App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 750);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(cuadro1);

		cuadro1.add(iconDiscordButton);
		cuadro1.add(iconLinkedinButton);
		cuadro1.add(menu);
		cuadro1.add(saludos);
		cuadro1.add(boton);
		cuadro1.add(boton2);

		cuadro4.setBackground(Color.white);
		cuadro4.setBounds(5, 500, 890, 155);
		// cuadro4.setLayout(new BorderLayout());
		cuadro4.setLayout(null);
		cuadro4.add(footer);
		frame.getContentPane().add(cuadro4);
		frame.setVisible(true);
	}

}