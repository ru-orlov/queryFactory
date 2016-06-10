package queryfactory;

import java.sql.ResultSet;
import java.util.ArrayList;

public class factory {
        DBHandler dbH = new DBHandler();

    public ResultSet getRows(){
        ArrayList<Object> params = new ArrayList<>();
        String d_date = "0000-00-00";
        params.add(d_date);
        String query = "SELECT * FROM table_name WHERE column_1 = ? ";
        return dbH.getRows(query, params);
    }
    
    public int updateRows(){
        String query;
        ArrayList<Object> params = new ArrayList<>();
        String description_str = "example description";
        int number_row = 1;
        params.add(description_str);
        params.add(number_row);
        query = "UPDATE table_name SET column_1 = ? "
              + "WHERE column_2 = ?";
        return dbH.doUpdate(query, params);
    }
    
    public int deleteRows(){  //or rows
        String query;
        ArrayList<Object> params = new ArrayList<>();
        int number_row = 36;
        params.add(description_str);
        params.add(number_row);
            query = "DELETE FROM table_name "
                  + "WHERE column_2 = ?";
        return dbH.doUpdate(query, params);
    }
}
