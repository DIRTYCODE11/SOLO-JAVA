import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class BotonesFlow extends JFrame {
	


	
	
	BotonesFlow(){
	    JFrame ventana = new JFrame();
		ventana.setSize(306,629);
		ventana.setTitle("Test Botones");
		ventana.setVisible(true);
		ventana.setResizable(false);
		
		JPanel panel= new JPanel();
		//panel.setSize(1000,1000);
		panel.setLayout(new FlowLayout(0,0,0));
		//panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		ventana.add(panel);
		
		JTextArea area= new JTextArea();
		area.setPreferredSize(new Dimension(300,100));
		area.setEditable(false);
	    area.setLineWrap(true);
		
	
		JButton boton = new JButton("1");
		boton.setForeground(Color.BLACK);
		boton.setBackground(Color.WHITE);
		boton.setPreferredSize(new Dimension(100,100));
		
		JButton boton1 = new JButton("2");
		boton1.setForeground(Color.BLUE);
		boton1.setBackground(Color.GRAY);
		boton1.setPreferredSize(new Dimension(100,100));

		JButton boton2 = new JButton("3");
		boton2.setForeground(Color.GREEN);
		boton2.setBackground(Color.BLUE);
		boton2.setPreferredSize(new Dimension(100,100));
		
		JButton boton3 = new JButton("4");
		boton3.setForeground(Color.WHITE);
		boton3.setBackground(Color.GREEN);
		boton3.setPreferredSize(new Dimension(100,100));
		
		
		JButton boton4 = new JButton("5");
		boton4.setForeground(Color.GRAY);
		boton4.setBackground(Color.RED);
		boton4.setPreferredSize(new Dimension(100,100));
		
		
		JButton boton5 = new JButton("6");
		boton5.setForeground(Color.BLACK);
		boton5.setBackground(Color.YELLOW);
		boton5.setPreferredSize(new Dimension(100,100));
		
		JButton boton6 = new JButton("7");
		boton6.setForeground(Color.RED);
		boton6.setBackground(Color.BLACK);
		boton6.setPreferredSize(new Dimension(100,100));
		
		
		JButton boton7 = new JButton("8");
		boton7.setForeground(Color.MAGENTA);
		boton7.setBackground(Color.WHITE);
		boton7.setPreferredSize(new Dimension(100,100));
		
		
		JButton boton8 = new JButton("9");
		boton8.setForeground(Color.MAGENTA);
		boton8.setBackground(Color.PINK);
		boton8.setPreferredSize(new Dimension(100,100));
		
		JButton boton9 = new JButton("*");
		boton9.setForeground(Color.MAGENTA);
		boton9.setBackground(Color.PINK);
		boton9.setPreferredSize(new Dimension(100,100));
		
		JButton boton10 = new JButton("0");
		boton10.setForeground(Color.MAGENTA);
		boton10.setBackground(Color.PINK);
		boton10.setPreferredSize(new Dimension(100,100));
		
		JButton boton11 = new JButton("#");
		boton11.setForeground(Color.MAGENTA);
		boton11.setBackground(Color.PINK);
		boton11.setPreferredSize(new Dimension(100,100));
		
		JButton llamar = new JButton("LLAMAR");
		llamar.setForeground(Color.MAGENTA);
		llamar.setBackground(Color.PINK);
		llamar.setPreferredSize(new Dimension(300,100));
		
		
		
		panel.add(area);
		panel.add(boton);
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		panel.add(boton7);
		panel.add(boton8);
		panel.add(boton9);
		panel.add(boton10);
		panel.add(boton11);
		panel.add(llamar);
		
	
		
	}
	
	public static void main(String[]args){
		new BotonesFlow();
	}
	

}
