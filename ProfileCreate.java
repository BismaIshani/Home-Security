/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import javax.swing.JOptionPane;

/**
 *
 * @author Bisma
 */
public class ProfileCreate {
    
    private String fname;
    private String lname;
    private String email;
    private String contact;
    private String uname;
    private String password;
    private String conpass;
    private String type;
    
    public void newProfileCreate(ProfileCreate insert){
        
        String qury="Insert into Users set FirstName='"+(getFname())+"',LastName='"+(getLname())+"',Email='"+(getEmail())+"',Phone='"+(getContact())+"',UserType = '"+("Owner")+"', Username='"+(getUname())+"', Password='"+(getPassword())+"'";
        Database db=Database.getInstance();
        db.insertRecord(qury);
        JOptionPane.showMessageDialog(null, "Information added to Database!.");
    
      
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the conpass
     */
    public String getConpass() {
        return conpass;
    }

    /**
     * @param conpass the conpass to set
     */
    public void setConpass(String conpass) {
        this.conpass = conpass;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
}
