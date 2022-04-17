package practicas;

import javax.swing.*;

public class Lamina_Dialogos extends JPanel{

    public Lamina_Dialogos(String titulo, String [] opciones){

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        grupo = new ButtonGroup();

        for(int i = 0; i < opciones.length; i ++){

            JRadioButton bot = new JRadioButton(opciones[i]);
            bot.setActionCommand(opciones[i]);
            add(bot);
            grupo.add(bot);
            bot.setSelected(i == 0);
        }
    }

    public String dameSeleccion(){

        /*ButtonModel  miboton = grupo.getSelection(); // ALMACENA EL JRADIOBUTTON SELECCIONADO
        String s = miboton.getActionCommand();  //DEVUELVE EL STRING DE LA ACCIÓN DE COMANDO
        return s;*/
        return grupo.getSelection().getActionCommand(); 
    }
    ButtonGroup grupo;
}  

