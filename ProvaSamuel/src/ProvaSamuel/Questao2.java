package ProvaSamuel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Questao2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtQtde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora BOVINA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(114, 46, 171, 23);
		contentPane.add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(204, 101, 127, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor da Arroba");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(32, 103, 119, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Arrobas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(32, 150, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		txtQtde = new JTextField();
		txtQtde.setBounds(204, 148, 127, 20);
		contentPane.add(txtQtde);
		txtQtde.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Total a Pagar");
		btnCalcular.setBackground(Color.LIGHT_GRAY);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor, total;
				int qtde;
				
				valor = Double.parseDouble(txtValor.getText());
				qtde = Integer.parseInt(txtQtde.getText());
				
				total = valor * qtde;
				
				JOptionPane.showMessageDialog(null, String.format("O valor a pagar é R$ %,.2f" , total, JOptionPane.INFORMATION_MESSAGE));
				
			}
		});
		btnCalcular.setBounds(129, 201, 177, 23);
		contentPane.add(btnCalcular);
	}
}
