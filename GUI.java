import javax.swing.JOptionPane; 
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null, "hello "+name + "\nage= "+age );
    }
}