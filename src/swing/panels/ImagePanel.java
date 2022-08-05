
package swing.panels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagePanel extends javax.swing.JPanel {

    private String path;
    private Image img;
    
    public ImagePanel(){
        path = null;
    }

    public void setImage(String path) {
        try {
            this.path = path;
            img = ImageIO.read(new File(path));
            repaint();
        } catch (IOException ex) {
            System.out.println("error al cargar la imagen: " + ex.getMessage());
            
        }
    }

    @Override
    public void paint(Graphics g) {
        if(img != null){
            Dimension d = getSize();
            g.drawImage(img, 0, 0, d.width, d.height, null);
            setOpaque(false);
            super.paint(g);
        }
    }

}
