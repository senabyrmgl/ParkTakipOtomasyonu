
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Customer extends javax.swing.JFrame {

    DbConnection dbHelper =new DbConnection(); 
    Connection connection=null; 
    int index=0; 
    
    public Customer() {
        
        initComponents();
        fillcustomertable(); 
        setLocation(300, 200);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        customer_name_field = new javax.swing.JTextField();
        customer_name_label = new javax.swing.JLabel();
        customer_surname_field = new javax.swing.JTextField();
        customer_surname_label = new javax.swing.JLabel();
        customer_phone_field = new javax.swing.JTextField();
        customer_phone_label = new javax.swing.JLabel();
        customer_plate_field = new javax.swing.JTextField();
        customer_plate_label = new javax.swing.JLabel();
        customer_info_label = new javax.swing.JLabel();
        update_customer_button = new javax.swing.JButton();
        customer_return_button = new javax.swing.JButton();
        customer_search_field = new javax.swing.JTextField();
        customer_combo_box = new javax.swing.JComboBox<>();
        customer_searchinfo_label = new javax.swing.JLabel();
        customer_title_label = new javax.swing.JLabel();
        delete_customer_button = new javax.swing.JButton();
        customer_vehicle_type_label = new javax.swing.JLabel();
        customer_vehicle_type_field = new javax.swing.JTextField();
        customer_vehicle_model_label = new javax.swing.JLabel();
        customer_vehicle_color_label = new javax.swing.JLabel();
        customer_vehicle_model_field = new javax.swing.JTextField();
        customer_vehicle_color_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "İsim", "Soyisim", "Telefon", "Plaka no", "Taşıt Tipi", "Taşıt Modeli", "Taşıt Rengi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customer_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customer_table);
        if (customer_table.getColumnModel().getColumnCount() > 0) {
            customer_table.getColumnModel().getColumn(0).setResizable(false);
            customer_table.getColumnModel().getColumn(1).setResizable(false);
            customer_table.getColumnModel().getColumn(2).setResizable(false);
            customer_table.getColumnModel().getColumn(3).setResizable(false);
            customer_table.getColumnModel().getColumn(4).setResizable(false);
            customer_table.getColumnModel().getColumn(5).setResizable(false);
            customer_table.getColumnModel().getColumn(6).setResizable(false);
        }

        customer_name_label.setText("İsim:");

        customer_surname_label.setText("Soyisim:");

        customer_phone_label.setText("Telefon:");

        customer_plate_field.setEditable(false);
        customer_plate_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_plate_fieldActionPerformed(evt);
            }
        });

        customer_plate_label.setText("Plaka no:");

        update_customer_button.setText("Güncelle");
        update_customer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_customer_buttonActionPerformed(evt);
            }
        });

        customer_return_button.setText("Geri dön");
        customer_return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_return_buttonActionPerformed(evt);
            }
        });

        customer_search_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customer_search_fieldKeyReleased(evt);
            }
        });

        customer_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İsim", "Soyisim", "Telefon", "Plaka", "Taşıt Tipi", "Taşıt Modeli", "Taşıt Rengi" }));
        customer_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_combo_boxActionPerformed(evt);
            }
        });

        customer_searchinfo_label.setText("Arama bilgisine göre");

        customer_title_label.setText("Müşteri Bilgileri");

        delete_customer_button.setText("Sil");
        delete_customer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_customer_buttonActionPerformed(evt);
            }
        });

        customer_vehicle_type_label.setText("Taşıt Tipi:");

        customer_vehicle_model_label.setText("Taşıt Modeli:");

        customer_vehicle_color_label.setText("Taşıt Rengi:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(customer_title_label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(customer_phone_label)
                                    .addGap(14, 14, 14))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(customer_name_label)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customer_surname_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update_customer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(delete_customer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(customer_phone_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(customer_surname_field, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customer_name_field, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(customer_plate_label)
                                        .addGap(13, 13, 13)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 9, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customer_vehicle_type_label)
                                            .addComponent(customer_vehicle_model_label)
                                            .addComponent(customer_vehicle_color_label, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(customer_vehicle_model_field, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(customer_vehicle_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(customer_vehicle_color_field, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addComponent(customer_info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customer_plate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(customer_searchinfo_label)
                        .addGap(13, 13, 13)
                        .addComponent(customer_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(customer_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(customer_return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customer_title_label)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_name_label)
                            .addComponent(customer_vehicle_type_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_vehicle_type_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_surname_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_surname_label)
                            .addComponent(customer_vehicle_model_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_vehicle_model_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customer_phone_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(customer_phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customer_vehicle_color_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customer_vehicle_color_label)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_plate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_plate_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customer_info_label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_searchinfo_label))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_customer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_customer_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(customer_return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void customer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_tableMouseClicked
           
            DefaultTableModel tblmodel = (DefaultTableModel) customer_table.getModel();
            String ownername =tblmodel.getValueAt(customer_table.getSelectedRow(),0).toString();
            String ownersurname =tblmodel.getValueAt(customer_table.getSelectedRow(),1).toString();
            String phone =tblmodel.getValueAt(customer_table.getSelectedRow(),2).toString();
            String plateno =tblmodel.getValueAt(customer_table.getSelectedRow(),3).toString();
            String vehicletype =tblmodel.getValueAt(customer_table.getSelectedRow(),4).toString();
            String vehiclemodel =tblmodel.getValueAt(customer_table.getSelectedRow(),5).toString();
            String vehiclecolor =tblmodel.getValueAt(customer_table.getSelectedRow(),6).toString();
           
            this.customer_name_field.setText(ownername);
            this.customer_surname_field.setText(ownersurname);
            this.customer_phone_field.setText(phone);
            this.customer_plate_field.setText(plateno);
            this.customer_vehicle_type_field.setText(vehicletype);
            this.customer_vehicle_model_field.setText(vehiclemodel);
            this.customer_vehicle_color_field.setText(vehiclecolor);
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_tableMouseClicked
   
    private void customer_return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_return_buttonActionPerformed
        this.setVisible(false);
        MainPage mainPage= new MainPage();
        mainPage.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_return_buttonActionPerformed
  
    private void update_customer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_customer_buttonActionPerformed
       
        PreparedStatement statement=null;
    
        try {
             connection = dbHelper.getConnection(); 
             String sql="update vehicle set ownername=?,ownersurname=?,phone=?,vehicletype=?,vehiclemodel=?,vehiclecolor=? where plate=?"; //Sql cümleciği veri tabanında işlemin yapılması için. 
             statement=connection.prepareStatement(sql);
             statement.setString(1, customer_name_field.getText());         
             statement.setString(2, customer_surname_field.getText()); 
             statement.setString(3, customer_phone_field.getText());  
             statement.setString(4, customer_vehicle_type_field.getText()); 
             statement.setString(5, customer_vehicle_model_field.getText()); 
             statement.setString(6, customer_vehicle_color_field.getText()); 
             statement.setString(7, customer_plate_field.getText()); 
          
             statement.executeUpdate();
             JOptionPane.showMessageDialog(this,"Veri Güncellendi" ,"Başarılı",WIDTH); 
             fillcustomertable(); 
        }catch(SQLException exception){
                dbHelper.showErrorMessage(exception); 
        }
        finally { 
            try {
                statement.close(); 
                connection.close();
            } catch (SQLException ex) {
               
            }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_update_customer_buttonActionPerformed
    
    private void customer_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_combo_boxActionPerformed
        DefaultTableModel tblmodel = (DefaultTableModel) customer_table.getModel(); 
        
        String selectedvalue = customer_combo_box.getSelectedItem().toString();
         if(selectedvalue.equals("İsim")){        
               index=0;
         }
         else if(selectedvalue.equals("Soyisim")){
             index=1;
         }
         else if (selectedvalue.equals("Telefon")){ 
             index=2;
         }
         else if(selectedvalue.equals("Plaka")){ 
             index=3;        
         }
         else if(selectedvalue.equals("Taşıt Tipi")){
             index=4;
                   
         }
         else if(selectedvalue.equals("Taşıt Modeli")){
             index=5;
         }
         else if(selectedvalue.equals("Taşıt Rengi")){
             index=6;
         }
        
// TODO add your handling code here:
    }//GEN-LAST:event_customer_combo_boxActionPerformed

    private void customer_search_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customer_search_fieldKeyReleased
            String searchKey= customer_search_field.getText(); 
            DefaultTableModel tblmodel = (DefaultTableModel) customer_table.getModel();
            TableRowSorter<DefaultTableModel> tblRowSorter= new TableRowSorter<>(tblmodel);
            customer_table.setRowSorter(tblRowSorter); 
            tblRowSorter.setRowFilter(RowFilter.regexFilter(searchKey,index)); 
            
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_search_fieldKeyReleased
    
    private void delete_customer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_customer_buttonActionPerformed
             PreparedStatement statement=null;
        
        try {
             connection = dbHelper.getConnection();
             String sql="delete from vehicle where plate=?"; 
           
             statement=connection.prepareStatement(sql);
             statement.setString(1, customer_plate_field.getText());
             statement.executeUpdate(); 
             fillcustomertable();       
             JOptionPane.showMessageDialog(this,customer_plate_field.getText()+" Plakalı Araç Sahibi Silindi" ,"Başarılı Silme",WIDTH); 
        }catch(SQLException exception){
                dbHelper.showErrorMessage(exception);
        }
        finally { 
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                dbHelper.showErrorMessage(ex);
            }
         }        // TODO add your handling code here:
    }//GEN-LAST:event_delete_customer_buttonActionPerformed

    private void customer_plate_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_plate_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customer_plate_fieldActionPerformed
    
    public void fillcustomertable(){
        DefaultTableModel model = (DefaultTableModel) customer_table.getModel(); 
        model.setRowCount(0); 
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = dbHelper.getConnection();  
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select ownername,ownersurname,phone,plate,vehicletype,vehiclemodel,vehiclecolor from vehicle");
            while (resultSet.next()) {
                Object[] added = {resultSet.getString("ownername"),resultSet.getString("ownersurname"),resultSet.getString("phone"),resultSet.getString("plate"),resultSet.getString("vehicletype"),resultSet.getString("vehiclemodel"),resultSet.getString("vehiclecolor")};
                model.addRow(added);  
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException ex) {
                dbHelper.showErrorMessage(ex);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> customer_combo_box;
    private javax.swing.JLabel customer_info_label;
    private javax.swing.JTextField customer_name_field;
    private javax.swing.JLabel customer_name_label;
    private javax.swing.JTextField customer_phone_field;
    private javax.swing.JLabel customer_phone_label;
    private javax.swing.JTextField customer_plate_field;
    private javax.swing.JLabel customer_plate_label;
    private javax.swing.JButton customer_return_button;
    private javax.swing.JTextField customer_search_field;
    private javax.swing.JLabel customer_searchinfo_label;
    private javax.swing.JTextField customer_surname_field;
    private javax.swing.JLabel customer_surname_label;
    private javax.swing.JTable customer_table;
    private javax.swing.JLabel customer_title_label;
    private javax.swing.JTextField customer_vehicle_color_field;
    private javax.swing.JLabel customer_vehicle_color_label;
    private javax.swing.JTextField customer_vehicle_model_field;
    private javax.swing.JLabel customer_vehicle_model_label;
    private javax.swing.JTextField customer_vehicle_type_field;
    private javax.swing.JLabel customer_vehicle_type_label;
    private javax.swing.JButton delete_customer_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update_customer_button;
    // End of variables declaration//GEN-END:variables
}
