import javax.swing.*;
public class swingcheckbox {
    public static void main(String[] args) {

        JFrame f = new JFrame("CheckBox");

        JCheckBox c = new JCheckBox("Java");
        c.setBounds(80, 30, 100, 30);

        JButton b = new JButton("Submit");
        b.setBounds(80, 80, 100, 30);

        b.addActionListener(e -> {

            if (c.isSelected())
                JOptionPane.showMessageDialog(f, "Java Selected");
            else
                JOptionPane.showMessageDialog(f, "Java Not Selected");
        });

        f.add(c);
        f.add(b);

        f.setSize(280, 160);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}