import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class DirtyGalery  extends JFrame{
	
	 //Distribucion que ayudara a crear la galeria
	 private CardLayout Imagenes;
	 
	 //Panel donde se colocan los labels (y en los labels van las imagenes)
	 private JPanel ap[]; 
	 private JLabel la[];
	 private  String nImagenes []={
			 "C:\\Users\\Emmanuel\\Desktop\\dirty\\1.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\dirty\\2.jpg",
			 "C:\\Users\\Emmanuel\\Desktop\\dirty\\3.gif",
			 "C:\\Users\\Emmanuel\\Desktop\\dirty\\4.jpg"
	 };
	 private Icon  icons[]={
			 new ImageIcon(nImagenes[0]),
			 new ImageIcon(nImagenes[1]),
			 new ImageIcon(nImagenes[2]),
			 new ImageIcon(nImagenes[3])
	 };
	 //Inicializacion de nuestro arreglo de imagenes
	 int contar=0;
	 
	 DirtyGalery(){
		 
		//Construccion del entorno grafico
			JPanel cabecera;
			cabecera = new JPanel();
			cabecera.setBackground(Color.BLACK);
			cabecera.setBounds(0,0,1366,136);
			setTitle("Dirty_Galery");
			setSize(1366,768);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			Font fuente= new Font("Arial",Font.BOLD,100);
			JLabel titulo = new JLabel("DIRTY_CODE");
			titulo.setFont(fuente);
			titulo.setForeground(Color.decode("#75a738"));
			cabecera.add(titulo);
		
			
			 JPanel botonAtras = new JPanel();
			 botonAtras.setLayout(null);
			 botonAtras.setBackground(Color.BLACK);
			 botonAtras.setBounds(73,370,51,87);
			

			JPanel botonAdelante = new JPanel();
			botonAdelante.setLayout(null);
			botonAdelante.setBackground(Color.BLACK);
			botonAdelante.setBounds(1245,370,51,87);
		
			
			Font fuente1= new Font("Arial",Font.BOLD,82);
			JButton atras= new JButton("<");
			atras.setBackground(Color.BLACK);
			atras.setFont(fuente1);
			atras.setForeground(Color.decode("#75a738"));
			atras.setBounds(1,1,1,1);
			atras.setSize(51,87);
			atras.setBorder(null);
			botonAtras.add(atras);
			
			JButton adelante= new JButton(">");
			adelante.setBackground(Color.BLACK);
			adelante.setFont(fuente1);
			adelante.setBounds(1,1,1,1);
			adelante.setForeground(Color.decode("#75a738"));
			adelante.setSize(51,87);
			adelante.setBorder(null);
			botonAdelante.add(adelante);

			Imagenes=new CardLayout(); 
			final JPanel ImagenPanel = new JPanel();
			ImagenPanel.setBackground(Color.BLACK);
			ImagenPanel.setLayout(null);
			ImagenPanel.setBounds(132,200,1105,420);
			
			 la =new JLabel[ nImagenes.length]; 
			 ap=new JPanel[icons.length];   
			 ImagenPanel.setLayout(Imagenes);
	        //algoritmo que añade paneles y etiquetas al arreglo	
			 for(int z=0; z<nImagenes.length;z++){
				    la[z]=new JLabel(icons[z]); 
				    ap[z ]=new JPanel(); 
				    ap[z].add(la[z]);
				    ap[z].setBackground(Color.BLACK);
				    ImagenPanel.add(ap[z],String.valueOf(z));
				}
	         //añadiendo la funcion a lo botones que recorre el arreglo nImagenes
			 adelante.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent arg0) {
				 if (contar < nImagenes.length) {
				 contar += 1;
				 Imagenes.show( ImagenPanel,"" + (contar));
				 }
				 }
				 });
				
				 atras.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent arg0) {
				 if (contar > 0) {
				 contar -= 1;
				 Imagenes.show( ImagenPanel, "" + (contar));
				 }
				 
				 
				 }
				 });
		
			
		
			JLabel background = new JLabel();
			background.setBackground(Color.BLACK);
			background.setOpaque(true);
			
			//Añadiendo los componentes 
			background.add(cabecera);
			background.add( botonAtras);
			background.add(botonAdelante);
			background.add( ImagenPanel);
			background.setBounds(0,0,1366,768);
			add(background );
			setVisible(true);	
	       
		 
		 
	 }
	
	
	public static void main(String[]args){
		
		new DirtyGalery();
	}

}
