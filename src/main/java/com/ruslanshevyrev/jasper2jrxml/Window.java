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
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Администратор
 */
public class Window extends JFrame{
    String pathJasper;
    String pathJRXML; 

    public Window(){
   
 
        JFrame frame = new JFrame("jasper2jrxml");
       
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setResizable(false);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
	panel.add(Box.createVerticalGlue());

	final JLabel labelJasper = new JLabel("JASPER PATH");
	//labelJasper.setAlignmentX(CENTER_ALIGNMENT);
	panel.add(labelJasper);

	panel.add(Box.createRigidArea(new Dimension(10, 10)));

	JButton buttonJasper = new JButton("choose JASPER file");

	buttonJasper.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileopen = new JFileChooser();
                        fileopen.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int ret = fileopen.showDialog(null, "Open File");				
			if (ret == JFileChooser.APPROVE_OPTION) {
				File file = fileopen.getSelectedFile();
				labelJasper.setText(file.getPath());
                                pathJasper = file.getPath();
			}
		}
	});

	panel.add(buttonJasper);

	final JLabel labelJRXML = new JLabel("JRXML PATH");
	//labelJRXML.setAlignmentX(CENTER_ALIGNMENT);
	panel.add(labelJRXML);

	JButton buttonJRXML = new JButton("choose JRXML file");

	buttonJRXML.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileopen = new JFileChooser();
                        fileopen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);				
			int ret = fileopen.showDialog(null, "Open File");				
			if (ret == JFileChooser.APPROVE_OPTION) {
				File file = fileopen.getSelectedFile();
				labelJRXML.setText(file.getPath());
                                pathJRXML = file.getPath();
			}
		}
	});

	panel.add(buttonJRXML);

	JButton convert = new JButton("Convert JASPER to JRXML");

	convert.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
                    ConvertJasper2JRXML convertJasper2JRXML = new ConvertJasper2JRXML();
                    try{
                        convertJasper2JRXML.convert(pathJasper, pathJRXML);
                    } catch(JRException ex){

                    }
		}
	});

	panel.add(convert);

	panel.add(Box.createVerticalGlue());
	frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Window app = new Window(); //Создаем экземпляр нашего приложения
    }
    
}
