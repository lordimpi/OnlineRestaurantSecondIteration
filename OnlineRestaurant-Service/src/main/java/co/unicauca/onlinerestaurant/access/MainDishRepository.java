package co.unicauca.onlinerestaurant.access;

import co.unicauca.common.domain.entity.MainDish;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Es una implementación que tiene libertad de hacer una implementación del
 * contrato. Lo puede hacer con Sqlite, postgres, mysql, u otra tecnología
 *
 * @author Santiago Acuña
 */
public class MainDishRepository implements IMainDish {

    private Connection conn;

    @Override
    public List<MainDish> findAll() {

        List<MainDish> mainDishes = new ArrayList<>();
        try {

            String sql = "SELECT id_dish, dish_name, dish_price FROM maindish";
            this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                MainDish newMainDish = new MainDish();
                newMainDish.setId_mainDish(Integer.toString(rs.getInt("id_dish")));
                newMainDish.setNameDish(rs.getString("dish_name"));
                newMainDish.setDishPrice(rs.getDouble("dish_price"));

                mainDishes.add(newMainDish);
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mainDishes;
    }

    @Override
    public MainDish findById(String id) {
        MainDish mainDish = null;
        try {

            String sql = "SELECT id_dish, dish_name, dish_price FROM maindish Where id_dish=" + id;
            this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                mainDish = new MainDish();
                mainDish.setId_mainDish(Integer.toString(rs.getInt("id_dish")));
                mainDish.setNameDish(rs.getString("dish_name"));
                mainDish.setDishPrice(rs.getDouble("dish_price"));
            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, "Error al buscar el plato principal en la base de datos", ex);
        }
        return mainDish;
    }

    @Override
    public boolean create(MainDish newMainDish) {
        String sql = "";
        try {
            this.connect();

            sql = "INSERT INTO maindish ( id_dish, dish_name, dish_price ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(newMainDish.getId_mainDish()));
            pstmt.setString(2, newMainDish.getNameDish());
            pstmt.setDouble(3, newMainDish.getDishPrice());
            pstmt.executeUpdate();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, "Error en el insert into: " + sql, ex);
        }
        return false;
    }

    @Override
    public boolean update(MainDish newMainDish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Conectar a la bd
     */
    public void connect() {
        try {
            //Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = "jdbc:mysql://localhost:3306/restaurante";
            String username = "lordimpi";
            String pwd = "lordimpi315";
            conn = DriverManager.getConnection(url, username, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Desconecta de la base de datos
     */
    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, "Error al cerrar conexión de la base de datos", ex);
        }
    }
}
