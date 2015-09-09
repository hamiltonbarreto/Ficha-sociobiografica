/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controladores.fichaControlador;
import Modelos.FichaBModelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;




public class FichaBibliografica1 extends javax.swing.JFrame {
 
   
    
    
    
    public FichaBibliografica1() {
        
        initComponents();
      setLocationRelativeTo(this);
      
       
        
    }
private void asignarfecha(){
        try { SimpleDateFormat formato =new SimpleDateFormat("dd/mm/yyyy");
         Date Fecha;
         Fecha =formato.parse("01/01/1980");
         this.jFech_exp.setDate(Fecha);
         jFech_exp.getDateEditor().setEnabled(false);
         this.jFech_nacimiento1.setDate(Fecha);
         jFech_nacimiento1.getDateEditor().setEnabled(false);
         this.jFech_solicitud.setDate(Fecha);
         jFech_solicitud.getDateEditor().setEnabled(false);
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(rootPane, "fecha errada"+ex.getMessage());
        }
  }
      public void limpiarCampos(){
        jnombresolic.setText("");
        japellidosolic.setText("");
        jcedula.setText("");
        jdireccion.setText("");
        jEstado.setText("");
        jTelefono.setText("");
        
        jCelular.setText("");
        jcodigo_e.setText("");
        jcedula2.setText("");
      
        jFech_solicitud.requestFocus();
    }
      
      
      
      
   
    
   
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jhuella = new javax.swing.JTextField();
        jCheckBox2_vulnerable = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jnombresolic = new javax.swing.JTextField();
        jdireccion = new javax.swing.JTextField();
        jComboBoxCiudad = new javax.swing.JComboBox();
        jcodigo_e = new javax.swing.JTextField();
        jcedula2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jestrato = new javax.swing.JComboBox();
        jCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jmotivo_consulta = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFech_nacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jGUARDAR = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFech_solicitud = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        japellidosolic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsueldo = new javax.swing.JTextField();
        jSueldo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jEstado = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox1_desplazado = new javax.swing.JCheckBox();
        jFech_exp = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jsegundonombresolic = new javax.swing.JTextField();
        jsegundoapellidosolic = new javax.swing.JTextField();
        jocupacion = new javax.swing.JTextField();
        jComboentrevistador = new javax.swing.JComboBox();
        jCombDPT = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jgrado_escolaridad1 = new javax.swing.JComboBox();
        jComTipo_Documento = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jCheckBox2_vulnerable.setText("Vulnerable");

