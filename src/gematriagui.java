import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

public class gematriagui extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Click for Gematria.");


    private gematriagui() {
        setTitle("Gematria Calculator");
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jt);
        jt.addActionListener(e -> {
            String Gematriainput = jt.getText();
            jl.setText("The Gematria of " + Gematriainput + " is " + ConvertLetters(Gematriainput));
        });
        jp.add(jb);

        jb.addActionListener(e -> {
            String input = jt.getText();
            jl.setText("The Gematria of " + input + " is " + ConvertLetters(input));

        });
        jp.add(jl);
        add(jp);
    }

    private static int ConvertLetters(String Letters) {
// Converts letters to numerical value.
        Hashtable<String, Integer> Gematria_Values = new Hashtable<>();
//        Goes through the Aleph Beis.
        Gematria_Values.put(" ", 0);
        Gematria_Values.put("א", 1);
        Gematria_Values.put("ב", 2);
        Gematria_Values.put("ג", 3);
        Gematria_Values.put("ד", 4);
        Gematria_Values.put("ה", 5);
        Gematria_Values.put("ו", 6);
        Gematria_Values.put("ז", 7);
        Gematria_Values.put("ח", 8);
        Gematria_Values.put("ט", 9);
        Gematria_Values.put("י", 10);
        Gematria_Values.put("כ", 20);
        Gematria_Values.put("ך", 20);
        Gematria_Values.put("ל", 30);
        Gematria_Values.put("מ", 40);
        Gematria_Values.put("ם", 40);
        Gematria_Values.put("נ", 50);
        Gematria_Values.put("ן", 50);
        Gematria_Values.put("ס", 60);
        Gematria_Values.put("ע", 70);
        Gematria_Values.put("פ", 80);
        Gematria_Values.put("ף", 80);
        Gematria_Values.put("צ", 90);
        Gematria_Values.put("ץ", 90);
        Gematria_Values.put("ק", 100);
        Gematria_Values.put("ר", 200);
        Gematria_Values.put("ש", 300);
        Gematria_Values.put("ת", 400);
        int sum = 0;
        for (int i = 0; i < Letters.length(); i++) {
            sum += Gematria_Values.get(String.valueOf(Letters.charAt(i)));
        }
//  Stores the value of the Gematria as the method.
        return sum;
    }


    public static void main(String[] args) {
        new gematriagui();

    }
}
