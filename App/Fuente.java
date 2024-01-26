package App;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Fuente {
    Font font;

    public Fuente(){
        InputStream is = getClass().getResourceAsStream("/Tipografia/LibreFranklin-MediumItalic.ttf");
        try {
            font= Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            font = new Font("Arial", Font.ITALIC, 14);
            System.out.println(e);
        }
    }
    
    /**
     * @param estilo Font.PLAIN = 0, Font.BOLT = 1, Font.ITALIC = 2
     * @param tamaño =float
     * @return Font
     */
    public Font getFont(int estilo, float tamaño){
        return font.deriveFont(estilo, tamaño);
    }
    
    public Font getFont(String fuente, int estilo, float tamaño){
        InputStream is = getClass().getResourceAsStream("/Tipografia/" + fuente + ".ttf");
        try {
            font= Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException | IOException e) {
            font = new Font("Arial", Font.ITALIC, 14);
        }
        return font.deriveFont(estilo, tamaño);
    }
}