        jLabel19.setText("Primer Apellido  *");

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });
        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });

        jnombresolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombresolicActionPerformed(evt);
            }
        });
        jnombresolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jnombresolicKeyTyped(evt);
            }
        });

        jdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdireccionKeyTyped(evt);
            }
        });

        jComboBoxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCiudadActionPerformed(evt);
            }
        });

        jcedula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcedula2KeyTyped(evt);
            }
        });

        jLabel21.setText("Ciudad");

        jestrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3" }));
        jestrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jestratoActionPerformed(evt);
            }
        });

        jCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCelularKeyTyped(evt);
            }
        });

        jLabel6.setText("Fecha de Nacimiento  *");

        jLabel18.setText("Ficha Socio-Biográfica ");

        jLabel7.setText("Grado de escolaridad");

        jmotivo_consulta.setColumns(20);
        jmotivo_consulta.setRows(5);
        jScrollPane1.setViewportView(jmotivo_consulta);

        jLabel8.setText("Ocupacion");

        jLabel9.setText("Motivo de la consulta");

        jLabel10.setText("Nombre del entrevistador *");

        jLabel11.setText("Codigo  *");

        jGUARDAR.setText("GUARDAR");
        jGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGUARDARActionPerformed(evt);
            }
        });

        jLabel12.setText("Estrato  *");

        jLabel13.setText("Huella");

        jLabel14.setText("Número de Cedula");

        jLabel15.setText("Expedida en:");

        jLabel1.setText("Fecha de la solicitud  *");

        jLabel2.setText("Primer Nombre  *");

        japellidosolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                japellidosolicKeyTyped(evt);
            }
        });

        jLabel3.setText("Documento   *");

        jcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcedulaKeyTyped(evt);
            }
        });

        jLabel4.setText("Dirección*");

        jLabel5.setText("Teléfono");

        jsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsueldoActionPerformed(evt);
            }
        });
        jsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsueldoKeyTyped(evt);
            }
        });

        jSueldo.setText("Sueldo");

        jLabel16.setText("Celular  *");

        jEstado.setText("Estado  *");

        jLabel17.setText("Firma del Solicitante");

        jCheckBox1_desplazado.setText("Desplazado");
        jCheckBox1_desplazado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1_desplazadoActionPerformed(evt);
            }
        });

        jLabel20.setText("Segundo Nombre");

        jLabel22.setText("Segundo Apellido");

        jsegundonombresolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsegundonombresolicActionPerformed(evt);
            }
        });
        jsegundonombresolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsegundonombresolicKeyTyped(evt);
            }
        });

        jsegundoapellidosolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsegundoapellidosolicActionPerformed(evt);
            }
        });
        jsegundoapellidosolic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsegundoapellidosolicKeyTyped(evt);
            }
        });

        jocupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jocupacionKeyTyped(evt);
            }
        });

        jCombDPT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombDPTItemStateChanged(evt);
            }
        });
        jCombDPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombDPTActionPerformed(evt);
            }
        });

        jLabel23.setText("Departamento");

        jgrado_escolaridad1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Preescolar", "Primaria", "Básica Secundaria", "Alta Secundaria", "Educacion Superior" }));

        jComTipo_Documento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula de Ciudadania", "Targeta de identidad", "Registro civil" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel17))
                                            .addComponent(jcodigo_e, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(264, 264, 264)
                                                .addComponent(jhuella, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(279, 279, 279)
                                                .addComponent(jLabel13))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jComboentrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(60, 60, 60)
                                        .addComponent(japellidosolic, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(33, 33, 33)
                                        .addComponent(jFech_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(30, 30, 30)
                                        .addComponent(jFech_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(60, 60, 60)
                                        .addComponent(jnombresolic, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jsegundonombresolic, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jsegundoapellidosolic, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jSueldo)
                                            .addComponent(jEstado))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCombDPT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(51, 51, 51))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                            .addComponent(jocupacion)
                                                            .addComponent(jgrado_escolaridad1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(204, 204, 204)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel16)
                                                            .addComponent(jLabel12))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jestrato, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel21))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jCheckBox1_desplazado)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jCheckBox2_vulnerable))
                                                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel3)
                                                .addGap(75, 75, 75))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(93, 93, 93)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComTipo_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jGUARDAR))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jFech_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFech_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jnombresolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jsegundonombresolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(japellidosolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jsegundoapellidosolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComTipo_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jFech_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(jCombDPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jgrado_escolaridad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSueldo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jestrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEstado)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1_desplazado)
                            .addComponent(jCheckBox2_vulnerable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboentrevistador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jcodigo_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jhuella, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(22, 22, 22)
                                .addComponent(jFech_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jcedula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jGUARDAR)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyTyped
        // TODO add your handling code here:

        int numerodecaracteres=7;
        if(jTelefono.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTelefonoKeyTyped

    private void jnombresolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnombresolicKeyTyped

        int numerodecaracteres=30;
        if(jnombresolic.getText().length()>=numerodecaracteres)
        evt.consume();
        
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}

        
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jnombresolicKeyTyped

    private void jComboBoxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCiudadActionPerformed

    private void jestratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jestratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jestratoActionPerformed

    private void jCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCelularKeyTyped
        // TODO add your handling code here:
        int numerodecaracteres=10;
        if(jCelular.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jCelularKeyTyped

    private void japellidosolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_japellidosolicKeyTyped
        int numerodecaracteres=30;
        if(japellidosolic.getText().length()>=numerodecaracteres)
        evt.consume();
       
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}


       
    }//GEN-LAST:event_japellidosolicKeyTyped

    private void jcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcedulaKeyTyped
        // TODO add your handling code here:

        int numerodecaracteres=12;
        if(jcedula.getText().length()>=numerodecaracteres)
        evt.consume();
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jcedulaKeyTyped

    private void jsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsueldoActionPerformed

    private void jCheckBox1_desplazadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1_desplazadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1_desplazadoActionPerformed

    private void jnombresolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombresolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnombresolicActionPerformed

    private void jGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGUARDARActionPerformed
         if(jnombresolic.getText().isEmpty() || japellidosolic.getText().isEmpty() || 
            jcedula.getText().isEmpty() || jdireccion.getText().isEmpty()
            || jTelefono.getText().isEmpty()||  jmotivo_consulta.getText().isEmpty()
                 ||  jcodigo_e.getText().isEmpty()
                 ){
                JOptionPane.showMessageDialog(null, "los campos marcados por * son obligatorios");
                jnombresolic.requestFocus();
            }
             
         
                
                             
    }//GEN-LAST:event_jGUARDARActionPerformed

    private void jsegundonombresolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsegundonombresolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsegundonombresolicActionPerformed

    private void jsegundonombresolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsegundonombresolicKeyTyped
    int numerodecaracteres=30;
        if(jsegundonombresolic.getText().length()>=numerodecaracteres)
        evt.consume();
        
      char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}

    }//GEN-LAST:event_jsegundonombresolicKeyTyped

    private void jsegundoapellidosolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsegundoapellidosolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsegundoapellidosolicActionPerformed

    private void jsegundoapellidosolicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsegundoapellidosolicKeyTyped
    int numerodecaracteres=30;
        if(jsegundoapellidosolic.getText().length()>=numerodecaracteres)
        evt.consume();
       
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
{
   evt.consume();
}

    }//GEN-LAST:event_jsegundoapellidosolicKeyTyped

    private void jsueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsueldoKeyTyped
    int numerodecaracteres=10;
        if(jcedula.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_jsueldoKeyTyped

    private void jcedula2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcedula2KeyTyped
     int numerodecaracteres=10;
        if(jcedula.getText().length()>=numerodecaracteres)
        evt.consume();

        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_jcedula2KeyTyped

    private void jdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdireccionKeyTyped
    int numerodecaracteres=60;
        if(jdireccion.getText().length()>=numerodecaracteres)
        evt.consume();
      
         char car = evt.getKeyChar();    
         if((car<'a' || car>'z') && (car<'A' || car>'Z')&& (car<'0' || car>'9') && (car!=(char)java.awt.event.KeyEvent.VK_SPACE))
          
{
   evt.consume();
}

    }//GEN-LAST:event_jdireccionKeyTyped

    private void jocupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jocupacionKeyTyped
    int numerodecaracteres=30;
        if(jnombresolic.getText().length()>=numerodecaracteres)
        evt.consume();
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A') | c>'Z') evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_jocupacionKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jCombDPTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombDPTItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPTItemStateChanged

    private void jCombDPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombDPTActionPerformed
                 // TODO add your handling code here:
    }//GEN-LAST:event_jCombDPTActionPerformed

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
            java.util.logging.Logger.getLogger(FichaBibliografica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaBibliografica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaBibliografica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaBibliografica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaBibliografica1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField jCelular;
    public javax.swing.JCheckBox jCheckBox1_desplazado;
    public javax.swing.JCheckBox jCheckBox2_vulnerable;
    public javax.swing.JComboBox jComTipo_Documento;
    public javax.swing.JComboBox jCombDPT;
    public javax.swing.JComboBox jComboBoxCiudad;
    public javax.swing.JComboBox jComboentrevistador;
    private javax.swing.JLabel jEstado;
    public com.toedter.calendar.JDateChooser jFech_exp;
    public com.toedter.calendar.JDateChooser jFech_nacimiento1;
    public com.toedter.calendar.JDateChooser jFech_solicitud;
    public javax.swing.JButton jGUARDAR;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jSueldo;
    public javax.swing.JTextField jTelefono;
    public javax.swing.JTextField japellidosolic;
    public javax.swing.JTextField jcedula;
    public javax.swing.JTextField jcedula2;
    public javax.swing.JTextField jcodigo_e;
    public javax.swing.JTextField jdireccion;
    public javax.swing.JComboBox jestrato;
    public javax.swing.JComboBox jgrado_escolaridad1;
    public javax.swing.JTextField jhuella;
    public javax.swing.JTextArea jmotivo_consulta;
    public javax.swing.JTextField jnombresolic;
    public javax.swing.JTextField jocupacion;
    public javax.swing.JTextField jsegundoapellidosolic;
    public javax.swing.JTextField jsegundonombresolic;
    public javax.swing.JTextField jsueldo;
    // End of variables declaration//GEN-END:variables
}
