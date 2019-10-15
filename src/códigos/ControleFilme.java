/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package códigos;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 * @author Igor Ramos
 */
public class ControleFilme {
    private Connection connection;
    public ControleFilme() {
             this.connection = (Connection) new FabricaConexao().getConnection();
         }
  //inserir
  public void Inserir(Filme filme){
      String sql = "insert into filme " +
             "(nome,ano,Categoria,Diretor)" +
             " values (?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,filme.getNome());
            stmt.setString(2, filme.getAno());
            stmt.setString(3,filme.getCategoria());
            stmt.setString(4, filme.getDiretor());
            stmt.execute();
            stmt.close();
            this.connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
  }
    
    //editar
    public void Editar(Filme filme) throws SQLException{
     String sql = "update filme set nome=?,ano=?,Categoria=?,Diretor=? where id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
           
            stmt.setString(1,filme.getNome());
            stmt.setString(2, filme.getAno());
            stmt.setString(3,filme.getCategoria());
            stmt.setString(4, filme.getDiretor());
             stmt.setInt(5, filme.getId());
            stmt.execute();
            stmt.close();
            this.connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
  }
    //excluir
    public void Excluir(int id) throws SQLException{
     PreparedStatement stmt = connection.prepareStatement("DELETE FROM filme WHERE id=?");
     stmt.setInt(1, id);
     stmt.execute();
     stmt.close();
     this.connection.close();
     
  }
    
    //consultar
      public void Consultar(String nome, DefaultTableModel tbFilme) throws SQLException{
     PreparedStatement stmt = connection.prepareStatement("select * from filme where LOCATE('"+nome+"',nome)");
     // executa um select
     ResultSet rs = stmt.executeQuery();
     while(rs.next()){
          tbFilme.addRow(new String[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("ano"),
                    rs.getString("Categoria"),
                    rs.getString("Diretor"),
                });
     }
     stmt.close();
     rs.close();
     this.connection.close();
     
  }
      public void popular(DefaultTableModel tbFilme) throws SQLException{
          PreparedStatement stmt = connection.prepareStatement("select * from filme");
          // executa um select
          ResultSet rs = stmt.executeQuery();
           while(rs.next()){
                tbFilme.addRow(new String[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("ano"),
                    rs.getString("Categoria"),
                    rs.getString("Diretor"),
                });
           }
          stmt.close();
          rs.close();
          this.connection.close();
      }
}
