/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mian;

import com.sun.glass.events.KeyEvent;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author Family
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Inicializar();
        
        label_admin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        NoRecuerda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }
    
    private void Inicializar() {
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("")));﻿
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fb.png")));
        jd_Principal.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fb.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_CreacionUsuario = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_NombreCompleto = new javax.swing.JTextField();
        tf_Nickname = new javax.swing.JTextField();
        tf_Contraseña = new javax.swing.JTextField();
        jb_GuardarUsuario = new javax.swing.JButton();
        cb_PaisORegion = new javax.swing.JComboBox<>();
        dc_FechaDeNacimiento = new com.toedter.calendar.JDateChooser();
        tf_foto = new javax.swing.JLabel();
        tf_seleccionarImagen = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jd_Principal = new javax.swing.JDialog();
        tab = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        perfil_foto = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        perfil_nombre = new javax.swing.JLabel();
        perfil_nicknaem = new javax.swing.JLabel();
        perfil_pais = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        perfil_fecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        musica_path = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_crearAlbum = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        cb_solicitudSin = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cb_amigosCon = new javax.swing.JComboBox<>();
        añadir_amigo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_solicitudes = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        boton_añadir = new javax.swing.JButton();
        boton_rechazar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cb_mensajeria = new javax.swing.JComboBox<>();
        tf_mensajeria = new javax.swing.JTextField();
        mensajeria_enviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mensajeria = new javax.swing.JTable();
        mensajeria_actualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jd_admin = new javax.swing.JDialog();
        PanePrincipal = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        admin_usuario = new javax.swing.JTextField();
        admin_pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pane_añadir = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_nuevoAdmin = new javax.swing.JTextField();
        tf_contraAdmin = new javax.swing.JTextField();
        AñadirAdmin = new javax.swing.JButton();
        admin_añUsuari = new javax.swing.JPanel();
        tf_NombreCompleto1 = new javax.swing.JTextField();
        tf_Nickname1 = new javax.swing.JTextField();
        tf_Contraseña1 = new javax.swing.JTextField();
        jb_GuardarUsuario1 = new javax.swing.JButton();
        cb_PaisORegion1 = new javax.swing.JComboBox<>();
        dc_FechaDeNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        tf_foto1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        tf_seleccionarImagen1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        admin_Usuario = new javax.swing.JPanel();
        cb_eliminarUsuari = new javax.swing.JComboBox<>();
        bt_eliminarUsuario = new javax.swing.JButton();
        admin_modiUsuario = new javax.swing.JPanel();
        cb_modificarUsuario = new javax.swing.JComboBox<>();
        tf_seleccionarImagen2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        tf_NombreCompleto2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tf_Nickname2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tf_Contraseña2 = new javax.swing.JTextField();
        jb_GuardarUsuario2 = new javax.swing.JButton();
        cb_PaisORegion2 = new javax.swing.JComboBox<>();
        dc_FechaDeNacimiento2 = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        tf_foto2 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jd_enseñarMensaje = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        mensaje_mensaje = new javax.swing.JTextField();
        menupop_mensajes = new javax.swing.JPopupMenu();
        mensajes_ver = new javax.swing.JMenuItem();
        mensajes_eliminar = new javax.swing.JMenuItem();
        jd_CrearAlbum = new javax.swing.JDialog();
        jLabel43 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        foto5 = new javax.swing.JLabel();
        foto6 = new javax.swing.JLabel();
        foto7 = new javax.swing.JLabel();
        foto8 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tf_crearAlbum = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        bt_agregarAlbum = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        login_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login_contraseña = new javax.swing.JPasswordField();
        bt_Login = new javax.swing.JButton();
        bt_crearUsuario = new javax.swing.JButton();
        label_admin = new javax.swing.JLabel();
        NoRecuerda = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel4.setText("NombreCompleto");

        jLabel5.setText("Nickname");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Pais o Region ");

        jLabel8.setText("FechaDeNacimiento");

        jb_GuardarUsuario.setText("Crear Cuenta");
        jb_GuardarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuarioMouseEntered(evt);
            }
        });
        jb_GuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarUsuarioActionPerformed(evt);
            }
        });

        cb_PaisORegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        tf_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        tf_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_seleccionarImagen.setText("Seleccionar Imagen");
        tf_seleccionarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_seleccionarImagenMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setText("Creacion de Cuenta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jd_CreacionUsuarioLayout = new javax.swing.GroupLayout(jd_CreacionUsuario.getContentPane());
        jd_CreacionUsuario.getContentPane().setLayout(jd_CreacionUsuarioLayout);
        jd_CreacionUsuarioLayout.setHorizontalGroup(
            jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CreacionUsuarioLayout.createSequentialGroup()
                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(dc_FechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_NombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(tf_Nickname)
                                            .addComponent(tf_Contraseña)))
                                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(cb_PaisORegion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jb_GuardarUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_foto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_seleccionarImagen)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_CreacionUsuarioLayout.setVerticalGroup(
            jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tf_Nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_foto))
                        .addGap(7, 7, 7)
                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_PaisORegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jd_CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(dc_FechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jb_GuardarUsuario)
                        .addGap(28, 28, 28))
                    .addGroup(jd_CreacionUsuarioLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(tf_seleccionarImagen)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jd_Principal.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel18.setText("NombreCompleto");

        perfil_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        perfil_foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel19.setText("Nickname");

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel20.setText("Contraseña");

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel21.setText("Pais o Region ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel22.setText("FechaDeNacimiento");

        perfil_nombre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        perfil_nicknaem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        perfil_pais.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel26.setText("*********");

        perfil_fecha.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perfil_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(28, 28, 28)
                                .addComponent(perfil_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(perfil_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(perfil_nicknaem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(301, 301, 301)
                        .addComponent(perfil_foto)))
                .addGap(0, 365, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(perfil_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(perfil_nicknaem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(perfil_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(perfil_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(perfil_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        tab.addTab("Perfil", jPanel7);

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel23.setText("Seleccionar Archivo:");

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Play►");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Pause▌►");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Stop▀");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(52, 52, 52)
                        .addComponent(musica_path, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton2)
                        .addContainerGap(143, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(musica_path, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(109, 109, 109)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        tab.addTab("Reproductor de Musica", jPanel9);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Cantidad"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        bt_crearAlbum.setText("Crear Album");
        bt_crearAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bt_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(bt_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.addTab("AlbumDeFoto", jPanel17);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.add(cb_solicitudSin, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 66, 186, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel29.setText("NoConocidos");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 33, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel30.setText("Amigos");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jPanel14.add(cb_amigosCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 66, 228, -1));

        añadir_amigo.setText("Añadir de Amigo");
        añadir_amigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadir_amigoMouseClicked(evt);
            }
        });
        jPanel14.add(añadir_amigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 135, -1, -1));

        tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "quien", "Mensaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_solicitudesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_solicitudes);
        if (tabla_solicitudes.getColumnModel().getColumnCount() > 0) {
            tabla_solicitudes.getColumnModel().getColumn(0).setResizable(false);
            tabla_solicitudes.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 450, 430));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("Solicitudes");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        boton_añadir.setText("Aceptar");
        boton_añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_añadirMouseClicked(evt);
            }
        });
        jPanel14.add(boton_añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 233, 100, -1));

        boton_rechazar.setText("Rechazar");
        boton_rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_rechazarMouseClicked(evt);
            }
        });
        boton_rechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rechazarActionPerformed(evt);
            }
        });
        jPanel14.add(boton_rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 289, 100, -1));

        jPanel15.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 140, 590));

        jPanel16.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1070, -1));

        tab.addTab("Solicitudes", jPanel14);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("De:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Para:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("YO");

        cb_mensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mensajeriaActionPerformed(evt);
            }
        });

        mensajeria_enviar.setText("Enviar");
        mensajeria_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mensajeria_enviarMouseClicked(evt);
            }
        });

        tabla_mensajeria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Enviado", "De Parte:", "Mensaje", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_mensajeria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_mensajeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_mensajeriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_mensajeria);

        mensajeria_actualizar.setText("Actualizar");
        mensajeria_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mensajeria_actualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(cb_mensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(mensajeria_actualizar))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(tf_mensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(mensajeria_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(cb_mensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensajeria_actualizar))
                        .addGap(42, 42, 42)
                        .addComponent(tf_mensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mensajeria_enviar))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tab.addTab("Mensajeria", jPanel13);

        jMenu1.setText("Cuenta");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jd_Principal.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jd_PrincipalLayout = new javax.swing.GroupLayout(jd_Principal.getContentPane());
        jd_Principal.getContentPane().setLayout(jd_PrincipalLayout);
        jd_PrincipalLayout.setHorizontalGroup(
            jd_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_PrincipalLayout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_PrincipalLayout.setVerticalGroup(
            jd_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_PrincipalLayout.createSequentialGroup()
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanePrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PanePrincipalStateChanged(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Login Admin");

        jLabel11.setText("Usuario:");

        jLabel13.setText("Pass:");

        jButton1.setText("entrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel9))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(admin_usuario)
                            .addComponent(admin_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(216, 216, 216))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(admin_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(admin_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanePrincipal.addTab("Entrar admin", jPanel5);

        pane_añadir.setEnabled(false);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Añadir Admin");

        jLabel16.setText("Nuevo Administrador");

        jLabel17.setText("Contraseña del Nuevo administrador");

        AñadirAdmin.setText("AñadirAdmin");
        AñadirAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nuevoAdmin)
                            .addComponent(tf_contraAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AñadirAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_nuevoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_contraAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(AñadirAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pane_añadirLayout = new javax.swing.GroupLayout(pane_añadir);
        pane_añadir.setLayout(pane_añadirLayout);
        pane_añadirLayout.setHorizontalGroup(
            pane_añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pane_añadirLayout.setVerticalGroup(
            pane_añadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanePrincipal.addTab("Añadir Admin", pane_añadir);

        admin_añUsuari.setEnabled(false);

        jb_GuardarUsuario1.setText("Crear Cuenta");
        jb_GuardarUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuario1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuario1MouseEntered(evt);
            }
        });
        jb_GuardarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarUsuario1ActionPerformed(evt);
            }
        });

        cb_PaisORegion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel33.setText("NombreCompleto");

        tf_foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        tf_foto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setText("Nickname");

        tf_seleccionarImagen1.setText("Seleccionar Imagen");
        tf_seleccionarImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_seleccionarImagen1MouseClicked(evt);
            }
        });

        jLabel35.setText("Contraseña");

        jLabel36.setText("Pais o Region ");

        jLabel37.setText("FechaDeNacimiento");

        javax.swing.GroupLayout admin_añUsuariLayout = new javax.swing.GroupLayout(admin_añUsuari);
        admin_añUsuari.setLayout(admin_añUsuariLayout);
        admin_añUsuariLayout.setHorizontalGroup(
            admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_añUsuariLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(admin_añUsuariLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(18, 18, 18)
                                .addComponent(dc_FechaDeNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(admin_añUsuariLayout.createSequentialGroup()
                                .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(admin_añUsuariLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_NombreCompleto1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                            .addComponent(tf_Nickname1)
                                            .addComponent(tf_Contraseña1)))
                                    .addGroup(admin_añUsuariLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(cb_PaisORegion1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(admin_añUsuariLayout.createSequentialGroup()
                            .addGap(234, 234, 234)
                            .addComponent(jb_GuardarUsuario1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_foto1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tf_seleccionarImagen1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        admin_añUsuariLayout.setVerticalGroup(
            admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(admin_añUsuariLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(admin_añUsuariLayout.createSequentialGroup()
                            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(admin_añUsuariLayout.createSequentialGroup()
                                    .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel33)
                                        .addComponent(tf_NombreCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(tf_Nickname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tf_foto1))
                            .addGap(7, 7, 7)
                            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(tf_Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_PaisORegion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(79, 79, 79)
                            .addGroup(admin_añUsuariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(dc_FechaDeNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_GuardarUsuario1))
                        .addGroup(admin_añUsuariLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(tf_seleccionarImagen1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(38, 38, 38)))
        );

        PanePrincipal.addTab("Añadir Usuario", admin_añUsuari);

        admin_Usuario.setEnabled(false);

        bt_eliminarUsuario.setText("Eliminar");
        bt_eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout admin_UsuarioLayout = new javax.swing.GroupLayout(admin_Usuario);
        admin_Usuario.setLayout(admin_UsuarioLayout);
        admin_UsuarioLayout.setHorizontalGroup(
            admin_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_UsuarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(cb_eliminarUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(bt_eliminarUsuario)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        admin_UsuarioLayout.setVerticalGroup(
            admin_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_UsuarioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(admin_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_eliminarUsuari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_eliminarUsuario))
                .addContainerGap(403, Short.MAX_VALUE))
        );

        PanePrincipal.addTab("Eliminar Usuario", admin_Usuario);

        admin_modiUsuario.setEnabled(false);

        cb_modificarUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_modificarUsuarioItemStateChanged(evt);
            }
        });

        tf_seleccionarImagen2.setText("Seleccionar Imagen");
        tf_seleccionarImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_seleccionarImagen2MouseClicked(evt);
            }
        });

        jLabel38.setText("Contraseña");

        jLabel39.setText("Pais o Region ");

        jLabel40.setText("FechaDeNacimiento");

        jb_GuardarUsuario2.setText("Modificar");
        jb_GuardarUsuario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuario2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jb_GuardarUsuario2MouseEntered(evt);
            }
        });
        jb_GuardarUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarUsuario2ActionPerformed(evt);
            }
        });

        cb_PaisORegion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel41.setText("NombreCompleto");

        tf_foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        tf_foto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel42.setText("Nickname");

        javax.swing.GroupLayout admin_modiUsuarioLayout = new javax.swing.GroupLayout(admin_modiUsuario);
        admin_modiUsuario.setLayout(admin_modiUsuarioLayout);
        admin_modiUsuarioLayout.setHorizontalGroup(
            admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(cb_modificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admin_modiUsuarioLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel40)
                            .addGap(18, 18, 18)
                            .addComponent(dc_FechaDeNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))
                        .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                            .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel41)
                                .addComponent(jLabel42)
                                .addComponent(jLabel38)
                                .addComponent(jLabel39))
                            .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_NombreCompleto2)
                                        .addComponent(tf_Nickname2)
                                        .addComponent(tf_Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(cb_PaisORegion2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jb_GuardarUsuario2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_foto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_seleccionarImagen2)
                .addContainerGap())
        );
        admin_modiUsuarioLayout.setVerticalGroup(
            admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(cb_modificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                        .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                                .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(tf_NombreCompleto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(tf_Nickname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tf_foto2))
                        .addGap(7, 7, 7)
                        .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(tf_Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_PaisORegion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(admin_modiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(dc_FechaDeNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_GuardarUsuario2))
                    .addGroup(admin_modiUsuarioLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tf_seleccionarImagen2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        PanePrincipal.addTab("Modificar Usuario", admin_modiUsuario);

        javax.swing.GroupLayout jd_adminLayout = new javax.swing.GroupLayout(jd_admin.getContentPane());
        jd_admin.getContentPane().setLayout(jd_adminLayout);
        jd_adminLayout.setHorizontalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addComponent(PanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_adminLayout.setVerticalGroup(
            jd_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_adminLayout.createSequentialGroup()
                .addComponent(PanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel15.setText("jLabel15");

        jLabel24.setText("jLabel24");

        jd_enseñarMensaje.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel32.setText("Mensaje");

        javax.swing.GroupLayout jd_enseñarMensajeLayout = new javax.swing.GroupLayout(jd_enseñarMensaje.getContentPane());
        jd_enseñarMensaje.getContentPane().setLayout(jd_enseñarMensajeLayout);
        jd_enseñarMensajeLayout.setHorizontalGroup(
            jd_enseñarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_enseñarMensajeLayout.createSequentialGroup()
                .addGroup(jd_enseñarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_enseñarMensajeLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel32))
                    .addGroup(jd_enseñarMensajeLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(mensaje_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jd_enseñarMensajeLayout.setVerticalGroup(
            jd_enseñarMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_enseñarMensajeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel32)
                .addGap(71, 71, 71)
                .addComponent(mensaje_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        mensajes_ver.setText("Ver Mensajes");
        mensajes_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajes_verActionPerformed(evt);
            }
        });
        menupop_mensajes.add(mensajes_ver);

        mensajes_eliminar.setText("Eliminar Mensaje");
        mensajes_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajes_eliminarActionPerformed(evt);
            }
        });
        menupop_mensajes.add(mensajes_eliminar);

        jLabel43.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel43.setText("Crear Album");

        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        foto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg"))); // NOI18N
        foto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel44.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel44.setText("Titulo:");

        tf_crearAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_crearAlbumActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        bt_agregarAlbum.setText("Agregar album");

        javax.swing.GroupLayout jd_CrearAlbumLayout = new javax.swing.GroupLayout(jd_CrearAlbum.getContentPane());
        jd_CrearAlbum.getContentPane().setLayout(jd_CrearAlbumLayout);
        jd_CrearAlbumLayout.setHorizontalGroup(
            jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                        .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(bt_agregarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(foto5))
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(tf_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foto1)))
                        .addGap(105, 105, 105)
                        .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foto7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto2)
                                .addGap(101, 101, 101)
                                .addComponent(foto3)))
                        .addGap(88, 88, 88)
                        .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(foto8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel43)))
                .addGap(95, 95, 95))
            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jButton6)
                .addGap(167, 167, 167)
                .addComponent(jButton7)
                .addGap(157, 157, 157)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(126, 126, 126))
            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jButton10)
                .addGap(159, 159, 159)
                .addComponent(jButton11)
                .addGap(162, 162, 162)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(122, 122, 122))
        );
        jd_CrearAlbumLayout.setVerticalGroup(
            jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_CrearAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(26, 26, 26)
                        .addComponent(tf_crearAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_agregarAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(32, 32, 32)
                        .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foto8))
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foto7))
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto2)
                                .addGap(106, 106, 106)
                                .addComponent(foto6))
                            .addGroup(jd_CrearAlbumLayout.createSequentialGroup()
                                .addComponent(foto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9))
                                .addGap(38, 38, 38)
                                .addComponent(foto5)))))
                .addGap(33, 33, 33)
                .addGroup(jd_CrearAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Family\\Desktop\\Fotito\\RedUnitec.jpg")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 36)); // NOI18N
        jLabel10.setText("FaceSpaceHI5");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, 267, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        jLabel2.setText("NombreCompleto");

        login_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_usuarioFocusGained(evt);
            }
        });
        login_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_usuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        login_contraseña.setText("jPassw");
        login_contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_contraseñaFocusGained(evt);
            }
        });
        login_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_contraseñaKeyPressed(evt);
            }
        });

        bt_Login.setText("Login");
        bt_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_LoginMouseClicked(evt);
            }
        });
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        bt_crearUsuario.setText("Crear Usuario");
        bt_crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearUsuarioMouseClicked(evt);
            }
        });

        label_admin.setForeground(new java.awt.Color(0, 0, 255));
        label_admin.setText("¿Admin?");
        label_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_crearUsuario))
                                .addContainerGap(75, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(login_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(label_admin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(bt_Login)
                .addGap(30, 30, 30)
                .addComponent(bt_crearUsuario)
                .addGap(35, 35, 35)
                .addComponent(label_admin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NoRecuerda.setForeground(new java.awt.Color(0, 0, 255));
        NoRecuerda.setText("¿No recuerda su contraseña?");
        NoRecuerda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoRecuerdaMouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Primera vez teniendo contacto con Unitec");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoRecuerda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foto)
                        .addGap(32, 32, 32)
                        .addComponent(NoRecuerda)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_usuarioFocusGained
        login_usuario.setText("");
    }//GEN-LAST:event_login_usuarioFocusGained

    private void login_contraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_contraseñaFocusGained
        login_contraseña.setText("");

    }//GEN-LAST:event_login_contraseñaFocusGained

    private void login_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_usuarioActionPerformed

    private void bt_crearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearUsuarioMouseClicked
        jd_CreacionUsuario.setModal(true);
        jd_CreacionUsuario.pack();
        jd_CreacionUsuario.setLocationRelativeTo(this);
        jd_CreacionUsuario.setVisible(true);
    }//GEN-LAST:event_bt_crearUsuarioMouseClicked

    private void jb_GuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuarioActionPerformed

    private void jb_GuardarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuarioMouseClicked
        if (!"".equals(tf_NombreCompleto.getText()) && !"".equals(tf_Nickname.getText()) && !"".equals(tf_Contraseña.getText())) {
            Usuarios p
                    = new Usuarios(tf_NombreCompleto.getText(), tf_Nickname.getText(), tf_Contraseña.getText(), cb_PaisORegion.getSelectedItem().toString(),
                            dc_FechaDeNacimiento.getDate(), tf_foto.getIcon(), "");
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            ap.setPersona(p);
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Amigo guardado exitosamente");
            tf_NombreCompleto.setText("");
            tf_Nickname.setText("");
            tf_Contraseña.setText("");
            dc_FechaDeNacimiento.setDate(new Date());
            tf_foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg")));
            jd_CreacionUsuario.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor introduzca lo necesario");
        }
        

    }//GEN-LAST:event_jb_GuardarUsuarioMouseClicked

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void bt_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_LoginMouseClicked
        String usuario = login_usuario.getText();
        String contraseña = login_contraseña.getText();
        administrarPersonas ap = new administrarPersonas("./amigos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaPersonas().size(); i++) {
            if (usuario.equals(ap.getListaPersonas().get(i).getNombre())) {
                if (contraseña.equals(ap.getListaPersonas().get(i).getContraseña())) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/ApprovedSign.png"));
                    
                    JOptionPane.showMessageDialog(this, "Bienvenido " + usuario, "", JOptionPane.INFORMATION_MESSAGE, icon);
                    perfil_nombre.setText(ap.getListaPersonas().get(i).getNombre());
                    perfil_nicknaem.setText(ap.getListaPersonas().get(i).getNickname());
                    perfil_pais.setText(ap.getListaPersonas().get(i).getPais());
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                    perfil_fecha.setText(formato.format(ap.getListaPersonas().get(i).getFecha()));
                    perfil_foto.setIcon(ap.getListaPersonas().get(i).getIcon());
                    jd_Principal.pack();
                    jd_Principal.setLocationRelativeTo(this);
                    jd_Principal.setVisible(true);
                    this.dispose();
                } else {
                    
                }
            }
        }

    }//GEN-LAST:event_bt_LoginMouseClicked

    private void jb_GuardarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuarioMouseEntered

    private void tf_seleccionarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_seleccionarImagenMouseClicked
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(100, 100, 0);
            this.tf_foto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_tf_seleccionarImagenMouseClicked

    private void NoRecuerdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoRecuerdaMouseClicked
        
        JOptionPane.showMessageDialog(this, "Acuerdese");
    }//GEN-LAST:event_NoRecuerdaMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("http://portal.unitec.edu"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void label_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_adminMouseClicked
        PanePrincipal.setEnabledAt(2, false);
        PanePrincipal.setEnabledAt(3, false);
        PanePrincipal.setEnabledAt(4, false);
        PanePrincipal.setEnabledAt(1, false);
        
        jd_admin.pack();
        jd_admin.setLocationRelativeTo(this);
        jd_admin.setVisible(true);

    }//GEN-LAST:event_label_adminMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        administrarAdmin ap = new administrarAdmin("./admin.cbm");
        ap.cargarArchivo();
        String usuario = admin_usuario.getText();
        String pass = admin_pass.getText();
        if (ap.archivo.exists()) {
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if ("admin".equals(usuario) || ap.listaPersonas.get(i).getUsuario().equals(usuario)) {
                    if ("admin".equals(pass) || ap.listaPersonas.get(i).getContraseña().equals(pass)) {
                        PanePrincipal.setEnabledAt(2, true);
                        PanePrincipal.setEnabledAt(3, true);
                        PanePrincipal.setEnabledAt(4, true);
                        PanePrincipal.setEnabledAt(1, true);
                    }
                }
            }
        } else {
            if ("admin".equals(usuario)) {
                if ("admin".equals(pass)) {
                    PanePrincipal.setEnabledAt(2, true);
                    PanePrincipal.setEnabledAt(3, true);
                    PanePrincipal.setEnabledAt(4, true);
                    PanePrincipal.setEnabledAt(1, true);
                }
            }
        }
        

    }//GEN-LAST:event_jButton1MouseClicked

    private void AñadirAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirAdminMouseClicked
        Admin a = new Admin(tf_nuevoAdmin.getText(), tf_contraAdmin.getText());
        administrarAdmin ap = new administrarAdmin("./admin.cbm");
        ap.cargarArchivo();
        ap.setPersona(a);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se ha guardado");
        tf_nuevoAdmin.setText("");
        tf_contraAdmin.setText("");
    }//GEN-LAST:event_AñadirAdminMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Musica", "MP3", "MP4", "WAV");
        fc.setFileFilter(filtro);
        
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            musica_path.setText(archivo.getPath());
            
            try {
                input = new FileInputStream(archivo);
                player = new PausablePlayer(input);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JavaLayerException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        try {
            
            player.stop();
            cont++;
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
        try {
            
            player.pause();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        try {
            if (cont != 0) {
                input = new FileInputStream(archivo);
                player = new PausablePlayer(input);
                player.play();
                cont = 0;
            }
            player.play();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        if (tab.getSelectedIndex() == 1) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cb_solicitudSin.getModel();
            model.removeAllElements();
            DefaultComboBoxModel model2 = (DefaultComboBoxModel) cb_amigosCon.getModel();
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if (ap.listaPersonas.get(i).getNombre().equals(perfil_nombre.getText())) {
                    for (int j = 0; j < ap.listaPersonas.get(i).getAmigos().size(); j++) {
                        if (model2.getIndexOf(ap.listaPersonas.get(i).amigos.get(j))
                                == -1 && !ap.listaPersonas.get(i).amigos.get(j).equals(perfil_nombre.getText())) {
                            model2.addElement(ap.listaPersonas.get(i).amigos.get(j));
                        }
                        
                    }
                }
                if (model2.getIndexOf(ap.listaPersonas.get(i).getNombre()) == -1 && !ap.listaPersonas.get(i).getNombre().equals(perfil_nombre.getText())) {
                    model.addElement(ap.listaPersonas.get(i).getNombre());
                }

                ////tabla 
                tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "quien", "Mensaje"
                        }
                ));
                tabla_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tabla_solicitudesMouseClicked(evt);
                    }
                });
                administrarSolicitud as = new administrarSolicitud("./solicitudes.cbm");
                as.cargarArchivo();
                DefaultTableModel model3 = (DefaultTableModel) tabla_solicitudes.getModel();
