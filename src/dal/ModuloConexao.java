package dal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModuloConexao {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    
    public void open(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(ClassNotFoundException ex){
            //Logger.getLogger(ConexaoBD.class.getNome()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/banconutrisystem","root","");
            stmt = (Statement) conn.createStatement();
        }catch(SQLException ex){
            //Logger.getLogger(ConexaoBD.class.getNome()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    public void close(){
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro no fechamento da conexão "+ e);
        }
    }
    
    public void cadastrar(String cad){
        open();
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(cad);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"O alimento foi cadastrado com sucesso");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"O alimento não foi cadastrado " + e.toString());
        }
        close();
    }
    
    public void consultar(DefaultTableModel dtm,String consultar){                                                                            //OBS:  serve
        Vector <Vector> dados = new Vector<Vector>();
        open();
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(consultar);
            pst.executeQuery();
            rs = pst.executeQuery(consultar);
            while(rs.next()){
                String nome = rs.getString("nome");
                String grupo = rs.getString("grupo");
                int per_capta = rs.getInt("perCapta");
                String unimedida = rs.getString("uniMedida");
                String ingredientes = rs.getString("ingredientes");
                String medCaseira = rs.getString("medidaCaseira");
                
                Vector registro = new Vector();
                registro.add(nome);
                registro.add(grupo);
                registro.add(per_capta);
                registro.add(unimedida);
                registro.add(ingredientes);
                registro.add(medCaseira);
                
                dados.add(registro);
            }
            for(int i = 0; i < dados.size(); i++){
                dtm.addRow(dados.get(i));
            }
            stmt.close();
        } catch (java.sql.SQLException e) {
            throw new java.lang.RuntimeException(e.getMessage());
        }
        close();
    }
    
    public void alterar(String alterar){
        open();
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(alterar);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"alimento alterado com sucesso");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"alimento não alterado " + e.toString());
        }
        close();
    }
    
    public void excluir(String excluir){
        open();
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(excluir);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"O alimento apagado com sucesso");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"alimento não apagado " + e.toString());
        }
        close();
    }
}
