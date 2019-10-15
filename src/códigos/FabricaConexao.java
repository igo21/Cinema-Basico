/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package códigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Igor Ramos
 */
public class FabricaConexao {
    
    public Connection getConnection() {
              try {
                  return DriverManager.getConnection(
                          "jdbc:mysql://localhost:3306/cinema?zeroDateTimeBehavior=convertToNull", "root", "1234");
              } catch (SQLException e) {
                  throw new RuntimeException(e);
              }
          }
}
