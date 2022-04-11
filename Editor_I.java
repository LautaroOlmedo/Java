package EditorDeTexto;
import java.awt.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Editor_I{
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame{

    public Marco(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Editor I");
        setResizable(true);
        setSize(400, 350);

        Frame miframe = new Frame();
        add(miframe);
    }
}

class Frame extends JPanel{
    public Frame(){
        // ---------- LAYOUT Y JPANEL ----------
        setLayout(new BorderLayout());
        laminaMenu = new JPanel();

        // ---------- CREACIÓN BARRA ----------
        JMenuBar miBarra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamagno = new JMenu("Tamaño");

        // ---------- CREANDO JMENU ----------
        configuraMenu("Arial", "Fuente", "Arial", 9, 10);
        configuraMenu("Courier", "Fuente", "Courier", 9, 10);
        configuraMenu("Verdana", "Fuente", "Verdana", 9, 10);

        //--------------------

        configuraMenu("Cursiva", "Estilo", "", Font.ITALIC, 10);
        configuraMenu("Negrita", "Estilo", "", Font.BOLD, 10);

        //--------------------

        configuraMenu("12", "Tamaño", "", 9, 12);
        configuraMenu("14", "Tamaño", "", 9, 14);
        configuraMenu("16", "Tamaño", "", 9, 16);
        configuraMenu("20", "Tamaño", "", 9, 20);
        configuraMenu("24", "Tamaño", "", 9, 24);

        // ---------- AGREGANDO MENUS A BARRA ----------
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);

        // ---------- CREACIÓN JTEXTPANE ----------
        miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);
    }
    
    // ---------- MÉTODO CREADOR DE JMENU ----------
    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam){
        JMenuItem elem_menu  = new JMenuItem(rotulo);

        if(menu == "Fuente"){
            fuente.add(elem_menu);
            if(tipoLetra == "Arial"){
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Arial"));
            }else if(tipoLetra == "Courier"){
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Courier"));
            }else if(tipoLetra == "Verdana"){
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia letra", "Verdana"));
            }
        }else if(menu == "Estilo"){
            estilo.add(elem_menu);
            if(estilos == Font.BOLD){
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
            }else if(estilos == Font.ITALIC){
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
        }else if(menu == "Tamaño"){
            tamagno.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", tam));
        }
    }
    JTextPane miArea;
    JPanel laminaMenu;  
    JMenu fuente, estilo, tamagno;
    Font letras;
    
}