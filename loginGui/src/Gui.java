import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
*
* @author LuongNT
*/
public class Gui implements ActionListener {
    private static  JLabel userLabel;
    private static JTextField userText;
    private static JLabel passWordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(jPanel);

       jPanel.setLayout(null);

        userLabel = new JLabel("User Name");
        userLabel.setBounds(10,20,80,25);
       jPanel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165,25);
        jPanel.add(userText);

        passWordLabel = new JLabel("Password");
        passWordLabel.setBounds(10,50,80,25);
        jPanel.add(passWordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165,25);
        jPanel.add(passwordText);

        button = new JButton("login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new Gui());
        jPanel.add(button);

        success  = new JLabel("");
        success.setBounds(10,110, 300,25);
        jPanel.add(success);

        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String pass = passwordText.getText();
        System.out.println(user+ "," +pass);

        if(user.equals("theluong") && pass.equals("12345")){
            success.setText("login sucsess!");
        }else{
            success.setText("user name or passWord not correct!");
        }

//add feature DB for login GUI check login
    }
}
