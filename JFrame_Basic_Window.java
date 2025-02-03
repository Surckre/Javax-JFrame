import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame(); // declare new JFrame Instance
        frame.setVisible(true); // set visible to true
        frame.setSize(800,600); // set window size
        frame.setTitle("Title"); // set title of the window
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // set exit after presing x on the window
        frame.setResizable(false); // set resizable to false
    }
}
