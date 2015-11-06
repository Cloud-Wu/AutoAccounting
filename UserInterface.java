import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UserInterface extends Frame implements ActionListener {

	/* ================= 
	 * "Date (MM/DD/YYYY): " [Month]/[Day]/[Year]
	 * 					"Debit"		"Credit"
	 * [Category] 		[Amount]
	 * (Button: + Debit Field) (Button: - Debit Field)
	 * [Category]					[Amount]
	 * (Button: + Credit Field) (Button: - Credit Field)
	 * 
	 * (Button: Record)
	 * ==========================
	 * "Text"		: Words displayed on the Frame
	 * [Month]		: Integer, ranging from 1 to 12. 
	 * [Day]		: Integer, ranging from 1 to last day of the month. 
	 * [Year]		: Integer, No limitation.
	 * [Category] 	: Drop-down List that require input from back-end.
	 * [Amount]		: Double, No limitation
	 * 
	 * Input Check before storing data:
	 * 1.	Do not allow invalid date: i.e. 02/29/2015 not allowed, but 02/29/2014 allowed
	 * 2. 	Debit total should equal to credit total
	 * 
	 * After basic layout configuration:
	 * 1. Record 5 inputs and display them 
	 * 2. Close button:
	 * 		Confirm close: "Sure to close?"
	 */

	private TextField txFld;
	private Button but_t;
	private Button but_c;

	private Button addBut;
	private int textFieldCount = 1;

	private ArrayList<TextField> textFieldList;
	
	public UserInterface() {
		initialization();
	}
	
	//Initial setup of frame, function should be called when program starts
	//One Debit field, and one Credit field
	private void initialization() {
		
		//Not sure which layout would be best
		setLayout(new FlowLayout());
		
		textFieldList = new ArrayList<TextField>();

		txFld = new TextField("This is a text field", 100);
		add(txFld);
		txFld.setEditable(true);

		but_t = new Button("Tifa");
		add(but_t);

		but_t.addActionListener(this);

		addBut = new Button("Create New Button");
		add(addBut);
		addBut.addActionListener(this);
		
		but_c = new Button("Cifa");
		add(but_c);
		but_c.addActionListener(this);

		setVisible(true); // "super" Frame shows

		setSize(1024, 768);
		setTitle("Cloud");
		
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int i = JOptionPane.showConfirmDialog(null, "Noooooooooooooooooo!!!!!!!!!");
                if(i == 0) System.exit(0);
            }
        });

	}

	//Function call from button 
	private void addDebitField() {

	}

	//Function call from button 
	private void deleteDebitField(){
		
	}

	//Function call from button 
	private void addCreditField() {

	}

	//Function call from button 
	private void deleteCreditField(){
		
		
	}
	
	//Function call from button 
	//Record all data in fields
	//Return to one Debit field, one Credit field
	private void record(){
		
	}
	
	//Handle all button event here: + Field / - Field / Record
	@Override
	public void actionPerformed(ActionEvent e) {
		if (but_t == e.getSource()) {

			setSize(200, 100);

		} else if (but_c == e.getSource()) {
			setSize(400, 100);

		} else if (addBut == e.getSource()) {
			TextField newTextField = new TextField("Button " + textFieldCount, 100);
			newTextField.setSize(100, 50);
			textFieldList.add(newTextField);
			newTextField.setLocation(0, 40 * textFieldCount + 200);
			this.add(newTextField);
			textFieldCount++;
		} else {
			System.out.println(e);
		}

	}

}
