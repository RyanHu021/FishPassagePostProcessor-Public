package hu.ryan.fpprocessor.ui;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class NewConditionPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewConditionPanel
     */
    public NewConditionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPath = new ButtonGroup();
        jPanel1 = new JPanel();
        btnConfirm = new JButton();
        btnCancel = new JButton();
        jPanel3 = new JPanel();
        txtFieldName = new JTextField();
        jLabel1 = new JLabel();
        rdbtnEC = new JRadioButton();
        rdbtnNC = new JRadioButton();
        rdbtnPC = new JRadioButton();
        rdbtnOther = new JRadioButton();
        jLabel2 = new JLabel();
        txtFieldOther = new JTextField();
        btnMesh = new JButton();
        btnData = new JButton();
        jPanel4 = new JPanel();
        chckbc = new JCheckBox();
        btnImage = new JButton();
        btnWorld = new JButton();
        jPanel5 = new JPanel();
        lblElements = new JLabel();
        lblNodes = new JLabel();
        lblTimestamps = new JLabel();
        lblImage = new JLabel();
        lblSelMesh = new JLabel();
        lblSelData = new JLabel();
        lblSelImage = new JLabel();
        lblSelWorld = new JLabel();

        setMinimumSize(new Dimension(600, 400));
        setPreferredSize(new Dimension(600, 400));

        btnConfirm.setText("Confirm");
        btnConfirm.setEnabled(false);

        btnCancel.setText("Cancel");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        jPanel3.setBorder(BorderFactory.createTitledBorder("General Options"));

        jLabel1.setText("Name:");

        btnGroupPath.add(rdbtnEC);
        rdbtnEC.setSelected(true);
        rdbtnEC.setText("Existing");

        btnGroupPath.add(rdbtnNC);
        rdbtnNC.setText("Natural");

        btnGroupPath.add(rdbtnPC);
        rdbtnPC.setText("Proposed");

        btnGroupPath.add(rdbtnOther);
        rdbtnOther.setText("Other:");

        jLabel2.setText("Mesh Path:");
        
        txtFieldOther.setText("[Node Path], [Element Path]");

        btnMesh.setText("Add Mesh File");

        btnData.setText("Add Data File");
        btnData.setEnabled(false);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldName))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdbtnOther)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldOther))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(rdbtnEC)
                            .addComponent(rdbtnPC)
                            .addComponent(rdbtnNC))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMesh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnEC)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnNC)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnPC))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnMesh)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnData)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnOther)
                    .addComponent(txtFieldOther, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.setBorder(BorderFactory.createTitledBorder("Georeference Options"));

        chckbc.setText("Use Map Image and World File");
        chckbc.setEnabled(false);

        btnImage.setText("Add Map Image");
        btnImage.setEnabled(false);

        btnWorld.setText("Add World File");
        btnWorld.setEnabled(false);

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(chckbc)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnImage)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWorld)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chckbc)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImage)
                    .addComponent(btnWorld))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel5.setBorder(BorderFactory.createTitledBorder("Info"));

        lblElements.setText("Elements:0 ");

        lblNodes.setText("Nodes: 0");

        lblTimestamps.setText("Timestamps: 0");

        lblImage.setText("With Image: No");

        lblSelMesh.setText("Selected Mesh File:");

        lblSelData.setText("Selected Data File:");

        lblSelImage.setText("Selected Map Image:");

        lblSelWorld.setText("Selected World File:");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimestamps, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNodes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblElements, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelMesh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSelData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelImage)
                            .addComponent(lblSelWorld))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElements)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNodes)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimestamps)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImage)
                .addGap(18, 18, 18)
                .addComponent(lblSelMesh)
                .addGap(18, 18, 18)
                .addComponent(lblSelData)
                .addGap(18, 18, 18)
                .addComponent(lblSelImage)
                .addGap(18, 18, 18)
                .addComponent(lblSelWorld)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private JButton btnCancel;
    private JButton btnConfirm;
    private JButton btnData;
    private ButtonGroup btnGroupPath;
    private JButton btnImage;
    private JButton btnMesh;
    private JButton btnWorld;
    private JCheckBox chckbc;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JLabel lblElements;
    private JLabel lblImage;
    private JLabel lblNodes;
    private JLabel lblSelData;
    private JLabel lblSelImage;
    private JLabel lblSelMesh;
    private JLabel lblSelWorld;
    private JLabel lblTimestamps;
    private JRadioButton rdbtnEC;
    private JRadioButton rdbtnNC;
    private JRadioButton rdbtnOther;
    private JRadioButton rdbtnPC;
    private JTextField txtFieldName;
    private JTextField txtFieldOther;
    // End of variables declaration
    
    public JButton getBtnMesh() {
		return btnMesh;
	}

	public JButton getBtnData() {
		return btnData;
	}

	public JTextField getTxtFieldName() {
		return txtFieldName;
	}
	
	public JTextField getTxtFieldOther() {
		return txtFieldOther;
	}

	public JLabel getLblElements() {
		return lblElements;
	}

	public JLabel getLblNodes() {
		return lblNodes;
	}

	public JLabel getLblTimestamps() {
		return lblTimestamps;
	}

	public JLabel getLblImage() {
		return lblImage;
	}

	public JButton getBtnImage() {
		return btnImage;
	}

	public JButton getBtnWorld() {
		return btnWorld;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JButton getBtnConfirm() {
		return btnConfirm;
	}

	public JCheckBox getChckbc() {
		return chckbc;
	}

	public JLabel getLblSelData() {
		return lblSelData;
	}

	public JLabel getLblSelImage() {
		return lblSelImage;
	}

	public JLabel getLblSelMesh() {
		return lblSelMesh;
	}

	public JLabel getLblSelWorld() {
		return lblSelWorld;
	}

	public JRadioButton getRdbtnEC() {
		return rdbtnEC;
	}

	public JRadioButton getRdbtnNC() {
		return rdbtnNC;
	}

	public JRadioButton getRdbtnOther() {
		return rdbtnOther;
	}

	public JRadioButton getRdbtnPC() {
		return rdbtnPC;
	}
}
