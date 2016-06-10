package queryfactory;

import java.sql.ResultSet;
import java.util.ArrayList;

public class factory {
        DBHandler dbH = new DBHandler();

    public ResultSet getRows(){
        ArrayList<Object> params = new ArrayList<>();
        String d_date = "2014-10-22";
        params.add(d_date);
        String query = "SELECT * FROM mac_range WHERE Date = ? ";
        return dbH.getRows(query, params);
    }
    
    public int updateRows(){
        String query;
        ArrayList<Object> params = new ArrayList<>();
        String description_str = "new2 description";
        int number_row = 36;
        params.add(description_str);
        params.add(number_row);
        query = "UPDATE mac_range SET Description = ? "
              + "WHERE n = ?";
        return dbH.doUpdate(query, params);
    }
    
    public int deleteRows(){  //or rows
        String query;
        ArrayList<Object> params = new ArrayList<>();
        String description_str = "new2 description";
        int number_row = 36;
        params.add(description_str);
        params.add(number_row);
            query = "DELETE FROM mac_range "
                  + "WHERE n = ?";
        return dbH.doUpdate(query, params);
    }
}
