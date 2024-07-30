/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package goodread.library;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.*;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class newPatron extends javax.swing.JFrame {

    /**
     * Creates new form newPatron
     */
    public newPatron() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        contactNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        AccCreateButton = new javax.swing.JButton();
        userID = new JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookTitle = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 235, 240));
        jPanel1.setMinimumSize(new java.awt.Dimension(1410, 732));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(68, 68, 100));
        jLabel22.setText("Add New Patrons");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 26, 36));
        jLabel1.setText("First Name :");

        FirstName.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 26, 36));
        jLabel2.setText("Last Name :");

        LastName.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 26, 36));
        jLabel4.setText("Email :");

        email.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        email.setText("username@gmail.com");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        contactNum.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        contactNum.setText("03XX-XXXXXXX");
        contactNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactNumFocusLost(evt);
            }
        });
        contactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 26, 36));
        jLabel5.setText("Contact no:");

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(26, 26, 36));
        jLabel8.setText("City :");

        City.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        City.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CityFocusLost(evt);
            }
        });
        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(26, 26, 36));
        jLabel9.setText("Address :");

        address.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        AccCreateButton.setBackground(new java.awt.Color(211, 211, 228));
        AccCreateButton.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        AccCreateButton.setForeground(new java.awt.Color(61, 61, 86));
        AccCreateButton.setText("Save Changes");
        AccCreateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(89, 89, 117), new java.awt.Color(204, 204, 255)));
        AccCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccCreateButtonActionPerformed(evt);
            }
        });

        userID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userID.setForeground(new java.awt.Color(26, 26, 36));
        userID.setText("User ID :");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(26, 26, 36));
        jLabel21.setText("User ID :");

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel3.setText("Book Title:");

        bookTitle.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        bookTitle.setMaximumRowCount(50);
        bookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitleActionPerformed(evt);
            }
        });

        bookInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookInfoActionPerformed(evt);
            }
        });
        jScrollPane1.setViewportView(bookInfo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(135, 135, 135)
                        .addComponent(userID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(City)
                            .addComponent(contactNum)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(LastName)
                            .addComponent(FirstName)
                            .addComponent(address)
                            .addComponent(bookTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)
                        .addComponent(AccCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1093, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(userID))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(jLabel22)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if (email.getText().equals("username@gmail.com")) {
            email.setText("");// TODO add your handling code here:
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (!emailValidator(email.getText())) {
            if (email.getText().equals("")) {
                email.setText("username@gmail.com");// TODO add your handling code here:
            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid email!");
            }
        }
    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void contactNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNumFocusGained
        if (contactNum.getText().equals("03XX-XXXXXXX")) {
            contactNum.setText("");
        }
    }//GEN-LAST:event_contactNumFocusGained

    private void contactNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNumFocusLost

        if (!numberValidator(contactNum.getText())) {
            if (contactNum.getText().equals("")) {
                contactNum.setText("03XX-XXXXXXX");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid contact number of format 03XX-XXXXXXX!");
            }
        }
    }//GEN-LAST:event_contactNumFocusLost

    private void contactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumActionPerformed

    }//GEN-LAST:event_contactNumActionPerformed

    private void CityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFocusGained

    private void CityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_CityFocusLost

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFocusLost

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void AccCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccCreateButtonActionPerformed
        String URL = "jdbc:mysql://localhost:3306/GoodRead";
        String Username = "root";
        String Password = "Radhika1@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connect = DriverManager.getConnection(URL, Username, Password);

            if (FirstName.getText().equals("") || LastName.getText().equals("") || email.getText().equals("username@gmail.com") || contactNum.getText().equals("03XX-XXXXXXX") || City.getText().equals("") || address.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter data into empty field(s)");
            } else if (!emailValidator(email.getText()) || !numberValidator(contactNum.getText())) {
                if (!emailValidator(email.getText())) {
                    email.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                if (!numberValidator(contactNum.getText())) {
                    contactNum.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            } else {
                // Check if the book is available
                String BookTitle = bookTitle.getSelectedItem().toString();
                int bookQuantity = 0;
                String checkBookQuery = "SELECT NumberOfBooks FROM Books WHERE BookTitle = ?";
                try (PreparedStatement checkBookStmt = connect.prepareStatement(checkBookQuery)) {
                    checkBookStmt.setString(1, BookTitle);
                    try (ResultSet rs = checkBookStmt.executeQuery()) {
                        if (rs.next()) {
                            bookQuantity = rs.getInt("NumberOfBooks");
                        }
                    }
                }

                if (bookQuantity <= 0) {
                    JOptionPane.showMessageDialog(this, "Book is not available.");
                    return;
                }

                // Decrease book quantity
                String updateBookQuery = "UPDATE Books SET NumberOfBooks = NumberOfBooks - 1 WHERE BookTitle = ?";
                try (PreparedStatement updateBookStmt = connect.prepareStatement(updateBookQuery)) {
                    updateBookStmt.setString(1, BookTitle);
                    updateBookStmt.executeUpdate();
                }

                // Add Patron information along with borrowDate and endDate
                String insertPatronQuery = "INSERT INTO Patrons (FirstName, SecondName, Email, Contact, City, Address, BookTitle, borrowDate, endDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertPatronStmt = connect.prepareStatement(insertPatronQuery)) {
                    insertPatronStmt.setString(1, FirstName.getText());
                    insertPatronStmt.setString(2, LastName.getText());
                    insertPatronStmt.setString(3, email.getText());
                    insertPatronStmt.setString(4, contactNum.getText());
                    insertPatronStmt.setString(5, City.getText());
                    insertPatronStmt.setString(6, address.getText());
                    insertPatronStmt.setString(7, BookTitle);

                    // Set borrow and end dates
                    Timestamp borrowDate = new Timestamp(System.currentTimeMillis());
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(borrowDate);
                    cal.add(Calendar.DAY_OF_MONTH, 14); // Assuming 14 days loan period
                    Timestamp endDate = new Timestamp(cal.getTimeInMillis());

                    insertPatronStmt.setTimestamp(8, borrowDate);
                    insertPatronStmt.setTimestamp(9, endDate);

                    int insertRow = insertPatronStmt.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Account has been created and book issued for 14 days.");

                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_AccCreateButtonActionPerformed

    private void bookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleActionPerformed
        String bookName = (String) bookTitle.getSelectedItem();
        if (bookName == null) {
            JOptionPane.showMessageDialog(this, "Please select a book first!");
            return;
        }

        String URL = "jdbc:mysql://localhost:3306/GoodRead";
        String username = "root";
        String password = "Radhika1@";
        String query = "SELECT * FROM books WHERE BookTitle = ?";

        Connection connect = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager.getConnection(URL, username, password);
            stmt = connect.prepareStatement(query);
            stmt.setString(1, bookName);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String specifications = "Book ID: " + rs.getString("BookID") + "\n \n"
                        + "Book Title: " + rs.getString("BookTitle") + "\n \n"
                        + "Author Name: " + rs.getString("Author") + "\n \n"
                        + "Publisher Name: " + rs.getString("Publisher") + "\n \n"
                        + "Publishing Year: " + rs.getString("Year") + "\n \n"
                        + "ISBN No.: " + rs.getString("ISBN") + "\n \n"
                        + "Availability Status: " + rs.getString("Status");
                bookInfo.setText(specifications);
            } else {
                bookInfo.setText("Book not found.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bookTitleActionPerformed

    private void bookInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookInfoActionPerformed

    }//GEN-LAST:event_bookInfoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        String URL = "jdbc:mysql://localhost:3306/GoodRead";
        String username = "root";
        String password = "Radhika1@";
        String query = "Select * from Patrons";
        ManagePatrons managePatrons = new ManagePatrons();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connect = DriverManager.getConnection(URL, username, password);
            PreparedStatement stmt = connect.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) managePatrons.ManagePatron.getModel();

            while (rs.next()) {
                Object[] row = {rs.getInt("PatronID"),
                    rs.getString("FirstName"),
                    rs.getString("SecondName"),
                    rs.getString("Email"),
                    rs.getString("Contact"),
                    rs.getString("Address"),
                    rs.getString("BookTitle"),
                    rs.getTimestamp("borrowDate"),
                    rs.getTimestamp("endDate")};

                model.addRow(row);
            }

            managePatrons.show();
            dispose();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_backActionPerformed

    private boolean emailValidator(String pass) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail.com";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email.getText());
        return matcher.matches();
    }

    private boolean numberValidator(String pass) {
        String regex = "^03\\d{2}-?\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contactNum.getText());
        return matcher.matches();
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
            java.util.logging.Logger.getLogger(newPatron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPatron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPatron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPatron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPatron().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccCreateButton;
    public javax.swing.JTextField City;
    public javax.swing.JTextField FirstName;
    public javax.swing.JTextField LastName;
    public javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField bookInfo;
    public javax.swing.JComboBox<String> bookTitle;
    public javax.swing.JTextField contactNum;
    public javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
