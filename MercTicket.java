
package MERCSystem;

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 *
 * @author HAACHAMA
 */
@SuppressWarnings("serial")
public class MercTicket extends javax.swing.JFrame {

// cost Polymorphism, creating a same method name in different class with application of inheritace
//cTransaction, cQuit Inheritance is the mechanism in java by which one class is allowed to acquire the features (fields and methods) of another class
//gross.cost, abstraction hiding the complicated codes and calling the methods inside of it using the child class 
//object for MercTicket which is the child class for cTransaction class	used in transactions
//GETTERS SETTERS Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates
	
double Gross;
cTransaction cost = new cTransaction();
private int count;

    public MercTicket() {
    	setResizable(false);
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jrbRegular = new javax.swing.JRadioButton();
        jlblRegular = new javax.swing.JLabel();
        jrbPrivate = new javax.swing.JRadioButton();
        jlblPrivate = new javax.swing.JLabel();
        jrbBusiness = new javax.swing.JRadioButton();
        jlblBusiness = new javax.swing.JLabel();
        jlblA = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmbDestination = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jrbSingle = new javax.swing.JRadioButton();
        jlblSingle = new javax.swing.JLabel();
        jrbRound = new javax.swing.JRadioButton();
        jlblRound = new javax.swing.JLabel();
        jlblD = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jcYes = new javax.swing.JCheckBox();
        jcNo = new javax.swing.JCheckBox();
        jlblTinsur = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtAdult = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtChild = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtSenior = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jbtnConfirm = new javax.swing.JButton();
        jlblPax1 = new javax.swing.JLabel();
        jlblPax = new javax.swing.JLabel();
        jlblPax2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlblMPax = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jtName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtAge = new javax.swing.JTextField();
        jbtnAddName = new javax.swing.JButton();
        jbtnAddName.setEnabled(false);
        jlblTPax = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNameAge = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jlblBag = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlblFee = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jlblInsur = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jbtnTotal = new javax.swing.JButton();
        jbtnTotal.setEnabled(false);
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jtDue = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jtPay = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jlblChange = new javax.swing.JLabel();
        jbtnPay = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jbtnReceipt = new javax.swing.JButton();
        jbtnReceipt.setEnabled(false);
        jbtnExit = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReceipt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Merc Airlines!");

        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setLayout(new java.awt.GridLayout(4, 2, 9, 9));

        jrbRegular.setText("REGULAR");
        jrbRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRegularActionPerformed(evt);
            }
        });
        jPanel3.add(jrbRegular);

        jlblRegular.setText("0");
        jPanel3.add(jlblRegular);

        jrbPrivate.setText("PRIVATE");
        jrbPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPrivateActionPerformed(evt);
            }
        });
        jPanel3.add(jrbPrivate);

        jlblPrivate.setText("0");
        jPanel3.add(jlblPrivate);

        jrbBusiness.setText("BUSINESS");
        jrbBusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBusinessActionPerformed(evt);
            }
        });
        jPanel3.add(jrbBusiness);

        jlblBusiness.setText("0");
        jPanel3.add(jlblBusiness);

        jlblA.setText("CLASS SELECTED:");
        jPanel3.add(jlblA);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 9, 9));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FLIGHT");
        jPanel1.add(jLabel2);

        jcmbDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Manila – Batanes", "Batanes – Manila", "Manila – Palawan", "Palawan – Manila", "Manila - South Korea", "South Korea – Manila", "Manila – Japan", "Japan – Manila", "Manila – Vietnam", "Vietnam – Manila" }));
        jcmbDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbDestinationActionPerformed(evt);
            }
        });
        jPanel1.add(jcmbDestination);

        jPanel4.setLayout(new java.awt.GridLayout(3, 2, 9, 9));

        jrbSingle.setText("ONE WAY");
        jrbSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSingleActionPerformed(evt);
            }
        });
        jPanel4.add(jrbSingle);

        jlblSingle.setText("0");
        jPanel4.add(jlblSingle);

        jrbRound.setText("ROUND TRIP");
        jrbRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRoundActionPerformed(evt);
            }
        });
        jPanel4.add(jrbRound);

        jlblRound.setText("0");
        jPanel4.add(jlblRound);

        jlblD.setText("TICKET SELECTED:");
        jPanel4.add(jlblD);

        jPanel5.setLayout(new java.awt.GridLayout(2, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TICKET TYPE");
        jPanel5.add(jLabel6);

        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("AVAIL INSURANCE");
        jPanel6.add(jLabel10);

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("CABIN CLASS");
        jPanel7.add(jLabel11);

        jPanel9.setLayout(new java.awt.GridLayout(2, 2));

        jcYes.setText("YES");
        jcYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcYesActionPerformed(evt);
            }
        });
        jPanel9.add(jcYes);

        jcNo.setText("NO");
        jcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNoActionPerformed(evt);
            }
        });
        jPanel9.add(jcNo);

        jlblTinsur.setText("0");
        jPanel9.add(jlblTinsur);

        jPanel8.setLayout(new java.awt.GridLayout(2, 0));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("PASSENGER DETAILS");
        jPanel8.add(jLabel13);

        jPanel10.setLayout(new java.awt.GridLayout(2, 0));

        jLabel14.setText("Number of Passenger/s");
        jPanel10.add(jLabel14);

        jPanel11.setLayout(new java.awt.GridLayout(3, 3, 0, 9));

        jLabel15.setText("ADULT");
        jPanel11.add(jLabel15);
        jPanel11.add(jtAdult);

        jLabel16.setText("CHILD");
        jPanel11.add(jLabel16);
        jPanel11.add(jtChild);

        jLabel17.setText("SENIOR");
        jPanel11.add(jLabel17);

        jPanel11.add(jtSenior);

        jPanel12.setLayout(new java.awt.GridLayout(2, 4, 9, 9));

        jbtnConfirm.setText("CONFIRM");
        jbtnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnConfirm);

        jlblPax1.setText("PAXX");
        jlblPax1.setVisible(false);
        jPanel12.add(jlblPax1);

        jlblPax.setText("PAX");
        jlblPax.setEnabled(false);
        jPanel12.add(jlblPax);

        jlblPax2.setText("PAXXX");
        jlblPax2.setVisible(false);
        jPanel12.add(jlblPax2);

        jPanel13.setLayout(new java.awt.GridLayout(2, 0));

        jlblMPax.setText("Maximum of # Passengers");
        jPanel13.add(jlblMPax);

        jPanel14.setLayout(new java.awt.GridLayout(4, 2, 9, 9));

        jLabel22.setText("NAME");
        jPanel14.add(jLabel22);
        jPanel14.add(jtName);

        jLabel24.setText("AGE");
        jPanel14.add(jLabel24);
        jPanel14.add(jtAge);

        jbtnAddName.setText("ADD PAX");
        jbtnAddName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddNameActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnAddName);
        jPanel14.add(jlblTPax);

        jPanel15.setLayout(new java.awt.GridLayout());

        jtNameAge.setEditable(false);
        jtNameAge.setColumns(20);
        jtNameAge.setRows(5);
        jScrollPane1.setViewportView(jtNameAge);

        jPanel15.add(jScrollPane1);

        jPanel16.setLayout(new java.awt.GridLayout(2, 0));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("TRANSACTION");
        jPanel16.add(jLabel25);

        jPanel17.setLayout(new java.awt.GridLayout(7, 2, 0, 9));

        jLabel30.setText("TAX");
        jPanel17.add(jLabel30);

        jlblTax.setText("0");
        jPanel17.add(jlblTax);

        jLabel32.setText("BAGGAGE FEE");
        jPanel17.add(jLabel32);

        jlblBag.setText("0");
        jPanel17.add(jlblBag);

        jLabel34.setText("ADDITIONAL FEE");
        jPanel17.add(jLabel34);

        jlblFee.setText("0");
        jPanel17.add(jlblFee);

        jLabel36.setText("INSURANCE FEE");
        jPanel17.add(jLabel36);

        jlblInsur.setText("0");
        jPanel17.add(jlblInsur);

        jLabel26.setText("SUBTOTAL");
        jPanel17.add(jLabel26);

        jlblSubTotal.setText("0");
        jPanel17.add(jlblSubTotal);

        jLabel28.setText("TOTAL");
        jPanel17.add(jLabel28);

        jlblTotal.setText("0");
        jPanel17.add(jlblTotal);

        jbtnTotal.setText("SHOW TOTAL");
        jbtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnTotal);

        jPanel18.setLayout(new java.awt.GridLayout(5, 0, 0, 9));

        jLabel38.setText("DUE AMOUNT");
        jPanel18.add(jLabel38);

        jtDue.setEditable(false);
        jPanel18.add(jtDue);

        jLabel39.setText("PAY AMOUNT");
        jPanel18.add(jLabel39);
        jPanel18.add(jtPay);

        jLabel41.setText("CHANGE");
        jPanel18.add(jLabel41);

        jlblChange.setText("YOUR CHANGE");
        jPanel18.add(jlblChange);

        jbtnPay.setText("PAY");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnPay);

        jPanel19.setLayout(new java.awt.GridLayout(4, 0, 0, 9));

        jbtnReceipt.setText("PRINT RECEIPT");
        jbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceiptActionPerformed(evt);
            }
        });
        jPanel19.add(jbtnReceipt);

        jbtnExit.setText("EXIT");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel19.add(jbtnExit);

        jPanel20.setLayout(new java.awt.GridLayout(2, 0));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("RECEIPT");
        jPanel20.add(jLabel42);

        jPanel21.setLayout(new java.awt.GridLayout());

        jtReceipt.setEditable(false);
        jtReceipt.setColumns(20);
        jtReceipt.setRows(5);
        jScrollPane2.setViewportView(jtReceipt);

        jPanel21.add(jScrollPane2);
        
        JButton btnShowFlights = new JButton();
        btnShowFlights.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cDestination ft = new cDestination();
        		ft.cDestination();
        	}
        });
        btnShowFlights.setText("SHOW FLIGHTS");
        
        JButton btnShowAirlineTypes = new JButton();
        btnShowAirlineTypes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		cAirplane ft = new cAirplane();
        		ft.cAirplane();
        	}
        });
        btnShowAirlineTypes.setText("SHOW AIRLINE TYPES");
        
        JPanel panel = new JPanel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(51)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jPanel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        					.addGap(60)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(jPanel14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel13, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel12, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jPanel11, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
        					.addGap(48)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jPanel17, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jPanel19, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jPanel18, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel20, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        						.addComponent(jPanel21, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
        					.addGap(27))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(btnShowFlights, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnShowAirlineTypes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(155)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(28)
        					.addComponent(btnShowFlights)
        					.addGap(5)
        					.addComponent(btnShowAirlineTypes)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(panel, 0, 0, Short.MAX_VALUE))
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jPanel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jPanel20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jPanel17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addGap(18)
        									.addComponent(jPanel18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(jPanel19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addGap(52))
        								.addComponent(jPanel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        			.addContainerGap(107, Short.MAX_VALUE))
        );
        panel.setLayout(new GridLayout(1, 0, 0, 0));
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(MercTicket.class.getResource("/MERCSystem/image/ezgif.com-gif-maker.gif")));
        panel.add(lblNewLabel);
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRoundActionPerformed
        jcNo.setSelected(true);
        jcYes.setSelected(false);
        jlblD.setText("Round Trip");
        
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbRegular.isSelected())
        {
            Gross = cost.RoundB_Manila; 
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundB_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
           jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.RoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       //--------------------------------------PRIVATE------------------------------------
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbPrivate.isSelected())
        {
            Gross = cost.PRoundB_Manila; 
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundB_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
           jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PRoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       //--------------------------------------BUSINESS------------------------------------
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbBusiness.isSelected())
        {
            Gross = cost.BRoundB_Manila; 
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundB_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
           jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundJP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BRoundVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblRound.setText(Cost);
            jrbSingle.setSelected(false);
            jlblSingle.setText("0");
        }
       
       
       
       
        if (jrbRound.isSelected()==false)
        {
            jlblRound.setText("0");
            jlblD.setText(null);
           
        }
    }//GEN-LAST:event_jrbRoundActionPerformed

    private void jbtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotalActionPerformed
          
        

         double pax = Double.parseDouble(jlblPax.getText());
         double pax1 = Double.parseDouble(jlblPax1.getText());
         double pax2 = Double.parseDouble(jlblPax2.getText());
         double tax, bag, fee, insur, subtotal;
       
     //----------------SINGLE    
   if ((jrbSingle.isSelected() == true) && jrbRegular.isSelected() && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && (jcYes.isSelected())) 
   {

       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_B * (pax1) + cost.Manila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);



   }

   if ((jrbSingle.isSelected() == true) && jrbRegular.isSelected() && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && (jcNo.isSelected()))
   {


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_B * (pax1) + cost.Manila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.B_Manila * (pax1) + cost.B_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.B_Manila * (pax1) + cost.B_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       // double pax = Double.parseDouble(jlblPax.getText());
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_P * (pax1) + cost.Manila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_P * (pax1) + cost.Manila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.P_Manila * (pax1) + cost.P_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.P_Manila * (pax1) + cost.P_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_SK * (pax1) + cost.Manila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_SK * (pax1) + cost.Manila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.SK_Manila * (pax1) + cost.SK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.SK_Manila * (pax1) + cost.SK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_JP * (pax1) + cost.Manila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_JP * (pax1) + cost.Manila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.JP_Manila * (pax1) + cost.JP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.JP_Manila * (pax1) + cost.JP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_VN * (pax1) + cost.Manila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.Manila_VN * (pax1) + cost.Manila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.VN_Manila * (pax1) + cost.VN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbSingle.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.VN_Manila * (pax1) + cost.VN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
        
        //---------------------PRIVATE------------------------
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
       
       insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_B * (pax1) + cost.PManila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbPrivate.isSelected() && (jcNo.isSelected())) 
        {
            
       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_B * (pax1) + cost.PManila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PB_Manila * (pax1) + cost.PB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected()))
        {
            tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PB_Manila * (pax1) + cost.PB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_P * (pax1) + cost.PManila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_P * (pax1) + cost.PManila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PP_Manila * (pax1) + cost.PP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected())) 
        {
             tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PP_Manila * (pax1) + cost.PP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);  
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_SK * (pax1) + cost.PManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
         if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
         {
           tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_SK * (pax1) + cost.PManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);   
         }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PSK_Manila * (pax1) + cost.PSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_SK * (pax1) + cost.PManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_JP * (pax1) + cost.PManila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected() && (jcNo.isSelected()))   
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_JP * (pax1) + cost.PManila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);      
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PJP_Manila * (pax1) + cost.PJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
        {
       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PJP_Manila * (pax1) + cost.PJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_VN * (pax1) + cost.PManila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))
        {
           tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PManila_VN * (pax1) + cost.PManila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
          insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PVN_Manila * (pax1) + cost.PVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PVN_Manila * (pax1) + cost.PVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        //---------------------BUSINESS------------------------
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
       
       insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_B * (pax1) + cost.BManila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbBusiness.isSelected() && (jcNo.isSelected())) 
        {
            
       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_B * (pax1) + cost.BManila_B * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BB_Manila * (pax1) + cost.BB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected()))
        {
            tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BB_Manila * (pax1) + cost.BB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_P * (pax1) + cost.BManila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_P * (pax1) + cost.BManila_P * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BP_Manila * (pax1) + cost.BP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected())) 
        {
             tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BP_Manila * (pax1) + cost.BP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);  
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_SK * (pax1) + cost.BManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
         if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
         {
           tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_SK * (pax1) + cost.BManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);   
         }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BSK_Manila * (pax1) + cost.BSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_SK * (pax1) + cost.BManila_SK * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_JP * (pax1) + cost.BManila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected() && (jcNo.isSelected()))   
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_JP * (pax1) + cost.BManila_JP * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);      
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BJP_Manila * (pax1) + cost.BJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
        {
       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BJP_Manila * (pax1) + cost.BJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_VN * (pax1) + cost.BManila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))
        {
           tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BManila_VN * (pax1) + cost.BManila_VN * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
          insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BVN_Manila * (pax1) + cost.BVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BVN_Manila * (pax1) + cost.BVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
 //---------ROUND----------------------------  
    if ((jrbRound.isSelected() == true) && jrbRegular.isSelected() && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && (jcYes.isSelected())) 
   {

       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundB_Manila * (pax1) + cost.RoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);



   }

   if ((jrbRound.isSelected() == true) && jrbRegular.isSelected() && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && (jcNo.isSelected()))
   {


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundB_Manila * (pax1) + cost.RoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundB_Manila * (pax1) + cost.RoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundB_Manila * (pax1) + cost.RoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       // double pax = Double.parseDouble(jlblPax.getText());
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundP_Manila * (pax1) + cost.RoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundP_Manila * (pax1) + cost.RoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundP_Manila * (pax1) + cost.RoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundP_Manila * (pax1) + cost.RoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundSK_Manila * (pax1) + cost.RoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundSK_Manila * (pax1) + cost.RoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundSK_Manila * (pax1) + cost.RoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundSK_Manila * (pax1) + cost.RoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundJP_Manila * (pax1) + cost.RoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected() && (jcNo.isSelected()))
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundJP_Manila * (pax1) + cost.RoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundJP_Manila * (pax1) + cost.RoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundJP_Manila * (pax1) + cost.RoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected() && (jcYes.isSelected()))
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundVN_Manila * (pax1) + cost.RoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundVN_Manila * (pax1) + cost.RoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }

   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected() && (jcYes.isSelected())) 
   {
       insur = Gross = cost.Rins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);


       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);


       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundVN_Manila * (pax1) + cost.RoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
   if ((jrbRound.isSelected() == true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected() && (jcNo.isSelected())) 
   {
       tax = Gross = cost.RTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       jlblInsur.setText("0");

       bag = Gross = cost.RBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);


       fee = Gross = cost.RFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);


       subtotal = Gross = cost.RoundVN_Manila * (pax1) + cost.RoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);


       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
   }
        
        //---------------------PRIVATE------------------------
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
       
       insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundB_Manila * (pax1) + cost.PRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbPrivate.isSelected() && (jcNo.isSelected())) 
        {
            
       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundB_Manila * (pax1) + cost.PRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundB_Manila * (pax1) + cost.PRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected()))
        {
            tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundB_Manila * (pax1) + cost.PRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundP_Manila * (pax1) + cost.PRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundP_Manila * (pax1) + cost.PRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundP_Manila * (pax1) + cost.PRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected())) 
        {
             tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundP_Manila * (pax1) + cost.PRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);  
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundSK_Manila * (pax1) + cost.PRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
         if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
         {
           tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundSK_Manila * (pax1) + cost.PRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);   
         }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundSK_Manila * (pax1) + cost.PRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundSK_Manila * (pax1) + cost.PRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundJP_Manila * (pax1) + cost.PRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected() && (jcNo.isSelected()))   
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundJP_Manila * (pax1) + cost.PRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);      
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundJP_Manila * (pax1) + cost.PRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))   
        {
       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundJP_Manila * (pax1) + cost.PRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundVN_Manila * (pax1) + cost.PRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected()&& (jcNo.isSelected()))
        {
           tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundVN_Manila * (pax1) + cost.PRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected() && (jcYes.isSelected()))   
        {
          insur = Gross = cost.Pins * pax;
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundVN_Manila * (pax1) + cost.PRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.PTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.PBag * pax;
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.PRoundVN_Manila * (pax1) + cost.PRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        //---------------------BUSINESS------------------------
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
       
       insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundB_Manila * (pax1) + cost.BRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbBusiness.isSelected() && (jcNo.isSelected())) 
        {
            
       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundB_Manila * (pax1) + cost.BRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundB_Manila * (pax1) + cost.BRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected()))
        {
            tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundB_Manila * (pax1) + cost.BRoundB_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundP_Manila * (pax1) + cost.BRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundP_Manila * (pax1) + cost.BRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundP_Manila * (pax1) + cost.BRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected())) 
        {
             tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundP_Manila * (pax1) + cost.BRoundP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);  
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundSK_Manila * (pax1) + cost.BRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
         if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
         {
           tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundSK_Manila * (pax1) + cost.BRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);   
         }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
            insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundSK_Manila * (pax1) + cost.BRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundSK_Manila * (pax1) + cost.BRoundSK_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundJP_Manila * (pax1) + cost.BRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected() && (jcNo.isSelected()))   
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundJP_Manila * (pax1) + cost.BRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);      
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundJP_Manila * (pax1) + cost.BRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))   
        {
       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundJP_Manila * (pax1) + cost.BRoundJP_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected()&& (jcYes.isSelected()))   
        {
           insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundVN_Manila * (pax1) + cost.BRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected()&& (jcNo.isSelected()))
        {
           tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundVN_Manila * (pax1) + cost.BRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);        
        }
        
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected() && (jcYes.isSelected()))   
        {
          insur = Gross = cost.Bins * (pax1) + cost.Bins * (pax2 * 0.8);
       String Cost4 = String.format("%.2f", Gross);
       jlblInsur.setText(Cost4);

       tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundVN_Manila * (pax1) + cost.BRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + insur + subtotal);
       jlblTotal.setText(iTotal);
       jtDue.setText(iTotal);
        }
        if ((jrbRound.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected() && (jcNo.isSelected()))  
        {
          tax = Gross = cost.BTax * pax1;
       String Cost3 = String.format("%.2f", Gross);
       jlblTax.setText(Cost3);

      jlblInsur.setText("0");

       bag = Gross = cost.BBag * (pax1) + cost.BBag * (pax2 * 0.8);
       String Cost1 = String.format("%.2f", Gross);
       jlblBag.setText(Cost1);

       fee = Gross = cost.PBFee * pax;
       String Cost2 = String.format("%.2f", Gross);
       jlblFee.setText(Cost2);

       subtotal = Gross = cost.BRoundVN_Manila * (pax1) + cost.BRoundVN_Manila * (pax2 * 0.8);
       String Cost = String.format("%.2f", Gross);
       jlblSubTotal.setText(Cost);

       String iTotal = String.format("%.2f", tax + bag + fee + subtotal);
       jlblTotal.setText(iTotal);   
       jtDue.setText(iTotal);    
        }

    }//GEN-LAST:event_jbtnTotalActionPerformed

    private void jbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceiptActionPerformed
     Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat ("HH:mm:ss");
        String iTime = (tTime.format(timer.getTime()));

        SimpleDateFormat Tdate = new SimpleDateFormat ("dd-MM-yyyy");
        String iDate = (Tdate.format(timer.getTime()));

        int num1;
        String ref ="";
        num1 = 1325 + (int) (Math.random()*4238);
        ref += num1 + 1325;
        //================
        String NameAge = (jtNameAge.getText());
        //String Age = (jtNameAge.getText());
        String rPax = (jlblPax.getText());
        String rDest = jcmbDestination.getSelectedItem().toString();
        String rType = (jlblA.getText());
        String rTrip = (jlblD.getText());
        String rTax = (jlblTax.getText());
        String rBag = (jlblBag.getText());
        String rFee = (jlblFee.getText());
        String rIns = (jlblInsur.getText());
        String rSubTotal = (jlblSubTotal.getText());
        String rTotal = (jlblTotal.getText());
        String rPay = (jtPay.getText());
        String rChange = (jlblChange.getText());
        

        jtReceipt.append("MERC AIRLINES RECEIPT:\n\n"
            +"Ref:\t" + ref
            +"\n---------------------------\n"
            + NameAge
            //+"\nAge:\t\t" + Age
            +"---------------------------"
            +"\nPassenger/s:\t" + rPax
            +"\nFlight:\t" + rDest
            +"\nCabin Class:\t" + rType
            +"\nTicket Type:\t" + rTrip    
            +"\nTax:\t" + rTax
            +"\nBag:\t" + rBag  
            +"\nAddFee:\t" + rFee
            +"\nInsurance:\t" + rIns
            +"\nSub Total:\t" + rSubTotal
            +"\nTotal:\t" + rTotal
            +"\nPaid Amount:\t" + rPay
            +"\nChange:\t" + rChange  
            +"\n---------------------------"
            +"\nDate:\t"+ iDate 
            +"\nTime:\t" + iTime
            +"\n\nThank You For Choosing \nMerc Airlines Ticketing System\n\n"
        );
    }

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
         cQuit cExit = new cQuit();
        cExit.quit();
    }
    
    private void jrbRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRegularActionPerformed
        if (jrbRegular.isSelected()== true)
        {
            jcmbDestination.setEnabled(true);
            jrbPrivate.setSelected(false);
            jrbBusiness.setSelected(false);
            jlblPrivate.setText("0");
            jlblBusiness.setText("0");
            jlblSingle.setText("0");
            jlblRound.setText("0");
            jlblA.setText("Regular");
            jcmbDestination.setSelectedItem("None");
            jlblMPax.setText("Maximum of 48 Passengers");
            
        }
         if (jrbRegular.isSelected()== false)
        {
            jcmbDestination.setSelectedItem("None");
            jcmbDestination.setEnabled(false);
            jlblRegular.setText("0");
            jlblA.setText(null);
            jlblMPax.setText(null);
        }
    }
    
    private void jrbPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPrivateActionPerformed
    if (jrbPrivate.isSelected()== true)
        {
            jcmbDestination.setEnabled(true);
            jrbRegular.setSelected(false);
            jrbBusiness.setSelected(false);
            jlblRegular.setText("0");
            jlblBusiness.setText("0");
            jlblSingle.setText("0");
            jlblRound.setText("0");
            jlblA.setText("Private");
            jcmbDestination.setSelectedItem("None");
            jlblMPax.setText("Maximum of 14 Passengers");
            
        }
         if (jrbPrivate.isSelected()== false)
        {
            jcmbDestination.setSelectedItem("None");
            jcmbDestination.setEnabled(false);
            jlblPrivate.setText("0");
            jlblA.setText(null);
            jlblMPax.setText(null);
        }        
    }

    private void jrbBusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBusinessActionPerformed
        if (jrbBusiness.isSelected()== true)
        {
            jcmbDestination.setEnabled(true);
            jrbRegular.setSelected(false);
            jrbPrivate.setSelected(false);
            jlblRegular.setText("0");
            jlblPrivate.setText("0");
            jlblSingle.setText("0");
            jlblRound.setText("0");
            jlblA.setText("Business");
            jcmbDestination.setSelectedItem("None");
            jlblMPax.setText("Maximum of 23 Passengers");
            
        }
         if (jrbBusiness.isSelected()== false)
        {
            jcmbDestination.setSelectedItem("None");
            jcmbDestination.setEnabled(false);
            jlblPrivate.setText("0");
            jlblA.setText(null);
            jlblMPax.setText(null);
        }   
    }//GEN-LAST:event_jrbBusinessActionPerformed

    private void jcmbDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbDestinationActionPerformed
              
         if ((jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbRegular.isSelected())
        {
          Gross = cost.Manila_B; 
          String Cost = String.format("%.2f",Gross );
          //String Cost = String.format("%.2f",cost.Canada_T);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
         // jrbSingle.setSelected(true);
        }
        
         if ((jcmbDestination.getSelectedItem().equals("Batanes – Manila"))&& jrbRegular.isSelected())
        {
          Gross = cost.B_Manila;
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.Canada_O);  
          jlblRegular.setText(Cost);
         // jlblSingle.setText(Cost);
         // jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila – Palawan"))&& jrbRegular.isSelected())
        {
          Gross = cost.Manila_P;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Norway);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Palawan – Manila"))&& jrbRegular.isSelected())
        {
          Gross = cost.P_Manila;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Nigeria);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila - South Korea"))&& jrbRegular.isSelected())
        {
          Gross = cost.Manila_SK;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
       //   jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("South Korea – Manila"))&& jrbRegular.isSelected())
        {
          Gross = cost.SK_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
          if ((jcmbDestination.getSelectedItem().equals("Manila – Japan"))&& jrbRegular.isSelected())
        {
          Gross = cost.Manila_JP;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
          
           if ((jcmbDestination.getSelectedItem().equals("Japan – Manila"))&& jrbRegular.isSelected())
        {
          Gross = cost.JP_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
       //   jrbSingle.setSelected(true);
        }
           
            if ((jcmbDestination.getSelectedItem().equals("Manila – Vietnam"))&& jrbRegular.isSelected())
        {
          Gross = cost.Manila_VN;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
            
              if ((jcmbDestination.getSelectedItem().equals("Vietnam – Manila"))&& jrbRegular.isSelected())
        {
          Gross = cost.VN_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblRegular.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         //===============PRIVATE=================
        if ((jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PManila_B; 
          String Cost = String.format("%.2f",Gross );
          //String Cost = String.format("%.2f",cost.Canada_T);  
          jlblPrivate.setText(Cost);
       //   jlblSingle.setText(Cost);
       //   jrbSingle.setSelected(true);
        }
        
         if ((jcmbDestination.getSelectedItem().equals("Batanes – Manila"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PB_Manila;
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.Canada_O);  
          jlblPrivate.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila – Palawan"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PManila_P;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Norway);  
          jlblPrivate.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Palawan – Manila"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PP_Manila;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Nigeria);  
          jlblPrivate.setText(Cost);
        //  jlblSingle.setText(Cost);
       //   jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila - South Korea"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PManila_SK;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
       //   jlblSingle.setText(Cost);
       //   jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("South Korea – Manila"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PSK_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
       //   jlblSingle.setText(Cost);
      //    jrbSingle.setSelected(true);
        }
         
          if ((jcmbDestination.getSelectedItem().equals("Manila – Japan"))&& jrbPrivate.isSelected())
        {
          Gross = cost.Manila_JP;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
       //   jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
          
           if ((jcmbDestination.getSelectedItem().equals("Japan – Manila"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PJP_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
           
            if ((jcmbDestination.getSelectedItem().equals("Manila – Vietnam"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PManila_VN;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
         // jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
            
              if ((jcmbDestination.getSelectedItem().equals("Vietnam – Manila"))&& jrbPrivate.isSelected())
        {
          Gross = cost.PVN_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblPrivate.setText(Cost);
        // jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
               //===============BUSINESS=================
        if ((jcmbDestination.getSelectedItem().equals("Manila – Batanes"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BManila_B; 
          String Cost = String.format("%.2f",Gross );
          //String Cost = String.format("%.2f",cost.Canada_T);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
        
         if ((jcmbDestination.getSelectedItem().equals("Batanes – Manila"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BB_Manila;
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.Canada_O);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila – Palawan"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BManila_P;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Norway);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Palawan – Manila"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BP_Manila;
          String Cost = String.format("%.2f",Gross );  
          //String Cost = String.format("%.2f",cost.Nigeria);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
         // jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("Manila - South Korea"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BManila_SK;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
         if ((jcmbDestination.getSelectedItem().equals("South Korea – Manila"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BSK_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
        //  jlblSingle.setText(Cost);
        //  jrbSingle.setSelected(true);
        }
         
          if ((jcmbDestination.getSelectedItem().equals("Manila – Japan"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BManila_JP;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
         // jlblSingle.setText(Cost);
         // jrbSingle.setSelected(true);
        }
          
           if ((jcmbDestination.getSelectedItem().equals("Japan – Manila"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BJP_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
          //jlblSingle.setText(Cost);
          //jrbSingle.setSelected(true);
        }
           
            if ((jcmbDestination.getSelectedItem().equals("Manila – Vietnam"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BManila_VN;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
          //jlblSingle.setText(Cost);
          //jrbSingle.setSelected(true);
        }
            
              if ((jcmbDestination.getSelectedItem().equals("Vietnam – Manila"))&& jrbBusiness.isSelected())
        {
          Gross = cost.BVN_Manila;  
          String Cost = String.format("%.2f",Gross ); 
          //String Cost = String.format("%.2f",cost.USA_A);  
          jlblBusiness.setText(Cost);
         // jlblSingle.setText(Cost);
          //jrbSingle.setSelected(true);
        }
    }//GEN-LAST:event_jcmbDestinationActionPerformed

    private void jrbSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSingleActionPerformed
     jcNo.setSelected(true);
     jcYes.setSelected(false);
        jlblD.setText("One Way");
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbRegular.isSelected())   
        {
            Gross = cost.Manila_B;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.B_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbRegular.isSelected())   
        {
            Gross = cost.Manila_P;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.P_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbRegular.isSelected())   
        {
            Gross = cost.Manila_SK;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.SK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbRegular.isSelected())   
        {
            Gross = cost.Manila_JP;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.JP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbRegular.isSelected())   
        {
            Gross = cost.Manila_VN;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbRegular.isSelected())   
        {
            Gross = cost.VN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        //---------------------PRIVATE------------------------
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PManila_B;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PB_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PManila_P;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PManila_SK;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PManila_JP;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PJP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PManila_VN;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbPrivate.isSelected())   
        {
            Gross = cost.PVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        //---------------------BUSINESS------------------------
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Batanes")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BManila_B;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Batanes – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BB_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Palawan")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BManila_P;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Palawan – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila - South Korea")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BManila_SK;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("South Korea – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BSK_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Japan")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BManila_JP;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Japan – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BJP_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Manila – Vietnam")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BManila_VN;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }
        
        if ((jrbSingle.isSelected()==true) && (jcmbDestination.getSelectedItem().equals("Vietnam – Manila")) && jrbBusiness.isSelected())   
        {
            Gross = cost.BVN_Manila;
            String Cost = String.format("%.2f", Gross);
            jlblSingle.setText(Cost);
            jrbRound.setSelected(false);
            jlblRound.setText("0");
        }

        if (jrbSingle.isSelected()==false)
        {
            jlblSingle.setText("0");
            jlblD.setText(null);
        }
    }//GEN-LAST:event_jrbSingleActionPerformed

    private void jcYesActionPerformed(java.awt.event.ActionEvent evt) {
       
        if ((jcYes.isSelected()==true) && jrbRegular.isSelected())   
        {
            Gross = cost.Rins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);   
            jcNo.setSelected(false);
        }
        
        if ((jcYes.isSelected()==true) && jrbPrivate.isSelected())   
        {
            Gross = cost.Pins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);   
             jcNo.setSelected(false);
        }
        
         if ((jcYes.isSelected()==true) && jrbBusiness.isSelected())   
        {
            Gross = cost.Bins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);
             jcNo.setSelected(false);
           
        } 
        if (jcYes.isSelected()==false)
        {
            jcNo.setSelected(true);
            jlblTinsur.setText("0");
        }
    }

    private void jcNoActionPerformed(java.awt.event.ActionEvent evt) {
       if ((jcNo.isSelected()==true))
        {
            jlblTinsur.setText("0");  
            jcYes.setSelected(false);
        }
        if ((jcNo.isSelected()==false) && jrbRegular.isSelected())
        {
            Gross = cost.Rins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);   
            jcYes.setSelected(true);
        }
        if ((jcNo.isSelected()==false) && jrbPrivate.isSelected())
        {
            Gross = cost.Pins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);   
            jcYes.setSelected(true);
        }
        if ((jcNo.isSelected()==false) && jrbBusiness.isSelected())
        {
            Gross = cost.Bins;
            String Cost = String.format("%.2f", Gross);
            jlblTinsur.setText(Cost);   
            jcYes.setSelected(true);
        }
        
    }

    private void jbtnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmActionPerformed
     try {
        if (jtAdult.getText().equals("0") && jtSenior.getText().equals("0")) {
            jtChild.setEnabled(false);
            jbtnTotal.setEnabled(false);
            jtName.setEnabled(false);
            jtAge.setEnabled(false);
            jbtnAddName.setEnabled(false);
            jbtnReceipt.setEnabled(false);
            
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen");
             
            
        }
        else {
            jtChild.setEnabled(true);
            jbtnTotal.setEnabled(true);
            jtName.setEnabled(true);
            jtAge.setEnabled(true);
            jbtnAddName.setEnabled(true);
            jbtnReceipt.setEnabled(true);
        }
        DecimalFormat numberFormat = new DecimalFormat("#");
        double adult, senior, child, total, total1, total2;
        adult = Double.parseDouble(jtAdult.getText());
        senior = Double.parseDouble(jtSenior.getText());
        child = Double.parseDouble(jtChild.getText());
        total = adult + senior + child;
        total1 = adult + child;
        total2 = senior;
        
        if ((total <=14) && jrbPrivate.isSelected()) {
            String paxx = String.valueOf(numberFormat.format(total));
            jlblPax.setText(paxx);
            String paxx1 = String.valueOf(numberFormat.format(total1));
            jlblPax1.setText(paxx1);
            String paxx2 = String.valueOf(numberFormat.format(total2));
            jlblPax2.setText(paxx2);
        
        }
        else if  ((total <= 23) && jrbBusiness.isSelected())  {
           String paxx = String.valueOf(numberFormat.format(total));
            jlblPax.setText(paxx);
            String paxx1 = String.valueOf(numberFormat.format(total1));
            jlblPax1.setText(paxx1);
            String paxx2 = String.valueOf(numberFormat.format(total2));
            jlblPax2.setText(paxx2);
        }
        else if  ((total <= 48) && jrbRegular.isSelected())  {
            String paxx = String.valueOf(numberFormat.format(total));
            jlblPax.setText(paxx); 
            String paxx1 = String.valueOf(numberFormat.format(total1));
            jlblPax1.setText(paxx1);
            String paxx2 = String.valueOf(numberFormat.format(total2));
            jlblPax2.setText(paxx2);
        }
        else {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Sorry! You have exceeded the number of passengers required");
            jtAdult.setText(null);
            jtSenior.setText(null);
            jtChild.setText(null);  
            jlblPax.setText(null);
            jlblPax1.setText(null);
            jlblPax2.setText(null);
        }
     }
     catch (NumberFormatException exp) 
     {
         JOptionPane.showMessageDialog(null, "Input Necessary Details");
     }
     
    }

    private void jbtnAddNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddNameActionPerformed
         
        
        try{
           
       int age = Integer.parseInt(jtAge.getText());
         
        if  ((age <= 150))   {
            String Name = (jtName.getText());
            String Age = (jtAge.getText());  
            jtNameAge.append(
             "Name:\t" + Name
            +"\nAge:\t" + Age
            +"\n"   
        );
            
        }
        
        else {
                
            jlblTPax.setText("#");
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Invalid Age!");
                       
        }  
        }
       catch (NumberFormatException exp) 
     {
         JOptionPane.showMessageDialog(null, "Input Necessary Details");
     }  
        int counts = Integer.parseInt(jlblPax.getText());
        count++;
        if ((count <= counts)) {
        jlblTPax.setText("Pax Added: " + count);
        }
        else {
            count = 0;
            jtNameAge.setText(null);
             jlblTPax.setText("#");
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Sorry! You have exceeded the number of passengers required");    
        }        
        
    }

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
      try {        
        
        double due;
        double pay;
        double change;
        
        pay = Double.parseDouble(jtPay.getText().toString());
        due = Double.parseDouble(jtDue.getText().toString());
        
        change = pay - due;
        if ((pay >= due)) {

            String ch = String.format("%.2f",change );
            jlblChange.setText(ch);
        }
        else {
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Insufficient Amount");
        }
        
 }
catch (NumberFormatException exp) 
     {
         JOptionPane.showMessageDialog(null, "Invalid Amount");
     }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           
                new MercTicket().setVisible(true);   
                
    }

    
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAddName;
    private javax.swing.JButton jbtnConfirm;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnReceipt;
    private javax.swing.JButton jbtnTotal;
    private javax.swing.JCheckBox jcNo;
    private javax.swing.JCheckBox jcYes;
    private javax.swing.JComboBox<String> jcmbDestination;
    private javax.swing.JLabel jlblA;
    private javax.swing.JLabel jlblBag;
    private javax.swing.JLabel jlblBusiness;
    private javax.swing.JLabel jlblChange;
    private javax.swing.JLabel jlblD;
    private javax.swing.JLabel jlblFee;
    private javax.swing.JLabel jlblInsur;
    private javax.swing.JLabel jlblMPax;
    private javax.swing.JLabel jlblPax;
    private javax.swing.JLabel jlblPax1;
    private javax.swing.JLabel jlblPax2;
    private javax.swing.JLabel jlblPrivate;
    private javax.swing.JLabel jlblRegular;
    private javax.swing.JLabel jlblRound;
    private javax.swing.JLabel jlblSingle;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblTPax;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTinsur;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JRadioButton jrbBusiness;
    private javax.swing.JRadioButton jrbPrivate;
    private javax.swing.JRadioButton jrbRegular;
    private javax.swing.JRadioButton jrbRound;
    private javax.swing.JRadioButton jrbSingle;
    private javax.swing.JTextField jtAdult;
    private javax.swing.JTextField jtAge;
    private javax.swing.JTextField jtChild;
    private javax.swing.JTextField jtDue;
    private javax.swing.JTextField jtName;
    private javax.swing.JTextArea jtNameAge;
    private javax.swing.JTextField jtPay;
    private javax.swing.JTextArea jtReceipt;
    private javax.swing.JTextField jtSenior;
}
