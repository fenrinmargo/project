import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Оля, я правда старалась писать чистый понятный код с объяснениями

public class GUI {

    public static void main (String[] args) throws Exception {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);


        //создаем кнопки и поля
        JButton jButton = new JButton("Что я могу приготовить?");
        JButton jButton2 = new JButton("Добавить новый рецепт");
        JLabel label1 = new JLabel("у меня появился новый продукт, это:");
        JTextField field1 = new JTextField(10);
        JButton jButtonPlus = new JButton("Добавить продукт");
        JLabel label2 = new JLabel("я сЪел кое-что, это:");
        JTextField field2 = new JTextField(10);
        JButton jButtonMinus = new JButton("Удалить продукт");

        JTextArea area = new JTextArea(20, 59); //поле для ВЫВОДА рецепта
        area.setLineWrap(true);       //работа с пере-
        area.setWrapStyleWord(true);  //носом строк

        JLabel label3 = new JLabel("Введите название блюда:");
        JTextField field3 = new JTextField(10);
        JLabel label4 = new JLabel("Введите нужные ингридиенты через пробел:");
        JTextField field4 = new JTextField(10);
        JLabel label5 = new JLabel("Введите рецепт:");
        JTextField field5 = new JTextField(10);

        //выводим кнопочки кнопочулички кнопульки выводим на экран
        jPanel.add(label1);
        jPanel.add(field1);
        jPanel.add(jButtonPlus);
        jPanel.add(label2);
        jPanel.add(field2);
        jPanel.add(jButtonMinus);
        jPanel.add(jButton);
        jPanel.add(area);
        jPanel.add(label3);
        jPanel.add(field3);
        jPanel.add(label4);
        jPanel.add(field4);
        jPanel.add(label5);
        jPanel.add(field5);
        jPanel.add(jButton2);



        //обработка событий JButton ("Что я могу приготовить?")
        jButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //твои действия ...
                System.out.println("я нажал кнопку Чтоямогуприготовить");
                area.setText("сюда можно внести название блюда и рецепт ");
            }
        });

        //обработка событий jButton2("Добавить новый рецепт")
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //превращаем введенный тект с объект
                String name = field3.getText();
                String needProduct = field4.getText();
                String recipe = field5.getText();

                //очищаем поля
                field3.setText("");
                field4.setText("");
                field5.setText("");
                
                //твои дейсвия ...
                System.out.println("я нажал кнопку Добавитьновыйрецепт");
            }
        });

        //считывание текста "у меня появился новый продукт:"
        jButtonPlus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String plusProduct = field1.getText(); //объект "plusProduct" это текст, введенный пользователем
                field1.setText(""); //очистить поле
                //твои действия ...
                System.out.println(plusProduct);
            }
        });

        //считывание текста "я сЪел кое-что, это:"
        jButtonMinus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String minusProduct = field2.getText(); //объект "minusProduct" это текст, введенный пользователем
                field2.setText(""); //очистить поле
                //твои действия ...
                System.out.println(minusProduct);
            }
        });


    }


    //создание окошка
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
