import javax.swing.JOptionPane;

public class TempQtns {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name", "null");
        JOptionPane.showMessageDialog(null,"Hello " + name );

//        int age = JOptionPane.showConfirmDialog(null, "value");
//        JOptionPane.showMessageDialog(null,"You age is " + age );
    }
}
