package practicas;

import javax.swing.*;

public class Lamina_Dialogos extends JPanel{

    public Lamina_Dialogos(String titulo, String [] opciones){

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup grupo = new ButtonGroup();

        for(int i = 0; i < opciones.length; i ++){

            JRadioButton bot = new JRadioButton(opciones[i]);
            add(bot);
            grupo.add(bot);
            bot.setSelected(i == 0);
        }
    }
}  

