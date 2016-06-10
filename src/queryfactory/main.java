package queryfactory;

import java.sql.ResultSet;

public class main {
    
    
    
    
    public static void main(String[] args) {
        factory fct = new factory();
        ResultSet rs = fct.getRows();
        
        System.out.println(fct.updateRows());
    }
}
