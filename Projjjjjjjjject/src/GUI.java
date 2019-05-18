import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GUI {

    public static void main (String[] args) throws Exception {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("Что я могу приготовить?");
        JButton jButton2 = new JButton("Добавить новый рецепт");
        JLabel label1 = new JLabel("у меня появился новый продукт, это:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("я сЪел кое-что, это:");
        JTextField field2 = new JTextField(10);



        //выводим кнопочки кнопочулички кнопульки выводим на экран
        jPanel.add(label1);
        jPanel.add(field1);
        jPanel.add(label2);
        jPanel.add(field2);
        jPanel.add(jButton);
        jPanel.add(jButton2);

        //обработка событий JButton ("Что я могу приготовить?")
        class TestActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Друг, я просил тебя нажимать эту кнопку?");
            }
        }
        ActionListener actionListener = new TestActionListener();
        jButton.addActionListener(actionListener);


        //обработка событий jButton2("Добавить новый рецепт")
        class TestActListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Друг, я просил тебя нажимать эту кнопку,,,,,,,,,,,,,,,,,?");
            }
        }
        ActionListener actListener = new TestActListener();
        jButton2.addActionListener(actListener);

    }



    static JFrame getFrame(){
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true); //окно превращается в видимое
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //теперь окно можно закрыть и прекратить этим программу
        jFrame.setSize(1500, 800); // размеры окна
        jFrame.setLocation(0, 0);
        jFrame.setTitle("hOlOdos");
        return jFrame;
    }

}
