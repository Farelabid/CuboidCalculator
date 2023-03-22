import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JTextField inputPanjang;
    private JTextField inputLebar;
    private JTextField inputTinggi;
    private JButton hitungButton;
    private JButton resetButton;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPanel panelMain;

    public Kalkulator() {
    hitungButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == hitungButton) {
                try {
                    double panjang = Double.parseDouble(inputPanjang.getText());
                    double lebar = Double.parseDouble(inputLebar.getText());
                    double tinggi = Double.parseDouble(inputTinggi.getText());

                    if (panjang <= 0 || lebar <= 0 || tinggi <= 0) {
                        JOptionPane.showMessageDialog(hitungButton, "Panjang, lebar, dan tinggi harus lebih besar dari 0", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double luas = panjang * lebar;
                        double keliling = 2 * (panjang + lebar);
                        double volume = panjang * lebar * tinggi;
                        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

                        label5.setText("Luas Persegi Panjang: " + luas);
                        label6.setText("Keliling Persegi Panjang: " + keliling);
                        label7.setText("Volume Balok: " + volume);
                        label8.setText("Luas Permukaan Balok: " + luasPermukaan);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(hitungButton, "Panjang, lebar, dan tinggi harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
                }
           }
        }
    });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputPanjang.setText("");
                inputLebar.setText("");
                inputTinggi.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
                label8.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Kalkulator h=new Kalkulator();
        h.setContentPane(h.panelMain);
        h.setTitle("Kalkulator Balok 123210076");
        h.setSize(400,450);
        h.setLocationRelativeTo(null);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
