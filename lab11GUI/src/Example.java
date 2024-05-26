import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Example extends JFrame{
    private JPanel JPanel1;
    private JButton kliknijMnieButton;
    private JButton wyjścieButton;
    private JTextField labelTextField;
    private JLabel lbWelcome;
    private int width =400, height=400;


    public static void main(String[] args) {

        Example example = new Example();
        example.setVisible(true);

    }

    public Example(){
        super("Moje pierwsze GUI");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        //this.pack();
        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        kliknijMnieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* String text = JOptionPane.showInputDialog("Podaj imie");
                JOptionPane.showMessageDialog(null,"Witaj: "+text,
                        "uwaga",JOptionPane.WARNING_MESSAGE);*/

                //lbWelcome.setText(new Date().toString());

                String text = labelTextField.getText();
                lbWelcome.setText(text);


            }
        });


    }

}
