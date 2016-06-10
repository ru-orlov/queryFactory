package queryfactory;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHandler {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://127.0.0.1:3306/testmysql";
    private static final String user = "root";
    private static final String password = "";
 
    // JDBC variables for opening and managing connection
    private static Connection connection;
    
    public int doUpdate(String query, ArrayList params) {
        try {
            PreparedStatement preparedstatement = null;
            int j = 1;
            connection = DriverManager.getConnection(url, user, password);
            preparedstatement = connection.prepareStatement(query);
            for (Object param : params) {
                if (null == param) {
                    preparedstatement.setObject(j, null);
                } else if (param instanceof Boolean) {
                    preparedstatement.setBoolean(j, (Boolean) param);
                } else if (param instanceof Character) {
                    preparedstatement.setString(j, String.valueOf(param));
                } else if (param instanceof Byte) {
                    preparedstatement.setByte(j, (Byte) param);
                } else if (param instanceof Short) {
                    preparedstatement.setShort(j, (Short) param);
                } else if (param instanceof Integer) {
                    preparedstatement.setInt(j, (Integer) param);
                } else if (param instanceof Long) {
                    preparedstatement.setLong(j, (Long) param);
                } else if (param instanceof Float) {
                    preparedstatement.setFloat(j, (Float) param);
                } else if (param instanceof Double) {
                    preparedstatement.setDouble(j, (Double) param);
                } else if (param instanceof String) {
                    preparedstatement.setString(j, (String) param);
                } else if (param instanceof Date) {
                    preparedstatement.setDate(j, new java.sql.Date(((Date) param).getTime()));
                } else if (param instanceof Calendar) {
                    preparedstatement.setDate(j, new java.sql.Date(((Calendar) param).getTimeInMillis()));
                } else if (param instanceof BigDecimal) {
                    preparedstatement.setBigDecimal(j, (BigDecimal) param);
                }
                j++;
            }
            return preparedstatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        }
    
    public ResultSet getRows(String query, ArrayList params){
        try {
            PreparedStatement preparedstatement = null;
            int j = 1;
            connection = DriverManager.getConnection(url, user, password);
            preparedstatement = connection.prepareStatement(query);
            for (Object param : params) {
                if (null == param) {
                    preparedstatement.setObject(j, null);
                } else if (param instanceof Boolean) {
                    preparedstatement.setBoolean(j, (Boolean) param);
                } else if (param instanceof Character) {
                    preparedstatement.setString(j, String.valueOf(param));
                } else if (param instanceof Byte) {
                    preparedstatement.setByte(j, (Byte) param);
                } else if (param instanceof Short) {
                    preparedstatement.setShort(j, (Short) param);
                } else if (param instanceof Integer) {
                    preparedstatement.setInt(j, (Integer) param);
                } else if (param instanceof Long) {
                    preparedstatement.setLong(j, (Long) param);
                } else if (param instanceof Float) {
                    preparedstatement.setFloat(j, (Float) param);
                } else if (param instanceof Double) {
                    preparedstatement.setDouble(j, (Double) param);
                } else if (param instanceof String) {
                    preparedstatement.setString(j, (String) param);
                } else if (param instanceof Date) {
                    preparedstatement.setDate(j, new java.sql.Date(((Date) param).getTime()));
                } else if (param instanceof Calendar) {
                    preparedstatement.setDate(j, new java.sql.Date(((Calendar) param).getTimeInMillis()));
                } else if (param instanceof BigDecimal) {
                    preparedstatement.setBigDecimal(j, (BigDecimal) param);
                }
                j++;
            }
            return preparedstatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
