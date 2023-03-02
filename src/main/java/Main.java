import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static Connection conectar() throws SQLException {

        String driver = "jdbc:postgresql:";
        String host = "//localhost:";
        String porto = "5432";
        String sid = "postgres";
        String usuario = "postgres";
        String password = "postgres";
        String url = driver + host + porto + "/" + sid;

        Connection conn = DriverManager.getConnection(url, usuario, password);

        return conn;
    }

    public static void main(String[] args) {

        Connection con = getConnection();
        Statement smt = con.createStatement();
        String codigo="p2";
        String descricion ="escoba";
        int prezo=26;
        String cidade="madrid";
        String cp=354;
        String cadea="insert into produtost values('"+codigo+"','"+descricion+"',"+prezo+",('"+cidade+"',"+cp+"))";

        String consulta="select *, (ci).cidade ,(ci).cp form produtos ";
        ResultSet r = smt.executeQuery(consulta);

    }
}