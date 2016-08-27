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

public class BancoNutriSystem {
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
            JOptionPane.showMessageDialog(null,"Já existe alimento cadastrado com esse nome");
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
                double preco = rs.getDouble("preco");
                int qtd = rs.getInt("quantidade");
                String unimedida = rs.getString("unimedida");
		double fatcorrecao = rs.getDouble("fatcorrecao");
                double fatcoccao = rs.getDouble("fatcoccao");
                double nutriem100g = rs.getDouble("nutriem100g");
                
                Vector registro = new Vector();
                registro.add(nome);
                registro.add(grupo);
                registro.add(preco);
                registro.add(qtd);
                registro.add(unimedida);
                registro.add(fatcorrecao);
		registro.add(fatcoccao);
		registro.add(nutriem100g);
                
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
            JOptionPane.showMessageDialog(null,"Alimento alterado com sucesso");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Alimento não alterado " + e.toString());
        }
        close();
    }
    
    public void excluir(String excluir){
        open();
        try {
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(excluir);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Alimento apagado com sucesso");
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Alimento não apagado " + e.toString());
        }
        close();
    }
}


