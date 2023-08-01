package com.farmer.pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class ProductDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDetails frame = new ProductDetails();
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
	public ProductDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(297, 148, 248, 45);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Crop Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(181, 148, 106, 37);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(297, 231, 248, 45);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.LIGHT_GRAY);
		textArea_2.setBounds(842, 148, 248, 45);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.LIGHT_GRAY);
		textArea_3.setBounds(842, 231, 248, 45);
		contentPane.add(textArea_3);
		
		JLabel lblCropName = new JLabel("Crop Name");
		lblCropName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCropName.setBounds(181, 239, 106, 37);
		contentPane.add(lblCropName);
		
		JLabel lblFertilizerType = new JLabel("Fertilizer type");
		lblFertilizerType.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFertilizerType.setBounds(700, 148, 106, 37);
		contentPane.add(lblFertilizerType);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblQuantity.setBounds(700, 239, 106, 37);
		contentPane.add(lblQuantity);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBackground(Color.LIGHT_GRAY);
		textArea_1_1.setBounds(297, 330, 248, 45);
		contentPane.add(textArea_1_1);
		
		JLabel lblSoilPhCertificate = new JLabel("Soil pH Certificate");
		lblSoilPhCertificate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSoilPhCertificate.setBounds(118, 338, 148, 37);
		contentPane.add(lblSoilPhCertificate);
		
		JButton btnNewButton = new JButton("Place Request");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(543, 484, 158, 45);
		contentPane.add(btnNewButton);
	}
}
