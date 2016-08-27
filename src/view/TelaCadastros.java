
package view;

import constantes.TrocaPainel;
import dal.BancoNutriSystem;
import dal.ModuloConexao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import dal.TabelaLocais;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastros extends javax.swing.JFrame {

    public TelaCadastros() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBannerCadastros = new javax.swing.JPanel();
        jLabeBannerCadastros = new javax.swing.JLabel();
        jPanelContendoSplitPane = new javax.swing.JPanel();
        jSplitPaneCadastros = new javax.swing.JSplitPane();
        jPanelBotoesEsquerdaPai = new javax.swing.JPanel();
        jPanelBotoesEsquerdaFilho = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonCadAlimentos = new javax.swing.JButton();
        jButtonCadPreparacoes = new javax.swing.JButton();
        jButtonCadLocais = new javax.swing.JButton();
        jButtonConfiguracoes = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jInternalFrame = new javax.swing.JInternalFrame();
        jPanelPrincipalCadastros = new javax.swing.JPanel();
        jPanelInicial = new javax.swing.JPanel();
        jLabelImagemFundo = new javax.swing.JLabel();
        jPanelCadAlimentosPai = new javax.swing.JPanel();
        jPanelCadAlimentosFilho = new javax.swing.JPanel();
        jLabelCadAlimentos = new javax.swing.JLabel();
        jPanelDadosAlimentos = new javax.swing.JPanel();
        jButtonNovoAlimento = new javax.swing.JButton();
        jButtonSalvarAlimento = new javax.swing.JButton();
        jButtonEditarAlimento = new javax.swing.JButton();
        jButtonExcluirAlimento = new javax.swing.JButton();
        jButtonCancelarCadAlimento = new javax.swing.JButton();
        jLabelNomeAlimento = new javax.swing.JLabel();
        jTextFieldNomeAlimento = new javax.swing.JTextField();
        jLabelGrupoAlimento = new javax.swing.JLabel();
        jComboBoxGrupoAlimento = new javax.swing.JComboBox<String>();
        jButtonAddGrupoAlimento = new javax.swing.JButton();
        jLabelPrecoAlimento = new javax.swing.JLabel();
        jTextFieldPrecoAlimento = new javax.swing.JTextField();
        jLabelQtdAlimento = new javax.swing.JLabel();
        jTextFieldQtdAlimento = new javax.swing.JTextField();
        jLabelNutriEm100g = new javax.swing.JLabel();
        jTextFieldNutriEm100g = new javax.swing.JTextField();
        jLabelUnidMedida = new javax.swing.JLabel();
        jLabelFatorCorecao = new javax.swing.JLabel();
        jTextFieldFatorCorecao = new javax.swing.JTextField();
        jLabelFatorCoccao = new javax.swing.JLabel();
        jTextFieldFatorCoccao = new javax.swing.JTextField();
        jComboBoxMedidaAlimento = new javax.swing.JComboBox();
        jLabelPesquisarAlimentoPorNome = new javax.swing.JLabel();
        jTextFieldBarraPesquisaAlimento = new javax.swing.JTextField();
        jButtonPesquisarAlimento = new javax.swing.JButton();
        jScrollPaneTabelaAlimentos = new javax.swing.JScrollPane();
        jTableDadosAlimentos = new javax.swing.JTable();
        jPanelCadPreparacoesPai = new javax.swing.JPanel();
        jPanelCadAlimentosFilho1 = new javax.swing.JPanel();
        jLabelCadAlimentos1 = new javax.swing.JLabel();
        jPanelDadosAlimentos1 = new javax.swing.JPanel();
        jLabelNomeAlimento1 = new javax.swing.JLabel();
        jTextFieldNomeAlimento1 = new javax.swing.JTextField();
        jTextFieldPrecoAlimento1 = new javax.swing.JTextField();
        jLabelQtdAlimento1 = new javax.swing.JLabel();
        jLabelQtdAlimento2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePesquisaIngredientes = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelPesquisarAlimentoPorNome1 = new javax.swing.JLabel();
        jTextFieldBarraPesquisaRefeicao = new javax.swing.JTextField();
        jButtonPesquisarRefeicao = new javax.swing.JButton();
        jScrollPaneTabelaAlimentos1 = new javax.swing.JScrollPane();
        jTableDadosReceita = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanelDadosAlimentos2 = new javax.swing.JPanel();
        jLabelNomeRefeicao = new javax.swing.JLabel();
        jTextFieldNomeReceita = new javax.swing.JTextField();
        jTextFieldPerCaptaReceita = new javax.swing.JTextField();
        jLabelQtdAlimento3 = new javax.swing.JLabel();
        jLabelQtdAlimento4 = new javax.swing.JLabel();
        jComboBoxGrupoReceita = new javax.swing.JComboBox();
        jComboBoxUniMedidaRefeicao = new javax.swing.JComboBox();
        jLabelNomeAlimento3 = new javax.swing.JLabel();
        jPanelDadosAlimentos3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButtonNovaReceita = new javax.swing.JButton();
        jButtonSalvarRecita = new javax.swing.JButton();
        jButtonEditarReceita = new javax.swing.JButton();
        jButtonExcluirReceita = new javax.swing.JButton();
        jButtonCancelarCadReceita = new javax.swing.JButton();
        jPanelCadLocaisPai = new javax.swing.JPanel();
        jPanelCadLocaisFilho = new javax.swing.JPanel();
        jLabelCadLocais = new javax.swing.JLabel();
        jPanelDadosLocal = new javax.swing.JPanel();
        jButtonNovoLocal = new javax.swing.JButton();
        jButtonSalvarLocal = new javax.swing.JButton();
        jButtonEditarLocal = new javax.swing.JButton();
        jButtonExcluirLocal = new javax.swing.JButton();
        jButtonCancelarCadLocal = new javax.swing.JButton();
        jLabelNomeLocal = new javax.swing.JLabel();
        jTextFieldNomeLocal = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<String>();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelPesquisarLocalPorNome = new javax.swing.JLabel();
        jTextFieldBarraPesquisaLocal = new javax.swing.JTextField();
        jButtonPesquisarLocal = new javax.swing.JButton();
        jScrollPaneTabelaLocais = new javax.swing.JScrollPane();
        jTableDadosLocais = new javax.swing.JTable();
        jPanelConfiguracoes = new javax.swing.JPanel();
        jPanelConfigsFilho = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBarSuperior = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadAlimentos = new javax.swing.JMenuItem();
        jMenuItemCadPreparacoes = new javax.swing.JMenuItem();
        jMenuItemCadLocais = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastros");
        setExtendedState(6);
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1010, 710));

        jPanelBannerCadastros.setBackground(new java.awt.Color(0, 100, 0));
        jPanelBannerCadastros.setLayout(new java.awt.GridLayout(1, 0));

        jLabeBannerCadastros.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabeBannerCadastros.setForeground(new java.awt.Color(255, 255, 255));
        jLabeBannerCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeBannerCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_cadastros.png"))); // NOI18N
        jLabeBannerCadastros.setText("  Cadastros");
        jLabeBannerCadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabeBannerCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabeBannerCadastros.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelBannerCadastros.add(jLabeBannerCadastros);

        getContentPane().add(jPanelBannerCadastros, java.awt.BorderLayout.PAGE_START);

        jPanelContendoSplitPane.setLayout(new java.awt.GridLayout(1, 0));

        jSplitPaneCadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSplitPaneCadastros.setDividerLocation(96);
        jSplitPaneCadastros.setContinuousLayout(true);
        jSplitPaneCadastros.setMaximumSize(new java.awt.Dimension(200, 200));
        jSplitPaneCadastros.setMinimumSize(new java.awt.Dimension(2, 2));
        jSplitPaneCadastros.setName(""); // NOI18N
        jSplitPaneCadastros.setOneTouchExpandable(true);

        jPanelBotoesEsquerdaPai.setLayout(new java.awt.CardLayout());

        jPanelBotoesEsquerdaFilho.setBackground(java.awt.Color.white);

        jButtonHome.setBackground(new java.awt.Color(0, 100, 0));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_home.png"))); // NOI18N
        jButtonHome.setToolTipText("Voltar â Tela Inicial");
        jButtonHome.setAlignmentX(0.5F);
        jButtonHome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonCadAlimentos.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCadAlimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_alimentos.png"))); // NOI18N
        jButtonCadAlimentos.setToolTipText("Cadastrar Alimentos");
        jButtonCadAlimentos.setAlignmentX(0.5F);
        jButtonCadAlimentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alimentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonCadAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlimentosActionPerformed(evt);
            }
        });

        jButtonCadPreparacoes.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCadPreparacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_receitas.png"))); // NOI18N
        jButtonCadPreparacoes.setToolTipText("Cadastrar Preparações/Receitas");
        jButtonCadPreparacoes.setAlignmentX(0.5F);
        jButtonCadPreparacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preparações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonCadPreparacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPreparacoesActionPerformed(evt);
            }
        });

        jButtonCadLocais.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCadLocais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_locais.png"))); // NOI18N
        jButtonCadLocais.setToolTipText("Cadastrar Locais");
        jButtonCadLocais.setAlignmentX(0.5F);
        jButtonCadLocais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Locais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonCadLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLocaisActionPerformed(evt);
            }
        });

        jButtonConfiguracoes.setBackground(new java.awt.Color(0, 100, 0));
        jButtonConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_confgs.png"))); // NOI18N
        jButtonConfiguracoes.setToolTipText("Configurações");
        jButtonConfiguracoes.setAlignmentX(0.5F);
        jButtonConfiguracoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configurações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracoesActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_cancel.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setAlignmentX(0.5F);
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cancelar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesEsquerdaFilhoLayout = new javax.swing.GroupLayout(jPanelBotoesEsquerdaFilho);
        jPanelBotoesEsquerdaFilho.setLayout(jPanelBotoesEsquerdaFilhoLayout);
        jPanelBotoesEsquerdaFilhoLayout.setHorizontalGroup(
            jPanelBotoesEsquerdaFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCadAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCadPreparacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCadLocais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBotoesEsquerdaFilhoLayout.setVerticalGroup(
            jPanelBotoesEsquerdaFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesEsquerdaFilhoLayout.createSequentialGroup()
                .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadPreparacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadLocais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotoesEsquerdaPai.add(jPanelBotoesEsquerdaFilho, "PainelBotoes");

        jSplitPaneCadastros.setLeftComponent(jPanelBotoesEsquerdaPai);

        jInternalFrame.setVisible(true);
        jInternalFrame.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanelPrincipalCadastros.setOpaque(false);
        jPanelPrincipalCadastros.setLayout(new java.awt.CardLayout());

        jPanelInicial.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicial.setLayout(new java.awt.GridLayout(1, 0));

        jLabelImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_banner.png"))); // NOI18N
        jPanelInicial.add(jLabelImagemFundo);

        jPanelPrincipalCadastros.add(jPanelInicial, "card6");

        jPanelCadAlimentosPai.setLayout(new java.awt.CardLayout());

        jPanelCadAlimentosFilho.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadAlimentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadAlimentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadAlimentos.setText("Cadastro de Alimentos");
        jLabelCadAlimentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelDadosAlimentos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosAlimentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelDadosAlimentos.setToolTipText("");

        jButtonNovoAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonNovoAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoAlimento.setText("Novo Alimento");

        jButtonSalvarAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonSalvarAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarAlimento.setText("Salvar Alimento");
        jButtonSalvarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlimentoActionPerformed(evt);
            }
        });

        jButtonEditarAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonEditarAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarAlimento.setText("Editar Alimento");
        jButtonEditarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAlimentoActionPerformed(evt);
            }
        });

        jButtonExcluirAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonExcluirAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirAlimento.setText("Excluir Alimento");
        jButtonExcluirAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAlimentoActionPerformed(evt);
            }
        });

        jButtonCancelarCadAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCancelarCadAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCadAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCadAlimento.setText("Cancelar");

        jLabelNomeAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeAlimento.setText("Nome:");
        jLabelNomeAlimento.setToolTipText("");
        jLabelNomeAlimento.setAlignmentX(10.0F);
        jLabelNomeAlimento.setAlignmentY(10.0F);

        jTextFieldNomeAlimento.setToolTipText("");
        jTextFieldNomeAlimento.setAlignmentX(10.0F);
        jTextFieldNomeAlimento.setAlignmentY(10.0F);
        jTextFieldNomeAlimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelGrupoAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelGrupoAlimento.setText("Grupo:");
        jLabelGrupoAlimento.setToolTipText("");
        jLabelGrupoAlimento.setAlignmentX(10.0F);
        jLabelGrupoAlimento.setAlignmentY(10.0F);

        jComboBoxGrupoAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jComboBoxGrupoAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxGrupoAlimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cereais", "Futas", "Vegetais" }));
        jComboBoxGrupoAlimento.setToolTipText("");
        jComboBoxGrupoAlimento.setAlignmentX(10.0F);
        jComboBoxGrupoAlimento.setAlignmentY(10.0F);

        jButtonAddGrupoAlimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddGrupoAlimento.setForeground(new java.awt.Color(0, 100, 0));
        jButtonAddGrupoAlimento.setText("+");
        jButtonAddGrupoAlimento.setBorder(null);
        jButtonAddGrupoAlimento.setOpaque(false);
        jButtonAddGrupoAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddGrupoAlimentojButton21ActionPerformed(evt);
            }
        });

        jLabelPrecoAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPrecoAlimento.setText("Preço:");
        jLabelPrecoAlimento.setToolTipText("");
        jLabelPrecoAlimento.setAlignmentX(10.0F);
        jLabelPrecoAlimento.setAlignmentY(10.0F);

        jTextFieldPrecoAlimento.setToolTipText("");
        jTextFieldPrecoAlimento.setAlignmentX(10.0F);
        jTextFieldPrecoAlimento.setAlignmentY(10.0F);
        jTextFieldPrecoAlimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelQtdAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtdAlimento.setText("Quantidade:");

        jTextFieldQtdAlimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNutriEm100g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNutriEm100g.setText("Nutrientes (100g):");

        jTextFieldNutriEm100g.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelUnidMedida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUnidMedida.setText("Unid. Medida:");
        jLabelUnidMedida.setToolTipText("");
        jLabelUnidMedida.setAlignmentX(10.0F);
        jLabelUnidMedida.setAlignmentY(10.0F);

        jLabelFatorCorecao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFatorCorecao.setText("Fator de Coreção:");
        jLabelFatorCorecao.setToolTipText("");
        jLabelFatorCorecao.setAlignmentX(10.0F);
        jLabelFatorCorecao.setAlignmentY(10.0F);

        jLabelFatorCoccao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFatorCoccao.setText("Fator de Cocção:");

        jTextFieldFatorCoccao.setToolTipText("");
        jTextFieldFatorCoccao.setAlignmentX(10.0F);
        jTextFieldFatorCoccao.setAlignmentY(10.0F);
        jTextFieldFatorCoccao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldFatorCoccao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFatorCoccaojTextField10ActionPerformed(evt);
            }
        });

        jComboBoxMedidaAlimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "UN", "KG", "GR", "LT", "ML" }));

        javax.swing.GroupLayout jPanelDadosAlimentosLayout = new javax.swing.GroupLayout(jPanelDadosAlimentos);
        jPanelDadosAlimentos.setLayout(jPanelDadosAlimentosLayout);
        jPanelDadosAlimentosLayout.setHorizontalGroup(
            jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonExcluirAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNovoAlimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarAlimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSalvarAlimento))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                                .addComponent(jTextFieldPrecoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabelQtdAlimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldQtdAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelNutriEm100g)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                                .addComponent(jTextFieldNutriEm100g, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelUnidMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMedidaAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                                .addComponent(jLabelGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                        .addComponent(jLabelFatorCorecao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFatorCorecao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelFatorCoccao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFatorCoccao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosAlimentosLayout.setVerticalGroup(
            jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonNovoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNomeAlimento)
                                    .addComponent(jTextFieldNomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelGrupoAlimento)
                                .addComponent(jComboBoxGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAddGrupoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecoAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUnidMedida)
                            .addComponent(jLabelPrecoAlimento)
                            .addComponent(jLabelQtdAlimento)
                            .addComponent(jTextFieldQtdAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNutriEm100g)
                            .addComponent(jTextFieldNutriEm100g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMedidaAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFatorCorecao)
                            .addComponent(jTextFieldFatorCoccao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFatorCoccao)
                            .addComponent(jTextFieldFatorCorecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosAlimentosLayout.createSequentialGroup()
                        .addComponent(jButtonSalvarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluirAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarCadAlimento)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabelPesquisarAlimentoPorNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesquisarAlimentoPorNome.setText("Procurar Alimento por Nome:");

        jTextFieldBarraPesquisaAlimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBarraPesquisaAlimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonPesquisarAlimento.setBackground(new java.awt.Color(0, 100, 0));
        jButtonPesquisarAlimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPesquisarAlimento.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisarAlimento.setText("Pesquisar");
        jButtonPesquisarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAlimentojButton9ActionPerformed(evt);
            }
        });

        jTableDadosAlimentos.setForeground(new java.awt.Color(0, 100, 0));
        jTableDadosAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Grupo", "Preço", "Quantidade", "Uni. Medida", "Fat. Correção", "Fat. Cocção", "Nutri. em 100g"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDadosAlimentos.setGridColor(new java.awt.Color(0, 100, 0));
        jScrollPaneTabelaAlimentos.setViewportView(jTableDadosAlimentos);

        javax.swing.GroupLayout jPanelCadAlimentosFilhoLayout = new javax.swing.GroupLayout(jPanelCadAlimentosFilho);
        jPanelCadAlimentosFilho.setLayout(jPanelCadAlimentosFilhoLayout);
        jPanelCadAlimentosFilhoLayout.setHorizontalGroup(
            jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadAlimentosFilhoLayout.createSequentialGroup()
                .addGroup(jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadAlimentosFilhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTabelaAlimentos)
                            .addGroup(jPanelCadAlimentosFilhoLayout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(jLabelPesquisarAlimentoPorNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBarraPesquisaAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarAlimento)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelCadAlimentosFilhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDadosAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCadAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelCadAlimentosFilhoLayout.setVerticalGroup(
            jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadAlimentosFilhoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelCadAlimentos)
                .addGap(18, 18, 18)
                .addComponent(jPanelDadosAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBarraPesquisaAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarAlimentoPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPaneTabelaAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCadAlimentosPai.add(jPanelCadAlimentosFilho, "card3");

        jPanelPrincipalCadastros.add(jPanelCadAlimentosPai, "CadAlimentos");

        jPanelCadPreparacoesPai.setBackground(new java.awt.Color(51, 51, 51));
        jPanelCadPreparacoesPai.setLayout(new java.awt.CardLayout());

        jPanelCadAlimentosFilho1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadAlimentos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadAlimentos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadAlimentos1.setText("Cadastro de Preparações");
        jLabelCadAlimentos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelDadosAlimentos1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosAlimentos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelDadosAlimentos1.setToolTipText("");

        jLabelNomeAlimento1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeAlimento1.setText("Nome:");
        jLabelNomeAlimento1.setToolTipText("");
        jLabelNomeAlimento1.setAlignmentX(10.0F);
        jLabelNomeAlimento1.setAlignmentY(10.0F);

        jTextFieldNomeAlimento1.setToolTipText("");
        jTextFieldNomeAlimento1.setAlignmentX(10.0F);
        jTextFieldNomeAlimento1.setAlignmentY(10.0F);
        jTextFieldNomeAlimento1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldPrecoAlimento1.setToolTipText("");
        jTextFieldPrecoAlimento1.setAlignmentX(10.0F);
        jTextFieldPrecoAlimento1.setAlignmentY(10.0F);
        jTextFieldPrecoAlimento1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelQtdAlimento1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtdAlimento1.setText("Quantidade:");

        jLabelQtdAlimento2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtdAlimento2.setText("Unid. Medida:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Ingredientes:");

        jButton1.setText("+");

        jTablePesquisaIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alimento", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTablePesquisaIngredientes);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelDadosAlimentos1Layout = new javax.swing.GroupLayout(jPanelDadosAlimentos1);
        jPanelDadosAlimentos1.setLayout(jPanelDadosAlimentos1Layout);
        jPanelDadosAlimentos1Layout.setHorizontalGroup(
            jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addComponent(jLabelQtdAlimento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQtdAlimento1)
                            .addComponent(jLabelNomeAlimento1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNomeAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPrecoAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91))))
        );
        jPanelDadosAlimentos1Layout.setVerticalGroup(
            jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosAlimentos1Layout.createSequentialGroup()
                .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane5))
                    .addGroup(jPanelDadosAlimentos1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeAlimento1)
                            .addComponent(jTextFieldNomeAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQtdAlimento1)
                            .addComponent(jTextFieldPrecoAlimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDadosAlimentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQtdAlimento2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        jLabelPesquisarAlimentoPorNome1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesquisarAlimentoPorNome1.setText("Procurar preparação por Nome:");

        jTextFieldBarraPesquisaRefeicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBarraPesquisaRefeicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonPesquisarRefeicao.setBackground(new java.awt.Color(0, 100, 0));
        jButtonPesquisarRefeicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPesquisarRefeicao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisarRefeicao.setText("Pesquisar");
        jButtonPesquisarRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarRefeicaojButton9ActionPerformed(evt);
            }
        });

        jTableDadosReceita.setForeground(new java.awt.Color(0, 100, 0));
        jTableDadosReceita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome da Receita", "Grupo", "Per Capta", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDadosReceita.setGridColor(new java.awt.Color(0, 100, 0));
        jScrollPaneTabelaAlimentos1.setViewportView(jTableDadosReceita);

        jLabel3.setText("Selecione os alimentos para a receita:");

        jPanelDadosAlimentos2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosAlimentos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelDadosAlimentos2.setToolTipText("");

        jLabelNomeRefeicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeRefeicao.setText("Nome:");
        jLabelNomeRefeicao.setToolTipText("");
        jLabelNomeRefeicao.setAlignmentX(10.0F);
        jLabelNomeRefeicao.setAlignmentY(10.0F);

        jTextFieldNomeReceita.setToolTipText("");
        jTextFieldNomeReceita.setAlignmentX(10.0F);
        jTextFieldNomeReceita.setAlignmentY(10.0F);
        jTextFieldNomeReceita.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldPerCaptaReceita.setToolTipText("");
        jTextFieldPerCaptaReceita.setAlignmentX(10.0F);
        jTextFieldPerCaptaReceita.setAlignmentY(10.0F);
        jTextFieldPerCaptaReceita.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPerCaptaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPerCaptaReceitaActionPerformed(evt);
            }
        });

        jLabelQtdAlimento3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtdAlimento3.setText("Per Capta");

        jLabelQtdAlimento4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtdAlimento4.setText("Grupo:");

        jComboBoxGrupoReceita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Almoço", "Bebidas", "Café da Manhã", "Ceia", "Carnes", "Cereais", "Merenda", "Janta", " " }));

        jComboBoxUniMedidaRefeicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "GR", "KG", "LT", "ML", "PC", "UN" }));

        javax.swing.GroupLayout jPanelDadosAlimentos2Layout = new javax.swing.GroupLayout(jPanelDadosAlimentos2);
        jPanelDadosAlimentos2.setLayout(jPanelDadosAlimentos2Layout);
        jPanelDadosAlimentos2Layout.setHorizontalGroup(
            jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosAlimentos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosAlimentos2Layout.createSequentialGroup()
                        .addComponent(jLabelNomeRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDadosAlimentos2Layout.createSequentialGroup()
                        .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQtdAlimento3)
                            .addComponent(jLabelQtdAlimento4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxGrupoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosAlimentos2Layout.createSequentialGroup()
                                .addComponent(jTextFieldPerCaptaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxUniMedidaRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosAlimentos2Layout.setVerticalGroup(
            jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosAlimentos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeRefeicao)
                    .addComponent(jTextFieldNomeReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdAlimento4)
                    .addComponent(jComboBoxGrupoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosAlimentos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdAlimento3)
                    .addComponent(jTextFieldPerCaptaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUniMedidaRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabelNomeAlimento3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeAlimento3.setText("Dados da receita:");
        jLabelNomeAlimento3.setToolTipText("");
        jLabelNomeAlimento3.setAlignmentX(10.0F);
        jLabelNomeAlimento3.setAlignmentY(10.0F);

        jPanelDadosAlimentos3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosAlimentos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelDadosAlimentos3.setToolTipText("");

        javax.swing.GroupLayout jPanelDadosAlimentos3Layout = new javax.swing.GroupLayout(jPanelDadosAlimentos3);
        jPanelDadosAlimentos3.setLayout(jPanelDadosAlimentos3Layout);
        jPanelDadosAlimentos3Layout.setHorizontalGroup(
            jPanelDadosAlimentos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        jPanelDadosAlimentos3Layout.setVerticalGroup(
            jPanelDadosAlimentos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setText("Medida caseira da receita:");

        jButtonNovaReceita.setBackground(new java.awt.Color(0, 100, 0));
        jButtonNovaReceita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovaReceita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovaReceita.setText("Nova Recita");
        jButtonNovaReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaReceitaActionPerformed(evt);
            }
        });

        jButtonSalvarRecita.setBackground(new java.awt.Color(0, 100, 0));
        jButtonSalvarRecita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarRecita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarRecita.setText("Salvar Receita");
        jButtonSalvarRecita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarRecitaActionPerformed(evt);
            }
        });

        jButtonEditarReceita.setBackground(new java.awt.Color(0, 100, 0));
        jButtonEditarReceita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarReceita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarReceita.setText("Editar Receita");
        jButtonEditarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarReceitaActionPerformed(evt);
            }
        });

        jButtonExcluirReceita.setBackground(new java.awt.Color(0, 100, 0));
        jButtonExcluirReceita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirReceita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirReceita.setText("Excluir Receita");
        jButtonExcluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirReceitaActionPerformed(evt);
            }
        });

        jButtonCancelarCadReceita.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCancelarCadReceita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCadReceita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCadReceita.setText("Cancelar");
        jButtonCancelarCadReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadReceitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadAlimentosFilho1Layout = new javax.swing.GroupLayout(jPanelCadAlimentosFilho1);
        jPanelCadAlimentosFilho1.setLayout(jPanelCadAlimentosFilho1Layout);
        jPanelCadAlimentosFilho1Layout.setHorizontalGroup(
            jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabelNomeAlimento3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                        .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCadAlimentos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                                .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                                        .addComponent(jLabelPesquisarAlimentoPorNome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldBarraPesquisaRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonPesquisarRefeicao))
                                    .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                                        .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonExcluirReceita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jButtonEditarReceita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonSalvarRecita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonNovaReceita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonCancelarCadReceita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanelDadosAlimentos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPaneTabelaAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanelDadosAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelDadosAlimentos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))))
        );
        jPanelCadAlimentosFilho1Layout.setVerticalGroup(
            jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelCadAlimentos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelNomeAlimento3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDadosAlimentos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                        .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                                .addComponent(jButtonNovaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonSalvarRecita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonEditarReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluirReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jButtonCancelarCadReceita)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelCadAlimentosFilho1Layout.createSequentialGroup()
                                .addComponent(jPanelDadosAlimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCadAlimentosFilho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPesquisarRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBarraPesquisaRefeicao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPesquisarAlimentoPorNome1))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneTabelaAlimentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanelDadosAlimentos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelCadPreparacoesPai.add(jPanelCadAlimentosFilho1, "card3");

        jPanelPrincipalCadastros.add(jPanelCadPreparacoesPai, "CadPreparacoes");

        jPanelCadLocaisPai.setLayout(new java.awt.CardLayout());

        jPanelCadLocaisFilho.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadLocais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadLocais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadLocais.setText("Cadastro de Locais");
        jLabelCadLocais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanelDadosLocal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDadosLocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelDadosLocal.setToolTipText("");

        jButtonNovoLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonNovoLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNovoLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovoLocal.setText("Novo Local");

        jButtonSalvarLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonSalvarLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarLocal.setText("Salvar Local");
        jButtonSalvarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarLocalActionPerformed(evt);
            }
        });

        jButtonEditarLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonEditarLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEditarLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarLocal.setText("Editar Local");
        jButtonEditarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarLocalActionPerformed(evt);
            }
        });

        jButtonExcluirLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonExcluirLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluirLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirLocal.setText("Excluir Local");
        jButtonExcluirLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirLocalActionPerformed(evt);
            }
        });

        jButtonCancelarCadLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonCancelarCadLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCancelarCadLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCadLocal.setText("Cancelar");

        jLabelNomeLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNomeLocal.setText("Nome:");
        jLabelNomeLocal.setToolTipText("");
        jLabelNomeLocal.setAlignmentX(10.0F);
        jLabelNomeLocal.setAlignmentY(10.0F);

        jTextFieldNomeLocal.setToolTipText("");
        jTextFieldNomeLocal.setAlignmentX(10.0F);
        jTextFieldNomeLocal.setAlignmentY(10.0F);

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstado.setText("Estado:");
        jLabelEstado.setToolTipText("");
        jLabelEstado.setAlignmentX(10.0F);
        jLabelEstado.setAlignmentY(10.0F);

        jComboBoxEstado.setBackground(new java.awt.Color(0, 100, 0));
        jComboBoxEstado.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxEstado.setToolTipText("");
        jComboBoxEstado.setAlignmentX(10.0F);
        jComboBoxEstado.setAlignmentY(10.0F);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCidade.setText("Cidade:");
        jLabelCidade.setToolTipText("");
        jLabelCidade.setAlignmentX(10.0F);
        jLabelCidade.setAlignmentY(10.0F);

        jTextFieldCidade.setToolTipText("");
        jTextFieldCidade.setAlignmentX(10.0F);
        jTextFieldCidade.setAlignmentY(10.0F);

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCEP.setText("CEP:");
        jLabelCEP.setToolTipText("");
        jLabelCEP.setAlignmentX(10.0F);
        jLabelCEP.setAlignmentY(10.0F);

        jTextFieldCEP.setToolTipText("");
        jTextFieldCEP.setAlignmentX(10.0F);
        jTextFieldCEP.setAlignmentY(10.0F);

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEndereco.setText("Endereço:");
        jLabelEndereco.setToolTipText("");
        jLabelEndereco.setAlignmentX(10.0F);
        jLabelEndereco.setAlignmentY(10.0F);

        jTextFieldEndereco.setToolTipText("");
        jTextFieldEndereco.setAlignmentX(10.0F);
        jTextFieldEndereco.setAlignmentY(10.0F);
        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLocalLayout = new javax.swing.GroupLayout(jPanelDadosLocal);
        jPanelDadosLocal.setLayout(jPanelDadosLocalLayout);
        jPanelDadosLocalLayout.setHorizontalGroup(
            jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonExcluirLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNovoLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditarLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonSalvarLocal))
                .addGap(38, 38, 38)
                .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNomeLocal)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEndereco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosLocalLayout.setVerticalGroup(
            jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNomeLocal)
                            .addComponent(jTextFieldNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstado)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCEP)
                            .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEndereco)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosLocalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButtonNovoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluirLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarCadLocal)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabelPesquisarLocalPorNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPesquisarLocalPorNome.setText("Procurar Local por Nome:");

        jTextFieldBarraPesquisaLocal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldBarraPesquisaLocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonPesquisarLocal.setBackground(new java.awt.Color(0, 100, 0));
        jButtonPesquisarLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPesquisarLocal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisarLocal.setText("Pesquisar");
        jButtonPesquisarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarLocalActionPerformed(evt);
            }
        });

        jTableDadosLocais.setForeground(new java.awt.Color(0, 100, 0));
        jTableDadosLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome do Local", "Cidade", "Endereço", "Estado", "CEP"
            }
        ));
        jTableDadosLocais.setGridColor(new java.awt.Color(0, 100, 0));
        jScrollPaneTabelaLocais.setViewportView(jTableDadosLocais);

        javax.swing.GroupLayout jPanelCadLocaisFilhoLayout = new javax.swing.GroupLayout(jPanelCadLocaisFilho);
        jPanelCadLocaisFilho.setLayout(jPanelCadLocaisFilhoLayout);
        jPanelCadLocaisFilhoLayout.setHorizontalGroup(
            jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadLocaisFilhoLayout.createSequentialGroup()
                .addGroup(jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadLocaisFilhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTabelaLocais)
                            .addGroup(jPanelCadLocaisFilhoLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabelPesquisarLocalPorNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBarraPesquisaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarLocal)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelCadLocaisFilhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDadosLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCadLocais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelCadLocaisFilhoLayout.setVerticalGroup(
            jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadLocaisFilhoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelCadLocais)
                .addGap(18, 18, 18)
                .addComponent(jPanelDadosLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBarraPesquisaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPesquisarLocalPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPaneTabelaLocais, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCadLocaisPai.add(jPanelCadLocaisFilho, "card3");

        jPanelPrincipalCadastros.add(jPanelCadLocaisPai, "CadLocais");

        jPanelConfiguracoes.setBackground(new java.awt.Color(0, 0, 0));
        jPanelConfiguracoes.setLayout(new java.awt.CardLayout());

        jPanelConfigsFilho.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Página em Manutenção");

        javax.swing.GroupLayout jPanelConfigsFilhoLayout = new javax.swing.GroupLayout(jPanelConfigsFilho);
        jPanelConfigsFilho.setLayout(jPanelConfigsFilhoLayout);
        jPanelConfigsFilhoLayout.setHorizontalGroup(
            jPanelConfigsFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfigsFilhoLayout.createSequentialGroup()
                .addContainerGap(569, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelConfigsFilhoLayout.setVerticalGroup(
            jPanelConfigsFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfigsFilhoLayout.createSequentialGroup()
                .addContainerGap(442, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelConfiguracoes.add(jPanelConfigsFilho, "card2");

        jPanelPrincipalCadastros.add(jPanelConfiguracoes, "Configuracoes");

        jInternalFrame.getContentPane().add(jPanelPrincipalCadastros);

        jSplitPaneCadastros.setRightComponent(jInternalFrame);

        jPanelContendoSplitPane.add(jSplitPaneCadastros);

        getContentPane().add(jPanelContendoSplitPane, java.awt.BorderLayout.CENTER);

        jMenuBarSuperior.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jMenuHome.setText("Home");
        jMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHomeActionPerformed(evt);
            }
        });
        jMenuBarSuperior.add(jMenuHome);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadAlimentos.setText("Alimento");
        jMenuItemCadAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAlimentosActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadAlimentos);

        jMenuItemCadPreparacoes.setText("Preparação/Receita");
        jMenuItemCadPreparacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadPreparacoesActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadPreparacoes);

        jMenuItemCadLocais.setText("Local");
        jMenuItemCadLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadLocaisActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadLocais);

        jMenuBarSuperior.add(jMenuCadastrar);

        jMenuFerramentas.setText("Configurações");
        jMenuFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFerramentasActionPerformed(evt);
            }
        });
        jMenuBarSuperior.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBarSuperior.add(jMenuSair);

        setJMenuBar(jMenuBarSuperior);

        setSize(new java.awt.Dimension(879, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jMenuItemCadAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAlimentosActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "CadAlimentos");
    }//GEN-LAST:event_jMenuItemCadAlimentosActionPerformed

    private void jButtonCadAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlimentosActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros,"CadAlimentos");
    }//GEN-LAST:event_jButtonCadAlimentosActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jButtonCadPreparacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPreparacoesActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "CadPreparacoes");
    }//GEN-LAST:event_jButtonCadPreparacoesActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLocaisActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "CadLocais");
    }//GEN-LAST:event_jButtonCadLocaisActionPerformed

    private void jButtonConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracoesActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "Configuracoes");
    }//GEN-LAST:event_jButtonConfiguracoesActionPerformed

    private void jMenuItemCadPreparacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPreparacoesActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "CadPreparacoes");
    }//GEN-LAST:event_jMenuItemCadPreparacoesActionPerformed

    private void jMenuItemCadLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadLocaisActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "CadLocais");
    }//GEN-LAST:event_jMenuItemCadLocaisActionPerformed

    private void jMenuFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFerramentasActionPerformed
        TrocaPainel.mudarPainel(jPanelPrincipalCadastros, "Configuracoes");
    }//GEN-LAST:event_jMenuFerramentasActionPerformed

    private void jButtonPesquisarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarLocalActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosLocais.getModel();
        while(this.jTableDadosLocais.getRowCount()>0){
            dtm.removeRow(0);
        }
        String pesquisa = this.jTextFieldBarraPesquisaLocal.getText();
        String consulta = "select * from locais where nome like '%"+pesquisa+"%'";
        TabelaLocais im = new TabelaLocais();
        im.consultar(dtm, consulta);
    }//GEN-LAST:event_jButtonPesquisarLocalActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonPesquisarAlimentojButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAlimentojButton9ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosAlimentos.getModel();
        
        while(this.jTableDadosAlimentos.getRowCount()>0){
            dtm.removeRow(0);
        }
        String pesquisa = this.jTextFieldBarraPesquisaAlimento.getText();
        String consulta = "select * from alimentos where nome like '%"+pesquisa+"%'";
        
        BancoNutriSystem im = new BancoNutriSystem();
        im.consultar(dtm, consulta);
    }//GEN-LAST:event_jButtonPesquisarAlimentojButton9ActionPerformed
        
    private void jTextFieldFatorCoccaojTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFatorCoccaojTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFatorCoccaojTextField10ActionPerformed

    private void jButtonAddGrupoAlimentojButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddGrupoAlimentojButton21ActionPerformed
        
        String newGroup = JOptionPane.showInputDialog("Adicionar Novo Grupo\nNome:");
        
        if(newGroup.equals(""))
            JOptionPane.showMessageDialog(null,"Por Favor! Insira um Nome ao Novo Grupo");
        else
            jComboBoxGrupoAlimento.addItem(newGroup);
    }//GEN-LAST:event_jButtonAddGrupoAlimentojButton21ActionPerformed

    private void jButtonPesquisarRefeicaojButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarRefeicaojButton9ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosReceita.getModel();
        while(this.jTableDadosReceita.getRowCount()>0){
            dtm.removeRow(0);
        }
        String pesquisa = this.jTextFieldBarraPesquisaRefeicao.getText();
        String consulta = "select * from preparacoes where id like '%"+pesquisa+"%' || nome like '%"+pesquisa+"%' || grupo like '%"+pesquisa+"%'";
        ModuloConexao im = new ModuloConexao();
        im.consultar(dtm, consulta);
    }//GEN-LAST:event_jButtonPesquisarRefeicaojButton9ActionPerformed

    private void jButtonNovaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovaReceitaActionPerformed

    private void jButtonSalvarRecitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarRecitaActionPerformed
        String nome = this.jTextFieldNomeReceita.getText();
        String grupo = (String) this.jComboBoxGrupoReceita.getSelectedItem();
        String perCapta = this.jTextFieldPerCaptaReceita.getText();
	String uniMedida = (String) this.jComboBoxUniMedidaRefeicao.getSelectedItem();
       
	// ingredientes e medida caseira

        String cad = "INSERT INTO preparacoes VALUES ('"+nome+"','"+grupo+"','"+perCapta+"','"+uniMedida+"','"+nome+"','"+nome+"')";
        ModuloConexao i = new ModuloConexao();
        i.cadastrar(cad);

        limpar(2);
        atualizar(2);
    }//GEN-LAST:event_jButtonSalvarRecitaActionPerformed

    private void jButtonEditarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarReceitaActionPerformed

    private void jButtonExcluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirReceitaActionPerformed

    private void jButtonCancelarCadReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadReceitaActionPerformed
        limpar(2);
    }//GEN-LAST:event_jButtonCancelarCadReceitaActionPerformed

    private void jButtonSalvarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlimentoActionPerformed
        String nome = this.jTextFieldNomeAlimento.getText();
        String grupo = this.jComboBoxGrupoAlimento.getItemAt(jComboBoxGrupoAlimento.getSelectedIndex());
        String preco = this.jTextFieldPrecoAlimento.getText();
        String quantidade = this.jTextFieldQtdAlimento.getText();
        String unimedida = (String) this.jComboBoxMedidaAlimento.getSelectedItem();
        String fatcorrecao = this.jTextFieldFatorCorecao.getText();
        String fatcoccao = this.jTextFieldFatorCoccao.getText();
        String nutriem100g = this.jTextFieldNutriEm100g.getText();
        
        String cad = "INSERT INTO alimentos VALUES ('"+nome+"','"+grupo+"','"+preco+"','"+quantidade+"','"+unimedida+"','"+fatcorrecao+"','"+fatcoccao+"','"+nutriem100g+"')";
        BancoNutriSystem i = new BancoNutriSystem();
        i.cadastrar(cad);
        atualizar(1);
        limpar(1);
    }//GEN-LAST:event_jButtonSalvarAlimentoActionPerformed

    private void jButtonExcluirAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAlimentoActionPerformed
        int linha = this.jTableDadosAlimentos.getSelectedRow();
        String nome = this.jTableDadosAlimentos.getValueAt(linha,0).toString();

        int mensagem = JOptionPane.showConfirmDialog(rootPane, "Deseja apagar o produto: "+nome);

        if(mensagem==0){
            String excluir = "DELETE FROM alimentos WHERE nome like'"+nome+"'";
            BancoNutriSystem exclui = new BancoNutriSystem();
            exclui.excluir(excluir);
        }
        atualizar(1);
        limpar(1);
    }//GEN-LAST:event_jButtonExcluirAlimentoActionPerformed

    private void jButtonEditarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAlimentoActionPerformed
        int linha = this.jTableDadosAlimentos.getSelectedRow();
        String nomeAlimentosNaTabela = this.jTableDadosAlimentos.getValueAt(linha,0).toString();
        int mensagem = JOptionPane.showConfirmDialog(rootPane, "Deseja alterar este produto: "+nomeAlimentosNaTabela );
       
        String nome = this.jTextFieldNomeAlimento.getText();
        String grupo = this.jComboBoxGrupoAlimento.getItemAt(jComboBoxGrupoAlimento.getSelectedIndex());
	String preco = this.jTextFieldPrecoAlimento.getText();
        String quantidade = this.jTextFieldQtdAlimento.getText();
        String unimedida = (String) this.jComboBoxMedidaAlimento.getSelectedItem();
        String fatcorrecao = this.jTextFieldFatorCorecao.getText();
        String fatcoccao = this.jTextFieldFatorCoccao.getText();
        String nutriem100g = this.jTextFieldNutriEm100g.getText();
        
        if(mensagem == 0){
            String alterar = "UPDATE alimentos SET grupo = '"+grupo+"',preco = '"+preco+"', quantidade = '"+quantidade+"', unimedida = '"+unimedida+"', fatcorrecao = '"+fatcorrecao+"', fatcoccao = '"+fatcoccao+"', nutriem100g = '"+nutriem100g+"' WHERE nome = '"+nome+"'";
            BancoNutriSystem a = new BancoNutriSystem();
            a.alterar(alterar);
        }  
        atualizar(1);
        limpar(1);
    }//GEN-LAST:event_jButtonEditarAlimentoActionPerformed

    private void jTextFieldPerCaptaReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPerCaptaReceitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPerCaptaReceitaActionPerformed

    private void jButtonSalvarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarLocalActionPerformed
        String nome = this.jTextFieldNomeLocal.getText();
        String estado = (String) this.jComboBoxEstado.getSelectedItem();
        String cidade = this.jTextFieldCidade.getText();
        String cep = this.jTextFieldCEP.getText();
        String endereco = this.jTextFieldEndereco.getText();
        
        String cad = "INSERT INTO locais VALUES ('"+nome+"','"+estado+"','"+cidade+"','"+cep+"','"+endereco+"')";
        TabelaLocais i = new TabelaLocais();
        i.cadastrar(cad);
        atualizar(3);
        limpar(3);
    }//GEN-LAST:event_jButtonSalvarLocalActionPerformed

    private void jButtonExcluirLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirLocalActionPerformed
        int linha = this.jTableDadosLocais.getSelectedRow();
        String nome = this.jTableDadosLocais.getValueAt(linha,0).toString();

        int mensagem = JOptionPane.showConfirmDialog(rootPane, "Deseja apagar o Local: "+nome);

        if(mensagem==0){
            String excluir = "DELETE FROM locais WHERE nome like'"+nome+"'";
            TabelaLocais exclui = new TabelaLocais();
            exclui.excluir(excluir);
        }
        atualizar(3);
        limpar(3);
    }//GEN-LAST:event_jButtonExcluirLocalActionPerformed

    private void jButtonEditarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarLocalActionPerformed
        int linha = this.jTableDadosLocais.getSelectedRow();
        String nomeAlimentosNaTabela = this.jTableDadosLocais.getValueAt(linha,0).toString();
        int mensagem = JOptionPane.showConfirmDialog(rootPane, "Deseja alterar este produto: "+nomeAlimentosNaTabela );
       
        String nome = this.jTextFieldNomeLocal.getText();
        String estado = (String) this.jComboBoxEstado.getSelectedItem();
	String cidade = this.jTextFieldCidade.getText();
        String endereco = this.jTextFieldEndereco.getText();
        String cep = this.jTextFieldCEP.getText();
        
        if(mensagem == 0){
            
            String alterar = "UPDATE locais SET estado = '"+estado+"',cidade = '"+cidade+"', endereco = '"+endereco+"', cep = '"+cep+"' WHERE nome = '"+nome+"'";
            TabelaLocais a = new TabelaLocais();
            a.alterar(alterar);
        }  
        atualizar(3);
        limpar(3);
    }//GEN-LAST:event_jButtonEditarLocalActionPerformed

    public void limpar(int tela){
        if(tela == 1){
            this.jTextFieldNomeAlimento.setText(null);
            this.jTextFieldPrecoAlimento.setText(null);
            this.jTextFieldQtdAlimento.setText(null);
            this.jTextFieldFatorCorecao.setText(null);
            this.jTextFieldFatorCoccao.setText(null);
            this.jTextFieldNutriEm100g.setText(null);
            this.jComboBoxMedidaAlimento.setSelectedItem(null);
        }
        if(tela == 2){
            this.jTextFieldNomeReceita.setText("");
            this.jComboBoxGrupoReceita.setSelectedIndex(0);
            this.jTextFieldPerCaptaReceita.setText("");
            this.jComboBoxUniMedidaRefeicao.setSelectedIndex(0);
            this.jTextFieldBarraPesquisaRefeicao.setText("");
        }
        if( tela == 3){
            this.jTextFieldNomeLocal.setText("");
            this.jComboBoxEstado.setSelectedIndex(0);
            this.jTextFieldCidade.setText("");
            this.jTextFieldEndereco.setText("");
            this.jTextFieldCEP.setText("");
        }
    }
    public void atualizar(int comando){
        if(comando == 1){
            DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosAlimentos.getModel();
            while(this.jTableDadosAlimentos.getRowCount()>0){
                dtm.removeRow(0);
            }
        
            String consultar = "SELECT * FROM alimentos";
            BancoNutriSystem im = new BancoNutriSystem();
            im.consultar(dtm, consultar);
        }
        if(comando == 2){
            DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosReceita.getModel();
            while(this.jTableDadosReceita.getRowCount()>0){
                dtm.removeRow(0);
            }

            String consultar = "SELECT * FROM Preparacoes";
            ModuloConexao im = new ModuloConexao();
            im.consultar(dtm, consultar);
        }
        if(comando == 3){
            DefaultTableModel dtm = (DefaultTableModel) this.jTableDadosLocais.getModel();
            while(this.jTableDadosLocais.getRowCount()>0){
                dtm.removeRow(0);
            }

            String consultar = "SELECT * FROM locais";
            TabelaLocais im = new TabelaLocais();
            im.consultar(dtm, consultar);
        }
    }
    public void cont(){     //COntador de total de produtos
        Connection conn = null;
        Statement stmt;
        ResultSet rs;
        PreparedStatement pst;
        
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/banconutrisystem","root","");
            stmt = (Statement) conn.createStatement();
        }catch(SQLException ex){
            //Logger.getLogger(ConexaoBD.class.getNome()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        try{
            pst = conn.prepareStatement("select cont(*) from alimentos");
            rs = pst.executeQuery();
            if(rs.next()){
                int cont_prod = rs.getInt("cont(*)");
               // conte.setText(""+cont_prod+" produto(s) encontrado(s)");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao tentar executar a quantidade total de produtos. "+ex.getMessage());
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastros().setVisible(true);                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddGrupoAlimento;
    private javax.swing.JButton jButtonCadAlimentos;
    private javax.swing.JButton jButtonCadLocais;
    private javax.swing.JButton jButtonCadPreparacoes;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCancelarCadAlimento;
    private javax.swing.JButton jButtonCancelarCadLocal;
    private javax.swing.JButton jButtonCancelarCadReceita;
    private javax.swing.JButton jButtonConfiguracoes;
    private javax.swing.JButton jButtonEditarAlimento;
    private javax.swing.JButton jButtonEditarLocal;
    private javax.swing.JButton jButtonEditarReceita;
    private javax.swing.JButton jButtonExcluirAlimento;
    private javax.swing.JButton jButtonExcluirLocal;
    private javax.swing.JButton jButtonExcluirReceita;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNovaReceita;
    private javax.swing.JButton jButtonNovoAlimento;
    private javax.swing.JButton jButtonNovoLocal;
    private javax.swing.JButton jButtonPesquisarAlimento;
    private javax.swing.JButton jButtonPesquisarLocal;
    private javax.swing.JButton jButtonPesquisarRefeicao;
    private javax.swing.JButton jButtonSalvarAlimento;
    private javax.swing.JButton jButtonSalvarLocal;
    private javax.swing.JButton jButtonSalvarRecita;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxGrupoAlimento;
    private javax.swing.JComboBox jComboBoxGrupoReceita;
    private javax.swing.JComboBox jComboBoxMedidaAlimento;
    private javax.swing.JComboBox jComboBoxUniMedidaRefeicao;
    private javax.swing.JInternalFrame jInternalFrame;
    private javax.swing.JLabel jLabeBannerCadastros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCadAlimentos;
    private javax.swing.JLabel jLabelCadAlimentos1;
    private javax.swing.JLabel jLabelCadLocais;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFatorCoccao;
    private javax.swing.JLabel jLabelFatorCorecao;
    private javax.swing.JLabel jLabelGrupoAlimento;
    private javax.swing.JLabel jLabelImagemFundo;
    private javax.swing.JLabel jLabelNomeAlimento;
    private javax.swing.JLabel jLabelNomeAlimento1;
    private javax.swing.JLabel jLabelNomeAlimento3;
    private javax.swing.JLabel jLabelNomeLocal;
    private javax.swing.JLabel jLabelNomeRefeicao;
    private javax.swing.JLabel jLabelNutriEm100g;
    private javax.swing.JLabel jLabelPesquisarAlimentoPorNome;
    private javax.swing.JLabel jLabelPesquisarAlimentoPorNome1;
    private javax.swing.JLabel jLabelPesquisarLocalPorNome;
    private javax.swing.JLabel jLabelPrecoAlimento;
    private javax.swing.JLabel jLabelQtdAlimento;
    private javax.swing.JLabel jLabelQtdAlimento1;
    private javax.swing.JLabel jLabelQtdAlimento2;
    private javax.swing.JLabel jLabelQtdAlimento3;
    private javax.swing.JLabel jLabelQtdAlimento4;
    private javax.swing.JLabel jLabelUnidMedida;
    private javax.swing.JMenuBar jMenuBarSuperior;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItemCadAlimentos;
    private javax.swing.JMenuItem jMenuItemCadLocais;
    private javax.swing.JMenuItem jMenuItemCadPreparacoes;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelBannerCadastros;
    private javax.swing.JPanel jPanelBotoesEsquerdaFilho;
    private javax.swing.JPanel jPanelBotoesEsquerdaPai;
    private javax.swing.JPanel jPanelCadAlimentosFilho;
    private javax.swing.JPanel jPanelCadAlimentosFilho1;
    private javax.swing.JPanel jPanelCadAlimentosPai;
    private javax.swing.JPanel jPanelCadLocaisFilho;
    private javax.swing.JPanel jPanelCadLocaisPai;
    private javax.swing.JPanel jPanelCadPreparacoesPai;
    private javax.swing.JPanel jPanelConfigsFilho;
    private javax.swing.JPanel jPanelConfiguracoes;
    private javax.swing.JPanel jPanelContendoSplitPane;
    private javax.swing.JPanel jPanelDadosAlimentos;
    private javax.swing.JPanel jPanelDadosAlimentos1;
    private javax.swing.JPanel jPanelDadosAlimentos2;
    private javax.swing.JPanel jPanelDadosAlimentos3;
    private javax.swing.JPanel jPanelDadosLocal;
    private javax.swing.JPanel jPanelInicial;
    private javax.swing.JPanel jPanelPrincipalCadastros;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneTabelaAlimentos;
    private javax.swing.JScrollPane jScrollPaneTabelaAlimentos1;
    private javax.swing.JScrollPane jScrollPaneTabelaLocais;
    private javax.swing.JSplitPane jSplitPaneCadastros;
    private javax.swing.JTable jTableDadosAlimentos;
    private javax.swing.JTable jTableDadosLocais;
    private javax.swing.JTable jTableDadosReceita;
    private javax.swing.JTable jTablePesquisaIngredientes;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBarraPesquisaAlimento;
    private javax.swing.JTextField jTextFieldBarraPesquisaLocal;
    private javax.swing.JTextField jTextFieldBarraPesquisaRefeicao;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFatorCoccao;
    private javax.swing.JTextField jTextFieldFatorCorecao;
    private javax.swing.JTextField jTextFieldNomeAlimento;
    private javax.swing.JTextField jTextFieldNomeAlimento1;
    private javax.swing.JTextField jTextFieldNomeLocal;
    private javax.swing.JTextField jTextFieldNomeReceita;
    private javax.swing.JTextField jTextFieldNutriEm100g;
    private javax.swing.JTextField jTextFieldPerCaptaReceita;
    private javax.swing.JTextField jTextFieldPrecoAlimento;
    private javax.swing.JTextField jTextFieldPrecoAlimento1;
    private javax.swing.JTextField jTextFieldQtdAlimento;
    // End of variables declaration//GEN-END:variables
}
