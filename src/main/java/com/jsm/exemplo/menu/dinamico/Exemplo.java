/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsm.exemplo.menu.dinamico;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author moises
 */
public class Exemplo extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Exemplo
     */
    public Exemplo() {
        initComponents();
        preencherMenu();
        this.getContentPane().setBackground(Color.white);
        panelMenu.setBackground(Color.red);
        //this.panelMenu.setPreferredSize(new Dimension(100, 100));

    }

    private void preencherMenu() {
        panelMenu.removeAll();
        panelMenu.invalidate();
        JButton b = null;
        int rows = CategoriaController.categorias().size() / 4;

        GridLayout gl = new GridLayout(rows, 4);

        panelMenu.setLayout(new FlowLayout());

        int i = 0;
        for (Categoria c : CategoriaController.categorias()) {

            // Tenta carregar imagem vindo da web [ Para fezer testes rapidos modifique para ImageIcon icon = null;//readImageFromUrl(c.getFoto())]
            ImageIcon icon = readImageFromUrl(c.getFoto());
            // Tenta carregar imagem de dentro do pacote de imagens
            if (icon == null) {
                icon = readFromPackge("src/main/resources/images/thumbnail-not-picked.jpg".replace("/", File.separator));
            }
            // Caso icon seja null tenta carregar de algum path pre definido
            if (icon == null) {
                icon = readFromPath("/home/moises/Imagens/thumbnail-not-picked2.jpg");
            }

            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(newImage);

            icon.getImage().setAccelerationPriority(TOP_ALIGNMENT);
            //BotaoMenu(T object, String text, Icon icon) {
            BotaoMenu bm = new BotaoMenu(c, c.getNome(), ic);
            bm.setVerticalTextPosition(SwingConstants.BOTTOM);
            bm.setHorizontalTextPosition(SwingConstants.CENTER);
            //bm.setSize(100, 100);
            bm.setBackground(Color.ORANGE);
            bm.setForeground(Color.red);
            bm.addActionListener(this);

            panelMenu.add(bm);
            i++;
        }

        panelMenu.validate();
        panelMenu.repaint();
        System.gc();

    }

    private void processarClickProduto(Produto produto) {
        if (produto.getId() == -1L) {
            preencherMenu();
        } else {
            // Realiza a venda do produto
        }

    }

    private void processarClickCategoria(Categoria categoria) {
        List<Produto> produtos = ProdutoController.produtosPorCategoria(categoria);
        panelMenu.removeAll();
        panelMenu.invalidate();
        
       
        produtos.forEach(p -> {
            System.out.println(p);
             // Tenta carregar imagem vindo da web [ Para fezer testes rapidos modifique para ImageIcon icon = null;//readImageFromUrl(c.getFoto())]
            ImageIcon icon  = readImageFromUrl(p.getFoto());
            // Tenta carregar imagem de dentro do pacote de imagens
            if (icon == null) {
                icon = readFromPackge("src/main/resources/images/thumbnail-not-picked.jpg".replace("/", File.separator));
            }
            // Caso icon seja null tenta carregar de algum path pre definido
//            if (icon == null) {
//                icon = readFromPath("/home/moises/Imagens/thumbnail-not-picked2.jpg");
//            }

            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(80, 40, Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(newImage);
            BotaoMenu bm = new BotaoMenu(p, p.getNome(), ic);
            bm.setVerticalTextPosition(SwingConstants.BOTTOM);
            bm.setHorizontalTextPosition(SwingConstants.CENTER);
            //bm.setSize(100, 100);
            bm.setBackground(Color.ORANGE);
            bm.setForeground(Color.red);
            bm.addActionListener(this);
            panelMenu.add(bm);
        });
         panelMenu.validate();
         panelMenu.repaint();
        
         System.gc();
    }

    private ImageIcon readFromPath(String file) {
        ImageIcon icon = new ImageIcon(file);
        return icon;
    }

    private ImageIcon readFromPackge(String packageAndFileName) {
        // packageAndFileName = packageAndFileName.replace("//", File.separator);

        ImageIcon icon = new ImageIcon(packageAndFileName);
        return icon;

    }

    private ImageIcon readImageFromUrl(String location) {
        Image image = null;
        ImageIcon icon = null;
        try {
            URL url = new URL(location);
            image = ImageIO.read(url);
            icon = new ImageIcon(image);

        } catch (NullPointerException e) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, e);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.imageio.IIOException ex) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Exemplo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return icon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        menuScrollPane = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 129, 133));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setText("jButton1");

        panelMenu.setPreferredSize(new java.awt.Dimension(300, 100));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        menuScrollPane.setViewportView(panelMenu);

        jButton2.setIcon(new javax.swing.ImageIcon("/home/moises/Imagens/coca-cola.jpg")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 249, Short.MAX_VALUE))
                    .addComponent(menuScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jButton2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane menuScrollPane;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        BotaoMenu bm = (BotaoMenu) e.getSource();
        if (bm.getObject() instanceof Categoria) {
            processarClickCategoria((Categoria) bm.getObject());
        } else if (bm.getObject() instanceof Produto) {
            processarClickProduto((Produto) bm.getObject());
        }
    }

}
