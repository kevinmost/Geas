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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

public class GUI {
	public static void main(String args[]){
		JFrame guiMainPanel = new JFrame();
		
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
		
		JSpinner spinner = new JSpinner();
		
		JLabel lblRestPeriod = new JLabel("Rest Period");
		
		JSlider slider = new JSlider();
		
		JLabel lblRandomness = new JLabel("Randomness");
		
		JToggleButton tglbtnStart = new JToggleButton("Start");
		GroupLayout groupLayout = new GroupLayout(guiMainPanel.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxUseTor)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addComponent(lblPollFile, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnLoad))
										.addComponent(frmtdtxtfldExamplepollxml))
									.addComponent(lblPollSettings))
								.addContainerGap(284, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblRestPeriod)
								.addGap(304))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(slider, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblRandomness)
								.addGap(293)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tglbtnStart)
							.addContainerGap(295, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblPollFile, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRandomness))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tglbtnStart)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		guiMainPanel.getContentPane().setLayout(groupLayout);

	}
}
