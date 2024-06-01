package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionFrame extends JFrame {
    private JTextField textField1;    private JPanel panel;
    private JLabel l1;
    private JLabel l2;

    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;

    public AdditionFrame(){
        initComponent();
        setContentPane(panel);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void initComponent(){
        panel.setLayout(null);
        l1.setBounds(50,50,100,20);
        textField1.setBounds(150,50,200,20);
        l2.setBounds(50,150,100,20);
        textField2.setBounds(150,150,200,20);
        button1.setBounds(200,250,100,100);
        textField3.setBounds(100,200,150,20);
        panel.add(l1);panel.add(textField1);
        panel.add(l2);panel.add(textField2);
        panel.add(button1);panel.add(textField3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(textField1.getText());
                int b=Integer.parseInt(textField2.getText());
                int c=a+b;
                textField3.setText("Sum of "+a+" and "+b+" is "+c);
            }
        });
    }
}
