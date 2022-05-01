//CurrencyConverter



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.*;

import java.awt.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Random;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import java.util.ArrayList;

class currencyConverter {
	public static void main(String[] args) {
		if (args[0].equalsIgnoreCase("-HttpRequest")) {
            System.out.println("Executing HttpRequest...");
            if (args.length <2) {
                System.out.println("The -HttpRequest function must have a valid URL as the second parameter.");
            } else {
                String URL = args[1];
                HttpRequest request = new HttpRequest();
                if (request.readURL(URL)) {
                    System.out.println(request);
                }
            }
        }
        else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
             System.out.println("Executing HttpRequestIndex...");   
            if (args.length != 2) {
                System.out.println("[[Your Error message here.]]");
            } else {
                String indexURL = args[1];
                HttpRequest requestIndex = new HttpRequest();
                if (requestIndex.readURL(indexURL)) {
                    System.out.println(requestIndex);
                }
                // Retrieves the data from each additional URL
                ThunderbirdModel data = new ThunderbirdModel();
                data.LoadIndex();
                data.LoadContacts();
                //Prints the data retrieved from each URL
                System.out.println(data);
            }
        }

		String[] optionsToChoose = { "Dollar", "Euro", "Yen", "Pound", "Australian Dollar", "Canadian Dollar" };

		JFrame frame = new JFrame();

		JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
		jComboBox.setBounds(100, 50, 140, 20);
		JComboBox<String> jComboBox2 = new JComboBox<>(optionsToChoose);
		jComboBox2.setBounds(300, 50, 140, 20);

		JTextField textField = new JTextField();
		textField.setBounds(20, 50, 70, 20);

		JButton jButton = new JButton("Done");
		jButton.setBounds(100, 100, 90, 20);
		JButton jButton1 = new JButton("Help");
		jButton1.setBounds(200, 100, 90, 20);

		JLabel jLabel = new JLabel();
		jLabel.setBounds(90, 100, 400, 100);
		JLabel jLabel1 = new JLabel();
		jLabel1.setBounds(90, 100, 400, 100);
		JLabel jLabel2 = new JLabel();
		jLabel2.setBounds(260, 50, 70, 20);


		frame.add(jButton);
		frame.add(jButton1);
		frame.add(jComboBox);
		frame.add(jComboBox2);
		frame.add(textField);
		frame.add(jLabel);
		frame.add(jLabel1);
		frame.add(jLabel2);


		String content = textField.getText();
		textField.setToolTipText("Please input currency amount here");

		frame.setTitle("Currency Converter");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedCurrency = "Result: " + ();
				/**jComboBox.getItemAt(/** Currency exchange result jComboBox.getSelectedIndex())**/
				jLabel.setText(selectedCurrency);
			}
		});

		jButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jLabel.setText("<html>Input a currency amount into first box.<br>Then choose currencies. Press Done</html>");
			}
		});

		jLabel2.setText("to");

	}

	 if (((String)optionsToChoose.getSelectedItem()).equals("Dollar")){
		 
		 findExRate();
            }
	/**
	 * System.out.println("");
	 * if (args.length < 1) {
	 * Help.printHelp();
	 * }
	 * else if (args[0].equalsIgnoreCase("-Help")) {
	 * System.out.println("Executing Help...");
	 * Help.printHelp();
	 * }
	 **/
}
