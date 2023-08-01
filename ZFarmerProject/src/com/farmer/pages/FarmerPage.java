package com.farmer.pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class FarmerPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmerPage frame = new FarmerPage();
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
	public FarmerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setForeground(new Color(128, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(993, 23, 160, 46);
		contentPane.add(btnNewButton);
		
		JButton btnViewSoldCrop = new JButton("View Sold Crop History");
		btnViewSoldCrop.setBackground(new Color(0, 128, 64));
		btnViewSoldCrop.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnViewSoldCrop.setBounds(488, 239, 238, 46);
		contentPane.add(btnViewSoldCrop);
		
		JButton btnNewButton_1_1 = new JButton("Place Sell Request");
		btnNewButton_1_1.setBackground(new Color(0, 128, 64));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(488, 162, 238, 46);
		contentPane.add(btnNewButton_1_1);
		
		txtWelcomeTo = new JTextField();
		txtWelcomeTo.setBackground(new Color(192, 192, 192));
		txtWelcomeTo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtWelcomeTo.setText("Welcome to ");
		txtWelcomeTo.setBounds(55, 23, 114, 26);
		contentPane.add(txtWelcomeTo);
		txtWelcomeTo.setColumns(10);
		
		JButton btnNewButton_1_2 = new JButton("View Marketplace");
		btnNewButton_1_2.setBackground(new Color(0, 128, 64));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_2.setBounds(488, 321, 238, 46);
		contentPane.add(btnNewButton_1_2);
	}
}
