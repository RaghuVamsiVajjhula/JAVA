package GUI;//This is taken by vs code as i have created a new folder for GUI so ignore...
//GUI is an program which consists of Graphical User Interface.

//The actual code begins now...


import javax.swing.JOptionPane;

public class input_user
{
    public static void main(String[] args)
    {

        String name=JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        //int age=JOptionPane.showInputDialog("Enter your age:");
        //When we use the above program we can get an error because the JOptionPane takes an
        //string class as an input and the 
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        JOptionPane.showMessageDialog(null,"You are :"+age+"years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null,"You are: "+height+"years old");
        
    }    
}
