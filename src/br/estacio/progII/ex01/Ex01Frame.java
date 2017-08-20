package br.estacio.progII.ex01;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
//import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex01Frame extends JFrame {
	// Label's
	private JLabel lblTabuada;
	private JLabel lblDe;
	private JLabel lblAte;
	private JLabel lblResultado;
	
	// Edit's
	private JTextField txtNumero;
	private JTextField txtDe;
	private JTextField txtAte;
	
	//Button
	private JButton btnCalcular;
	
	// Construtor da classe
	public Ex01Frame () {
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		
		instanciarElementos();
		
		posicionarElementos();
		
		definirEvento();
		
		setVisible(true);		
	}
	
	private void instanciarElementos() {
		lblTabuada = new JLabel("Tabuada do:");
		lblTabuada.setFont(new Font("Arial", Font.PLAIN, 10));
		txtNumero = new JTextField("", 10);
		
		lblDe = new JLabel("De:");
		lblDe.setFont(new Font("Arial", Font.PLAIN, 10));
		txtDe = new JTextField("", 10);
		
		lblAte = new JLabel("Até:");
		lblAte.setFont(new Font("Arial", Font.PLAIN, 10));
		txtAte = new JTextField("", 10);
		
		btnCalcular = new JButton("Calcular");
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	private void posicionarElementos() {
		this.add(lblTabuada);
		this.add(txtNumero);
		this.add(lblDe);
		this.add(txtDe);
		this.add(lblAte);
		this.add(txtAte);
		this.add(btnCalcular);
		this.add(lblResultado);
	}
	
	private void definirEvento() {
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String texto = txtNumero.getText().trim(); 
				String numDe = txtDe.getText().trim();
				String numAte = txtAte.getText().trim();
				
				if (texto == null || texto.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "É necessário informar o número que será calculado.");
					txtNumero.grabFocus();
				}
				else if (numDe == null || numDe.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "É necessário informar o número inicial.");
					txtDe.grabFocus();					
				}
				else if (numAte == null || numAte.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "É necessário informar o número final.");
					txtAte.grabFocus();					
				}				
				else
				{
					lblResultado.setText((new Ex01Class().Calcular(Integer.parseInt(txtNumero.getText()), Integer.parseInt(txtDe.getText()), Integer.parseInt(txtAte.getText()))));
				}
			}
		});
	}
	
}
