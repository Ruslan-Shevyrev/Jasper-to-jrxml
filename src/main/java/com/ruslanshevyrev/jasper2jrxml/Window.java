/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ruslanshevyrev.jasper2jrxml;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Администратор
 */
public class Window extends JFrame {
        private JFileChooser fileChooser = null;
    public Window(){
        JFrame frame = new JFrame("jasper2jrxml");
       
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setResizable(false);


        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
	panel.add(Box.createVerticalGlue());

	final JLabel label = new JLabel("JASPER PATH");
		label.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(label);

		panel.add(Box.createRigidArea(new Dimension(10, 10)));

		JButton button = new JButton("choose JASPER file");
		button.setAlignmentX(CENTER_ALIGNMENT);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileopen = new JFileChooser();				
				int ret = fileopen.showDialog(null, "Открыть файл");				
				if (ret == JFileChooser.APPROVE_OPTION) {
					File file = fileopen.getSelectedFile();
					label.setText(file.getPath());
				}
			}
		});

		panel.add(button);
		panel.add(Box.createVerticalGlue());
		frame.getContentPane().add(panel);
       // Создание экземпляра JFileChooser 
        fileChooser = new JFileChooser();
    }

    public static void main(String[] args) {
        Window app = new Window(); //Создаем экземпляр нашего приложения
    }
    
}
