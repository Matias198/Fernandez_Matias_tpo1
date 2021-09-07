package AAAGUI;

/*
    nota: al poner el cursor sobre algunos elementos en la app da informacion de que hace o como
    introducir un dato.

    Utilicé los cuadritos de mensaje para informar al usuario para que sea
    mas facil la comunicacion al ingresar los datos.
*/
import static javax.swing.JOptionPane.showMessageDialog;

public class GUI extends javax.swing.JFrame {

    /*
        Utilizando un vector por cada elemento que se solicite al usuario,
        con 10 elementos maximos. Utilicé long para DNI y los telefonos porque
        al ingresar int no soportaba un numero con caracteristica ya que queda muy
        grande para el int
    */
    
    int Indice = 0;
    long DNIs [] = new long[10];
    String Nombres [] = new String[10];
    String Apellidos [] = new String[10];
    String Direcciones [] = new String[10];
    long Telefonos[] = new long[10];
    String FechaNac [] = new String[10];
   
    public GUI() {
        initComponents();
        TxtIndice.setText(Integer.toString(Indice)); 
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        TxtDNI = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnGrabar = new javax.swing.JButton();
        BtnAntes = new javax.swing.JButton();
        BtnDespues = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        TxtFecNac = new javax.swing.JFormattedTextField();
        TxtIndice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(200, 200));
        setMinimumSize(new java.awt.Dimension(200, 200));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TxtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDNI.setToolTipText("Sin puntos o comas");
        TxtDNI.setNextFocusableComponent(TxtNombre);

        TxtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtApellido.setNextFocusableComponent(TxtDireccion);

        TxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNombre.setNextFocusableComponent(TxtApellido);

        TxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDireccion.setNextFocusableComponent(TxtTelefono);

        TxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTelefono.setNextFocusableComponent(TxtFecNac);

