package sistemaconsultorio;


public class TelaCadastro extends javax.swing.JFrame {
    EntidadeCliente e1 = new EntidadeCliente();

    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoFone01 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoFone02 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoDataNasc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoIdade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoSexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        campoEstadoCivil = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoCel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoUf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campoEnd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoSetor = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        campoNum = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        campoMotivoConsulta = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tratMed = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        campMed = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        campoAlergiaMed = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        campoGravidez = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        campoMesGravidez = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        campoProbRen = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        campoReacao = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        campoProbCoracao = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        campoProbResp = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        campoAnestesia = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        campoAnemia = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        campoHepatite = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        campoDesmaio = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        campoHemor = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        campoDiabetes = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        campoFebreReum = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        campoGengiva = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        campoSense = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        campoFuma = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        jRadioButton1.setText("jRadioButton1");

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 1, 24)); // NOI18N
        jLabel2.setText("Ficha Odontológica");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CPF:");

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Telefone 01:");

        campoFone01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFone01ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Telefone 02:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");

        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Data de Nascimento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Idade:");

        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Sexo:");

        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Feminino", " ", " ", " " }));
        campoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSexoActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado Civil:");

        campoEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)", " " }));
        campoEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoCivilActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Identificação:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Celular:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Endereço:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Cidade:");

        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("UF:");

        campoUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUfActionPerformed(evt);
            }
        });

        jLabel19.setText("Setor:");

        jLabel20.setText("Número:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Inventário de Saúde:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("(Informações respondidas pelo cliente)");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Motivo da Consulta:");

        campoMotivoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Está em tratamento médico:");

        tratMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tratMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sim", "Não", " ", " " }));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Está utilizando algum medicamento? Qual? ");

        campMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Tem alergia a algum medicamento? Qual? ");

        campoAlergiaMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Está grávida?");

        campoGravidez.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoGravidez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim", " " }));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Quantos meses?");

        campoMesGravidez.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoMesGravidez.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", " " }));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Já fez uso de anestesia?");

        campoProbRen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoProbRen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Alguma reação não usual?");

        campoReacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoReacaoActionPerformed(evt);
            }
        });

        jLabel31.setText("Problemas no Coração: ");

        campoProbCoracao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoProbCoracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel32.setText("Problema Respiratório:");

        campoProbResp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoProbResp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel33.setText("Problemas Renais:");

        campoAnestesia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoAnestesia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel34.setText("Anemia:");

        campoAnemia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoAnemia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel35.setText("Hepatite:");

        campoHepatite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoHepatite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel36.setText("Já desmaiou?");

        campoDesmaio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoDesmaio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel37.setText("Teve hemorragia? ");

        campoHemor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoHemor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel38.setText("Diabetes:");

        campoDiabetes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoDiabetes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel39.setText("Febre reumática: ");

        campoFebreReum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoFebreReum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel40.setText("Sua gengiva sangra?");

        campoGengiva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoGengiva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel41.setText("Sensibilidade nos dentes? ");

        campoSense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoSense.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        jLabel42.setText("Fuma?");

        campoFuma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoFuma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Não", "Sim" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                        .addComponent(campoCel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(38, 38, 38)
                                                .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(57, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoFone02, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel14)
                                .addContainerGap(269, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(368, 368, 368)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(178, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDesmaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoHemor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFebreReum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40)
                                .addGap(31, 31, 31)
                                .addComponent(campoGengiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoProbCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoProbResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoProbRen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoAnemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addComponent(campoFone01, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(47, 47, 47)
                                .addComponent(campoMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tratMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoAlergiaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(341, 341, 341)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(77, 77, 77)
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoSense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoFuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoAnestesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoReacao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jButton1)
                                        .addGap(114, 114, 114)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoGravidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoMesGravidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(campMed, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(51, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(campoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(campoEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoFone01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(campoFone02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(campoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel12)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(campoEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(campoUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(campoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel18)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(campoMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(tratMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(campoAlergiaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(campoGravidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(campoMesGravidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(campoReacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAnestesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(campoProbCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(campoProbResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(campoProbRen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(campoAnemia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(campoHepatite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(campoDesmaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(campoHemor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(campoDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(campoFebreReum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(campoGengiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(campoSense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(campoFuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void campoFone01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFone01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFone01ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     e1.setNome(campoNome.getText());
     e1.setCpf(campoCpf.getText());
     e1.setSexo((String) campoSexo.getSelectedItem());
     e1.setIdade(Integer.parseInt(campoIdade.getText()));
     e1.setEstadoCivil((String) campoEstadoCivil.getSelectedItem());
     e1.setFone01(Integer.parseInt(campoFone01.getText()));
     e1.setFone02(Integer.parseInt(campoFone02.getText()));
     e1.setCelular(Integer.parseInt(campoCel.getText()));
     e1.setEndereco(campoEnd.getText());
     e1.setCidade(campoCidade.getText());
     e1.setUf(campoUf.getText());
     e1.setSetor(campoSetor.getText());
     e1.setNum(Integer.parseInt(campoNum.getText()));
     e1.setMotivoConsulta(campoMotivoConsulta.getText());
     e1.setTratMed((String) tratMed.getSelectedItem());
     e1.setMedicamento(campMed.getText());
     e1.setAlergiaMed(campoAlergiaMed.getText());
     e1.setGravidez((String) campoGravidez.getSelectedItem());
     e1.setMesGravidez((int) campoMesGravidez.getSelectedItem());
     e1.setAnestesia((String) campoAnestesia.getSelectedItem());
     e1.setReacao(campoReacao.getText());
     e1.setProbCoracao((String) campoProbCoracao.getSelectedItem());
     e1.setProbResp((String) campoProbResp.getSelectedItem());
     e1.setProbRen((String) campoProbRen.getSelectedItem());
     e1.setAnemia((String) campoAnemia.getSelectedItem());
     e1.setHepatite((String) campoHepatite.getSelectedItem());
     e1.setDesmaio((String) campoDesmaio.getSelectedItem());
     e1.setHemorragia((String) campoHemor.getSelectedItem());
     e1.setDiabetes((String) campoDiabetes.getSelectedItem());
     e1.setFebreReum((String) campoFebreReum.getSelectedItem());
     e1.setGengiva((String) campoGengiva.getSelectedItem());
     e1.setSensibilidade((String) campoSense.getSelectedItem());
     e1.setFuma((String) campoFuma.getSelectedItem());
   
   
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdadeActionPerformed

    private void campoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSexoActionPerformed

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void campoUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUfActionPerformed

    private void campoReacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoReacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoReacaoActionPerformed

    private void campoEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoCivilActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botão Limpar
        
        campoNome.setText("");
        campoCpf.setText("");
        campoSexo.setSelectedItem("-");
        campoIdade.setText("");
        campoEstadoCivil.setSelectedItem("-");
        campoFone01.setText("");
        campoFone02.setText("");
        campoCel.setText("");
        campoEnd.setText("");
        campoCidade.setText("");
        campoUf.setText("");
        campoSetor.setText("");
        campoNum.setText("");
        campoMotivoConsulta.setText("");
        tratMed.setSelectedItem("-");
        campMed.setText("");
        campoAlergiaMed.setText("");
        campoReacao.setText("");
        campoGravidez.setSelectedItem("Não");
        campoMesGravidez.setSelectedItem("-");
        campoAnestesia.setSelectedItem("-");
        campoProbCoracao.setSelectedItem("-");
        campoProbResp.setSelectedItem("-");
        campoProbRen.setSelectedItem("-");
        campoAnemia.setSelectedItem("-");
        campoHepatite.setSelectedItem("-");
        campoDesmaio.setSelectedItem("-");
        campoHemor.setSelectedItem("-");
        campoDiabetes.setSelectedItem("-");
        campoFebreReum.setSelectedItem("-");
        campoGengiva.setSelectedItem("-");
        campoSense.setSelectedItem("-");
        campoFuma.setSelectedItem("-");
        
    }//GEN-LAST:event_jButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campMed;
    private javax.swing.JTextField campoAlergiaMed;
    private javax.swing.JComboBox<String> campoAnemia;
    private javax.swing.JComboBox<String> campoAnestesia;
    private javax.swing.JTextField campoCel;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoDataNasc;
    private javax.swing.JComboBox<String> campoDesmaio;
    private javax.swing.JComboBox<String> campoDiabetes;
    private javax.swing.JTextField campoEnd;
    private javax.swing.JComboBox<String> campoEstadoCivil;
    private javax.swing.JComboBox<String> campoFebreReum;
    private javax.swing.JTextField campoFone01;
    private javax.swing.JTextField campoFone02;
    private javax.swing.JComboBox<String> campoFuma;
    private javax.swing.JComboBox<String> campoGengiva;
    private javax.swing.JComboBox<String> campoGravidez;
    private javax.swing.JComboBox<String> campoHemor;
    private javax.swing.JComboBox<String> campoHepatite;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JComboBox<String> campoMesGravidez;
    private javax.swing.JTextField campoMotivoConsulta;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNum;
    private javax.swing.JComboBox<String> campoProbCoracao;
    private javax.swing.JComboBox<String> campoProbRen;
    private javax.swing.JComboBox<String> campoProbResp;
    private javax.swing.JTextField campoReacao;
    private javax.swing.JComboBox<String> campoSense;
    private javax.swing.JTextField campoSetor;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField campoUf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    private javax.swing.JComboBox<String> tratMed;
    // End of variables declaration//GEN-END:variables
}
