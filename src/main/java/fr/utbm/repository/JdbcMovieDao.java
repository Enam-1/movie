package fr.utbm.repository;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

public class JdbcMovieDao {
    public void saveToDB() {
        Connection con=null;
        try {
            Class.forName("org.postgresql.Driver");
            //String dataServerURL = new String("jdbc:postgresql://localhost:5432/postgres");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            System.out.println("CONNEXION OK");
        }
        catch (Exception e) {
            System.out.println("CONNEXION KO");
            e.printStackTrace();
        }
        finally {
            if(con!=null) {
                try {
                        con.close();
                    }
                catch (SQLException ex) {
                        ex.printStackTrace();
                    }
            }
        }
    }

    public void saveStatement(){
        statement stmt=connection.Crea
    }
}
