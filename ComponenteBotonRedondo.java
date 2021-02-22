import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

//Redondeando botones con solo modificar la propiedad de radio
public  class ComponenteBotonRedondo implements Border {
private int radio;

public ComponenteBotonRedondo(int radio){
	this.radio=radio;	
}
	//Método que ayuda a redondear las esquinas según el radio
public Insets getBorderInsets(Component c) {
	return new Insets(radio, radio, radio, radio);
	}

	public boolean isBorderOpaque() {

	return true;
	}

	
//Este metodo va hacer que se marque el borde del boton
	public void paintBorder(Component c,Graphics g ,int x, int y, int width,
			int height) {
        g.drawRoundRect(x, y, width-1, height-1, radio, radio);		
	}	
}
