import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Awt extends Frame {
    Awt() {
        Frame f = new Frame();
        JFrame ff = new JFrame();
        Label ll = new Label("STUDENT FORM");
        Label l = new Label("Name");
        TextField t = new TextField();
        Label l1 = new Label("Father Name");
        TextField t1 = new TextField();
        Label l2 = new Label("Mother Name");
        TextField t2 = new TextField();
        Label l3 = new Label("Age");
        TextField t3 = new TextField();
        Label l4 = new Label("Gender");
        JRadioButton r1 = new JRadioButton("male");
        JRadioButton r2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        Label l5 = new Label("Skills");
        JCheckBox c1 = new JCheckBox("java");
        JCheckBox c2 = new JCheckBox("C++");
        JCheckBox c3 = new JCheckBox("Python");
        Label l6 = new Label("Feedback");
        TextField t4 = new TextField();
        Button b = new Button("Submit");
        Button b1 = new Button("Clear");
        ll.setBounds(50, 20, 100, 30);
        l.setBounds(20, 70, 70, 30);
        t.setBounds(150, 70, 70, 30);

        l1.setBounds(20, 100, 90, 30);
        t1.setBounds(150, 100, 70, 30);

        l2.setBounds(20, 130, 90, 30);
        t2.setBounds(150, 130, 70, 30);

        l3.setBounds(20, 160, 70, 30);
        t3.setBounds(150, 160, 70, 30);

        l4.setBounds(20, 190, 70, 30);

        r1.setBounds(20, 220, 70, 30);
        r2.setBounds(100, 220, 70, 30);

        l5.setBounds(20, 250, 70, 30);

        c1.setBounds(20, 280, 70, 30);
        c2.setBounds(100, 280, 70, 30);
        c3.setBounds(180, 280, 70, 30);

        l6.setBounds(20, 310, 70, 30);
        t4.setBounds(20, 340, 200, 100);

        b.setBounds(50, 500, 80, 30);
        b1.setBounds(200, 500, 80, 30);
        bg.add(r1);
        bg.add(r2);
        f.add(l);
        f.add(t);
        f.add(b);
        f.add(b1);
        f.add(ll);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(r1);
        f.add(r2);
        f.add(l6);
        f.add(t4);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        ff.setSize(400, 300);
        ff.setLayout(null);
        ff.setVisible(true);
    }

    public static void main(String args[]) {
        Awt f = new Awt();
    }
}
