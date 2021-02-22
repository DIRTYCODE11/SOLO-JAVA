import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarrasDirty extends JFrame{

	BarrasDirty(){
	  setSize(320, 430);
      setTitle("Gráfica de barras");
      setVisible(true);
      setResizable(false);
       
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setSize(450, 500);
      panel.setBackground(Color.RED);

      JLabel title = new JLabel("GRÁFICAR BARRAS");
      title.setForeground(Color.white);
      Font fuente = new Font("Arial", Font.BOLD, 16);
      title.setFont(fuente);
      title.setBounds(75, 0, 300, 70);
      panel.add(title);

      JLabel lunes = new JLabel("LUNES:");
      lunes.setForeground(Color.white);
      Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
      lunes.setFont(fuenteEmpresa);
      lunes.setBounds(0, 0, 300, 150);
      panel.add(lunes);
      
      final JTextField d1txt = new JTextField();
      d1txt.setForeground(Color.black);
      d1txt.setBorder(null);
      d1txt.setBounds(100, 60, 200, 30);
      panel.add(d1txt);
      
      JLabel martes = new JLabel("MARTES:");
      martes.setForeground(Color.white);
      martes.setFont(fuenteEmpresa);
      martes.setBounds(0, 40, 300, 150);
      panel.add(martes);
      
      final JTextField d2txt = new JTextField();
      d2txt.setForeground(Color.black);
      d2txt.setBorder(null);
      d2txt.setBounds(100, 100, 200, 30);
      panel.add(d2txt);
      
      JLabel miercoles = new JLabel("MIÉRCOLES:");
      miercoles.setForeground(Color.white);
      miercoles.setFont(fuenteEmpresa);
      miercoles.setBounds(0, 80, 300, 150);
      panel.add(miercoles);
      
      final JTextField d3txt = new JTextField();
      d3txt.setForeground(Color.black);
      d3txt.setBorder(null);
      d3txt.setBounds(100, 140, 200, 30);
      panel.add(d3txt);
      
      JLabel jueves = new JLabel("JUEVES:");
      jueves.setForeground(Color.white);
      jueves.setFont(fuenteEmpresa);
      jueves.setBounds(0, 120, 300, 150);
      panel.add(jueves);
      
      final JTextField d4txt = new JTextField();
      d4txt.setForeground(Color.black);
      d4txt.setBorder(null);
      d4txt.setBounds(100, 180, 200, 30);
      panel.add(d4txt);
      
      JLabel viernes = new JLabel("VIERNES:");
      viernes.setForeground(Color.white);
      viernes.setFont(fuenteEmpresa);
      viernes.setBounds(0, 160, 300, 150);
      panel.add(viernes);
      
      final JTextField d5txt = new JTextField();
      d5txt.setForeground(Color.black);
      d5txt.setBorder(null);
      d5txt.setBounds(100, 220, 200, 30);
      panel.add(d5txt);
      
      JLabel sabado= new JLabel("SÁBADO:");
      sabado.setForeground(Color.white);
      sabado.setFont(fuenteEmpresa);
      sabado.setBounds(0, 200, 300, 150);
      panel.add(sabado);
      
      final JTextField d6txt = new JTextField();
      d6txt.setForeground(Color.black);
      d6txt.setBorder(null);
      d6txt.setBounds(100, 260, 200, 30);
      panel.add(d6txt);
      
      JLabel domingo= new JLabel("DOMINGO:");
      domingo.setForeground(Color.white);
      domingo.setFont(fuenteEmpresa);
      domingo.setBounds(0, 240, 300, 150);
      panel.add(domingo);
      
      final JTextField d7txt = new JTextField();
      d7txt.setForeground(Color.black);
      d7txt.setBorder(null);
      d7txt.setBounds(100, 300, 200, 30);
      panel.add(d7txt);
      
      JButton Graficar = new JButton("GRÁFICAR");
      Graficar.setBounds(60, 350, 200, 30);
      panel.add(Graficar);

      JLabel background = new JLabel();
      background.add(panel);
      add(background);

      
      Graficar.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
		
				    JFreeChart grafico = null;
			        DefaultCategoryDataset datos = new DefaultCategoryDataset();
			        int dato1 = Integer.parseInt(d1txt.getText());
			        int dato2 = Integer.parseInt(d2txt.getText());
			        int dato3 = Integer.parseInt(d3txt.getText());
			        int dato4 = Integer.parseInt(d4txt.getText());
			        int dato5= Integer.parseInt(d5txt.getText());
			        int dato6=Integer.parseInt(d6txt.getText());
			        int dato7=Integer.parseInt(d7txt.getText());
			        
			        datos.addValue(dato1,"Gráfica 1","LUNES");
			        datos.addValue(dato2,"Gráfica 1","MARTES");
			        datos.addValue(dato3,"Gráfica 1","MIÉRCOLES");
			        datos.addValue(dato4,"Gráfica 1","JUEVES");
			        datos.addValue(dato5,"Gráfica 1","VIERNES");
			        datos.addValue(dato6,"Gráfica 1","SÁBADO");
			        datos.addValue(dato7,"Gráfica 1","DOMINGO");
			        
			        grafico = ChartFactory.createBarChart("GRÁFICA DE BARRAS", "DIAS", "GANANCIAS",datos ,PlotOrientation.VERTICAL, true, true, false);				 
			        ChartPanel cPanel = new ChartPanel(grafico);
			        
			        JFrame informacion = new JFrame("Grafica");
			        informacion.getContentPane().add(cPanel);
			        informacion.pack();
			        informacion.setSize(1080,720);
			        informacion.setVisible(true);
			        
			 }
			 });
      

    }
	
	
	public static void main(String[]args) {
		
		new BarrasDirty().setVisible(true);
		
	}
	
}
