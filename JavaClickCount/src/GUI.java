import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    private int count = 0;
    private JLabel label;
    private JButton button;
    private JFrame frame;
    private JPanel panel;
    public GUI (){
        frame = new JFrame();
        button = new JButton("Count");
        button.addActionListener(this);
        label = new JLabel("count : 0");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60, 60, 30, 60));
        panel.setLayout(new GridLayout(2, 3));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

@Override
public void actionPerformed(ActionEvent e){
    count++;
    label.setText(count+ " click");
}
}