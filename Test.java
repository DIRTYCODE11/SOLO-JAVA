import java.awt.*;
import javax.swing.*;
public class Test extends JFrame {

	Test(){
			setSize(420,500);
			setTitle("Botones Dirty_Code");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(true);
			
			JPanel Autorizar= new JPanel();
			Autorizar.setLayout(null);
			Autorizar.setSize(683,500);
			Autorizar.setBackground(Color.decode("#75a540"));
		
	       JButton Enviar = new JButton("DIRTY BUTTON 10");
	       Enviar.setBackground(Color.decode("#75a540"));
	       Enviar.setBorder(new ComponenteBotonRedondo(10));
	       Enviar.setForeground(Color.black);
	       Enviar.setBounds(0, 0, 200, 50);
	       Autorizar.add(Enviar);
	       
	       JButton Enviar1 = new JButton("DIRTY BUTTON 20");
	       Enviar1.setBackground(Color.decode("#75a540"));
	       Enviar1.setBorder(new ComponenteBotonRedondo(20));
	       Enviar1.setForeground(Color.black);
	       Enviar1.setBounds(0, 60, 200, 50);
	       Autorizar.add(Enviar1);
	       
	       JButton Enviar2 = new JButton("DIRTY BUTTON 30");
	       Enviar2.setBackground(Color.decode("#75a540"));
	       Enviar2.setBorder(new ComponenteBotonRedondo(30));
	       Enviar2.setForeground(Color.black);
	       Enviar2.setBounds(0, 120, 200, 50);
	       Autorizar.add(Enviar2);
	       
	       JButton Enviar3 = new JButton("DIRTY BUTTON 40");
	       Enviar3.setBackground(Color.decode("#75a540"));
	       Enviar3.setBorder(new ComponenteBotonRedondo(40));
	       Enviar3.setForeground(Color.black);
	       Enviar3.setBounds(0, 180, 200, 50);
	       Autorizar.add(Enviar3);
		
	       JButton Enviar5 = new JButton("DIRTY BUTTON 50");
	       Enviar5.setBackground(Color.decode("#75a540"));
	       Enviar5.setBorder(new ComponenteBotonRedondo(50));
	       Enviar5.setForeground(Color.black);
	       Enviar5.setBounds(0, 240, 230, 50);
	       Autorizar.add(Enviar5);
	       
	       JButton Enviar0 = new JButton("DIRTY BUTTON 0");
	       Enviar0.setBackground(Color.decode("#75a540"));
	       Enviar0.setBorder(new ComponenteBotonRedondo(0));
	       Enviar0.setForeground(Color.black);
	       Enviar0.setBounds(0, 300, 230, 50);
	       Autorizar.add(Enviar0);
	       
	       JButton Enviar100 = new JButton("DIRTY BUTTON 100");
	       Enviar100.setBackground(Color.decode("#75a540"));
	       Enviar100.setBorder(new ComponenteBotonRedondo(100));
	       Enviar100.setForeground(Color.black);
	       Enviar100.setBounds(0, 370, 400, 50);
	     
	       Autorizar.add(Enviar100);
		   JLabel background = new JLabel();
		   background.add(Autorizar);
		   add(background );
		   setVisible(true);
		}
	
		public static void main(String[]args){
			new Test();
		}
	
}