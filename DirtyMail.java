import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DirtyMail extends JFrame {


    DirtyMail() {
        setSize(450, 500);
        setTitle("Autorizar renta");

        setVisible(true);
        setResizable(false);

        JPanel Autorizar = new JPanel();
        Autorizar.setLayout(null);
        Autorizar.setSize(450, 500);
        Autorizar.setBackground(Color.BLACK);

        JLabel anuncio = new JLabel("MANDAR E-MAIL:");
        anuncio.setForeground(Color.white);
        Font fuente = new Font("Arial", Font.BOLD, 16);
        anuncio.setFont(fuente);
        anuncio.setBounds(150, 0, 300, 70);
        Autorizar.add(anuncio);

        JLabel persona = new JLabel("ASUNTO:");
        persona.setForeground(Color.white);
        Font fuenteEmpresa = new Font("Arial", Font.BOLD, 14);
        persona.setFont(fuenteEmpresa);
        persona.setBounds(0, 0, 300, 150);
        Autorizar.add(persona);

        final JTextField personatxt = new JTextField();
        personatxt.setForeground(Color.black);
        personatxt.setBorder(null);
        personatxt.setBounds(200, 63, 200, 30);
        Autorizar.add(personatxt);

        JLabel CorreoDestino = new JLabel("DESTINATARIO:");
        CorreoDestino.setForeground(Color.white);
        Font Destino = new Font("Arial", Font.BOLD, 14);
        CorreoDestino.setFont(Destino);
        CorreoDestino.setBounds(0, 104, 400, 150);
        Autorizar.add(CorreoDestino);

        JTextField CorreoDestinotxt = new JTextField("");
        CorreoDestinotxt.setForeground(Color.black);
        CorreoDestinotxt.setBorder(null);
        CorreoDestinotxt.setBounds(200, 170, 200, 30);
        Autorizar.add(CorreoDestinotxt);

        JLabel CampoB = new JLabel("Escriba abajo la información necesaria:");
        CampoB.setForeground(Color.black);
        Font CampoBlanco = new Font("Arial", Font.BOLD, 14);
        CampoB.setFont(CampoBlanco);
        CampoB.setBounds(100, 150, 500, 150);
        Autorizar.add(CampoB);

        JTextArea Campotxt = new JTextArea();
        Campotxt.setSize(650, 130);
        Campotxt.setLineWrap(true);
        Campotxt.setForeground(Color.black);
        Campotxt.setBorder(null);
        Campotxt.setBounds(10, 240, 400, 130);
        Autorizar.add(Campotxt);

        JButton Enviar = new JButton("Enviar");
        Enviar.setBackground(Color.black);

        Enviar.setBorder(new ComponenteBotonRedondo(40));
        Enviar.setForeground(Color.white);
        Enviar.setBounds(140, 400, 200, 50);
        Autorizar.add(Enviar);
       

        JLabel background = new JLabel();
        background.add(Autorizar);
        add(background);

        setVisible(true);

    }

    public static void main(String[] args) {

        new DirtyMail();

    }


}