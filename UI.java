import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    JFrame Window = new JFrame("Physics");
    JTextField tfMass = new JTextField("Enter Mass");
    JTextField tfAcceleration = new JTextField("Acceleration");
    JButton btnCalculate = new JButton("calculate");

    void  drawUI(){
        Window.add(tfAcceleration);
        Window.add(tfMass);
        Window.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Physics physics = new Physics();
                Float mass = Float.valueOf(tfMass.getText());
                Float acceleration = Float.valueOf(tfAcceleration.getText());

                JOptionPane.showMessageDialog(null),
                physics.calculateForce(mass, acceleration);
            }catch (NumberFormatException nfe;){
                JOptionPane.showMessageDialog(null, "Enter only numeric value");
                nfe.printStackTrace();

            }
        });

        Window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Window.setLayout(new GridLayout(3,1));
        Window.setSize(200,250);
        Window.setVisible(true);

    }

}

