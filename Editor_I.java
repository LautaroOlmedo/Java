package EditorDeTexto;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Editor_I{
    public static void main(String[] args) {
        marco mimarco = new marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marco extends JFrame{

    public marco(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Editor I");
        setResizable(true);
        setSize(400, 350);


        frame miframe = new frame();
        add(miframe);
    }
}

class frame extends JPanel{
    public frame(){
        // ---------- LAYOUT Y JPANEL ----------
        setLayout(new BorderLayout());
        laminaMenu = new JPanel();

        // ---------- CREACIÓN BARRA ----------
        JMenuBar miBarra = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");

        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);

        // ---------- AGREGANDO BARRA ----------
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);

        // ---------- CREACIÓN JMENUITEM FUENTE ----------
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem verdana = new JMenuItem("Verdana");
        JMenuItem courier = new JMenuItem("Courier");

        fuente.add(arial);
        fuente.add(verdana);
        fuente.add(courier);

        // ---------- CREACIÓN JMENUITEM ESTILO ----------
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");

        estilo.add(cursiva);
        estilo.add(negrita);

        // ---------- CREACIÓN JMENUITEM TAMAGNO ----------
        JMenuItem tam_12 = new JMenuItem("12");
        JMenuItem tam_14 = new JMenuItem("14");
        JMenuItem tam_16 = new JMenuItem("16");
        JMenuItem tam_20 = new JMenuItem("20");
        JMenuItem tam_22 = new JMenuItem("22");
        JMenuItem tam_24 = new JMenuItem("24");

        tamagno.add(tam_12);
        tamagno.add(tam_14);
        tamagno.add(tam_16);
        tamagno.add(tam_20);
        tamagno.add(tam_22);
        tamagno.add(tam_24);
    }

    JPanel laminaMenu;  
}