package Atv1;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame{
    private JPanel homePanel;
    private JButton cadastrarCarroButton;
    private JButton listagemGeralButton;
    private JButton mostrarAMediaDeButton;
    private JButton SAIRButton;

    public void build(){
        setTitle("Cadastro");
        setSize(500,250);
        setContentPane(homePanel);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();
        int width = screen.width;
        int height = screen.height;
        setLocation(width/3,height/3);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Home() {
        cadastrarCarroButton.addActionListener(e -> {
            Cadastro cadastro = new Cadastro();
            cadastro.build();
        });
        SAIRButton.addActionListener(e -> {
            setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
        listagemGeralButton.addActionListener(e -> {
            ListarTodos listarTodos = new ListarTodos();
            listarTodos.build();
        });
        mostrarAMediaDeButton.addActionListener(e -> {
            try{
                int soma = 0, media = 0;
                int cont = 0;
                for (Carro carro : Cadastro.carros) {
                    if (carro.getValor() >= 50000) {
                        soma += carro.getAno();
                        cont++;
                    }
                }
                media = soma / cont;
                JOptionPane.showMessageDialog(homePanel, "A media do ano dos carros \ncom o valor superior a" +
                        "R$ 50.000 é: \n" + media);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(homePanel, "Não tem nenhum carro com valor superior a \nR$ 50.000 " );
            }
        });
    }
}
