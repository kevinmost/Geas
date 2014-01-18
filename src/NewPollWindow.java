import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class NewPollWindow {
	private static JTable table;
	public static void main(String args[]){
		JPanel mainPanel = new JPanel();
		
		JFormattedTextField frmtdtxtfldPollname = new JFormattedTextField();
		frmtdtxtfldPollname.setText("pollName");
		
		JLabel lblPollScript = new JLabel("Poll Script");
		
		JTextArea txtrHttpexamplepollsitecomfirstpollchoice = new JTextArea();
		txtrHttpexamplepollsitecomfirstpollchoice.setText("http://examplepollsite.com/firstpoll,choice\r\nhttp://examplepollsite.com/secondpoll,choice");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 50, 5));
		
		JLabel lblRandomness = new JLabel("Randomness");
		
		JButton btnSave = new JButton("Save");
		
		JSpinner spinner_1 = new JSpinner();
		
		JLabel lblRestPeriod = new JLabel("Rest Period");
		
		JCheckBox chckbxUseTor = new JCheckBox("Use Tor");
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrHttpexamplepollsitecomfirstpollchoice, GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
						.addComponent(frmtdtxtfldPollname, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
						.addComponent(lblPollScript)
						.addGroup(Alignment.TRAILING, gl_mainPanel.createSequentialGroup()
							.addComponent(chckbxUseTor)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblRestPeriod)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblRandomness)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave)))
					.addContainerGap())
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(frmtdtxtfldPollname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPollScript)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrHttpexamplepollsitecomfirstpollchoice, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(lblRandomness)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRestPeriod)
						.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxUseTor))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		mainPanel.setLayout(gl_mainPanel);

	}
}
