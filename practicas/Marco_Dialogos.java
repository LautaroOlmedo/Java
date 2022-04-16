package practicas;
import javax.swing.*;
import java.awt.*;

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
        laminaFondo.add(mostrar);
        add(laminaFondo, BorderLayout.SOUTH);
        
        //------------------------------------------
        add(laminaCuadricula, BorderLayout.CENTER);
    }

    private Lamina_Dialogos lamina_tipo, lamina_tipomensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;
    private JPanel laminaFondo;
       
}
