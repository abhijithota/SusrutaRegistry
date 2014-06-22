/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhijit
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SusrutaApp {
    
    static String table;
    static final String path = "jdbc:mysql://localhost:3306/susruta";
    
    
    public void newTable()  {
        DateFormat newTableFormat = new SimpleDateFormat("ddMMMyyyy$HH_mm_ss");
        Date newTableDate = new Date();
        String newTableName = newTableFormat.format(newTableDate);
        try{
            Connection connt=DriverManager.getConnection(path, "root", "");
            Statement stnt = connt.createStatement();
            stnt.executeUpdate("CREATE  TABLE susruta." + newTableName + " ("
                    + "`id` INT NOT NULL AUTO_INCREMENT ,"
                    + " `name` VARCHAR(45) NOT NULL ,"
                    + " `age` INT NOT NULL ,"
                    + " `gender` CHAR NOT NULL ,"
                    + " `consult` INT NOT NULL ,"
                    + " `time` TIME NOT NULL ,"
                    + " `state` INT NOT NULL ,"
                    + " PRIMARY KEY (`id`) ,"
                    + " UNIQUE INDEX `id_UNIQUE` (`id` ASC) )");
            stnt.executeUpdate("INSERT INTO susruta.records (`tableName`) VALUES ('" + newTableName + "')");
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
    }
    
    public void setLastTable()  {
        ResultSet lastTable = null;
        try{
            Connection conslt=DriverManager.getConnection(path, "root", "");
            Statement stslt = conslt.createStatement();
            lastTable = stslt.executeQuery("SELECT tableName FROM susruta.records where id="
                    +"(SELECT MAX(id) FROM susruta.records)");
            if(lastTable != null)
            {
                lastTable.next();
                table = lastTable.getString(1);
            }
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
    }
    
    public void addEntry(String n, int a, char g, int c)  {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String d = dateFormat.format(date);
        try{
            Connection con=DriverManager.getConnection(path, "root", "");
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO susruta."+table+" (name,age,gender,consult,time,state) "
                    + "VALUES ('"+n+"',"+a+",'"+g+"',"+c+",'"
                    +d+"',1)");
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }    
    }
    
    
    public int deleteEntry(int id)  {
        int rd = -1;
        try{
            Connection conDel=DriverManager.getConnection(path, "root", "");
            Statement stDel = conDel.createStatement();
            rd = stDel.executeUpdate("DELETE FROM susruta."+table+" WHERE id = "+id);
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
        return rd;
    }
    
    
    public ResultSet getData(int state)  {
        ResultSet rs = null;
        try{
            Connection con=DriverManager.getConnection(path, "root", "");
            Statement st = con.createStatement();
            rs = st.executeQuery("SELECT name,age,gender,consult,time FROM susruta."
                    + table+" WHERE state = " + state);
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
        return rs;
    }
    
    public ResultSet getIndex(int stateI)  {
        ResultSet rsi = null;
        try{
            Connection coni = DriverManager.getConnection(path, "root", "");
            Statement sti = coni.createStatement();
            rsi = sti.executeQuery("SELECT id FROM susruta." + table + " WHERE state = " + stateI);
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
        return rsi;
    }
    
    
    public int moveTo(int id, int ns)  {
        int rm = -1;
        try{
            Connection conm = DriverManager.getConnection(path, "root", "");
            Statement sti = conm.createStatement();
            rm = sti.executeUpdate("UPDATE susruta." + table + " SET state = " + ns + " WHERE id = " + id);
        }
        catch(SQLException ex){
        ex.printStackTrace();
        }
        return rm;
    }
    
    
    public static void main(String[] args) {
        
        AuthenticationJFrame ajf = new AuthenticationJFrame();
        ajf.setLocationRelativeTo(null);
        ajf.setResizable(false);
        ajf.setVisible(true);
    }
}
