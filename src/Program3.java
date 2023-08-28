import javax.swing.JOptionPane;

public class Program3
{
    public static void main(String[] args)
    {
        String navn;
        navn = JOptionPane.showInputDialog("Hva heter du?");
        String utskrift;
        utskrift = "Hallais! " + navn;
        JOptionPane.showMessageDialog(null, utskrift);
    }
}
