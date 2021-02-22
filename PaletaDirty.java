import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

//Martinez Castellanos Francisco Emmanuel 16161365 

public class PaletaDirty {
 
    private JLabel etiquetaSu,eti1,eti2,eti3;
    private JTextField red, green, blue;
    private JPanel panelIzquierdo, panelDerecho, panelInferior;
    private JButton   pintar;
    private JTextArea lienzo;

    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        eti1=new JLabel("RED");
        eti2=new JLabel("GREEN");
        eti3=new JLabel("BLUE");
        red= new JTextField();
        green= new JTextField();
        blue= new JTextField();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.WHITE);
        panelIzquierdo.add(eti1);
        panelIzquierdo.add(red);
        panelIzquierdo.add(eti2);
        panelIzquierdo.add(green);
        panelIzquierdo.add(eti3);
        panelIzquierdo.add(blue);
    }


    public void PanelBotones(){
        panelInferior = new JPanel();
        pintar=new JButton("PINTAR");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.WHITE);
        panelInferior.add(pintar);
    }

    public void VentanaPrincipal(){
        JFrame frame = new JFrame();
        lienzo = new JTextArea("",10,15);
        etiquetaSu = new JLabel("         PALETA RGB");
     
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
        frame.setLayout(new BorderLayout());

    
        frame.add(etiquetaSu,BorderLayout.NORTH);
        frame.add(lienzo, BorderLayout.CENTER);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelInferior,BorderLayout.SOUTH);
 
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public PaletaDirty(){
        PanelBotones();
        contruyePanelIzquierdo();
        VentanaPrincipal(); 
pintar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    
            int r=Integer.parseInt(red.getText().trim());
            int g=Integer.parseInt(green.getText().trim());
            int b=Integer.parseInt(blue.getText().trim());
         
        if((r<=255 && g<=255 && b<=255)&& (r>=0&& g>=0 && b>=0)){
                    Color color = new Color(r,g,b);
                    lienzo.setBackground(color);
                    }else{
           JOptionPane.showMessageDialog(null,"Fuera de Rango");
                    }
                    
                } });
    }

    public static void main (String []args){
        new PaletaDirty();
    }
}