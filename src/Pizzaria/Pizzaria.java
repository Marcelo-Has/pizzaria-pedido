package Pizzaria;

import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Pizzaria extends javax.swing.JFrame {

    DecimalFormat formatador = new DecimalFormat("#####0.00");
    private float precoCamarao_P = 34.90f;
    private float precoCamarao_M = 45.50f;
    private float precoCamarao_G = 54.90f;
    private float precoBacon_P = 31.90f;
    private float precoBacon_M = 41.50f;
    private float precoBacon_G = 49.50f;
    private float precoCalabresa_P = 28.90f;
    private float precoCalabresa_M = 35.90f;
    private float precoCalabresa_G = 45.00f;
    private float precoPeQ_P = 30.90f;
    private float precoPeQ_M = 40.50f;
    private float precoPeQ_G = 48.00f;
    private float precoCobBacon = 2.00f;
    private float precoCobCamarao = 2.50f;
    private float precoCobChampion = 2.50f;
    private float precoCobPresunto = 2.00f;
    private float precoCobQueijo = 2.00f;
    private float precoCobCebola = 1.50f;

    public Pizzaria() {
        initComponents();

        valorPedido.setHorizontalAlignment(SwingConstants.RIGHT);

        definePreco();
    }

    private void definePreco() {

        ActionListener verificaSelecao = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (opPCamarao.isSelected()) {
                    precoCamarao.setText("R$ " + formataPreco(precoCamarao_P));
                } else if (opMCamarao.isSelected()) {
                    precoCamarao.setText("R$ " + formataPreco(precoCamarao_M));
                } else {
                    precoCamarao.setText("R$ " + formataPreco(precoCamarao_G));
                }

                if (opPBacon.isSelected()) {
                    precoBacon.setText("R$ " + formataPreco(precoBacon_P));
                } else if (opMBacon.isSelected()) {
                    precoBacon.setText("R$ " + formataPreco(precoBacon_M));
                } else {
                    precoBacon.setText("R$ " + formataPreco(precoBacon_G));
                }

                if (opPCalabresa.isSelected()) {
                    precoCalabresa.setText("R$ " + formataPreco(precoCalabresa_P));
                } else if (opMCalabresa.isSelected()) {
                    precoCalabresa.setText("R$ " + formataPreco(precoCalabresa_M));
                } else {
                    precoCalabresa.setText("R$ " + formataPreco(precoCalabresa_G));
                }

                if (opPPeQ.isSelected()) {
                    precoPeQ.setText("R$ " + formataPreco(precoPeQ_P));
                } else if (opMPeQ.isSelected()) {
                    precoPeQ.setText("R$ " + formataPreco(precoPeQ_M));
                } else {
                    precoPeQ.setText("R$ " + formataPreco(precoPeQ_G));
                }

                float valorPedido_final = (Float.parseFloat(cboQntCamarao.getSelectedItem().toString()) * Float.parseFloat(precoCamarao.getText().replace(",", ".").replace("R$ ", "")))
                        + (Float.parseFloat(cboQntBacon.getSelectedItem().toString()) * Float.parseFloat(precoBacon.getText().replace(",", ".").replace("R$ ", "")))
                        + (Float.parseFloat(cboQntCalabresa.getSelectedItem().toString()) * Float.parseFloat(precoCalabresa.getText().replace(",", ".").replace("R$ ", "")))
                        + (Float.parseFloat(cboQntPeQ.getSelectedItem().toString()) * Float.parseFloat(precoPeQ.getText().replace(",", ".").replace("R$ ", "")))
                        + (Float.parseFloat(cboQntCobBacon.getSelectedItem().toString()) * precoCobBacon)
                        + (Float.parseFloat(cboQntCobCamarao.getSelectedItem().toString()) * precoCobCamarao)
                        + (Float.parseFloat(cboQntCobChampion.getSelectedItem().toString()) * precoCobChampion)
                        + (Float.parseFloat(cboQntCobPresunto.getSelectedItem().toString()) * precoCobPresunto)
                        + (Float.parseFloat(cboQntCobQueijo.getSelectedItem().toString()) * precoCobQueijo)
                        + (Float.parseFloat(cboQntCobCebola.getSelectedItem().toString()) * precoCobCebola);
                valorPedido.setText("R$ " + formataPreco(valorPedido_final));
            }
        };

        opPCamarao.addActionListener(verificaSelecao);
        opMCamarao.addActionListener(verificaSelecao);
        opGCamarao.addActionListener(verificaSelecao);
        opPBacon.addActionListener(verificaSelecao);
        opMBacon.addActionListener(verificaSelecao);
        opGBacon.addActionListener(verificaSelecao);
        opPCalabresa.addActionListener(verificaSelecao);
        opMCalabresa.addActionListener(verificaSelecao);
        opGCalabresa.addActionListener(verificaSelecao);
        opPPeQ.addActionListener(verificaSelecao);
        opMPeQ.addActionListener(verificaSelecao);
        opGPeQ.addActionListener(verificaSelecao);
        cboQntCamarao.addActionListener(verificaSelecao);
        cboQntBacon.addActionListener(verificaSelecao);
        cboQntCalabresa.addActionListener(verificaSelecao);
        cboQntPeQ.addActionListener(verificaSelecao);
        cboQntCobBacon.addActionListener(verificaSelecao);
        cboQntCobCamarao.addActionListener(verificaSelecao);
        cboQntCobChampion.addActionListener(verificaSelecao);
        cboQntCobPresunto.addActionListener(verificaSelecao);
        cboQntCobQueijo.addActionListener(verificaSelecao);
        cboQntCobCebola.addActionListener(verificaSelecao);

    }

    private String formataPreco(Float preco) {
        return formatador.format(preco).replace(".", ",");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupCamarao = new javax.swing.ButtonGroup();
        btnGroupBacon = new javax.swing.ButtonGroup();
        btnGroupCalabresa = new javax.swing.ButtonGroup();
        btnGroupPeQ = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        lbPizzas = new javax.swing.JLabel();
        lbCobertura = new javax.swing.JLabel();
        pizzaCamarao = new javax.swing.JLabel();
        pizzaBacon = new javax.swing.JLabel();
        pizzaCalabresa = new javax.swing.JLabel();
        pizzaPeQ = new javax.swing.JLabel();
        lbCamarao = new javax.swing.JLabel();
        lbBacon = new javax.swing.JLabel();
        lbCalabresa = new javax.swing.JLabel();
        lbPeQ = new javax.swing.JLabel();
        opPCamarao = new javax.swing.JRadioButton();
        opMCamarao = new javax.swing.JRadioButton();
        opGCamarao = new javax.swing.JRadioButton();
        lbQntCamarao = new javax.swing.JLabel();
        cboQntCamarao = new javax.swing.JComboBox<>();
        opPBacon = new javax.swing.JRadioButton();
        opMBacon = new javax.swing.JRadioButton();
        opGBacon = new javax.swing.JRadioButton();
        lbQntBacon = new javax.swing.JLabel();
        cboQntBacon = new javax.swing.JComboBox<>();
        opPCalabresa = new javax.swing.JRadioButton();
        opMCalabresa = new javax.swing.JRadioButton();
        opGCalabresa = new javax.swing.JRadioButton();
        lbQntCalabresa = new javax.swing.JLabel();
        cboQntCalabresa = new javax.swing.JComboBox<>();
        opPPeQ = new javax.swing.JRadioButton();
        opMPeQ = new javax.swing.JRadioButton();
        opGPeQ = new javax.swing.JRadioButton();
        lbQntPeQ = new javax.swing.JLabel();
        cboQntPeQ = new javax.swing.JComboBox<>();
        precoCamarao = new javax.swing.JLabel();
        precoBacon = new javax.swing.JLabel();
        precoCalabresa = new javax.swing.JLabel();
        precoPeQ = new javax.swing.JLabel();
        cobBacon = new javax.swing.JLabel();
        cobCamarao = new javax.swing.JLabel();
        cobChampion = new javax.swing.JLabel();
        cobPresunto = new javax.swing.JLabel();
        cobQueijo = new javax.swing.JLabel();
        cobCebola = new javax.swing.JLabel();
        lbCobBacon = new javax.swing.JLabel();
        lbCobCamarao = new javax.swing.JLabel();
        lbCobChampion = new javax.swing.JLabel();
        lbCobPresunto = new javax.swing.JLabel();
        lbCobQueijo = new javax.swing.JLabel();
        lbCobCebola = new javax.swing.JLabel();
        lbPrecoCobBacon = new javax.swing.JLabel();
        lbPrecoCobCamarao = new javax.swing.JLabel();
        lbPrecoCobChampion = new javax.swing.JLabel();
        lbPrecoCobPresunto = new javax.swing.JLabel();
        lbPrecoCobQueijo = new javax.swing.JLabel();
        lbPrecoCobCebola = new javax.swing.JLabel();
        lbQntCobBacon = new javax.swing.JLabel();
        cboQntCobBacon = new javax.swing.JComboBox<>();
        lbQntCobCamarao = new javax.swing.JLabel();
        cboQntCobCamarao = new javax.swing.JComboBox<>();
        lbQntCobChampion = new javax.swing.JLabel();
        cboQntCobChampion = new javax.swing.JComboBox<>();
        lbQntCobPresunto = new javax.swing.JLabel();
        cboQntCobPresunto = new javax.swing.JComboBox<>();
        lbQntCobQueijo = new javax.swing.JLabel();
        cboQntCobQueijo = new javax.swing.JComboBox<>();
        lbQntCobCebola = new javax.swing.JLabel();
        cboQntCobCebola = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lbPedido = new javax.swing.JLabel();
        valorPedido = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria Has");
        setIconImages(null);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1080, 625));
        setResizable(false);
        getContentPane().setLayout(null);

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("PIZZARIA HAS");
        getContentPane().add(lbTitulo);
        lbTitulo.setBounds(560, 30, 330, 44);

        lbPizzas.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        lbPizzas.setForeground(new java.awt.Color(255, 255, 255));
        lbPizzas.setText("Sabores de Pizzas");
        getContentPane().add(lbPizzas);
        lbPizzas.setBounds(630, 80, 210, 33);

        lbCobertura.setFont(new java.awt.Font("Times New Roman", 3, 28)); // NOI18N
        lbCobertura.setForeground(new java.awt.Color(255, 255, 255));
        lbCobertura.setText("Coberturas Extras");
        getContentPane().add(lbCobertura);
        lbCobertura.setBounds(630, 330, 220, 33);

        pizzaCamarao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/pizzaCamarao.png"))); // NOI18N
        getContentPane().add(pizzaCamarao);
        pizzaCamarao.setBounds(460, 140, 92, 92);

        pizzaBacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/pizzaBacon.png"))); // NOI18N
        getContentPane().add(pizzaBacon);
        pizzaBacon.setBounds(610, 140, 92, 92);

        pizzaCalabresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/pizzaCalabresa.png"))); // NOI18N
        getContentPane().add(pizzaCalabresa);
        pizzaCalabresa.setBounds(760, 140, 92, 90);

        pizzaPeQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/pizzaPeQ.png"))); // NOI18N
        getContentPane().add(pizzaPeQ);
        pizzaPeQ.setBounds(910, 140, 90, 90);

        lbCamarao.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCamarao.setForeground(new java.awt.Color(255, 255, 255));
        lbCamarao.setText("Camarão");
        getContentPane().add(lbCamarao);
        lbCamarao.setBounds(470, 120, 70, 20);

        lbBacon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbBacon.setForeground(new java.awt.Color(255, 255, 255));
        lbBacon.setText(" Bacon");
        getContentPane().add(lbBacon);
        lbBacon.setBounds(630, 120, 60, 20);

        lbCalabresa.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        lbCalabresa.setText("Calabresa");
        getContentPane().add(lbCalabresa);
        lbCalabresa.setBounds(770, 120, 80, 20);

        lbPeQ.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbPeQ.setForeground(new java.awt.Color(255, 255, 255));
        lbPeQ.setText("Presunto e Queijo");
        getContentPane().add(lbPeQ);
        lbPeQ.setBounds(890, 120, 130, 20);

        opPCamarao.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCamarao.add(opPCamarao);
        opPCamarao.setForeground(new java.awt.Color(255, 255, 255));
        opPCamarao.setSelected(true);
        opPCamarao.setText("P");
        getContentPane().add(opPCamarao);
        opPCamarao.setBounds(450, 230, 31, 23);

        opMCamarao.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCamarao.add(opMCamarao);
        opMCamarao.setForeground(new java.awt.Color(255, 255, 255));
        opMCamarao.setText("M");
        getContentPane().add(opMCamarao);
        opMCamarao.setBounds(490, 230, 33, 23);

        opGCamarao.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCamarao.add(opGCamarao);
        opGCamarao.setForeground(new java.awt.Color(255, 255, 255));
        opGCamarao.setText("G");
        getContentPane().add(opGCamarao);
        opGCamarao.setBounds(530, 230, 33, 23);

        lbQntCamarao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCamarao.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCamarao.setText("Qnt:");
        getContentPane().add(lbQntCamarao);
        lbQntCamarao.setBounds(460, 290, 34, 20);

        cboQntCamarao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCamarao);
        cboQntCamarao.setBounds(500, 290, 50, 20);

        opPBacon.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupBacon.add(opPBacon);
        opPBacon.setForeground(new java.awt.Color(255, 255, 255));
        opPBacon.setSelected(true);
        opPBacon.setText("P");
        getContentPane().add(opPBacon);
        opPBacon.setBounds(600, 230, 31, 23);

        opMBacon.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupBacon.add(opMBacon);
        opMBacon.setForeground(new java.awt.Color(255, 255, 255));
        opMBacon.setText("M");
        getContentPane().add(opMBacon);
        opMBacon.setBounds(640, 230, 33, 23);

        opGBacon.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupBacon.add(opGBacon);
        opGBacon.setForeground(new java.awt.Color(255, 255, 255));
        opGBacon.setText("G");
        getContentPane().add(opGBacon);
        opGBacon.setBounds(680, 230, 33, 23);

        lbQntBacon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntBacon.setForeground(new java.awt.Color(255, 255, 255));
        lbQntBacon.setText("Qnt:");
        getContentPane().add(lbQntBacon);
        lbQntBacon.setBounds(610, 290, 34, 20);

        cboQntBacon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntBacon);
        cboQntBacon.setBounds(650, 290, 50, 20);

        opPCalabresa.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCalabresa.add(opPCalabresa);
        opPCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        opPCalabresa.setSelected(true);
        opPCalabresa.setText("P");
        getContentPane().add(opPCalabresa);
        opPCalabresa.setBounds(750, 230, 31, 23);

        opMCalabresa.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCalabresa.add(opMCalabresa);
        opMCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        opMCalabresa.setText("M");
        getContentPane().add(opMCalabresa);
        opMCalabresa.setBounds(790, 230, 33, 23);

        opGCalabresa.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupCalabresa.add(opGCalabresa);
        opGCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        opGCalabresa.setText("G");
        getContentPane().add(opGCalabresa);
        opGCalabresa.setBounds(830, 230, 33, 23);

        lbQntCalabresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCalabresa.setText("Qnt:");
        getContentPane().add(lbQntCalabresa);
        lbQntCalabresa.setBounds(760, 290, 34, 20);

        cboQntCalabresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCalabresa);
        cboQntCalabresa.setBounds(800, 290, 50, 20);

        opPPeQ.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupPeQ.add(opPPeQ);
        opPPeQ.setForeground(new java.awt.Color(255, 255, 255));
        opPPeQ.setSelected(true);
        opPPeQ.setText("P");
        getContentPane().add(opPPeQ);
        opPPeQ.setBounds(900, 230, 31, 23);

        opMPeQ.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupPeQ.add(opMPeQ);
        opMPeQ.setForeground(new java.awt.Color(255, 255, 255));
        opMPeQ.setText("M");
        getContentPane().add(opMPeQ);
        opMPeQ.setBounds(940, 230, 33, 23);

        opGPeQ.setBackground(new java.awt.Color(255, 255, 204));
        btnGroupPeQ.add(opGPeQ);
        opGPeQ.setForeground(new java.awt.Color(255, 255, 255));
        opGPeQ.setText("G");
        getContentPane().add(opGPeQ);
        opGPeQ.setBounds(980, 230, 33, 23);

        lbQntPeQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntPeQ.setForeground(new java.awt.Color(255, 255, 255));
        lbQntPeQ.setText("Qnt:");
        getContentPane().add(lbQntPeQ);
        lbQntPeQ.setBounds(910, 290, 34, 20);

        cboQntPeQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntPeQ);
        cboQntPeQ.setBounds(950, 290, 50, 20);

        precoCamarao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoCamarao.setForeground(new java.awt.Color(255, 255, 255));
        precoCamarao.setText("R$ 34,90");
        getContentPane().add(precoCamarao);
        precoCamarao.setBounds(470, 260, 80, 20);

        precoBacon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoBacon.setForeground(new java.awt.Color(255, 255, 255));
        precoBacon.setText("R$ 31,90");
        getContentPane().add(precoBacon);
        precoBacon.setBounds(620, 260, 80, 20);

        precoCalabresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoCalabresa.setForeground(new java.awt.Color(255, 255, 255));
        precoCalabresa.setText("R$ 28,90");
        getContentPane().add(precoCalabresa);
        precoCalabresa.setBounds(770, 260, 80, 20);

        precoPeQ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoPeQ.setForeground(new java.awt.Color(255, 255, 255));
        precoPeQ.setText("R$ 30,90");
        getContentPane().add(precoPeQ);
        precoPeQ.setBounds(920, 260, 80, 20);

        cobBacon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobBacon.png"))); // NOI18N
        getContentPane().add(cobBacon);
        cobBacon.setBounds(460, 390, 70, 40);

        cobCamarao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobCamarao.png"))); // NOI18N
        getContentPane().add(cobCamarao);
        cobCamarao.setBounds(560, 390, 70, 40);

        cobChampion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobChampion.png"))); // NOI18N
        getContentPane().add(cobChampion);
        cobChampion.setBounds(660, 390, 70, 40);

        cobPresunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobPresunto.png"))); // NOI18N
        getContentPane().add(cobPresunto);
        cobPresunto.setBounds(760, 390, 70, 40);

        cobQueijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobQueijo.png"))); // NOI18N
        getContentPane().add(cobQueijo);
        cobQueijo.setBounds(860, 390, 70, 40);

        cobCebola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/cobCebola.png"))); // NOI18N
        getContentPane().add(cobCebola);
        cobCebola.setBounds(960, 390, 70, 40);

        lbCobBacon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobBacon.setForeground(new java.awt.Color(255, 255, 255));
        lbCobBacon.setText("Bacon");
        getContentPane().add(lbCobBacon);
        lbCobBacon.setBounds(470, 370, 50, 17);

        lbCobCamarao.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobCamarao.setForeground(new java.awt.Color(255, 255, 255));
        lbCobCamarao.setText("Camarão");
        getContentPane().add(lbCobCamarao);
        lbCobCamarao.setBounds(560, 370, 70, 17);

        lbCobChampion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobChampion.setForeground(new java.awt.Color(255, 255, 255));
        lbCobChampion.setText("Champion");
        getContentPane().add(lbCobChampion);
        lbCobChampion.setBounds(660, 370, 80, 17);

        lbCobPresunto.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobPresunto.setForeground(new java.awt.Color(255, 255, 255));
        lbCobPresunto.setText("Presunto");
        getContentPane().add(lbCobPresunto);
        lbCobPresunto.setBounds(760, 370, 70, 17);

        lbCobQueijo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobQueijo.setForeground(new java.awt.Color(255, 255, 255));
        lbCobQueijo.setText("Queijo");
        getContentPane().add(lbCobQueijo);
        lbCobQueijo.setBounds(870, 370, 50, 17);

        lbCobCebola.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbCobCebola.setForeground(new java.awt.Color(255, 255, 255));
        lbCobCebola.setText("Cebola");
        getContentPane().add(lbCobCebola);
        lbCobCebola.setBounds(970, 370, 50, 17);

        lbPrecoCobBacon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobBacon.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobBacon.setText("R$ 2,00");
        getContentPane().add(lbPrecoCobBacon);
        lbPrecoCobBacon.setBounds(460, 430, 70, 22);

        lbPrecoCobCamarao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobCamarao.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobCamarao.setText("R$ 2,50");
        getContentPane().add(lbPrecoCobCamarao);
        lbPrecoCobCamarao.setBounds(560, 430, 70, 22);

        lbPrecoCobChampion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobChampion.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobChampion.setText("R$ 2,50");
        getContentPane().add(lbPrecoCobChampion);
        lbPrecoCobChampion.setBounds(660, 430, 70, 22);

        lbPrecoCobPresunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobPresunto.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobPresunto.setText("R$ 2,00");
        getContentPane().add(lbPrecoCobPresunto);
        lbPrecoCobPresunto.setBounds(760, 430, 70, 22);

        lbPrecoCobQueijo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobQueijo.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobQueijo.setText("R$ 2,00");
        getContentPane().add(lbPrecoCobQueijo);
        lbPrecoCobQueijo.setBounds(860, 430, 70, 22);

        lbPrecoCobCebola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPrecoCobCebola.setForeground(new java.awt.Color(255, 255, 255));
        lbPrecoCobCebola.setText("R$ 1,50");
        getContentPane().add(lbPrecoCobCebola);
        lbPrecoCobCebola.setBounds(960, 430, 70, 22);

        lbQntCobBacon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobBacon.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobBacon.setText("Qnt:");
        getContentPane().add(lbQntCobBacon);
        lbQntCobBacon.setBounds(450, 460, 34, 20);

        cboQntCobBacon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobBacon);
        cboQntCobBacon.setBounds(490, 460, 40, 20);

        lbQntCobCamarao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobCamarao.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobCamarao.setText("Qnt:");
        getContentPane().add(lbQntCobCamarao);
        lbQntCobCamarao.setBounds(550, 460, 34, 20);

        cboQntCobCamarao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobCamarao);
        cboQntCobCamarao.setBounds(590, 460, 40, 20);

        lbQntCobChampion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobChampion.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobChampion.setText("Qnt:");
        getContentPane().add(lbQntCobChampion);
        lbQntCobChampion.setBounds(650, 460, 34, 20);

        cboQntCobChampion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobChampion);
        cboQntCobChampion.setBounds(690, 460, 40, 20);

        lbQntCobPresunto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobPresunto.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobPresunto.setText("Qnt:");
        getContentPane().add(lbQntCobPresunto);
        lbQntCobPresunto.setBounds(750, 460, 34, 20);

        cboQntCobPresunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobPresunto);
        cboQntCobPresunto.setBounds(790, 460, 40, 20);

        lbQntCobQueijo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobQueijo.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobQueijo.setText("Qnt:");
        getContentPane().add(lbQntCobQueijo);
        lbQntCobQueijo.setBounds(850, 460, 34, 20);

        cboQntCobQueijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobQueijo);
        cboQntCobQueijo.setBounds(890, 460, 40, 20);

        lbQntCobCebola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbQntCobCebola.setForeground(new java.awt.Color(255, 255, 255));
        lbQntCobCebola.setText("Qnt:");
        getContentPane().add(lbQntCobCebola);
        lbQntCobCebola.setBounds(950, 460, 34, 20);

        cboQntCobCebola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cboQntCobCebola);
        cboQntCobCebola.setBounds(990, 460, 40, 20);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar Pedido");
        btnLimpar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaPedido(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(890, 550, 140, 35);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar Pedido");
        btnConfirmar.setPreferredSize(new java.awt.Dimension(140, 35));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaPedido(evt);
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(480, 550, 150, 35);

        lbPedido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbPedido.setForeground(new java.awt.Color(255, 255, 255));
        lbPedido.setText("Valor Total do Pedido:");
        getContentPane().add(lbPedido);
        lbPedido.setBounds(480, 500, 280, 30);

        valorPedido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valorPedido.setForeground(new java.awt.Color(255, 255, 255));
        valorPedido.setText("R$ 0,00");
        getContentPane().add(valorPedido);
        valorPedido.setBounds(780, 500, 250, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pizzaria/background.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1080, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limpaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaPedido
        opPCamarao.setSelected(true);
        precoCamarao.setText("R$ " + formataPreco(precoCamarao_P));
        cboQntCamarao.setSelectedIndex(0);
        opPBacon.setSelected(true);
        precoBacon.setText("R$ " + formataPreco(precoBacon_P));
        cboQntBacon.setSelectedIndex(0);
        opPCalabresa.setSelected(true);
        precoCalabresa.setText("R$ " + formataPreco(precoCalabresa_P));
        cboQntCalabresa.setSelectedIndex(0);
        opPPeQ.setSelected(true);
        precoPeQ.setText("R$ " + formataPreco(precoPeQ_P));
        cboQntPeQ.setSelectedIndex(0);
        cboQntCobBacon.setSelectedIndex(0);
        cboQntCobCamarao.setSelectedIndex(0);
        cboQntCobChampion.setSelectedIndex(0);
        cboQntCobPresunto.setSelectedIndex(0);
        cboQntCobQueijo.setSelectedIndex(0);
        cboQntCobCebola.setSelectedIndex(0);
    }//GEN-LAST:event_limpaPedido

    private void confirmaPedido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaPedido
        String compraCamarao, compraBacon, compraCalabresa, compraPeQ, compraCobBacon, compraCobCamarao, compraCobChampion, compraCobPresunto, compraCobQueijo, compraCobCebola;
        if (cboQntCamarao.getSelectedIndex() == 0) {
            compraCamarao = "";
        } else {
            // compraCamarao = "Pizza de Camarão - " + btnGroupCamarao.getSelection().getSelectedObjects().toString() + " : " + cboQntCamarao.getSelectedIndex() + " unidades." ;
            compraCamarao = "Pizza de Camarão - " + btnGroupCamarao.getElements().nextElement().getText() + " : " + cboQntCamarao.getSelectedIndex() + " unidade(s).______________________________R$ " + formataPreco(Float.parseFloat(cboQntCamarao.getSelectedItem().toString()) * Float.parseFloat(precoCamarao.getText().replace(",", ".").replace("R$ ", ""))) + "\n";
        }

        if (cboQntBacon.getSelectedIndex() == 0) {
            compraBacon = "";
        } else {
            compraBacon = "Pizza de Bacon - " + btnGroupBacon.getElements().nextElement().getText() + " : " + cboQntBacon.getSelectedIndex() + " unidade(s).________________________________R$ " + formataPreco(Float.parseFloat(cboQntBacon.getSelectedItem().toString()) * Float.parseFloat(precoBacon.getText().replace(",", ".").replace("R$ ", ""))) + "\n";
        }

        if (cboQntCalabresa.getSelectedIndex() == 0) {
            compraCalabresa = "";
        } else {
            compraCalabresa = "Pizza de Calabresa - " + btnGroupCalabresa.getElements().nextElement().getText() + " : " + cboQntCalabresa.getSelectedIndex() + " unidade(s)._____________________________R$ " + formataPreco(Float.parseFloat(cboQntCalabresa.getSelectedItem().toString()) * Float.parseFloat(precoCalabresa.getText().replace(",", ".").replace("R$ ", ""))) + "\n";
        }

        if (cboQntPeQ.getSelectedIndex() == 0) {
            compraPeQ = "";
        } else {
            compraPeQ = "Pizza de Presunto e Queijo - " + btnGroupPeQ.getElements().nextElement().getText() + " : " + cboQntPeQ.getSelectedIndex() + " unidade(s)._______________________R$ " + formataPreco(Float.parseFloat(cboQntPeQ.getSelectedItem().toString()) * Float.parseFloat(precoPeQ.getText().replace(",", ".").replace("R$ ", ""))) + "\n";
        }

        if (cboQntCobBacon.getSelectedIndex() == 0) {
            compraCobBacon = "";
        } else {
            compraCobBacon = "Cobertura Extra de Bacon : " + cboQntCobBacon.getSelectedIndex() + " unidade(s).___________________________R$ " + formataPreco(Float.parseFloat(cboQntCobBacon.getSelectedItem().toString()) * precoCobBacon) + "\n";
        }

        if (cboQntCobCamarao.getSelectedIndex() == 0) {
            compraCobCamarao = "";
        } else {
            compraCobCamarao = "Cobertura Extra de Camarão : " + cboQntCobCamarao.getSelectedIndex() + " unidade(s).________________________R$ " + formataPreco(Float.parseFloat(cboQntCobCamarao.getSelectedItem().toString()) * precoCobCamarao) + "\n";
        }

        if (cboQntCobChampion.getSelectedIndex() == 0) {
            compraCobChampion = "";
        } else {
            compraCobChampion = "Cobertura Extra de Champion : " + cboQntCobChampion.getSelectedIndex() + " unidade(s)._______________________R$ " + formataPreco(Float.parseFloat(cboQntCobChampion.getSelectedItem().toString()) * precoCobChampion) + "\n";
        }

        if (cboQntCobPresunto.getSelectedIndex() == 0) {
            compraCobPresunto = "";
        } else {
            compraCobPresunto = "Cobertura Extra de Presunto : " + cboQntCobPresunto.getSelectedIndex() + " unidade(s).________________________R$ " + formataPreco(Float.parseFloat(cboQntCobPresunto.getSelectedItem().toString()) *  precoCobPresunto) + "\n";
        }

        if (cboQntCobQueijo.getSelectedIndex() == 0) {
            compraCobQueijo = "";
        } else {
            compraCobQueijo = "Cobertura Extra de Queijo : " + cboQntCobQueijo.getSelectedIndex() + " unidade(s).__________________________R$ " + formataPreco(Float.parseFloat(cboQntCobQueijo.getSelectedItem().toString()) * precoCobQueijo) + "\n";
        }

        if (cboQntCobCebola.getSelectedIndex() == 0) {
            compraCobCebola = "";
        } else {
            compraCobCebola = "Cobertura Extra de Cebola : " + cboQntCobCebola.getSelectedIndex() + " unidade(s)._________________________R$ " + formataPreco(Float.parseFloat(cboQntCobCebola.getSelectedItem().toString()) * precoCobCebola) + "\n";
        }

        if (compraCamarao.equals("") & compraBacon.equals("") & compraCalabresa.equals("") & compraPeQ.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum sabor de pizza foi adicionado ao pedido!", "Confirmação do Pedido", 1);
        } else {
            if (JOptionPane.showConfirmDialog(null, compraCamarao + compraBacon + compraCalabresa + compraPeQ + compraCobBacon
                    + compraCobCamarao + compraCobChampion + compraCobPresunto + compraCobQueijo + compraCobCebola
                    + "\n\n O seu pedido está correto?", "Confirmação do pedido", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!", "Confirmação do Pedido", 1);
            }
        }
        
        opPCamarao.setSelected(true);
        precoCamarao.setText("R$ " + formataPreco(precoCamarao_P));
        cboQntCamarao.setSelectedIndex(0);
        opPBacon.setSelected(true);
        precoBacon.setText("R$ " + formataPreco(precoBacon_P));
        cboQntBacon.setSelectedIndex(0);
        opPCalabresa.setSelected(true);
        precoCalabresa.setText("R$ " + formataPreco(precoCalabresa_P));
        cboQntCalabresa.setSelectedIndex(0);
        opPPeQ.setSelected(true);
        precoPeQ.setText("R$ " + formataPreco(precoPeQ_P));
        cboQntPeQ.setSelectedIndex(0);
        cboQntCobBacon.setSelectedIndex(0);
        cboQntCobCamarao.setSelectedIndex(0);
        cboQntCobChampion.setSelectedIndex(0);
        cboQntCobPresunto.setSelectedIndex(0);
        cboQntCobQueijo.setSelectedIndex(0);
        cboQntCobCebola.setSelectedIndex(0);
    }//GEN-LAST:event_confirmaPedido

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
            java.util.logging.Logger.getLogger(Pizzaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizzaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizzaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup btnGroupBacon;
    private javax.swing.ButtonGroup btnGroupCalabresa;
    private javax.swing.ButtonGroup btnGroupCamarao;
    private javax.swing.ButtonGroup btnGroupPeQ;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cboQntBacon;
    private javax.swing.JComboBox<String> cboQntCalabresa;
    private javax.swing.JComboBox<String> cboQntCamarao;
    private javax.swing.JComboBox<String> cboQntCobBacon;
    private javax.swing.JComboBox<String> cboQntCobCamarao;
    private javax.swing.JComboBox<String> cboQntCobCebola;
    private javax.swing.JComboBox<String> cboQntCobChampion;
    private javax.swing.JComboBox<String> cboQntCobPresunto;
    private javax.swing.JComboBox<String> cboQntCobQueijo;
    private javax.swing.JComboBox<String> cboQntPeQ;
    private javax.swing.JLabel cobBacon;
    private javax.swing.JLabel cobCamarao;
    private javax.swing.JLabel cobCebola;
    private javax.swing.JLabel cobChampion;
    private javax.swing.JLabel cobPresunto;
    private javax.swing.JLabel cobQueijo;
    private javax.swing.JLabel lbBacon;
    private javax.swing.JLabel lbCalabresa;
    private javax.swing.JLabel lbCamarao;
    private javax.swing.JLabel lbCobBacon;
    private javax.swing.JLabel lbCobCamarao;
    private javax.swing.JLabel lbCobCebola;
    private javax.swing.JLabel lbCobChampion;
    private javax.swing.JLabel lbCobPresunto;
    private javax.swing.JLabel lbCobQueijo;
    private javax.swing.JLabel lbCobertura;
    private javax.swing.JLabel lbPeQ;
    private javax.swing.JLabel lbPedido;
    private javax.swing.JLabel lbPizzas;
    private javax.swing.JLabel lbPrecoCobBacon;
    private javax.swing.JLabel lbPrecoCobCamarao;
    private javax.swing.JLabel lbPrecoCobCebola;
    private javax.swing.JLabel lbPrecoCobChampion;
    private javax.swing.JLabel lbPrecoCobPresunto;
    private javax.swing.JLabel lbPrecoCobQueijo;
    private javax.swing.JLabel lbQntBacon;
    private javax.swing.JLabel lbQntCalabresa;
    private javax.swing.JLabel lbQntCamarao;
    private javax.swing.JLabel lbQntCobBacon;
    private javax.swing.JLabel lbQntCobCamarao;
    private javax.swing.JLabel lbQntCobCebola;
    private javax.swing.JLabel lbQntCobChampion;
    private javax.swing.JLabel lbQntCobPresunto;
    private javax.swing.JLabel lbQntCobQueijo;
    private javax.swing.JLabel lbQntPeQ;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton opGBacon;
    private javax.swing.JRadioButton opGCalabresa;
    private javax.swing.JRadioButton opGCamarao;
    private javax.swing.JRadioButton opGPeQ;
    private javax.swing.JRadioButton opMBacon;
    private javax.swing.JRadioButton opMCalabresa;
    private javax.swing.JRadioButton opMCamarao;
    private javax.swing.JRadioButton opMPeQ;
    private javax.swing.JRadioButton opPBacon;
    private javax.swing.JRadioButton opPCalabresa;
    private javax.swing.JRadioButton opPCamarao;
    private javax.swing.JRadioButton opPPeQ;
    private javax.swing.JLabel pizzaBacon;
    private javax.swing.JLabel pizzaCalabresa;
    private javax.swing.JLabel pizzaCamarao;
    private javax.swing.JLabel pizzaPeQ;
    private javax.swing.JLabel precoBacon;
    private javax.swing.JLabel precoCalabresa;
    private javax.swing.JLabel precoCamarao;
    private javax.swing.JLabel precoPeQ;
    private javax.swing.JLabel valorPedido;
    // End of variables declaration//GEN-END:variables
}
