package Atv1;

import javax.swing.*;
import java.awt.*;

public class ListarTodos extends JFrame{
    private JPanel listagemPanel;
    private JButton sairButton;
    private JButton listarTodosButton;
    private JTextArea todosTA;

    public ListarTodos() {
        listarTodosButton.addActionListener(e -> {
            for (Carro carro: Cadastro.carros) {
                todosTA.append(
                        "Marca: " + carro.getMarca() +
                        "\nModelo: " + carro.getModelo() +
                        "\nAno: " + carro.getAno() +
                        "\nValor: " +"R$"+ carro.getValor() +
                        "\n===========================================================\n");
            }
        });
        sairButton.addActionListener(e -> {
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        });
    }

    public void build(){
        setTitle("Cadastro");
        setSize(550, 500);
        setContentPane(listagemPanel);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screen = kit.getScreenSize();
        int width = screen.width;
        int height = screen.height;
        setLocation(width / 3, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
