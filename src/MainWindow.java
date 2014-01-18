import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class MainWindow {
	public static void main(String args[]){
		JFrame mainPanel = new JFrame();
		mainPanel.setTitle("Geas");
		
		JLabel lblPollFile = new JLabel("Poll File");
		
		JFormattedTextField frmtdtxtfldExamplepollxml = new JFormattedTextField();
		frmtdtxtfldExamplepollxml.setText("examplepoll.xml");
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnLoad = new JButton("Load");
		
		JLabel lblPollSettings = new JLabel("Poll Settings");
		
		JCheckBox chckbxUseTor = new JCheckBox("Use TOR");
		chckbxUseTor.setSelected(true);
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblRestPeriod = new JLabel("Rest Period");
		
		JLabel lblRandomness = new JLabel("Randomness");
		
		JToggleButton tglbtnStart = new JToggleButton("Start");
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JLabel lblPollProgress = new JLabel("Poll Progress");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 50, 5));
		GroupLayout groupLayout = new GroupLayout(mainPanel.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxUseTor)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(6)
								.addComponent(lblPollFile, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnLoad))
							.addComponent(frmtdtxtfldExamplepollxml))
						.addComponent(lblPollSettings)
						.addComponent(tglbtnStart)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(spinner_1)
								.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRandomness)
								.addComponent(lblRestPeriod))))
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
						.addComponent(lblPollProgress))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPollFile, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPollProgress))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(frmtdtxtfldExamplepollxml, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnLoad))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblPollSettings)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxUseTor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRestPeriod))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRandomness))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tglbtnStart)))
					.addContainerGap())
		);
		mainPanel.getContentPane().setLayout(groupLayout);

	}
}
