import java.awt.*;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyTableDialog extends JDialog implements ActionListener
{
	JTable os;
	JLabel x,y;
	JTextField t1,t2;
	JButton b1,b2,b3;
	
	public MyTableDialog()
	{
		super(new Frame(),"ListBox Dmoe");
		setSize(500,400);
		setLayout(new BorderLayout());
		
		Vector v = new Vector();
		v.addElement("Operating System");
		v.addElement("Company");
		
		model = new DefaultModel(new Vector(),v);
		
		os = new JTable(model);
		
		x = new JTable("Operating system");
		y = new JTable("Company");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		b1 = new JButton("Add");
		b2 = new JButton("Remove");
		b3 = new JButton("Close");
		
		Vector v1 = new Vector();
		v1.addElement("Windows 2000");
		v1.addElement("Microsoft");
		
		Vector v1 = new Vector();
		v1.addElement("Windows XP");
		v1.addElement("Microsoft");
		
		model.addRow(v1);
		model.addRow(v2);
		
		JPanel aPanel1 = new JPanel();
		aPanel1.setBorder(BorderFactory.createTitledBorder("OS"));
		JScrollPane aScrollPane = new JScrollPane(os,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		aPanel1.add(aScrollPane);
		
		os.setPreferredScrollableViewportSize(new Dimension(300,200));
		
		
		JPanel aPanel2 = new JPanel();
		
		aPanel2.
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
