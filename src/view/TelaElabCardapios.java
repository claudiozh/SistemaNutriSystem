
package view;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author vinicius
 */
public class TelaElabCardapios extends javax.swing.JFrame {

    public TelaElabCardapios() {
        initComponents();
    }
    
    public void mudarPainel(JPanel painelPai, String nameCard) {
        CardLayout layout = (CardLayout) painelPai.getLayout();
        layout.show(painelPai, nameCard);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBannerCadastros = new javax.swing.JPanel();
        jLabelImagemBannerCadastros = new javax.swing.JLabel();
        jPanelContendoSpliPane = new javax.swing.JPanel();
        jSplitPaneCadastros = new javax.swing.JSplitPane();
        jPanelPaiBotoes = new javax.swing.JPanel();
        jPanelBotoesFilho = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonCadAlimentos = new javax.swing.JButton();
        jButtonCadPreparacoes = new javax.swing.JButton();
        jButtonCadLocais = new javax.swing.JButton();
        jButtonConfiguracoes = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jInternalFrame = new javax.swing.JInternalFrame();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelBrancoInicial = new javax.swing.JPanel();
        jPanelCadAlimentosPai = new javax.swing.JPanel();
        jPaneCadAlimentosFilho = new javax.swing.JPanel();
        jLabeCadlAlimentos = new javax.swing.JLabel();
        jButtonNovoAlimento = new javax.swing.JButton();
        jButtonSalvarAlimento = new javax.swing.JButton();
        jButtonEditarAlimento = new javax.swing.JButton();
        jButtonExcluirAlimento = new javax.swing.JButton();
        jPanelCentralAlimentos = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabelCidade1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanelCadPreparacoesPai = new javax.swing.JPanel();
        jPaneCadPreparFilho = new javax.swing.JPanel();
        jLabePrepar = new javax.swing.JLabel();
        jButtonNovaPreparacao = new javax.swing.JButton();
        jButtonSalvarPreparacao = new javax.swing.JButton();
        jButtonEditPreparacao = new javax.swing.JButton();
        jButtonExcluirPreparacao = new javax.swing.JButton();
        jPanelCentraPrepar = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelCadLocaisPai = new javax.swing.JPanel();
        jPaneCadLocaisFilho = new javax.swing.JPanel();
        jLabelLocais = new javax.swing.JLabel();
        jButtonNovoLocal = new javax.swing.JButton();
        jButtonEditarLocal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPaneCentralLocais = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabelEndereco = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldNomeLocal = new javax.swing.JTextField();
        jLabelNomeLocal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelConfiguracoes = new javax.swing.JPanel();
        jMenuBarSuperior = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadAlimentos = new javax.swing.JMenuItem();
        jMenuItemCadPreparacoes = new javax.swing.JMenuItem();
        jMenuItemCadLocais = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemEditAlimentos = new javax.swing.JMenuItem();
        jMenuItemEditPreparacoes = new javax.swing.JMenuItem();
        jMenuItemEditLocais = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemExcAlimentos = new javax.swing.JMenuItem();
        jMenuItemExcPreparacoes = new javax.swing.JMenuItem();
        jMenuItemExclLocais = new javax.swing.JMenuItem();
        jMenuCancelar = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastros");
        setExtendedState(6);
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jPanelBannerCadastros.setBackground(new java.awt.Color(0, 250, 154));
        jPanelBannerCadastros.setLayout(new java.awt.GridLayout(1, 0));

        jLabelImagemBannerCadastros.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelImagemBannerCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagemBannerCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_elabCardapios.png"))); // NOI18N
        jLabelImagemBannerCadastros.setText("Elaborar Cardápios");
        jLabelImagemBannerCadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelImagemBannerCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelImagemBannerCadastros.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelBannerCadastros.add(jLabelImagemBannerCadastros);

        getContentPane().add(jPanelBannerCadastros, java.awt.BorderLayout.PAGE_START);

        jPanelContendoSpliPane.setLayout(new java.awt.GridLayout(1, 0));

        jSplitPaneCadastros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSplitPaneCadastros.setDividerLocation(80);
        jSplitPaneCadastros.setContinuousLayout(true);
        jSplitPaneCadastros.setMaximumSize(new java.awt.Dimension(200, 200));
        jSplitPaneCadastros.setMinimumSize(new java.awt.Dimension(2, 2));
        jSplitPaneCadastros.setName(""); // NOI18N
        jSplitPaneCadastros.setOneTouchExpandable(true);

        jPanelPaiBotoes.setLayout(new java.awt.CardLayout());

        jPanelBotoesFilho.setBackground(java.awt.Color.white);

        jButtonHome.setBackground(java.awt.Color.white);
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_home.png"))); // NOI18N
        jButtonHome.setToolTipText("Voltar â Tela Inicial");
        jButtonHome.setAlignmentX(0.5F);
        jButtonHome.setBorder(null);
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonCadAlimentos.setBackground(java.awt.Color.white);
        jButtonCadAlimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_alimentos.png"))); // NOI18N
        jButtonCadAlimentos.setToolTipText("Cadastrar Alimentos");
        jButtonCadAlimentos.setAlignmentX(0.5F);
        jButtonCadAlimentos.setBorder(null);
        jButtonCadAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAlimentosActionPerformed(evt);
            }
        });

        jButtonCadPreparacoes.setBackground(java.awt.Color.white);
        jButtonCadPreparacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_receitas.png"))); // NOI18N
        jButtonCadPreparacoes.setToolTipText("Cadastrar Preparações/Receitas");
        jButtonCadPreparacoes.setAlignmentX(0.5F);
        jButtonCadPreparacoes.setBorder(null);
        jButtonCadPreparacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPreparacoesActionPerformed(evt);
            }
        });

        jButtonCadLocais.setBackground(java.awt.Color.white);
        jButtonCadLocais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_locais.png"))); // NOI18N
        jButtonCadLocais.setToolTipText("Cadastrar Locais");
        jButtonCadLocais.setAlignmentX(0.5F);
        jButtonCadLocais.setBorder(null);
        jButtonCadLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLocaisActionPerformed(evt);
            }
        });

        jButtonConfiguracoes.setBackground(java.awt.Color.white);
        jButtonConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_confgs.png"))); // NOI18N
        jButtonConfiguracoes.setToolTipText("Configurações");
        jButtonConfiguracoes.setAlignmentX(0.5F);
        jButtonConfiguracoes.setBorder(null);
        jButtonConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracoesActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(java.awt.Color.white);
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_cancel.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setAlignmentX(0.5F);
        jButtonCancelar.setBorder(null);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesFilhoLayout = new javax.swing.GroupLayout(jPanelBotoesFilho);
        jPanelBotoesFilho.setLayout(jPanelBotoesFilhoLayout);
        jPanelBotoesFilhoLayout.setHorizontalGroup(
            jPanelBotoesFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addComponent(jButtonCadAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCadPreparacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCadLocais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBotoesFilhoLayout.setVerticalGroup(
            jPanelBotoesFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesFilhoLayout.createSequentialGroup()
                .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadPreparacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadLocais, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        );

        jPanelPaiBotoes.add(jPanelBotoesFilho, "PainelBotoes");

        jSplitPaneCadastros.setLeftComponent(jPanelPaiBotoes);

        jInternalFrame.setVisible(true);
        jInternalFrame.getContentPane().setLayout(new java.awt.CardLayout());

        jPanelPrincipal.setLayout(new java.awt.CardLayout());

        jPanelBrancoInicial.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelBrancoInicialLayout = new javax.swing.GroupLayout(jPanelBrancoInicial);
        jPanelBrancoInicial.setLayout(jPanelBrancoInicialLayout);
        jPanelBrancoInicialLayout.setHorizontalGroup(
            jPanelBrancoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        jPanelBrancoInicialLayout.setVerticalGroup(
            jPanelBrancoInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(jPanelBrancoInicial, "card6");

        jPanelCadAlimentosPai.setLayout(new java.awt.CardLayout());

        jPaneCadAlimentosFilho.setBackground(new java.awt.Color(102, 102, 102));

        jLabeCadlAlimentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabeCadlAlimentos.setForeground(new java.awt.Color(255, 255, 255));
        jLabeCadlAlimentos.setText("Cadastro de Alimentos");

        jButtonNovoAlimento.setBackground(java.awt.Color.white);
        jButtonNovoAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_novo.png"))); // NOI18N
        jButtonNovoAlimento.setToolTipText("Novo");
        jButtonNovoAlimento.setBorderPainted(false);
        jButtonNovoAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovoAlimento.setOpaque(false);

        jButtonSalvarAlimento.setBackground(java.awt.Color.white);
        jButtonSalvarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_salvar.png"))); // NOI18N
        jButtonSalvarAlimento.setToolTipText("Salvar");
        jButtonSalvarAlimento.setBorderPainted(false);
        jButtonSalvarAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvarAlimento.setOpaque(false);

        jButtonEditarAlimento.setBackground(java.awt.Color.white);
        jButtonEditarAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_edit.png"))); // NOI18N
        jButtonEditarAlimento.setToolTipText("Editar");
        jButtonEditarAlimento.setBorderPainted(false);
        jButtonEditarAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditarAlimento.setOpaque(false);

        jButtonExcluirAlimento.setBackground(java.awt.Color.white);
        jButtonExcluirAlimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_excluir.png"))); // NOI18N
        jButtonExcluirAlimento.setToolTipText("Excluir");
        jButtonExcluirAlimento.setBorderPainted(false);
        jButtonExcluirAlimento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluirAlimento.setOpaque(false);

        jPanelCentralAlimentos.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCidade1.setText("Grupo");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        jButton3.setText("Pesquisar");

        jLabel5.setText("Nome:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanelCentralAlimentosLayout = new javax.swing.GroupLayout(jPanelCentralAlimentos);
        jPanelCentralAlimentos.setLayout(jPanelCentralAlimentosLayout);
        jPanelCentralAlimentosLayout.setHorizontalGroup(
            jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralAlimentosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralAlimentosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(jPanelCentralAlimentosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanelCentralAlimentosLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(104, 104, 104))
        );
        jPanelCentralAlimentosLayout.setVerticalGroup(
            jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralAlimentosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCidade1)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151)
                .addGroup(jPanelCentralAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPaneCadAlimentosFilhoLayout = new javax.swing.GroupLayout(jPaneCadAlimentosFilho);
        jPaneCadAlimentosFilho.setLayout(jPaneCadAlimentosFilhoLayout);
        jPaneCadAlimentosFilhoLayout.setHorizontalGroup(
            jPaneCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadAlimentosFilhoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPaneCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarAlimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarAlimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoAlimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCentralAlimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPaneCadAlimentosFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeCadlAlimentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneCadAlimentosFilhoLayout.setVerticalGroup(
            jPaneCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadAlimentosFilhoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabeCadlAlimentos)
                .addGap(35, 35, 35)
                .addGroup(jPaneCadAlimentosFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentralAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPaneCadAlimentosFilhoLayout.createSequentialGroup()
                        .addComponent(jButtonNovoAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditarAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirAlimento)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelCadAlimentosPai.add(jPaneCadAlimentosFilho, "ExcluirLocal");

        jPanelPrincipal.add(jPanelCadAlimentosPai, "CadAlimentos");

        jPanelCadPreparacoesPai.setLayout(new java.awt.CardLayout());

        jPaneCadPreparFilho.setBackground(new java.awt.Color(102, 102, 102));

        jLabePrepar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabePrepar.setForeground(new java.awt.Color(255, 255, 255));
        jLabePrepar.setText("Cadastro de Preparações/Receitas");

        jButtonNovaPreparacao.setBackground(java.awt.Color.white);
        jButtonNovaPreparacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_novo.png"))); // NOI18N
        jButtonNovaPreparacao.setToolTipText("Novo");
        jButtonNovaPreparacao.setBorderPainted(false);
        jButtonNovaPreparacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovaPreparacao.setOpaque(false);

        jButtonSalvarPreparacao.setBackground(java.awt.Color.white);
        jButtonSalvarPreparacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_salvar.png"))); // NOI18N
        jButtonSalvarPreparacao.setToolTipText("Salvar");
        jButtonSalvarPreparacao.setBorderPainted(false);
        jButtonSalvarPreparacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvarPreparacao.setOpaque(false);

        jButtonEditPreparacao.setBackground(java.awt.Color.white);
        jButtonEditPreparacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_edit.png"))); // NOI18N
        jButtonEditPreparacao.setToolTipText("Editar");
        jButtonEditPreparacao.setBorderPainted(false);
        jButtonEditPreparacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditPreparacao.setOpaque(false);

        jButtonExcluirPreparacao.setBackground(java.awt.Color.white);
        jButtonExcluirPreparacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_excluir.png"))); // NOI18N
        jButtonExcluirPreparacao.setToolTipText("Excluir");
        jButtonExcluirPreparacao.setBorderPainted(false);
        jButtonExcluirPreparacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluirPreparacao.setOpaque(false);

        jPanelCentraPrepar.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        jButton8.setText("Pesquisar");

        jLabel6.setText("Nome:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanelCentraPreparLayout = new javax.swing.GroupLayout(jPanelCentraPrepar);
        jPanelCentraPrepar.setLayout(jPanelCentraPreparLayout);
        jPanelCentraPreparLayout.setHorizontalGroup(
            jPanelCentraPreparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentraPreparLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelCentraPreparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentraPreparLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))
                    .addGroup(jPanelCentraPreparLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanelCentraPreparLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(104, 104, 104))
        );
        jPanelCentraPreparLayout.setVerticalGroup(
            jPanelCentraPreparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentraPreparLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelCentraPreparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addGroup(jPanelCentraPreparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPaneCadPreparFilhoLayout = new javax.swing.GroupLayout(jPaneCadPreparFilho);
        jPaneCadPreparFilho.setLayout(jPaneCadPreparFilhoLayout);
        jPaneCadPreparFilhoLayout.setHorizontalGroup(
            jPaneCadPreparFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadPreparFilhoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPaneCadPreparFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditPreparacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarPreparacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovaPreparacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirPreparacao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCentraPrepar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPaneCadPreparFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabePrepar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneCadPreparFilhoLayout.setVerticalGroup(
            jPaneCadPreparFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadPreparFilhoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabePrepar)
                .addGap(35, 35, 35)
                .addGroup(jPaneCadPreparFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentraPrepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPaneCadPreparFilhoLayout.createSequentialGroup()
                        .addComponent(jButtonNovaPreparacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarPreparacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditPreparacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirPreparacao)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelCadPreparacoesPai.add(jPaneCadPreparFilho, "ExcluirLocal");

        jPanelPrincipal.add(jPanelCadPreparacoesPai, "CadPreparacoes");

        jPanelCadLocaisPai.setLayout(new java.awt.CardLayout());

        jPaneCadLocaisFilho.setBackground(new java.awt.Color(102, 102, 102));

        jLabelLocais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLocais.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLocais.setText("Cadastro de Locais");

        jButtonNovoLocal.setBackground(java.awt.Color.white);
        jButtonNovoLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_novo.png"))); // NOI18N
        jButtonNovoLocal.setToolTipText("Novo");
        jButtonNovoLocal.setBorderPainted(false);
        jButtonNovoLocal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovoLocal.setOpaque(false);

        jButtonEditarLocal.setBackground(java.awt.Color.white);
        jButtonEditarLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_salvar.png"))); // NOI18N
        jButtonEditarLocal.setToolTipText("Salvar");
        jButtonEditarLocal.setBorderPainted(false);
        jButtonEditarLocal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditarLocal.setOpaque(false);

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_edit.png"))); // NOI18N
        jButton4.setToolTipText("Editar");
        jButton4.setBorderPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setOpaque(false);

        jButton5.setBackground(java.awt.Color.white);
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_excluir.png"))); // NOI18N
        jButton5.setToolTipText("Excluir");
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setOpaque(false);

        jPaneCentralLocais.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelEndereco.setText("CEP:");

        jLabel2.setText("Endereço:");

        jLabelCidade.setText("Estado:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        jButton2.setText("Pesquisar");

        jLabelNomeLocal.setText("Cidade:");

        jLabel3.setText("Nome:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPaneCentralLocaisLayout = new javax.swing.GroupLayout(jPaneCentralLocais);
        jPaneCentralLocais.setLayout(jPaneCentralLocaisLayout);
        jPaneCentralLocaisLayout.setHorizontalGroup(
            jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                        .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNomeLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextFieldNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(104, 104, 104))
        );
        jPaneCentralLocaisLayout.setVerticalGroup(
            jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                        .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextFieldNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNomeLocal))))
                    .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneCentralLocaisLayout.createSequentialGroup()
                            .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelCidade)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneCentralLocaisLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelEndereco)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPaneCentralLocaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPaneCadLocaisFilhoLayout = new javax.swing.GroupLayout(jPaneCadLocaisFilho);
        jPaneCadLocaisFilho.setLayout(jPaneCadLocaisFilhoLayout);
        jPaneCadLocaisFilhoLayout.setHorizontalGroup(
            jPaneCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadLocaisFilhoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPaneCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovoLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneCentralLocais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPaneCadLocaisFilhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLocais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneCadLocaisFilhoLayout.setVerticalGroup(
            jPaneCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCadLocaisFilhoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelLocais)
                .addGap(35, 35, 35)
                .addGroup(jPaneCadLocaisFilhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneCentralLocais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPaneCadLocaisFilhoLayout.createSequentialGroup()
                        .addComponent(jButtonNovoLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditarLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelCadLocaisPai.add(jPaneCadLocaisFilho, "ExcluirLocal");

        jPanelPrincipal.add(jPanelCadLocaisPai, "CadLocais");

        jPanelConfiguracoes.setBackground(java.awt.Color.white);
        jPanelConfiguracoes.setLayout(new java.awt.CardLayout());
        jPanelPrincipal.add(jPanelConfiguracoes, "Configuracoes");

        jInternalFrame.getContentPane().add(jPanelPrincipal, "card2");

        jSplitPaneCadastros.setRightComponent(jInternalFrame);

        jPanelContendoSpliPane.add(jSplitPaneCadastros);

        getContentPane().add(jPanelContendoSpliPane, java.awt.BorderLayout.CENTER);

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

        jMenuEditar.setText("Editar");

        jMenuItemEditAlimentos.setText("Alimento");
        jMenuEditar.add(jMenuItemEditAlimentos);

        jMenuItemEditPreparacoes.setText("Preparação/Receita");
        jMenuEditar.add(jMenuItemEditPreparacoes);

        jMenuItemEditLocais.setText("Local");
        jMenuEditar.add(jMenuItemEditLocais);

        jMenuBarSuperior.add(jMenuEditar);

        jMenu4.setText("Excluir");

        jMenuItemExcAlimentos.setText("Alimento");
        jMenu4.add(jMenuItemExcAlimentos);

        jMenuItemExcPreparacoes.setText("Preparação/Receita");
        jMenu4.add(jMenuItemExcPreparacoes);

        jMenuItemExclLocais.setText("Local");
        jMenu4.add(jMenuItemExclLocais);

        jMenuBarSuperior.add(jMenu4);

        jMenuCancelar.setText("Cancelar");
        jMenuBarSuperior.add(jMenuCancelar);

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

        setSize(new java.awt.Dimension(841, 639));
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
             
    }//GEN-LAST:event_jMenuItemCadAlimentosActionPerformed

    private void jButtonCadAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAlimentosActionPerformed
        
    }//GEN-LAST:event_jButtonCadAlimentosActionPerformed

    private void jMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHomeActionPerformed

    private void jButtonCadPreparacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPreparacoesActionPerformed
        
    }//GEN-LAST:event_jButtonCadPreparacoesActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCadLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLocaisActionPerformed
        
    }//GEN-LAST:event_jButtonCadLocaisActionPerformed

    private void jButtonConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracoesActionPerformed
        
    }//GEN-LAST:event_jButtonConfiguracoesActionPerformed

    private void jMenuItemCadPreparacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadPreparacoesActionPerformed
        mudarPainel(jPanelPrincipal, "CadPreparacoes");
    }//GEN-LAST:event_jMenuItemCadPreparacoesActionPerformed

    private void jMenuItemCadLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadLocaisActionPerformed
        
    }//GEN-LAST:event_jMenuItemCadLocaisActionPerformed

    private void jMenuFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFerramentasActionPerformed
        
    }//GEN-LAST:event_jMenuFerramentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaElabCardapios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElabCardapios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElabCardapios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElabCardapios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElabCardapios().setVisible(true);                               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonCadAlimentos;
    private javax.swing.JButton jButtonCadLocais;
    private javax.swing.JButton jButtonCadPreparacoes;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfiguracoes;
    private javax.swing.JButton jButtonEditPreparacao;
    private javax.swing.JButton jButtonEditarAlimento;
    private javax.swing.JButton jButtonEditarLocal;
    private javax.swing.JButton jButtonExcluirAlimento;
    private javax.swing.JButton jButtonExcluirPreparacao;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNovaPreparacao;
    private javax.swing.JButton jButtonNovoAlimento;
    private javax.swing.JButton jButtonNovoLocal;
    private javax.swing.JButton jButtonSalvarAlimento;
    private javax.swing.JButton jButtonSalvarPreparacao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame;
    private javax.swing.JLabel jLabeCadlAlimentos;
    private javax.swing.JLabel jLabePrepar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidade1;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelImagemBannerCadastros;
    private javax.swing.JLabel jLabelLocais;
    private javax.swing.JLabel jLabelNomeLocal;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBarSuperior;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenu jMenuCancelar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItemCadAlimentos;
    private javax.swing.JMenuItem jMenuItemCadLocais;
    private javax.swing.JMenuItem jMenuItemCadPreparacoes;
    private javax.swing.JMenuItem jMenuItemEditAlimentos;
    private javax.swing.JMenuItem jMenuItemEditLocais;
    private javax.swing.JMenuItem jMenuItemEditPreparacoes;
    private javax.swing.JMenuItem jMenuItemExcAlimentos;
    private javax.swing.JMenuItem jMenuItemExcPreparacoes;
    private javax.swing.JMenuItem jMenuItemExclLocais;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPaneCadAlimentosFilho;
    private javax.swing.JPanel jPaneCadLocaisFilho;
    private javax.swing.JPanel jPaneCadPreparFilho;
    private javax.swing.JPanel jPaneCentralLocais;
    private javax.swing.JPanel jPanelBannerCadastros;
    private javax.swing.JPanel jPanelBotoesFilho;
    private javax.swing.JPanel jPanelBrancoInicial;
    private javax.swing.JPanel jPanelCadAlimentosPai;
    private javax.swing.JPanel jPanelCadLocaisPai;
    private javax.swing.JPanel jPanelCadPreparacoesPai;
    private javax.swing.JPanel jPanelCentraPrepar;
    private javax.swing.JPanel jPanelCentralAlimentos;
    private javax.swing.JPanel jPanelConfiguracoes;
    private javax.swing.JPanel jPanelContendoSpliPane;
    private javax.swing.JPanel jPanelPaiBotoes;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPaneCadastros;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNomeLocal;
    // End of variables declaration//GEN-END:variables
}
