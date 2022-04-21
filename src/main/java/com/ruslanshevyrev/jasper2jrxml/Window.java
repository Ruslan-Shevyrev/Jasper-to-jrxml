/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ruslanshevyrev.jasper2jrxml;

import javax.swing.JFrame;

/**
 *
 * @author Администратор
 */
public class Window extends JFrame {

    public Window(){
        super("My First Window"); //Заголовок окна
        setBounds(100, 100, 200, 200); //Если не выставить 
                                   //размер и положение 
                                   //то окно будет мелкое и незаметное
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при 
                                                    //закрытии окна закрывалась и программа,
                                                    //иначе она останется висеть в процессах
    }

    public static void main(String[] args) {
        Window app = new Window(); //Создаем экземпляр нашего приложения
        app.setVisible(true); //С этого момента приложение запущено!
    }
    
}
