package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDB {

        Connection c;
        Statement s;
        public ConnectDB(){
        try{

            Class.forName("org.postgresql.Driver");
            c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bankmanagementsystem","postgres","1371");
            s=c.createStatement();
            
    }catch(Exception e){
        System.out.println(e);
    }
    }
}