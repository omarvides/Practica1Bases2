/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Cubo.Cubo;
import Cubo.VistaCubo;
import Mapeo.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author omar
 */
public class Front extends javax.swing.JFrame {

    Modelo a;
    public static String URL = "";
    public static String user="";
    Olap es;
    public static String password="";
    public ArrayList<String> jeraquia = new ArrayList<String>();
            
    DefaultListModel dm = new DefaultListModel();
    /**
     * Creates new form Front
     */
    public Front() {
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}
        initComponents();
        this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        jButton4.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jDialog1.setTitle("Configuracion de conexion");
        jDialog1.setBounds(new java.awt.Rectangle(0, 0, 450, 250));
        jDialog1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDialog1.setModal(true);

        jLabel1.setText("Configuracion del String de conexion");

        jLabel2.setText("Host");

        jLabel3.setText("User Name");

        jLabel4.setText("Password");

        jLabel5.setText("Database");

        jTextField1.setText("127.0.0.1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("postgres");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("postgres");

        jTextField3.setText("prueba1");

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jPasswordField1))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(16, 16, 16))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setAutoscrolls(true);
        jTabbedPane1.addTab("Transaccional", jDesktopPane1);
        jTabbedPane1.addTab("Dimensiones/Jerarquias", jDesktopPane2);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setText("Select Fact");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);

        jButton4.setText("Generate Cube");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jMenu1.setText("File");

        jMenuItem1.setText("New Project");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ArrayList<String> metricas = new ArrayList<String>();    
        Component[] components = jDesktopPane1.getComponents();         
        for(int x = 0; x < components.length; x++)
        {
            Component comp = components[x];            
            if(comp instanceof JInternalFrame)
            {
                JInternalFrame ff = (JInternalFrame) comp;
                if(ff.isSelected())
                {
                    JPanel jpn = (JPanel) ff.getContentPane().getComponent(0);                    
                    Component[] subcomponents = jpn.getComponents(); 
                    
                    for(int y = 0; y < subcomponents.length; y++)
                    {
                        Component subcomp = subcomponents[y];                        
                        if(subcomp instanceof JCheckBox)
                        {
                            JCheckBox jchk = (JCheckBox) subcomp;
                            String[] arr = jchk.getText().split("\\|");                            
                            if(jchk.isSelected())
                            {
                                metricas.add(arr[1]);                                
                            }                                                        
                        }
                    }
                            
                    String msg = "Has elegido definir como fact la tabla: \"" + ff.getTitle().toUpperCase() + "\", a continuacion\n"
                            + "se mostraran las posibles dimensiones, deberas escoger las jerarquias a utilizar.";
                    JOptionPane.showMessageDialog(this,msg,"MessageBox Title",JOptionPane.INFORMATION_MESSAGE);
                    
                    //for para extraccion de metricas.                                        
                    generarOlap(a,ff.getTitle(), metricas);
                }
                
            }            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.URL = "jdbc:postgresql://"+ jTextField1.getText() +":5432/"+jTextField3.getText();
        this.user = jTextField2.getText();
        this.password = jPasswordField1.getText();
        jDialog1.setVisible(false);
//        System.out.println("My new String: " + this.URL);
        a = new Modelo();
        a.cargarEntidades();
        cargarUiTransaccional(a);
        String msg = "En el siguiente cuadro de vista transaccional eliga una tabla para generar la tabla fact y elige\n"
                + " tambien las metricas que deseas que se muestren de dicha tabla, a continuacion Presione el boton\n"
                + " \"Select Fact \"de la barra de menu inferior.";
        JOptionPane.showMessageDialog(this,msg,"PASO 1: GENERACION DE TABLA FACT\\METRICAS",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        crearJerarquias();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Front().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void cargarUiTransaccional(Modelo a) {
        
            a.ejecutaSecuencia();
           // Entidad prueba=a.BuscarEntidad("agencia");                        
            //ArrayList<String> dimensiones=a.getDimensiones("detallefactura");           
            ArrayList<Entidad> x = a.getEntidades();            

           int B=10;
           B=10+1;            
            Iterator m = x.iterator();
            int xpos = 0;
            int ypos = 0;
            int wrap = 0;
            while(m.hasNext())
            {
                Entidad w = (Entidad) m.next();                
                String name = w.getNombre();
                if(!(name.toLowerCase().contains("dimension") || name.toLowerCase().contains("dimencion")
                        || name.toLowerCase().contains("dim")))
                {
                    JInternalFrame f = new JInternalFrame(w.getNombre(), true);
                    JPanel jp = new JPanel();
                    jp.setBounds(0, 0, 200, 150);
                    jp.setLayout(new GridLayout(5, 1, 0,2));
                    ArrayList<String[]> att = w.getAtributos();
    //                System.out.println(att.size());
                    Iterator u = att.iterator();
                    while(u.hasNext())
                    {
                        String[] t = (String[]) u.next();
                        JCheckBox chk = new JCheckBox(t[1] + " | " + t[0]);
    //                    System.out.println(t[0]);
                        jp.add(chk);


                    }
                    f.add(jp);
                    if(wrap == 6)
                    {
                        ypos++;
                        xpos = 0;
                        wrap = 0;
                    }
                    f.setBounds(xpos * 210, ypos*155, 200, 150);
                    f.setVisible(true);                
                    this.jDesktopPane1.add(f);
                    xpos++;
                    wrap++;
                }
            }                                                               
            int c;
            c=1+1;
    }

    private void generarOlap(Modelo a, String title, ArrayList<String> metricas) {
        
        es = new Olap(a,title,metricas);
        ArrayList<queryDim> myquery = es.getDimensionesPosibles();
        crearNuevaUi(myquery);
        //generarJerarquia(es);
    }

    private void generarJerarquia(Olap es) {
        ArrayList<String> jeraquia=new ArrayList();
            
            jeraquia.add("pais_nombre");
            jeraquia.add("departamento_nombre");
            jeraquia.add("municipio_nombre");
            jeraquia.add("agencia_nombre");           
            
            es.setDimX1("dimension_02", jeraquia, "ubicacion");
            
           //Dimension dim=new Dimension(a.getDimOriginales().get(1),jeraquia);         
           
           //a.getDimOriginales().get(1).CrearDimensionTiempo("factura_fecha");
                    
           //dim.CrearDimension("Ubicacion");
                     
           jeraquia=new ArrayList();
           jeraquia.add("producto_nombre");
           
           es.setDimX1("dimension_01", jeraquia, "producto");
           
           es.setDimTiempo("dimension_02", "factura_fecha");
           
           
           // ya introducidas las dimenciones con jerarquias se coloca el nombre de la tabla hechos.  este metodo crea un Atributo de Olap(estrella) 
           es.generaTablaEchos("prueba");
           //TODO: 
           //estrella tiene los campos  de la tabla hechos, las llaves foraneas  (hacia las dimenciones) y las dimenciones con jeraquias.
    }

    private void crearNuevaUi(ArrayList<queryDim> myquery) {        
        jTabbedPane1.setEnabledAt(0, false);
        jButton1.setEnabled(false);
        jTabbedPane1.setSelectedIndex(1);        
        int xpos = 0;
        int ypos = 0;
        int wrap = 0;
        
        Iterator xmd = myquery.iterator();
        while(xmd.hasNext())
        {
            queryDim qdim = (queryDim) xmd.next();
//            System.out.println(qdim.getNombre());
            JInternalFrame f = new JInternalFrame(qdim.getNombre(), true);
            JPanel jp = new JPanel();
            jp.setBounds(0, 0, 200, 150);
            jp.setLayout(new GridLayout(5, 1, 0,2));
            
            ArrayList<String> trt = qdim.getAtributos();
            Iterator m = trt.iterator();                        
            
            while(m.hasNext())
            {
                String xdu = (String) m.next();
//                System.out.println(xdu);
                JCheckBox chk = new JCheckBox(xdu);
                jp.add(chk);
            }
            f.add(jp);
            if(wrap == 6)
            {
                ypos++;
                xpos = 0;
                wrap = 0;
            }
            f.setBounds(xpos * 210, ypos*155, 200, 150);
            f.setVisible(true);                
            this.jDesktopPane2.add(f);
            xpos++;
            wrap++;
        }         
        jButton4.setEnabled(true);
    }

    private void crearJerarquias() {
                
        Component[] components = jDesktopPane2.getComponents();         
        for(int x = 0; x < components.length; x++)
        {
            Component comp = components[x];            
            if(comp instanceof JInternalFrame)
            {
                
                JInternalFrame ff = (JInternalFrame) comp;
                                
                    JPanel jpn = (JPanel) ff.getContentPane().getComponent(0);                    
                    Component[] subcomponents = jpn.getComponents(); 
                    
                    for(int y = 0; y < subcomponents.length; y++)
                    {
                        Component subcomp = subcomponents[y];                        
                        if(subcomp instanceof JCheckBox)
                        {
                            JCheckBox jchk = (JCheckBox) subcomp;                            
                            if(jchk.isSelected())
                            {
//                                System.out.println(jchk.getText() + " " + ff.getTitle());
                                jeraquia.add(jchk.getText());
                            }                                                        
                        }
                    }                                                   
            
                    es.setDimX1(ff.getTitle(), jeraquia, "Jerarquia" + x);

                    
                    jeraquia=new ArrayList();                          
                    
                    //for para extraccion de metricas.                                        
                    //generarOlap(a,ff.getTitle(), metricas);
                }
                                    
        }
                // ya introducidas las dimenciones con jerarquias se coloca el nombre de la tabla hechos.  este metodo crea un Atributo de Olap(estrella) 
                es.generaTablaEchos("prueba");
                Cubo cubo= new Cubo(es.getModeloEstrella());
                cubo.setDatosUsuario(Front.URL, Front.user, Front.password);
                VistaCubo vs= new VistaCubo(cubo);
                vs.setVisible(true);
                    String msg = "Cubo generado exitosamente, ahora pueden analizarse los datos.";
                    JOptionPane.showMessageDialog(this,msg,"MessageBox Title",JOptionPane.INFORMATION_MESSAGE);

        
    }
}
