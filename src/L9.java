import javax.swing.JOptionPane;


public class L9{

    public static void main(String[] args){

        String firstName;
        String lastName;

        firstName= JOptionPane.showInputDialog("What is your name?");
        lastName = JOptionPane.showInputDialog("What is your last Name?");

        JOptionPane.showMessageDialog(null,"Hello " + firstName + " " + lastName + "!!");

        //ALL INPUT IS STRING DATA

      int mph, minutes;
        double hours, distance;

        mph=Integer.parseInt(JOptionPane.showInputDialog("What was your input speed?")) ;
        minutes=Integer.parseInt(JOptionPane.showInputDialog("How long did,IN MINUTES, you travel?"));

        hours= minutes/60.0;

        distance = hours * mph;

        JOptionPane.showMessageDialog(null,"you travled "+ distance+ " miles");

        //PROTIP: Seprate like data type varaibles on one line with a coma



        System.exit(0);









    }
}
