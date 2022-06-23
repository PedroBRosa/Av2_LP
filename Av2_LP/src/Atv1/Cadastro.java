package Atv1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Cadastro extends JFrame {

    static ArrayList <Carro> carros = new ArrayList<>();
    private JPanel cadastroPanel;
    private JFormattedTextField marcaTF;
    private JFormattedTextField modeloTF;
    private JFormattedTextField anoTF;
    private JFormattedTextField valorTF;
    private JButton salvarButton;
    private JButton sairButton;
    public void build(){
        setTitle("Cadastro");
        setSize(500,250);
        setContentPane(cadastroPanel);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();
        int width = screen.width;
        int height = screen.height;
        setLocation(width/3,height/3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void reset(){
        marcaTF.setText("");
        modeloTF.setText("");
        anoTF.setText("");
        valorTF.setText("");
    }
    public Cadastro() {
        salvarButton.addActionListener(e -> {
            Carro carro = new Carro();
            carro.setMarca(marcaTF.getText());
            carro.setModelo(modeloTF.getText());
            carro.setAno(Integer.parseInt(anoTF.getText()));
            carro.setValor(Double.valueOf(valorTF.getText()));
            carros.add(carro);
            JOptionPane.showMessageDialog(cadastroPanel,"Cadastro Realizado com sucesso!");
            reset();
        });
        sairButton.addActionListener(e -> {
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        });

    }





}
