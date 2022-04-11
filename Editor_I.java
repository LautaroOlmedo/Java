package EditorDeTexto;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
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

        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);




    }

    JPanel laminaMenu;
    
}