import javax.naming.ldap.PagedResultsControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.event.ActionListener;

import static sun.text.normalizer.UTF16.append;

public class Calculator extends JFrame {

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
    private JButton undo;
    private JButton curat;
    private JButton inmultire;
    private JButton parantezaStanga;
    private JButton parantezaDreapta;
    private JButton plus;
    private JButton egal;
    private JButton minus;





    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        super("Calculator blanao");
        sendUI(this);
        sendDisplay();
        sendButtons();



    }

    private void sendButtons() {
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
        parantezaStanga = new JButton("(");
        parantezaDreapta = new JButton(")");
        egal = new JButton("=");
        undo = new JButton("back");
        curat = new JButton("C");
        minus = new JButton("-");


        seven.setBounds(20, 100, 50, 50);
        eight. setBounds(90,100,50,50);
        nine.setBounds(160,100,50,50);
        impartire.setBounds(230,100,50,50);
        curat.setBounds(250,100,50,50);
        four.setBounds(20,170,50,50);
        five.setBounds(90,170,50,50);
        six.setBounds(160,170,50,50);
        one.setBounds(20,240,50,50);
        two.setBounds(90,240,50,50);
        three.setBounds(160,240,50,50);
        zero.setBounds(20,310,50,50);
        minus.setBounds(300,100,50,50);

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
                if(display.getText().equalsIgnoreCase("0")) {
                    display.setText("0");
                    return;
                }
                else
                    display.setText(display.getText() + "0");
            }
        });

        add(seven);
        add(eight);
        add(nine);
        add(four);
        add(five);
        add(six);
        add(one);
        add(zero);
        add(two);
        add(three);
        add(impartire);
        add(inmultire);
        add(plus);
        add(minus);
        add(egal);
        add(undo);
        add(curat);
        add(parantezaDreapta);
        add(parantezaStanga);

    }

    private void sendDisplay() {
        display = new JTextField("0");
        add(display);
        display.setBounds(50,10,340, 50);
        display.setEditable(false);
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setFont(new Font("Arial",Font.PLAIN,30));


    }


    private void sendUI(Calculator app) {
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
        app.setSize(450, 600);
        app.setVisible(true);
        app.setLayout(null);

    }

}
