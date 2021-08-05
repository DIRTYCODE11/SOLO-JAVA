
import java.awt.Color;

/******************************************************************************
 * La clase Picture.java es una clase open source elaborado por la universidad de Princeton
 En el siguiente link lo puedes descargar https://introcs.cs.princeton.edu/java/stdlib/Picture.java.html
 Recuerda que si quieres hacer funcionar tu código debes tener tus imagenes y las clase FadeRapido.java
 y Picture.java en el mismo paquete
 * La clase FadeRapido.java es una implementación de la clase  Picture.java y fue elaborada por el equipo de
 * Dirty Code para que pueda ser usada por todo el público

******************************************************************************/
public class FadeRapido {

    //Método que nos pinta la imagen  con el metodo show que esta en el TDA  Picture.java
    //Nos ayudara a recorre las imagenes en cuanto las pinte
    public static void MoverIm(int n, Picture picture1, Picture picture2, int width, int height, Picture picture) {
        for (int k = 0; k <= n; k++) {
            double alpha = 1.0 * k / n;
            for (int col = 0; col < width; col++) {
                for (int row = 0; row < height; row++) {
                    Color c1 = picture1.get(col, row);
                    Color c2 = picture2.get(col, row);
                    picture.set(col, row, combine(c2, c1, alpha));
                }
            }
            picture.show();
        }
    }
    
   // Asignando colores RGB
    public static Color combine(Color c1, Color c2, double alpha) {
        int r = (int) (alpha * c1.getRed() + (1 - alpha) * c2.getRed());
        int g = (int) (alpha * c1.getGreen() + (1 - alpha) * c2.getGreen());
        int b = (int) (alpha * c1.getBlue() + (1 - alpha) * c2.getBlue());
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        //Velocidad en donde se recorren las imagenes
        int n = 10;
        
        //Creando objetos de la clase Picture
        Picture picture1;
        Picture picture2;
        Picture picture3;
        Picture picture4;
        Picture picture5;
        Picture picture6;
        Picture picture7;
        Picture picture8;
        Picture picture9;
        Picture picture10;

        Picture picture11;
        Picture picture12;
        Picture picture13;
        Picture picture14;
        Picture picture15;
        Picture picture16;
        Picture picture17;
        Picture picture18;
        Picture picture19;
        Picture picture20;

        Picture picture21;
        Picture picture22;
        Picture picture23;
        Picture picture24;
        Picture picture25;
        Picture picture26;
        Picture picture27;
        Picture picture28;
        Picture picture29;
        Picture picture30;
        Picture picture31;

        
        //Nombre de nuestras imagenes que seran los frames
        //Importante fijarse en la terminacion , puede ser png o jpg
        
        String NombreImagen[] = {
            "0.jpg", "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg",
            "11.jpg", "12.jpg", "13.jpg", "14.jpg", "15.jpg", "16.jpg", "17.jpg", "18.jpg", "19.jpg", "20.jpg", "21.jpg",
            "22.jpg", "23.jpg", "24.jpg", "25.jpg", "26.jpg", "27.jpg", "28.jpg", "29.jpg", "30.jpg", "31.jpg"
        };

       // A cada objeto creado de la clase Picture le asignamos un espacio en el arreglo de NombreImagen
        Picture Imagen[] = {
            picture1 = new Picture(NombreImagen[0]),
            picture2 = new Picture(NombreImagen[1]),
            picture3 = new Picture(NombreImagen[2]),
            picture4 = new Picture(NombreImagen[3]),
            picture5 = new Picture(NombreImagen[4]),
            picture6 = new Picture(NombreImagen[5]),
            picture7 = new Picture(NombreImagen[6]),
            picture8 = new Picture(NombreImagen[7]),
            picture9 = new Picture(NombreImagen[8]),
            picture10 = new Picture(NombreImagen[9]),
            picture11 = new Picture(NombreImagen[10]),
            picture12 = new Picture(NombreImagen[11]),
            picture13 = new Picture(NombreImagen[12]),
            picture14 = new Picture(NombreImagen[13]),
            picture15 = new Picture(NombreImagen[14]),
            picture16 = new Picture(NombreImagen[15]),
            picture17 = new Picture(NombreImagen[16]),
            picture18 = new Picture(NombreImagen[17]),
            picture19 = new Picture(NombreImagen[18]),
            picture20 = new Picture(NombreImagen[19]),
            picture21 = new Picture(NombreImagen[20]),
            picture22 = new Picture(NombreImagen[21]),
            picture23 = new Picture(NombreImagen[22]),
            picture24 = new Picture(NombreImagen[23]),
            picture25 = new Picture(NombreImagen[24]),
            picture26 = new Picture(NombreImagen[25]),
            picture27 = new Picture(NombreImagen[26]),
            picture28 = new Picture(NombreImagen[27]),
            picture29 = new Picture(NombreImagen[28]),
            picture30 = new Picture(NombreImagen[29]),
            picture31 = new Picture(NombreImagen[30])

        };

        //Dimensiones de la imagen aca todos los frame (imagenes que usemos) deben ser de la misma dimencion
        int width = picture1.width();
        int height = picture1.height();
        
        //Nueva instancia de Picture asignando tamaño y altura
        Picture picture = new Picture(width, height);
        
       // Mandando a llamar el método del inicio , recibiendo
       //n velocidad con la que se recorra (entre más chico este número más rápido correra)
       //recibimos 2 frames para que haga la animacion
       // el ancho y largo de la imagen
       // y una nueva instancia de Picture
        MoverIm(n, picture1, picture2, width, height, picture);
        MoverIm(n, picture3, picture4, width, height, picture);
        MoverIm(n, picture5, picture6, width, height, picture);
        MoverIm(n, picture7, picture8, width, height, picture);
        MoverIm(n, picture9, picture10, width, height, picture);

        MoverIm(n, picture11, picture12, width, height, picture);
        MoverIm(n, picture13, picture14, width, height, picture);
        MoverIm(n, picture15, picture16, width, height, picture);
        MoverIm(n, picture17, picture18, width, height, picture);
        MoverIm(n, picture19, picture20, width, height, picture);

        MoverIm(n, picture21, picture22, width, height, picture);
        MoverIm(n, picture23, picture24, width, height, picture);
        MoverIm(n, picture25, picture26, width, height, picture);
        MoverIm(n, picture27, picture28, width, height, picture);
        MoverIm(n, picture29, picture30, width, height, picture);

    }
}
