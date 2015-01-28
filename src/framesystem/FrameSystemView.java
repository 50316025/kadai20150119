package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.MM1_lib;
import lib.MMS_lib;
import lib.calculation_lib;
public class FrameSystemView extends Frame implements ActionListener,WindowListener {
	
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private TextField m1 = new TextField("",10);
	private TextField m2 = new TextField("",10);
	private TextField m3 = new TextField("",10);
	private TextField m4 = new TextField("",10);
	private TextField m5 = new TextField("",10);
	private Button button1 = new Button("ìöÇ¶");
	private Button bm = new Button("M/M/1");
	private Button bs = new Button("MMS");
	public FrameSystemView(FrameSystemController control){
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("ìöÇ¶"));
		add(text3);
		add(new Label("É…"));
		add(m1);
		add(new Label("É "));
		add(m2);
		add(new Label("s"));
		add(m5);
		add(bm);
		add(new Label("ïΩãœånì‡êlêî"));
		add(m3);
		add(bs);
		add(new Label("ïΩãœånì‡êlêî"));
		add(m4);
		button1.addActionListener(this);
		bm.addActionListener(this);
		bs.addActionListener(this);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1+val2));
		calculation_lib clib = new calculation_lib(val1,val2);
		text3.setText(String.valueOf(clib.getPlus()));
		}
		else if(e.getSource()==bm){
         double lambda = Double.parseDouble(m1.getText());
         double mu = Double.parseDouble(m2.getText());
         MM1_lib mlib = new MM1_lib(lambda, mu);
         m3.setText(String.valueOf(mlib.getLength()));
         }
		else if(e.getSource()==bs){
		 double lambda = Double.parseDouble(m1.getText());
	     double mu = Double.parseDouble(m2.getText());
	     int s = Integer.parseInt(m5.getText());
	     MMS_lib mlib=new MMS_lib(lambda,mu,s);
		 m4.setText(String.valueOf(mlib.getL()));
		}
	}
	
		
		
	
	
	
	


}