        jLabel1.setFont(new java.awt.Font("Elephant", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Agenda Electrónica");

        BtnGrabar.setBackground(new java.awt.Color(255, 255, 255));
        BtnGrabar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnGrabar.setForeground(new java.awt.Color(0, 0, 102));
        BtnGrabar.setText("Grabar");
        BtnGrabar.setToolTipText("Grabar datos");
        BtnGrabar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGrabar.setMaximumSize(new java.awt.Dimension(43, 21));
        BtnGrabar.setMinimumSize(new java.awt.Dimension(43, 21));
        BtnGrabar.setNextFocusableComponent(BtnDespues);
        BtnGrabar.setPreferredSize(new java.awt.Dimension(43, 21));
        BtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabarActionPerformed(evt);
            }
        });

        BtnAntes.setBackground(new java.awt.Color(255, 255, 255));
        BtnAntes.setFont(new java.awt.Font("Elephant", 1, 11)); // NOI18N
        BtnAntes.setForeground(new java.awt.Color(0, 0, 153));
        BtnAntes.setText("<<");
        BtnAntes.setToolTipText("Retroceder pagina");
        BtnAntes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAntes.setNextFocusableComponent(TxtDNI);
        BtnAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAntesActionPerformed(evt);
            }
        });

        BtnDespues.setBackground(new java.awt.Color(255, 255, 255));
        BtnDespues.setFont(new java.awt.Font("Elephant", 1, 11)); // NOI18N
        BtnDespues.setForeground(new java.awt.Color(0, 0, 153));
        BtnDespues.setText(">>");
        BtnDespues.setToolTipText("Avanzar pagina");
        BtnDespues.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDespues.setNextFocusableComponent(BtnAntes);
        BtnDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespuesActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 153));

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 102));
        label1.setText("Indice:");

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 153));
        label2.setText("DNI :");

        label3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 153));
        label3.setText("Apellido :");

        label4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 153));
        label4.setText("Nombre :");

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 153));
        label5.setText("Direccion :");

        label6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 153));
        label6.setText("Telefono :");

        label7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 153));
        label7.setText("F. Nac :");

        jLabel2.setText("Fernández Matias Daniel - TPO1 - 2021");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        TxtFecNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TxtFecNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtFecNac.setToolTipText("Formato: dd/MM/aaaa");
        TxtFecNac.setNextFocusableComponent(BtnGrabar);

        TxtIndice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TxtIndice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtIndice.setToolTipText("Numero de pagina");
        TxtIndice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtIndice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtApellido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(TxtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(TxtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(BtnAntes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(TxtIndice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDespues, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDespues, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(BtnAntes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtIndice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        label1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void BtnDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespuesActionPerformed
        //Para limitar y que no haya desbordamiento del indice con el array:
        if (Indice < 9)
        {
            //Cada vez que se pulsa el boton para avanzar el indice suma 1
            Indice += 1;
            
            TxtIndice.setText(Integer.toString(Indice));
            
            //Para que al avanzar no rellene los campos DNI y Telefono con 0:
 
            if ("0".equals(String.valueOf(DNIs[Indice])))
            {
               TxtDNI.setText(""); 
            }
            else
            {
                TxtDNI.setText(String.valueOf(DNIs[Indice]));
            }
            
            if ("0".equals(String.valueOf(Telefonos[Indice])))
            {
                TxtTelefono.setText(""); 
            }
            else
            {
                TxtTelefono.setText(String.valueOf(Telefonos[Indice]));
            }
            
            TxtNombre.setText(Nombres[Indice]);
            TxtApellido.setText(Apellidos[Indice]);
            TxtDireccion.setText(Direcciones[Indice]);
            TxtFecNac.setText(FechaNac[Indice]);
        }
    }//GEN-LAST:event_BtnDespuesActionPerformed
    private void BtnAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAntesActionPerformed
        if (Indice > 0)
        {
            //Cada vez que se pulsa el boton para retroceder el indice suma 1
            Indice -= 1;
            
            TxtIndice.setText(Integer.toString(Indice));
            
            //Para que al retroceder no rellene los campos DNI y Telefono con 0:
            
            if ("0".equals(String.valueOf(DNIs[Indice])))
            {
               TxtDNI.setText(""); 
            }
            else
            {
                TxtDNI.setText(String.valueOf(DNIs[Indice]));
            }
            
            if ("0".equals(String.valueOf(Telefonos[Indice])))
            {
                TxtTelefono.setText(""); 
            }
            else
            {
                TxtTelefono.setText(String.valueOf(Telefonos[Indice]));
            }
            
            TxtNombre.setText(Nombres[Indice]);
            TxtApellido.setText(Apellidos[Indice]);
            TxtDireccion.setText(Direcciones[Indice]);
            TxtFecNac.setText(FechaNac[Indice]);
        }
    }//GEN-LAST:event_BtnAntesActionPerformed
    private void BtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabarActionPerformed
        /*
            La idea es controlar para que el usuario no deje campos vacios o con valores que 
            no deberian estar segun el tipo de dato que se solicita. Acá es donde usé los 
            cuadritos de mensajes para mantener informado al usuario si ocurre un error
        */
        
        if (!"".equals(TxtDNI.getText()))
        {
            if (!"".equals(TxtNombre.getText()))
            {
                if (!"".equals(TxtApellido.getText()))
                {
                    if (!"".equals(TxtDireccion.getText()))
                    {
                        if (!"".equals(String.valueOf(TxtTelefono.getText())))
                        {
                            if (!"".equals(TxtFecNac.getText()))
                            {
                                /*
                                    Utilizando el try catch para detectar errores de guardado
                                    Si el usuario ingresa un valor que no puede ser admitido por la variable
                                    en dicho campo entonces informará un error en el guardado pidiendo que se
                                    vuelva a verificar los datos que se han introducido.
                                */
                                try
                                {
                                    DNIs[Indice] = Integer.parseInt(TxtDNI.getText());
                                    Nombres[Indice] = TxtNombre.getText();
                                    Apellidos[Indice] = TxtApellido.getText();
                                    Direcciones[Indice] = TxtDireccion.getText();
                                    Telefonos[Indice] = Long.parseUnsignedLong(TxtTelefono.getText()); 
                                    FechaNac[Indice] = TxtFecNac.getText();
                                    showMessageDialog(null,"Datos guardados exitosamente");
                                }
                                catch (NumberFormatException e)
                                {
                                    showMessageDialog(null, "Ocurrió un error inesperado en el guardado de datos, por favor verifique los campos cargados");
                                }
                            }
                            else
                            {
                                showMessageDialog(null, "Ingrese su fecha de nacimiento");
                            }
                        }
                        else
                        {
                            showMessageDialog(null, "Ingrese su numero de telefono");
                        }
                    }
                    else
                    {
                        showMessageDialog(null, "Ingrese su direccion");
                    }
                }
                else
                {
                    showMessageDialog(null, "Ingrese su apellido");
                }
            }
            else
            {
                showMessageDialog(null, "Ingrese su nombre");
            }
        }
        else
        {
            showMessageDialog(null, "Ingrese su DNI");
        }    
    }//GEN-LAST:event_BtnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAntes;
    private javax.swing.JButton BtnDespues;
    private javax.swing.JButton BtnGrabar;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtDNI;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JFormattedTextField TxtFecNac;
    private javax.swing.JLabel TxtIndice;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    // End of variables declaration//GEN-END:variables
}
