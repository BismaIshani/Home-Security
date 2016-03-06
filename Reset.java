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
public class Reset {
    private String uname;
    private String password;
    private String conpass;
    
    public void userRest(Reset update){
        
       String qu="UPDATE Users SET Password='"+(update.getPassword())+"' where Username='"+(update.getUname())+"'";
       Database db=Database.getInstance();
       db.updateRecord(qu);
       JOptionPane.showMessageDialog(null, "Information added to Database..");
    
      
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
}
