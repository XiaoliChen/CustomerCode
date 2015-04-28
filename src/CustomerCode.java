import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomerCode extends JFrame {
	private static final long serialVersionUID = 1L;
    protected static JLabel LbName;
    protected static JTextField txtInputName;
    protected static JLabel LbDescription;
    protected static JTextField txtInputDescription;
    static JButton btnSubmit;
	private JPanel contentPane;
	
	 @SuppressWarnings("unchecked")
	    public void CustomerInfo() {

	        //Name Label and TextField 
	        LbName = new JLabel("FirstName:");
	        txtInputName = new JTextField(50);
	        
	        LbName = new JLabel("MiddleName:");
	        txtInputName = new JTextField(1);
	        
	        LbName = new JLabel("LastName:");
	        txtInputName = new JTextField(50);
	        
	       LbName = new JLabel("Address:");
	        txtInputName = new JTextField(50);
	        
	        LbName = new JLabel("City:");
	        txtInputName = new JTextField(25);
	        
	        LbName = new JLabel("State:");
	        txtInputName = new JTextField(2);
	        /*by just put into the first initial of State name*/
	        
	        
	        LbName = new JLabel("Zip:");
	        txtInputName = new JTextField(9);
	        setLayout(null);
	        //Name
	        add(LbName);
	        add(txtInputName);
	        add(txtInputDescription);
	        //button Submit
	        add(btnSubmit);
	      
	        }
	  private static void createAndShowGUI() {

	        //Create and set up the window.
	        JFrame frame = new JFrame("DataDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        CustomerCode newContentPane = new CustomerCode();
	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setSize(500, 500);
	        frame.setVisible(true);
	        //(x,y,with,height)
	        //Name interface position 
	        LbName.setBounds(50, 70, 200, 25);
	        txtInputName.setBounds(200, 70, 200, 25);
	        //Description interface position 
	        LbDescription.setBounds(50, 100, 200, 25);
	        txtInputDescription.setBounds(200, 100, 200, 25);
	        //button Submit
	        btnSubmit.setBounds(200, 150, 200, 25);
	    }

	       

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CustomerCode frame = new CustomerCode();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CustomerCode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 200, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JRadioButton Cd1 = new JRadioButton("male");
		Cd1.setBounds(50, 50, 100, 50);
		contentPane.add(Cd1);
		JRadioButton Cd2 = new JRadioButton("female");
		Cd1.setBounds(100, 50,  100, 100);
		contentPane.add(Cd2);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(Cd1);
		buttonGroup.add(Cd2);
	    Cd1.setSelected(true);
	    Cd2.setSelected(true);
	}
}