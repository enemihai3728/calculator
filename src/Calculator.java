import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.StrictMath.sqrt;


public class Calculator extends JFrame {

    // Creare butoane + display

    private JTextField display;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton one;
    private JButton zero;
    private JButton two;
    private JButton three;
    private JButton impartire;
    private JButton clear;
    private JButton inmultire;
    private JButton plus;
    private JButton egal;
    private JButton minus;
    private JButton square;
    private JButton radical;
    private JButton virgula;
    private JButton procent;
    private JButton pozneg;

    // Creare variabile ce memoreaza numerele pe care se efectueaza operatia

    private double tempSecond = 0.0;
    private double tempFirst = 0.0;

    // Vector ce memoreaza operatiile

    private boolean[] operation = new boolean[7];

    // Main

    public static void main(String[] args) {
        new Calculator();
    }

    // Configurare calculator

    public Calculator() {
        super("Mihai's Calculator");
        sendUI(this);
        sendDisplay();
        sendButtons();



    }

    // Configurare butoane

    private void sendButtons() {

        // Crearea butoanelor

        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        one = new JButton("1");
        zero = new JButton("0");
        two = new JButton("2");
        three = new JButton("3");
        impartire = new JButton(":");
        inmultire = new JButton("X");
        egal = new JButton("=");
        clear = new JButton("C");
        minus = new JButton("-");
        square = new JButton("x²");
        radical = new JButton("√");
        virgula = new JButton(".");
        procent = new JButton("%");
        plus = new JButton("+");
        egal = new JButton("=");
        pozneg = new JButton("+/-");

        // Adaugarea butoanelor

        add(seven);
        add(eight);
        add(nine);
        add(impartire);
        add(clear);
        add(four);
        add(five);
        add(six);
        add(inmultire);
        add(one);
        add(two);
        add(three);
        add(minus);
        add(square);
        add(radical);
        add(zero);
        add(virgula);
        add(procent);
        add(plus);
        add(egal);
        add(pozneg);

        // Dimensiuni si pozitionare pentru butoane

        seven.setBounds(20, 100, 50, 50);
        eight. setBounds(90,100,50,50);
        nine.setBounds(160,100,50,50);
        impartire.setBounds(230,100,50,50);
        clear.setBounds(300,100,120,50);
        four.setBounds(20,170,50,50);
        five.setBounds(90,170,50,50);
        six.setBounds(160,170,50,50);
        inmultire.setBounds(230,170,50,50);
        pozneg.setBounds(300,170,120,50);
        one.setBounds(20,240,50,50);
        two.setBounds(90,240,50,50);
        three.setBounds(160,240,50,50);
        minus.setBounds(230,240,50,50);
        egal.setBounds(300,240,120,50);
        zero.setBounds(20,310,50,50);
        virgula.setBounds(90,310,50,50);
        procent.setBounds(160,310,50,50);
        plus.setBounds(230,310,50,50);
        square.setBounds(300,310,50,50);
        radical.setBounds(370,310,50,50);

        // Configurare Butoane

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0"))
                {
                    display.setText("7");
                    return;
                }
                else
                    display.setText(display.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("8");
                    return;
                }
                else
                    display.setText(display.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("9");
                    return;
                }
                else
                    display.setText(display.getText() + "9");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("4");
                    return;
                }
                else
                    display.setText(display.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("5");
                    return;
                }
                else
                    display.setText(display.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("6");
                    return;
                }
                else
                    display.setText(display.getText() + "6");
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("1");
                    return;
                }
                else
                    display.setText(display.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("2");
                    return;
                }
                else
                    display.setText(display.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("3");
                    return;
                }
                else
                    display.setText(display.getText() + "3");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().length()>16)
                    return;
                if(display.getText().equalsIgnoreCase("0") || display.getText().length() > 16) {
                    display.setText("0");
                    return;
                }
                else
                    display.setText(display.getText() + "0");
            }
        });
        virgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().contains("."))
                    return;
                else
                    display.setText(display.getText() + ".");

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText("0");
                setTempFirst(0.0);
                for(int i=0;i<7;i++)
                    operation[i]=false;
            }
        });

        // Configurare Operatii

        impartire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempFirst(Double.parseDouble(display.getText()));
                if(display.getText().equalsIgnoreCase("0"))
                    return;
                else {
                    operation[0] = true;
                    display.setText("0");
                }
            }
        });
        inmultire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempFirst(Double.parseDouble(display.getText()));
                operation[1] = true;
                display.setText("0");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempFirst(Double.parseDouble(display.getText()));
                operation[2] = true;
                display.setText("0");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempFirst(Double.parseDouble(display.getText()));
                operation[3]=true;
                display.setText("0");
            }
        });
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempSecond(Double.parseDouble(display.getText()));
                display.setText(display.getText()+"²");
                operation[4]=true;
            }

        });
        procent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setTempFirst(Double.parseDouble(display.getText()));
                operation[5]=true;
                display.setText("0");
            }
        });
        radical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                operation[6]=true;
                setTempSecond(Double.parseDouble(display.getText()));
                display.setText("sqrt("+display.getText()+")");
            }
        });
        egal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(operation[0])
                {
                    setTempSecond(Double.parseDouble(display.getText()));
                    display.setText(Double.toString(getTempFirst()/getTempSecond()));
                }
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
                if(operation[1])
                {
                    setTempSecond(Double.parseDouble(display.getText()));
                    display.setText(Double.toString(getTempFirst() * getTempSecond()));
                }
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
                if(operation[2])
                {
                    setTempSecond(Double.parseDouble(display.getText()));
                    display.setText(Double.toString(getTempFirst()+getTempSecond()));
                }
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
                if(operation[3])
                {
                    setTempSecond(Double.parseDouble(display.getText()));
                    display.setText(Double.toString(getTempFirst()-getTempSecond()));
                }
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
                if(operation[4])
                {
                    display.setText(Double.toString(getTempSecond()*getTempSecond()));
                }
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
                if(operation[5])
                {
                    setTempSecond(Double.parseDouble(display.getText()));
                    display.setText(Double.toString(getTempFirst()%getTempSecond()));
                }
                if(operation[6])
                    display.setText(Double.toString(sqrt(getTempSecond())));
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
            }
        });
        pozneg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(display.getText().equalsIgnoreCase("0"))
                    return;
                else
                    display.setText(Double.toString(Double.parseDouble(display.getText()) * (-1)));
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0",""));
            }
        });

    }

    // Configurare Display (afisaj)

    private void sendDisplay() {
        display = new JTextField("0");
        add(display);
        display.setBounds(30,22,380, 50);
        display.setEditable(false);
        display.setFont(new Font("Arial",Font.PLAIN,30));


    }

    // Configurare UI

    private void sendUI(Calculator app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
        app.setSize(440, 425);
        app.setVisible(true);
        app.setLayout(null);

    }

    //Geteri si Seteri pentru operatii

    public double getTempFirst() {
        return tempFirst;
    }

    public void setTempFirst(double tempRezult) {
        this.tempFirst = tempRezult;
    }

    public double getTempSecond() {
        return tempSecond;
    }

    public void setTempSecond(double tempSecond) {
        this.tempSecond = tempSecond;
    }
}
