
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Albert
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        this.setLocationRelativeTo(null);
        Panel();

    }

    private boolean foco;

    private void Panel() {

        NumbersOctal.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                //System.out.println("El campo ha ganado el foco");

                num = 0;

                foco = true;

                Respuesta.setText("");

                if (NotOctal) {
                    //ResetCheckBoxes();
                    //NumbersOctal.setText("");
                    num = 0;
                }

            }

            @Override
            public void focusLost(FocusEvent e) {

                Component button = e.getOppositeComponent();

                if (button != Chmod) {

                    //System.out.println("El campo ha perdido el foco");
                    num = 0;

                    foco = false;

                    Respuesta.setText("");

                }

            }
        });

        ListenCheckBoxes();

    }

    private void ListenCheckBoxes() {

        ReadOwner.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        WriteOwner.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        ExecuteOwner.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        ReadGroup.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        WriteGroup.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        ExecuteGroup.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        ReadOthers.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        WriteOthers.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        ExecuteOthers.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        StickyBit.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        GID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

        UID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (NotOctal) {

                    Respuesta.setText("");

                    num = 0;

                    NotOctal = false;

                    foco = false;
                }

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    num = 0;

                    foco = false;

                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ReadOwner = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        WriteOwner = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        ExecuteOwner = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        ReadGroup = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        WriteGroup = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        ExecuteGroup = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        ReadOthers = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        WriteOthers = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        ExecuteOthers = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        UID = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        GID = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        StickyBit = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        NumbersOctal = new javax.swing.JTextField();
        Chmod = new javax.swing.JButton();
        Respuesta = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linux Chmod GUI");
        setResizable(false);

        jLabel1.setText("Propietario:");

        jLabel2.setText("Grupo:");

        jLabel3.setText("Otros:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("R");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("W");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("X");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("R");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("W");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("X");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("R");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("W");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("X");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Asigna UID");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Asigna GID");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Sticky Bit");

        NumbersOctal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumbersOctalKeyTyped(evt);
            }
        });

        Chmod.setText("Chmod");
        Chmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChmodActionPerformed(evt);
            }
        });

        Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Octal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel16))
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReadOwner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WriteOwner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExecuteOwner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReadGroup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WriteGroup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExecuteGroup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ReadOthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WriteOthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExecuteOthers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Respuesta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumbersOctal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StickyBit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Chmod)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(ReadOwner))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ExecuteOwner)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(WriteOwner)
                                        .addComponent(jLabel7)))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ReadGroup)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ExecuteGroup)
                                .addComponent(jLabel11))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(WriteGroup)
                                .addComponent(jLabel8)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(ReadOthers))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ExecuteOthers)
                                .addComponent(jLabel12))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(WriteOthers)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UID)
                            .addComponent(jLabel13))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GID)
                            .addComponent(jLabel14))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StickyBit)
                            .addComponent(jLabel15))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumbersOctal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(Chmod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumbersOctalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumbersOctalKeyTyped
        // TODO add your handling code here:

        int keyChar = evt.getKeyChar();

        if (!Character.isDigit(keyChar)) {

            evt.consume();

        }

        if (NumbersOctal.getText().length() == 4) {
            evt.consume();

        }

    }//GEN-LAST:event_NumbersOctalKeyTyped

    private int num = 0;

    private void ChmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChmodActionPerformed
        // TODO add your handling code here:

        //System.out.println("Foco: " + foco);
        Respuesta.setText("");

        if (!foco) {

            CalcularCasillas();

        } else {

            CalcularNumeros();

        }


    }//GEN-LAST:event_ChmodActionPerformed

    boolean[][] CheckBoxes = new boolean[3][4];

    private void CalcularCasillas() {

        num = 0;

        for (int i = 0; i < CheckBoxes.length; i++) {

            for (int j = 0; j < CheckBoxes[i].length; j++) {

                CheckBoxes[i][j] = false;
            }
        }

        LlenarCasillas();

        //PrintarArray();
        NumeroCasillas();

    }

    private void NumeroCasillas() {

        if (CheckBoxes[0][0]) {

            num = num + 400;
        }
        if (CheckBoxes[0][1]) {

            num = num + 200;
        }

        if (CheckBoxes[0][2]) {

            num = num + 100;

        }

        if (CheckBoxes[0][3]) {

            num = num + 4000;

        }

        if (CheckBoxes[1][0]) {

            num = num + 40;

        }

        if (CheckBoxes[1][1]) {

            num = num + 20;

        }

        if (CheckBoxes[1][2]) {

            num = num + 10;

        }

        if (CheckBoxes[1][3]) {

            num = num + 2000;

        }

        if (CheckBoxes[2][0]) {

            num = num + 4;

        }

        if (CheckBoxes[2][1]) {

            num = num + 2;

        }

        if (CheckBoxes[2][2]) {

            num = num + 1;

        }

        if (CheckBoxes[2][3]) {

            num = num + 1000;

        }

        NumbersOctal.setText(String.valueOf(num));

    }

    private void LlenarCasillas() {

        if (ReadOwner.isSelected()) {

            CheckBoxes[0][0] = true;

        }

        if (WriteOwner.isSelected()) {

            CheckBoxes[0][1] = true;

        }

        if (ExecuteOwner.isSelected()) {

            CheckBoxes[0][2] = true;

        }

        if (UID.isSelected()) {

            CheckBoxes[0][3] = true;

        }

        if (ReadGroup.isSelected()) {

            CheckBoxes[1][0] = true;

        }

        if (WriteGroup.isSelected()) {

            CheckBoxes[1][1] = true;

        }

        if (ExecuteGroup.isSelected()) {

            CheckBoxes[1][2] = true;

        }

        if (GID.isSelected()) {

            CheckBoxes[1][3] = true;

        }

        if (ReadOthers.isSelected()) {

            CheckBoxes[2][0] = true;

        }

        if (WriteOthers.isSelected()) {

            CheckBoxes[2][1] = true;

        }

        if (ExecuteOthers.isSelected()) {

            CheckBoxes[2][2] = true;

        }

        if (StickyBit.isSelected()) {

            CheckBoxes[2][3] = true;

        }

    }

    /*private void PrintarArray(){
        
        for (int i = 0; i < CheckBoxes.length; i++) {
            
            for (int j = 0; j < CheckBoxes[i].length; j++) {
                
                System.out.print(CheckBoxes[i][j] + " ");
                
                
                
            }
            
            System.out.println();
            
        }
        
    }*/
    private void CalcularNumeros() {

        String numero = NumbersOctal.getText();

        Respuesta.setHorizontalAlignment(Respuesta.CENTER);

        if (EsOctal(numero)) {

            ResetCheckBoxes();

            DesglosarNumero(numero);

            NotOctal = false;

        } else if (numero.equals("") && !ComprovarCheckBoxes()) {

            Respuesta.setText("Error");

        } else if (numero.equals("") && ComprovarCheckBoxes()){
            
            CalcularCasillas();
            
        } else {
            Respuesta.setText("NO es Octal!");

            NotOctal = true;
        }

    }

    private boolean NotOctal;

    private String PrimerNumero;

    private String SegonNumero;

    private String TercerNumero;

    private String QuartNumero;

    private void QuarteNumeros(String primernumero, String segonnumero, String tercernumero, String quartnumero) {

        switch (primernumero) {
            case "1":
                StickyBit.setSelected(true);
                break;
            case "2":
                GID.setSelected(true);
                break;
            case "3":
                StickyBit.setSelected(true);
                GID.setSelected(true);
                break;
            case "4":
                UID.setSelected(true);
                break;
            case "5":
                UID.setSelected(true);
                StickyBit.setSelected(true);
                break;
            case "6":
                UID.setSelected(true);
                GID.setSelected(true);
                break;
            case "7":
                UID.setSelected(true);
                GID.setSelected(true);
                StickyBit.setSelected(true);
                break;
        }

        switch (segonnumero) {
            case "1":
                ExecuteOwner.setSelected(true);
                break;
            case "2":
                WriteOwner.setSelected(true);
                break;
            case "3":
                WriteOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
            case "4":
                ReadOwner.setSelected(true);
                break;
            case "5":
                ReadOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
            case "6":
                ReadOwner.setSelected(true);
                WriteOwner.setSelected(true);
                break;
            case "7":
                ReadOwner.setSelected(true);
                WriteOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
        }

        switch (tercernumero) {
            case "1":
                ExecuteGroup.setSelected(true);
                break;
            case "2":
                WriteGroup.setSelected(true);
                break;
            case "3":
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "4":
                ReadGroup.setSelected(true);
                break;
            case "5":
                ReadGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "6":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                break;
            case "7":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
        }

        switch (quartnumero) {
            case "1":
                ExecuteOthers.setSelected(true);
                break;
            case "2":
                WriteOthers.setSelected(true);
                break;
            case "3":
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "4":
                ReadOthers.setSelected(true);
                break;
            case "5":
                ReadOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "6":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                break;
            case "7":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
        }

    }

    private void TresNumeros(String primernumero, String segonnumero, String tercernumero) {

        switch (primernumero) {
            case "1":
                ExecuteOwner.setSelected(true);
                break;
            case "2":
                WriteOwner.setSelected(true);
                break;
            case "3":
                WriteOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
            case "4":
                ReadOwner.setSelected(true);
                break;
            case "5":
                ReadOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
            case "6":
                ReadOwner.setSelected(true);
                WriteOwner.setSelected(true);
                break;
            case "7":
                ReadOwner.setSelected(true);
                WriteOwner.setSelected(true);
                ExecuteOwner.setSelected(true);
                break;
        }

        switch (segonnumero) {
            case "1":
                ExecuteGroup.setSelected(true);
                break;
            case "2":
                WriteGroup.setSelected(true);
                break;
            case "3":
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "4":
                ReadGroup.setSelected(true);
                break;
            case "5":
                ReadGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "6":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                break;
            case "7":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
        }

        switch (tercernumero) {
            case "1":
                ExecuteOthers.setSelected(true);
                break;
            case "2":
                WriteOthers.setSelected(true);
                break;
            case "3":
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "4":
                ReadOthers.setSelected(true);
                break;
            case "5":
                ReadOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "6":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                break;
            case "7":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
        }

    }

    private void DosNumeros(String primernumero, String segonnumero) {

        switch (primernumero) {
            case "1":
                ExecuteGroup.setSelected(true);
                break;
            case "2":
                WriteGroup.setSelected(true);
                break;
            case "3":
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "4":
                ReadGroup.setSelected(true);
                break;
            case "5":
                ReadGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
            case "6":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                break;
            case "7":
                ReadGroup.setSelected(true);
                WriteGroup.setSelected(true);
                ExecuteGroup.setSelected(true);
                break;
        }

        switch (segonnumero) {
            case "1":
                ExecuteOthers.setSelected(true);
                break;
            case "2":
                WriteOthers.setSelected(true);
                break;
            case "3":
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "4":
                ReadOthers.setSelected(true);
                break;
            case "5":
                ReadOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "6":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                break;
            case "7":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
        }

    }

    private void UnNumeros(String primernumero) {

        switch (primernumero) {
            case "1":
                ExecuteOthers.setSelected(true);
                break;
            case "2":
                WriteOthers.setSelected(true);
                break;
            case "3":
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "4":
                ReadOthers.setSelected(true);
                break;
            case "5":
                ReadOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
            case "6":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                break;
            case "7":
                ReadOthers.setSelected(true);
                WriteOthers.setSelected(true);
                ExecuteOthers.setSelected(true);
                break;
        }

    }

    private void DesglosarNumero(String numero) {

        if (numero.length() == 4) {

            PrimerNumero = numero.substring(0, 1);

            SegonNumero = numero.substring(1, 2);

            TercerNumero = numero.substring(2, 3);

            QuartNumero = numero.substring(3, 4);

            QuarteNumeros(PrimerNumero, SegonNumero, TercerNumero, QuartNumero);

        } else if (numero.length() == 3) {

            PrimerNumero = numero.substring(0, 1);

            SegonNumero = numero.substring(1, 2);

            TercerNumero = numero.substring(2, 3);

            TresNumeros(PrimerNumero, SegonNumero, TercerNumero);

        } else if (numero.length() == 2) {

            PrimerNumero = numero.substring(0, 1);

            SegonNumero = numero.substring(1, 2);

            DosNumeros(PrimerNumero, SegonNumero);

        } else {

            PrimerNumero = numero;

            UnNumeros(PrimerNumero);

        }

    }

    private boolean EsOctal(String numero) {

        if (numero.matches("[0-7]+")) {
            return true;
        } else {
            return false;
        }

    }

    private void ResetCheckBoxes() {

        UID.setSelected(false);
        GID.setSelected(false);
        StickyBit.setSelected(false);

        ExecuteGroup.setSelected(false);
        ExecuteOthers.setSelected(false);
        ExecuteOwner.setSelected(false);

        ReadGroup.setSelected(false);
        ReadOthers.setSelected(false);
        ReadOwner.setSelected(false);

        WriteGroup.setSelected(false);
        WriteOthers.setSelected(false);
        WriteOwner.setSelected(false);

    }

    private boolean ComprovarCheckBoxes() {

        if (UID.isSelected()
                || GID.isSelected()
                || StickyBit.isSelected()
                || ExecuteGroup.isSelected()
                || ExecuteOthers.isSelected()
                || ExecuteOwner.isSelected()
                || ReadGroup.isSelected()
                || ReadOthers.isSelected()
                || ReadOwner.isSelected()
                || WriteGroup.isSelected()
                || WriteOthers.isSelected()
                || WriteOwner.isSelected()) {

            return true;

        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chmod;
    private javax.swing.JCheckBox ExecuteGroup;
    private javax.swing.JCheckBox ExecuteOthers;
    private javax.swing.JCheckBox ExecuteOwner;
    private javax.swing.JCheckBox GID;
    private javax.swing.JTextField NumbersOctal;
    private javax.swing.JCheckBox ReadGroup;
    private javax.swing.JCheckBox ReadOthers;
    private javax.swing.JCheckBox ReadOwner;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JCheckBox StickyBit;
    private javax.swing.JCheckBox UID;
    private javax.swing.JCheckBox WriteGroup;
    private javax.swing.JCheckBox WriteOthers;
    private javax.swing.JCheckBox WriteOwner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
