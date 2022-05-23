package lab.matrix_visual.schemes;

import lab.matrix.IMatrix;
import lab.matrix_visual.DrawerScheme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicalScheme extends JFrame implements DrawerScheme {
    private JButton button = new JButton("Print matrix");
    private JTextArea input = new JTextArea(5, 20);
    private JRadioButton radio = new JRadioButton("Draw with borders");
    private IMatrix matrix;

    public GraphicalScheme() {
        super("GraphicalScheme");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ButtonEventListener());

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input);
        container.add(button);
        container.add(radio);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input.setText("Test");
        }
    }

    @Override
    public void draw(IMatrix matrix) {
        setVisible(true);
    }

}
