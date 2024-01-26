package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private String ip, usuario, contraseña, bd, cadena;
    private int puerto;
    private Connection conectar;

    public Conexion() {
        this.ip = "localhost";
        this.usuario = "usuarioMYL";
        this.contraseña = "root";
        this.bd = "MYL";
        this.cadena = "jdbc:sqlserver://" + ip + ":" + puerto + "; databaseName=" + bd + ";encrypt=true; trustServerCertificate=true";
        this.conectar = null;
        this.puerto = 1433;
    }

    public Connection getConexion() {
        if (conectar == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conectar = DriverManager.getConnection(cadena, usuario, contraseña);
                System.out.println("Conexion exitosa");
            } catch (Exception e) {
                System.out.println("Error al conectar a la base de datos. " + e.toString());
            }
        }
        return  this.conectar;
    }

    public void cerrarConexion() throws SQLException {
        if (this.conectar != null) {
            this.conectar.close();
        }
    }

    public static void main(String[] args) {
        Conexion c = new Conexion();
        Connection conexion = c.getConexion();
        try {
            conexion = c.getConexion();
            //Consulta 1
            Statement st = conexion.createStatement();
            String consulta = "SELECT * FROM Proveedores";
            ResultSet res = st.executeQuery(consulta);
            while (res.next()) {
                System.out.print(res.getString("id") + " ");
                System.out.println(res.getString("direccion"));
            }

            //Consulta 2
            consulta = "SELECT * FROM Proveedores Where id=? and direccion=?";
            PreparedStatement ps = conexion.prepareStatement(consulta);
            ps.setInt(1, 1);
            ps.setString(2, "1d");
            res = ps.executeQuery();
            while (res.next()) {
                System.out.print(res.getString("telefono") + " ");
            }
            System.out.println("");
            //insert
            consulta = "INSERT INTO Proveedores (direccion,telefono) VALUES(?,?)";
            PreparedStatement ps2 = conexion.prepareStatement(consulta);
            ps2.setString(1, "direc");
            ps2.setString(2, "2464639889");
            int actua = ps2.executeUpdate();
            if (actua == 1) {
                System.out.println("Se agrego");
            }
            res.close();
            c.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


