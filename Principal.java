/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cisneros;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Jose Maria
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        
        // inicia el frame principal
        initComponents();
               
        
        
        //coloca el frame como maximizado.
        this.setLocationRelativeTo(null);
        this.setExtendedState(Principal.MAXIMIZED_BOTH);
        
        //Cambie el icono de la ventana Principal
        Image icon = new ImageIcon(getClass().getResource("/cisneros/iconos/cisne.png")).getImage();
        setIconImage(icon);
        
        //Comienza buscando la base de datos de usuarios si no existe la crea por defecto.
        
       
        
        //Desctiva opciones dependiendo de los menus
        MenuAgenda.setEnabled(false);
        // MenuNuevoAlumno.setEnabled(true);
        
        
           
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        MenuAjustes = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuConectarBase = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuConfiguracion = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuSalir = new javax.swing.JMenuItem();
        MenuGestionAlumno = new javax.swing.JMenu();
        MenuNuevoAlumno = new javax.swing.JMenuItem();
        AlumnosActivos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuAlumnosTotales = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuAgenda = new javax.swing.JMenuItem();
        MenuNotas = new javax.swing.JMenuItem();
        MenuCalculadora = new javax.swing.JMenuItem();
        MenuGestionLocalBD = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        MenuAcercade = new javax.swing.JMenu();
        MenuAcercaCisneros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cisneros. Gestión de Alumnos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("Principal"); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );

        MenuAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/configuraciones.png"))); // NOI18N
        MenuAjustes.setText("Ajustes");

        MenuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/intimidad (1).png"))); // NOI18N
        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuariosActionPerformed(evt);
            }
        });
        MenuAjustes.add(MenuUsuarios);

        MenuConectarBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/carpeta.png"))); // NOI18N
        MenuConectarBase.setText("Conexión BBDD");
        MenuConectarBase.setToolTipText("Conecta las bases de datos");
        MenuConectarBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConectarBaseActionPerformed(evt);
            }
        });
        MenuAjustes.add(MenuConectarBase);
        MenuAjustes.add(jSeparator1);

        MenuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/configuraciones (1).png"))); // NOI18N
        MenuConfiguracion.setText("Configuración");
        MenuConfiguracion.setToolTipText("Configuración del programa");
        MenuConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConfiguracionActionPerformed(evt);
            }
        });
        MenuAjustes.add(MenuConfiguracion);
        MenuAjustes.add(jSeparator3);

        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/salida.png"))); // NOI18N
        MenuSalir.setText("Salir");
        MenuSalir.setToolTipText("Cierra el programa");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        MenuAjustes.add(MenuSalir);

        BarraMenu.add(MenuAjustes);

        MenuGestionAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/personal.png"))); // NOI18N
        MenuGestionAlumno.setText("Gestión de Alumnos");
        MenuGestionAlumno.setToolTipText("Gestiona los alumnos");

        MenuNuevoAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuNuevoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/colegial.png"))); // NOI18N
        MenuNuevoAlumno.setText("Matricular Usuarios");
        MenuNuevoAlumno.setToolTipText("Lista de nuevos alumnos.");
        MenuNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoAlumnoActionPerformed(evt);
            }
        });
        MenuGestionAlumno.add(MenuNuevoAlumno);

        AlumnosActivos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        AlumnosActivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/escritorios.png"))); // NOI18N
        AlumnosActivos.setText("Alumnos activos");
        AlumnosActivos.setToolTipText("Alumnos actualmente activos");
        AlumnosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosActivosActionPerformed(evt);
            }
        });
        MenuGestionAlumno.add(AlumnosActivos);
        MenuGestionAlumno.add(jSeparator2);

        MenuAlumnosTotales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuAlumnosTotales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/alumno.png"))); // NOI18N
        MenuAlumnosTotales.setText("Alumnos Totales");
        MenuAlumnosTotales.setToolTipText("Alumnos totales");
        MenuAlumnosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlumnosTotalesActionPerformed(evt);
            }
        });
        MenuGestionAlumno.add(MenuAlumnosTotales);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/certificado.png"))); // NOI18N
        jMenuItem6.setText("Certicicados entregados");
        jMenuItem6.setToolTipText("Alumnos con certificados terminados");
        MenuGestionAlumno.add(jMenuItem6);

        BarraMenu.add(MenuGestionAlumno);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/curso-por-internet.png"))); // NOI18N
        jMenu3.setText("Gestión de cursos");
        jMenu3.setToolTipText("Gestionas los cursos");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/curso-por-internet (1).png"))); // NOI18N
        jMenuItem7.setText("Categorias");
        jMenuItem7.setToolTipText("Define los cursos por categorias");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/curso-online.png"))); // NOI18N
        jMenuItem8.setText("Cursos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        BarraMenu.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/gestion.png"))); // NOI18N
        jMenu4.setText("Gestión de Profesores");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/profesor.png"))); // NOI18N
        jMenuItem10.setText("Profesores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/instructor.png"))); // NOI18N
        jMenuItem11.setText("Profesores por alumnos");
        jMenu4.add(jMenuItem11);

        BarraMenu.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/analitica.png"))); // NOI18N
        jMenu5.setText("Estadisticas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/base-de-datos-financiera.png"))); // NOI18N
        jMenuItem1.setText("Contabilidad");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/curso.png"))); // NOI18N
        jMenuItem2.setText("Estadisticas de cursos");
        jMenu5.add(jMenuItem2);

        BarraMenu.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/defectuoso.png"))); // NOI18N
        jMenu6.setText("Utilidades");

        MenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/cuaderno (1).png"))); // NOI18N
        MenuAgenda.setText("Agenda");
        MenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendaActionPerformed(evt);
            }
        });
        jMenu6.add(MenuAgenda);

        MenuNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/publicalo.png"))); // NOI18N
        MenuNotas.setText("Notas");
        MenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNotasActionPerformed(evt);
            }
        });
        jMenu6.add(MenuNotas);

        MenuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/calculadora.png"))); // NOI18N
        MenuCalculadora.setText("Calculadora");
        MenuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCalculadoraActionPerformed(evt);
            }
        });
        jMenu6.add(MenuCalculadora);

        BarraMenu.add(jMenu6);

        MenuGestionLocalBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/datos-de-terceros.png"))); // NOI18N
        MenuGestionLocalBD.setText("Gestión Local BD");

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/copia-de-seguridad.png"))); // NOI18N
        jMenuItem12.setText("Copia de Seguridad");
        MenuGestionLocalBD.add(jMenuItem12);

        BarraMenu.add(MenuGestionLocalBD);

        MenuAcercade.setText("Acerca de...");
        MenuAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercadeActionPerformed(evt);
            }
        });

        MenuAcercaCisneros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cisneros/iconos/cisne.png"))); // NOI18N
        MenuAcercaCisneros.setText("Acerca de Cisneros");
        MenuAcercaCisneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercaCisnerosActionPerformed(evt);
            }
        });
        MenuAcercade.add(MenuAcercaCisneros);

        BarraMenu.add(MenuAcercade);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuariosActionPerformed
       
        // Abre ventana Usuarios.
       VentanaUsuarios verUser = new VentanaUsuarios();
       escritorio.add(verUser);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = verUser.getSize();
       verUser.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       verUser.show();
    }//GEN-LAST:event_MenuUsuariosActionPerformed

    private void MenuConectarBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConectarBaseActionPerformed
        // Abre ventana Conectar Base de datos
        VentanaConectarBase verCBase = new VentanaConectarBase();
        escritorio.add(verCBase);
       
        //Centra el JInternalFrame en la pantalla
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verCBase.getSize();
        verCBase.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
        
        verCBase.show();
    }//GEN-LAST:event_MenuConectarBaseActionPerformed

    private void MenuAlumnosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlumnosTotalesActionPerformed
        VentanaAlumnosTotales verAluTotal = new VentanaAlumnosTotales();
        escritorio.add(verAluTotal);
       
        //Centra el JInternalFrame en la pantalla
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAluTotal.getSize();
        verAluTotal.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
        
        verAluTotal.show();
    }//GEN-LAST:event_MenuAlumnosTotalesActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        // Sale del programa
        System.exit(WIDTH);
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercadeActionPerformed
        
    }//GEN-LAST:event_MenuAcercadeActionPerformed

    private void MenuAcercaCisnerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercaCisnerosActionPerformed
         // Abre ventana Conectar Acerca de
        VentanaAcercade verAcerca = new VentanaAcercade();
        escritorio.add(verAcerca);
         //Centra el JInternalFrame en la pantalla
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = verAcerca.getSize();
        verAcerca.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
        verAcerca.show();
    }//GEN-LAST:event_MenuAcercaCisnerosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCalculadoraActionPerformed
        VentanaCalculadora verCalcu = new VentanaCalculadora();
        escritorio.add(verCalcu);
        verCalcu.show();
    }//GEN-LAST:event_MenuCalculadoraActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void MenuConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConfiguracionActionPerformed
        // Abre ventana Usuarios.
       VentanaConfiguracion verUser = new VentanaConfiguracion();
       escritorio.add(verUser);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = verUser.getSize();
       verUser.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       verUser.show();
    }//GEN-LAST:event_MenuConfiguracionActionPerformed

    private void MenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNotasActionPerformed
         // Abre ventana Usuarios.
       VentanaBlocNotas Notas = new VentanaBlocNotas();
       escritorio.add(Notas);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = Notas.getSize();
       Notas.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       Notas.show();
    }//GEN-LAST:event_MenuNotasActionPerformed

    private void MenuNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoAlumnoActionPerformed
        // Abre ventana Usuarios.
       VentanaMatricularAlumno matricularAlumno = new VentanaMatricularAlumno();
       escritorio.add(matricularAlumno);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = matricularAlumno.getSize();
       matricularAlumno.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       matricularAlumno.show();
    }//GEN-LAST:event_MenuNuevoAlumnoActionPerformed

    private void AlumnosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosActivosActionPerformed
         // Abre ventana Usuarios.
       VentanaAlumnosActivos AlumnosActivos = new VentanaAlumnosActivos();
       escritorio.add(AlumnosActivos);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = AlumnosActivos.getSize();
       AlumnosActivos.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       AlumnosActivos.show();
    }//GEN-LAST:event_AlumnosActivosActionPerformed

    private void MenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendaActionPerformed
       VentanaCalendario Notas = new VentanaCalendario();
       escritorio.add(Notas);
       
       //Centra el JInternalFrame en la pantalla
       Dimension desktopSize = escritorio.getSize();
       Dimension FrameSize = Notas.getSize();
       Notas.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
       
       //Pone el Fame en modo visibility
       Notas.show();
    }//GEN-LAST:event_MenuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnosActivos;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem MenuAcercaCisneros;
    private javax.swing.JMenu MenuAcercade;
    private javax.swing.JMenuItem MenuAgenda;
    private javax.swing.JMenu MenuAjustes;
    private javax.swing.JMenuItem MenuAlumnosTotales;
    private javax.swing.JMenuItem MenuCalculadora;
    private javax.swing.JMenuItem MenuConectarBase;
    private javax.swing.JMenuItem MenuConfiguracion;
    private javax.swing.JMenu MenuGestionAlumno;
    private javax.swing.JMenu MenuGestionLocalBD;
    private javax.swing.JMenuItem MenuNotas;
    private javax.swing.JMenuItem MenuNuevoAlumno;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenuItem MenuUsuarios;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
