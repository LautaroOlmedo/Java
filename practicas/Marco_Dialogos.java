package practicas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.awt.geom. Rectangle2D;

public class Marco_Dialogos extends JFrame {

    public Marco_Dialogos(){

        setTitle("Aplicación Diálogos");
        setBounds(500, 300, 600, 450);
        setLayout(new BorderLayout());

        //------------------------------------------

        JPanel laminaCuadricula = new JPanel(); // LÁMINA PRINCIPAL

        //------------------------------------------

        laminaCuadricula.setLayout(new GridLayout(2, 3));

        //------------------------------------------

        String primero [] = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        lamina_tipo = new Lamina_Dialogos("Tipo", primero);
        laminaCuadricula.add(lamina_tipo);

        //------------------------------------------

        lamina_tipomensaje = new Lamina_Dialogos("Tipo de Mensaje", new String []{
            "ERROR_MESSAGE",
            "INFORMATION_MESSAGE",
            "QUESTION_MESSAGE",
            "PLAIN_MESSAGE"
        });
        laminaCuadricula.add(lamina_tipomensaje);

        //------------------------------------------

        lamina_mensaje = new Lamina_Dialogos("Mensaje", new String []{
            "Cadena",
            "Ícono",
            "Componente",
            "Otros",
            "Objects[]"
        });
        laminaCuadricula.add(lamina_mensaje);

        //------------------------------------------

        lamina_confirmar = new Lamina_Dialogos("Confirmar", new String []{
            "DEFAULT_OPTION",
            "YES_NO_OPTION",
            "YES_NO_CANCEL_OPTION",
            "OK_CANCEL_OPTION"
        });
        laminaCuadricula.add(lamina_confirmar);

        //------------------------------------------

        lamina_opcion = new Lamina_Dialogos("Opción", new String []{
            "String[]",
            "Icon[]",
            "Object[]"
        });
        laminaCuadricula.add(lamina_opcion);

        //------------------------------------------

        lamina_entrada = new Lamina_Dialogos("Entrada", new String []{
            "Campo de Texto",
            "Combo"  
        });
        laminaCuadricula.add(lamina_entrada);

        //------------------------------------------

        laminaFondo = new JPanel();
        JButton mostrar = new JButton("Mostrar");
        mostrar.addActionListener(new AccionMostrar());
        laminaFondo.add(mostrar);
        add(laminaFondo, BorderLayout.SOUTH);
        
        //------------------------------------------
        add(laminaCuadricula, BorderLayout.CENTER);
    }
    
    public Object dameMensaje(){

        String s = lamina_mensaje.dameSeleccion();
        if(s.equals("Cadena")){
            return cadenaMensaje;

        }else if(s.equals("Icono")){
            return iconMensaje;

        }else if(s.equals("Componente")){
            return componenteMensaje;

        }else if(s.equals("Otros")){
            return objetoMensaje;

        }else if(s.equals("Objects[]")){
            return new Object[]{
                cadenaMensaje,
                componenteMensaje,
                objetoMensaje
            };
        }else{
            return null;
        }
    }

    //------------------------------------------ CLASE INTERNA QUE GESTIONA EVENTOS
    private class AccionMostrar implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if(lamina_tipo.dameSeleccion().equals("Mensaje")){
                JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0);

            }else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0, 0);

            }else if(lamina_tipo.dameSeleccion().equals("Entrada")){
                JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0);

            }else if(lamina_tipo.dameSeleccion().equals("Objects[]")){
                JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), "Titulo", 0, 0, null, null, null);

            }
        }

    }

    private Lamina_Dialogos lamina_tipo, lamina_tipomensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;
    private JPanel laminaFondo;
    private String cadenaMensaje = "Mensaje";
    private Icon iconMensaje = null;
    private Object objetoMensaje = new Date();
    private Component componenteMensaje = new Lamina_Ejemplo();
       
}

class Lamina_Ejemplo extends JPanel{
    
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        g2.setPaint(Color.YELLOW);
        g2.fill(rectangulo);
    }
}
