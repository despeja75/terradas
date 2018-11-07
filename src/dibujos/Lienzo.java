package dibujos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
	private ArrayList<Persona> datos;
	public Lienzo() {
        super.setPreferredSize(new Dimension(500, 500));
        datos= new ArrayList<Persona>();
        datos.add(new Persona("pepe",100));
        datos.add(new Persona("juan", 200));
        datos.add(new Persona("david",300));
        datos.add(new Persona("carlos",400));
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        //Marco
        g.drawRect(10, 10, 400, 400);
       
        //Fijo fuente para el texto
        g.setFont(new Font("Arial", 30, 20)  );
        //Nombres
        g.drawString(datos.get(0).getNombre(), 30, 30);
        g.drawString(datos.get(1).getNombre(), 150, 30);
        g.drawString(datos.get(2).getNombre(), 270, 30);
                       
        g.setColor(new Color(255, 0, 0));
        g.fillRect(20, 50, 100, datos.get(0).getVentas());
                
        g.setColor(new Color(0, 255, 0));
        g.fillRect(140, 50, 100, datos.get(1).getVentas());
        
        g.setColor(new Color(0, 0, 255));
        g.fillRect(260, 50, 100, datos.get(2).getVentas());
        
        //Valores
        g.setColor(new Color(0, 0, 0));
        g.drawString(new Integer(datos.get(0).getVentas()).toString(), 30, 80+datos.get(0).getVentas());
        g.drawString(new Integer(datos.get(1).getVentas()).toString(), 150,80+ datos.get(1).getVentas());
        g.drawString(new Integer(datos.get(2).getVentas()).toString(), 270, 80+ datos.get(2).getVentas());
        
        //imagen
        //de x= 400 a x= 600 ha de ir la imagen
        ImageIcon Img = new ImageIcon(getClass().getResource("../imagenes2/esteve.jpg"));
        //la ruta es relativo a la colocación de la clase que muestra la imagen
        if(Img == null) System.out.println("No encontrada");
        g.drawImage(Img.getImage(), 450, 0, 100, 100, null);
       //Conclusión...Se crea la carpeta en src con el IDE, se copia la imagne , pero 
        //el solo crea una carpeta dentro de bin ,que es la de la ruta correcta
        
        ImageIcon Img2 = new ImageIcon(getClass().getResource("../imagenes3/Koala.jpg"));
        //la ruta es relativo a la colocación de la clase que muestra la imagen
        if(Img2 == null) System.out.println("No encontrada");
        g.drawImage(Img2.getImage(), 450, 0, 100, 100, null);
        
        
    }
    
   
  
}