///AQUI AYUDA
                for (int j = 0; j < as.listasolicitud.size(); j++) {
                    if (as.listasolicitud.get(j).receptor.equals(perfil_nombre.getText()));
                    {
                        model3.addRow(new Object[]{as.listasolicitud.get(j).emisor, "Quiere ser tu amigo"});
                    }
                }
                
            }
            //tabla mensajeria
            tabla_mensajeria.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                        "Enviado", "De Parte:", "Mensaje", "Estado"
                    }
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };
                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            administrarMensajes am = new administrarMensajes("./mensajes.cbm");
            am.cargarArchivo();
            DefaultTableModel modelM = (DefaultTableModel) tabla_mensajeria.getModel();
            
            for (int i = 0; i < am.listamensajes.size(); i++) {
                if (am.listamensajes.get(i).getReceptor().equals(perfil_nombre.getText())) {
                    modelM.addRow(new Object[]{am.listamensajes.get(i).getEnviado(), am.listamensajes.get(i).getEmisor(), am.listamensajes.get(i).getMensaje(), am.listamensajes.get(i).getEstado()});
                }
            }
            
        }
    }//GEN-LAST:event_tabStateChanged

    private void añadir_amigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadir_amigoMouseClicked
        solicitudes s = new solicitudes(perfil_nombre.getText(), cb_solicitudSin.getSelectedItem().toString(), "esperando");
        administrarSolicitud as = new administrarSolicitud("./solicitudes.cbm");
        as.cargarArchivo();
        as.setSolicitud(s);
        as.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se ha enviado la solicitud");
        for (int i = 0; i < as.listasolicitud.size(); i++) {
            System.out.println(as.listasolicitud.get(i).getReceptor() + " emisor:" + as.listasolicitud.get(i).getEmisor());
        }
    }//GEN-LAST:event_añadir_amigoMouseClicked

    private void boton_añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_añadirMouseClicked
        
        administrarPersonas ap = new administrarPersonas("./amigos.cbm");
        ap.cargarArchivo();
        String algo = tabla_solicitudes.getModel().getValueAt(tabla_solicitudes.getX(), tabla_solicitudes.getY()).toString();
        
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            if (ap.listaPersonas.get(i).getNombre().equals(algo)) {
                ap.listaPersonas.get(i).getAmigos().add(perfil_nombre.getText());
                ap.listaPersonas.get(i).setEstado(algo + "");
            }
            if (ap.listaPersonas.get(i).getNombre().equals(perfil_nombre.getText())) {
                ap.listaPersonas.get(i).getAmigos().add(algo);
            }
        }
        ap.escribirArchivo();
        administrarSolicitud as = new administrarSolicitud("./solicitudes.cbm");
        as.cargarArchivo();
        
        for (int i = 0; i < as.listasolicitud.size(); i++) {
            if (as.listasolicitud.get(i).getEmisor().equals(algo)) {
                as.listasolicitud.remove(i);
                System.out.println(as.listasolicitud.size());
                as.escribirArchivo();
            }
        }
        
        ((DefaultTableModel) tabla_solicitudes.getModel()).removeRow(tabla_solicitudes.getSelectedRow());
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) cb_amigosCon.getModel();
        
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            if (!ap.listaPersonas.get(i).getEstado().contains(perfil_nombre.getText())
                    && !ap.listaPersonas.get(i).getNombre().equals(perfil_nombre.getText())
                    && !ap.listaPersonas.get(i).getNickname().equals(perfil_nicknaem.getText())) {
                
            } else {
                for (int j = 0; j < ap.listaPersonas.get(i).amigos.size(); j++) {
                    if (model2.getIndexOf(ap.listaPersonas.get(i).amigos.get(j)) == -1) {
                        model2.addElement(ap.listaPersonas.get(i).amigos.get(j));
                    }
                }
                
            }
        }
    }//GEN-LAST:event_boton_añadirMouseClicked

    private void tabla_solicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_solicitudesMouseClicked

    }//GEN-LAST:event_tabla_solicitudesMouseClicked

    private void cb_mensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mensajeriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mensajeriaActionPerformed

    private void login_contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_contraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String usuario = login_usuario.getText();
            String contraseña = login_contraseña.getText();
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            for (int i = 0; i < ap.getListaPersonas().size(); i++) {
                if (usuario.equals(ap.getListaPersonas().get(i).getNombre())) {
                    if (contraseña.equals(ap.getListaPersonas().get(i).getContraseña())) {
                        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/ApprovedSign.png"));
                        
                        JOptionPane.showMessageDialog(this, "Bienvenido " + usuario, "", JOptionPane.INFORMATION_MESSAGE, icon);
                        perfil_nombre.setText(ap.getListaPersonas().get(i).getNombre());
                        perfil_nicknaem.setText(ap.getListaPersonas().get(i).getNickname());
                        perfil_pais.setText(ap.getListaPersonas().get(i).getPais());
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
                        perfil_fecha.setText(formato.format(ap.getListaPersonas().get(i).getFecha()));
                        perfil_foto.setIcon(ap.getListaPersonas().get(i).getIcon());
                        jd_Principal.pack();
                        jd_Principal.setLocationRelativeTo(this);
                        jd_Principal.setVisible(true);
                        this.dispose();
                    } else {
                        
                    }
                } else {
                    
                }
            }
            
        }
    }//GEN-LAST:event_login_contraseñaKeyPressed

    private void mensajeria_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajeria_actualizarMouseClicked
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_mensajeria.getModel();
        administrarPersonas ap = new administrarPersonas("./amigos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            if (ap.listaPersonas.get(i).getNombre().equals(perfil_nombre.getText())) {
                for (int j = 0; j < ap.listaPersonas.get(i).getAmigos().size(); j++) {
                    if (model.getIndexOf(ap.listaPersonas.get(i).amigos.get(j))
                            == -1 && !ap.listaPersonas.get(i).amigos.get(j).equals(perfil_nombre.getText())) {
                        model.addElement(ap.listaPersonas.get(i).amigos.get(j));
                    }
                    
                }
                
            }
        }

    }//GEN-LAST:event_mensajeria_actualizarMouseClicked

    private void mensajeria_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajeria_enviarMouseClicked
        //Date enviado, String mensaje, String receptor, String emisor, String estado
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        mensajes m = new mensajes(strDate, tf_mensajeria.getText(), cb_mensajeria.getSelectedItem().toString(), perfil_nombre.getText(), "*");
        administrarMensajes am = new administrarMensajes("./mensajes.cbm");
        am.cargarArchivo();
        am.setMensajes(m);
        am.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se ha enviado el mensaje a:" + cb_mensajeria.getSelectedItem().toString());
        tf_mensajeria.setText("");
    }//GEN-LAST:event_mensajeria_enviarMouseClicked

    private void tabla_mensajeriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_mensajeriaMouseClicked
        if (evt.isMetaDown()) {
            JTable source = (JTable) evt.getSource();
            int row = source.rowAtPoint(evt.getPoint());
            int column = source.columnAtPoint(evt.getPoint());
            if (!source.isRowSelected(row)) {
                source.changeSelection(row, column, false, false);
                menupop_mensajes.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
        

    }//GEN-LAST:event_tabla_mensajeriaMouseClicked

    private void mensajes_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajes_verActionPerformed
        jd_enseñarMensaje.pack();
        jd_enseñarMensaje.setLocationRelativeTo(this);
        jd_enseñarMensaje.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tabla_mensajeria.getModel();
        int rows = tabla_mensajeria.getSelectedRow();
        
        String mensaje = (String) model.getValueAt(rows, 2);
        mensaje_mensaje.setText(mensaje);
        administrarMensajes am = new administrarMensajes("./mensajes.cbm");
        am.cargarArchivo();
        for (int i = 0; i < am.listamensajes.size(); i++) {
            if (am.listamensajes.get(i).getReceptor().equals(perfil_nombre.getText()) && am.listamensajes.get(i).getMensaje().equals(mensaje)) {
                am.listamensajes.get(i).setEstado("Leido");
            }
        }
        am.escribirArchivo();
        tabla_mensajeria.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Enviado", "De Parte:", "Mensaje", "Estado"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        am.cargarArchivo();
        DefaultTableModel modelM = (DefaultTableModel) tabla_mensajeria.getModel();
        
        for (int i = 0; i < am.listamensajes.size(); i++) {
            if (am.listamensajes.get(i).getReceptor().equals(perfil_nombre.getText())) {
                modelM.addRow(new Object[]{am.listamensajes.get(i).getEnviado(), am.listamensajes.get(i).getEmisor(), am.listamensajes.get(i).getMensaje(), am.listamensajes.get(i).getEstado()});
            }
        }
    }//GEN-LAST:event_mensajes_verActionPerformed

    private void mensajes_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajes_eliminarActionPerformed
        int rows = tabla_mensajeria.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tabla_mensajeria.getModel();
        String mensaje = (String) model.getValueAt(rows, 2);
        mensaje_mensaje.setText(mensaje);
        administrarMensajes am = new administrarMensajes("./mensajes.cbm");
        am.cargarArchivo();
        for (int i = 0; i < am.listamensajes.size(); i++) {
            if (am.listamensajes.get(i).getReceptor().equals(perfil_nombre.getText()) && am.listamensajes.get(i).getMensaje().equals(mensaje)) {
                am.listamensajes.remove(i);
            }
        }
        am.escribirArchivo();
        tabla_mensajeria.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Enviado", "De Parte:", "Mensaje", "Estado"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        
        am.cargarArchivo();
        DefaultTableModel modelM = (DefaultTableModel) tabla_mensajeria.getModel();
        
        for (int i = 0; i < am.listamensajes.size(); i++) {
            if (am.listamensajes.get(i).getReceptor().equals(perfil_nombre.getText())) {
                modelM.addRow(new Object[]{am.listamensajes.get(i).getEnviado(), am.listamensajes.get(i).getEmisor(), am.listamensajes.get(i).getMensaje(), am.listamensajes.get(i).getEstado()});
            }
        }
    }//GEN-LAST:event_mensajes_eliminarActionPerformed

    private void boton_rechazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_rechazarMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabla_solicitudes.getModel();
        int rows = tabla_solicitudes.getSelectedRow();
        String receptor = (String) model.getValueAt(rows, 0);
        administrarSolicitud as = new administrarSolicitud("./solicitudes.cbm");
        as.cargarArchivo();
        for (int i = 0; i < as.listasolicitud.size(); i++) {
            if (as.listasolicitud.get(i).getReceptor().equals(perfil_nombre.getText()) && as.listasolicitud.get(i).getEmisor().equals(receptor)) {
                as.listasolicitud.remove(i);
            }
        }
        as.escribirArchivo();
        tabla_solicitudes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "quien", "Mensaje"
                }
        ));
        tabla_solicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_solicitudesMouseClicked(evt);
            }
        });
    }//GEN-LAST:event_boton_rechazarMouseClicked

    private void boton_rechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rechazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_rechazarActionPerformed

    private void jb_GuardarUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario1MouseClicked
        if (!"".equals(tf_NombreCompleto1.getText()) && !"".equals(tf_Nickname1.getText()) && !"".equals(tf_Contraseña1.getText())) {
            Usuarios p
                    = new Usuarios(tf_NombreCompleto1.getText(), tf_Nickname1.getText(), tf_Contraseña1.getText(), cb_PaisORegion1.getSelectedItem().toString(),
                            dc_FechaDeNacimiento1.getDate(), tf_foto1.getIcon(), "");
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            ap.setPersona(p);
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Amigo guardado exitosamente");
            tf_NombreCompleto1.setText("");
            tf_Nickname1.setText("");
            tf_Contraseña1.setText("");
            dc_FechaDeNacimiento1.setDate(new Date());
            tf_foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fb_profile.jpg")));
            
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor introduzca lo necesario");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuario1MouseClicked

    private void jb_GuardarUsuario1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuario1MouseEntered

    private void jb_GuardarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuario1ActionPerformed

    private void tf_seleccionarImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_seleccionarImagen1MouseClicked
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(100, 100, 0);
            this.tf_foto1.setIcon(new ImageIcon(img));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tf_seleccionarImagen1MouseClicked

    private void PanePrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PanePrincipalStateChanged
        if (PanePrincipal.getSelectedIndex() == 1) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cb_modificarUsuario.getModel();
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if (model.getIndexOf(ap.listaPersonas.get(i).getNombre()) == -1) {
                    model.addElement(ap.listaPersonas.get(i).getNombre());
                }
                
            }
            DefaultComboBoxModel modelEliminar = (DefaultComboBoxModel) cb_eliminarUsuari.getModel();
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if (modelEliminar.getIndexOf(ap.listaPersonas.get(i).getNombre()) == -1) {
                    modelEliminar.addElement(ap.listaPersonas.get(i).getNombre());
                }
                
            }
        }
    }//GEN-LAST:event_PanePrincipalStateChanged

    private void tf_seleccionarImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_seleccionarImagen2MouseClicked
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(100, 100, 0);
            this.tf_foto2.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_tf_seleccionarImagen2MouseClicked

    private void jb_GuardarUsuario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario2MouseClicked
        if (!"".equals(tf_NombreCompleto2.getText()) && !"".equals(tf_Nickname2.getText()) && !"".equals(tf_Contraseña2.getText())) {
            Usuarios p
                    = new Usuarios(tf_NombreCompleto2.getText(), tf_Nickname2.getText(), tf_Contraseña2.getText(), cb_PaisORegion2.getSelectedItem().toString(),
                            dc_FechaDeNacimiento2.getDate(), tf_foto2.getIcon(), "");
            
            DefaultComboBoxModel model = (DefaultComboBoxModel) cb_modificarUsuario.getModel();
            String mod = (String) model.getSelectedItem();
            administrarPersonas ap = new administrarPersonas("./amigos.cbm");
            ap.cargarArchivo();
            for (int i = 0; i < ap.listaPersonas.size(); i++) {
                if (ap.listaPersonas.get(i).getNombre().equals(mod)) {
                    ap.listaPersonas.set(i, p);
                }
            }
            
            ap.escribirArchivo();
            JOptionPane.showMessageDialog(this, "Se ha modificado el usuario");
            
        }
    }//GEN-LAST:event_jb_GuardarUsuario2MouseClicked

    private void jb_GuardarUsuario2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuario2MouseEntered

    private void jb_GuardarUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarUsuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_GuardarUsuario2ActionPerformed

    private void cb_modificarUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_modificarUsuarioItemStateChanged
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_modificarUsuario.getModel();
        String mod = (String) model.getSelectedItem();
        administrarPersonas ap = new administrarPersonas("./amigos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            if (ap.listaPersonas.get(i).getNombre().equals(mod)) {
                tf_NombreCompleto2.setText(ap.listaPersonas.get(i).getNombre());
                tf_Nickname2.setText(ap.listaPersonas.get(i).getNickname());
                tf_Contraseña2.setText(ap.listaPersonas.get(i).getContraseña());
                dc_FechaDeNacimiento2.setDate(ap.listaPersonas.get(i).getFecha());
                tf_foto2.setIcon(ap.listaPersonas.get(i).getIcon());
            }
        }
    }//GEN-LAST:event_cb_modificarUsuarioItemStateChanged

    private void bt_eliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarUsuarioMouseClicked
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_eliminarUsuari.getModel();
        String mod = (String) model.getSelectedItem();
        administrarPersonas ap = new administrarPersonas("./amigos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.listaPersonas.size(); i++) {
            if (ap.listaPersonas.get(i).getNombre().equals(mod)) {
                ap.listaPersonas.remove(i);
            }
        }
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se ha borrado el usuario");
    }//GEN-LAST:event_bt_eliminarUsuarioMouseClicked

    private void bt_crearAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearAlbumMouseClicked
       jd_CrearAlbum.pack();
       jd_CrearAlbum.setLocationRelativeTo(this);
       jd_CrearAlbum.setVisible(true);
       
    }//GEN-LAST:event_bt_crearAlbumMouseClicked

    private void tf_crearAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_crearAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_crearAlbumActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirAdmin;
    private javax.swing.JLabel NoRecuerda;
    private javax.swing.JTabbedPane PanePrincipal;
    private javax.swing.JPanel admin_Usuario;
    private javax.swing.JPanel admin_añUsuari;
    private javax.swing.JPanel admin_modiUsuario;
    private javax.swing.JTextField admin_pass;
    private javax.swing.JTextField admin_usuario;
    private javax.swing.JButton añadir_amigo;
    private javax.swing.JButton boton_añadir;
    private javax.swing.JButton boton_rechazar;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_agregarAlbum;
    private javax.swing.JButton bt_crearAlbum;
    private javax.swing.JButton bt_crearUsuario;
    private javax.swing.JButton bt_eliminarUsuario;
    private javax.swing.JComboBox<String> cb_PaisORegion;
    private javax.swing.JComboBox<String> cb_PaisORegion1;
    private javax.swing.JComboBox<String> cb_PaisORegion2;
    private javax.swing.JComboBox<String> cb_amigosCon;
    private javax.swing.JComboBox<String> cb_eliminarUsuari;
    private javax.swing.JComboBox<String> cb_mensajeria;
    private javax.swing.JComboBox<String> cb_modificarUsuario;
    private javax.swing.JComboBox<String> cb_solicitudSin;
    private com.toedter.calendar.JDateChooser dc_FechaDeNacimiento;
    private com.toedter.calendar.JDateChooser dc_FechaDeNacimiento1;
    private com.toedter.calendar.JDateChooser dc_FechaDeNacimiento2;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel foto8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_GuardarUsuario;
    private javax.swing.JButton jb_GuardarUsuario1;
    private javax.swing.JButton jb_GuardarUsuario2;
    private javax.swing.JDialog jd_CreacionUsuario;
    private javax.swing.JDialog jd_CrearAlbum;
    private javax.swing.JDialog jd_Principal;
    private javax.swing.JDialog jd_admin;
    private javax.swing.JDialog jd_enseñarMensaje;
    private javax.swing.JLabel label_admin;
    private javax.swing.JPasswordField login_contraseña;
    private javax.swing.JTextField login_usuario;
    private javax.swing.JTextField mensaje_mensaje;
    private javax.swing.JButton mensajeria_actualizar;
    private javax.swing.JButton mensajeria_enviar;
    private javax.swing.JMenuItem mensajes_eliminar;
    private javax.swing.JMenuItem mensajes_ver;
    private javax.swing.JPopupMenu menupop_mensajes;
    private javax.swing.JTextField musica_path;
    private javax.swing.JPanel pane_añadir;
    private javax.swing.JLabel perfil_fecha;
    private javax.swing.JLabel perfil_foto;
    private javax.swing.JLabel perfil_nicknaem;
    private javax.swing.JLabel perfil_nombre;
    private javax.swing.JLabel perfil_pais;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tabla_mensajeria;
    private javax.swing.JTable tabla_solicitudes;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_Contraseña1;
    private javax.swing.JTextField tf_Contraseña2;
    private javax.swing.JTextField tf_Nickname;
    private javax.swing.JTextField tf_Nickname1;
    private javax.swing.JTextField tf_Nickname2;
    private javax.swing.JTextField tf_NombreCompleto;
    private javax.swing.JTextField tf_NombreCompleto1;
    private javax.swing.JTextField tf_NombreCompleto2;
    private javax.swing.JTextField tf_contraAdmin;
    private javax.swing.JTextField tf_crearAlbum;
    private javax.swing.JLabel tf_foto;
    private javax.swing.JLabel tf_foto1;
    private javax.swing.JLabel tf_foto2;
    private javax.swing.JTextField tf_mensajeria;
    private javax.swing.JTextField tf_nuevoAdmin;
    private javax.swing.JButton tf_seleccionarImagen;
    private javax.swing.JButton tf_seleccionarImagen1;
    private javax.swing.JButton tf_seleccionarImagen2;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuarios> usuarios = new ArrayList();
    File archivo;
    FileInputStream input;
    PausablePlayer player;
    int cont = 0;
    int x;
    int y;
}
