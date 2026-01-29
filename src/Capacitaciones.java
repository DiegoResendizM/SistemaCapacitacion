import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Capacitaciones extends javax.swing.JFrame {
    
    private List<String[]> registros = new ArrayList<>();
    private int indiceActual = -1;
    private static final String ARCHIVO = "capacitaciones.txt";

    public Capacitaciones() {
        initComponents();
        cargarRegistros();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CAPACITACIONES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Matricula:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Curso:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha (AAAA-MM-DD):");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Modalidad:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Horas:");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SIGUIENTE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(265, 265, 265))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatricula)
                                    .addComponent(txtId)
                                    .addComponent(txtCurso)
                                    .addComponent(txtFecha)
                                    .addComponent(txtModalidad)
                                    .addComponent(txtHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                        .addGap(169, 169, 169))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         navegar(-1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarRegistro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        navegar(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        eliminarRegistro();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

private boolean existeEnArchivo(String valor, int columna, String archivo) {
        File f = new File(archivo);
        if (!f.exists()) return false;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";", -1);
                if (partes.length > columna && partes[columna].equals(valor)) {
                    return true;
                }
            }
        } catch (IOException e) { 
            /* ignora */ 
        }
        return false;
    }

    private void cargarRegistros() {
        registros.clear();
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            try { 
                archivo.createNewFile(); 
            } catch (IOException e) { 
                JOptionPane.showMessageDialog(this, "Error al crear archivo.");
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    registros.add(linea.split(";", -1));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar capacitaciones.");
        }
        indiceActual = registros.isEmpty() ? -1 : 0;
        mostrarRegistro();
    }

    private void mostrarRegistro() {
        if (registros.isEmpty()) { 
            limpiar(); 
            return; 
        }
        String[] r = registros.get(indiceActual);
        txtId.setText(r[0]);
        txtMatricula.setText(r[1]);
        txtCurso.setText(r[2]);
        txtFecha.setText(r[3]);
        txtModalidad.setText(r[4]);
        txtHoras.setText(r[5]);
    }

    private void limpiar() {
        txtId.setText("");
        txtMatricula.setText("");
        txtCurso.setText("");
        txtFecha.setText("");
        txtModalidad.setText("");
        txtHoras.setText("");
    }

    private void guardarRegistro() {
    String id = txtId.getText().trim();
    String mat = txtMatricula.getText().trim();
    String cur = txtCurso.getText().trim();
    String fec = txtFecha.getText().trim();
    String mod = txtModalidad.getText().trim();
    String hrs = txtHoras.getText().trim();

    if (id.isEmpty() || mat.isEmpty() || cur.isEmpty() || fec.isEmpty() || mod.isEmpty() || hrs.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
        return;
    }

    for (String[] r : registros) {
        if (r[0].equals(id)) {
            JOptionPane.showMessageDialog(this, "El ID de capacitación ya existe.");
            return;
        }
    }

    if (!existeEnArchivo(mat, 0, "estudiantes.txt")) {
        JOptionPane.showMessageDialog(this, "La matrícula no existe en estudiantes.txt\nPrimero debe registrar al estudiante.");
        return;
    }

    if (!existeEnArchivo(cur, 0, "cursos.txt")) {
        JOptionPane.showMessageDialog(this, "El código de curso no existe en cursos.txt\nPrimero debe registrar el curso.");
        return;
    }

    if (!fec.matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(this, "El formato de fecha debe ser AAAA-MM-DD");
        return;
    }

    try {
        int h = Integer.parseInt(hrs);
        if (h < 0) throw new NumberFormatException();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Horas cubiertas debe ser un entero ≥ 0.");
        return;
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
        bw.write(id + ";" + mat + ";" + cur + ";" + fec + ";" + mod + ";" + hrs);
        bw.newLine();
        JOptionPane.showMessageDialog(this, "Capacitación guardada exitosamente.");
        cargarRegistros();
        limpiar();

        if (!registros.isEmpty()) {
            indiceActual = registros.size() - 1;
            mostrarRegistro();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
    }
} 

    private void eliminarRegistro() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay registros para eliminar.");
            return;
        }
        int conf = JOptionPane.showConfirmDialog(this, "¿Eliminar esta capacitación?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            registros.remove(indiceActual);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
                for (String[] r : registros) {
                    bw.write(String.join(";", r));
                    bw.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar.");
                return;
            }
            if (indiceActual >= registros.size()) indiceActual = Math.max(0, registros.size() - 1);
            mostrarRegistro();
            JOptionPane.showMessageDialog(this, "Capacitación eliminada.");
        }
    }

    private void navegar(int dir) {
        if (registros.isEmpty()) return;
        indiceActual += dir;
        if (indiceActual < 0) {
            indiceActual = 0;
            JOptionPane.showMessageDialog(this, "Está en el primer registro.");
        } else if (indiceActual >= registros.size()) {
            indiceActual = registros.size() - 1;
            JOptionPane.showMessageDialog(this, "Está en el último registro.");
        }
        mostrarRegistro();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModalidad;
    // End of variables declaration//GEN-END:variables
}
