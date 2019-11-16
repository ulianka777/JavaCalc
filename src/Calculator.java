import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.IOException;

public class Calculator extends javax.swing.JFrame {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel JavaCalculator;
    private JTextField textDISPLAY;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnPercent;
    private JButton btnDelete;

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDISPLAY.getText());
        textDISPLAY.setText("");

    }

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDISPLAY.getText() + btnOne.getText();
                textDISPLAY.setText(btnOneText);

            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDISPLAY.getText() + btnTwo.getText();
                textDISPLAY.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDISPLAY.getText() + btnThree.getText();
                textDISPLAY.setText(btnThreeText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDISPLAY.getText() + btnFour.getText();
                textDISPLAY.setText(btnFourText);

            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDISPLAY.getText() + btnFive.getText();
                textDISPLAY.setText(btnFiveText);

            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDISPLAY.getText() + btnSix.getText();
                textDISPLAY.setText(btnSixText);

            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDISPLAY.getText() + btnSeven.getText();
                textDISPLAY.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDISPLAY.getText() + btnEight.getText();
                textDISPLAY.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDISPLAY.getText() + btnNine.getText();
                textDISPLAY.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDISPLAY.getText() + btnZero.getText();
                textDISPLAY.setText(btnZeroText);

            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String button_text = btnPlus.getText();

                getOperator(button_text);

                textDISPLAY.setText(btnPlus.getText());


            }
        });

        btnEquals.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            switch (math_operator) {
                                                case '+':

                                                    total2 = total1 + Double.parseDouble(textDISPLAY.getText());

                                                    break;

                                                case '-':

                                                    total2 = total1 - Double.parseDouble(textDISPLAY.getText());

                                                    break;
                                                case '/':
                                                    if (Double.parseDouble(textDISPLAY.getText()) == 0) {
                                                        textDISPLAY.setText("Cannot be divisible by zero!");
                                                    }
                                                    total2 = total1 / Double.parseDouble(textDISPLAY.getText());
                                                    break;
                                                case '*':

                                                    total2 = total1 * Double.parseDouble(textDISPLAY.getText());


                                                    break;
                                                case '%':

                                                    total2 = total1 * Double.parseDouble(textDISPLAY.getText()) / 100.0;

                                                    break;
                                            }
                                            if (total2 % 1 == 0) {
                                                textDISPLAY.setText(String.valueOf((int) total2));
                                            } else
                                                textDISPLAY.setText(Double.toString(total2));

                                            total1 = 0;

                                        }

                                    }
        );
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDISPLAY.setText("");

            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);

            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);

            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);

            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDISPLAY.getText().equals("")) {
                    textDISPLAY.setText("0.");
                } else if (textDISPLAY.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textDISPLAY.getText() + btnPoint.getText();
                    textDISPLAY.setText(btnPointText);
                }
                btnPoint.setEnabled(true);

            }

        });
        btnPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPercent.getText();
                getOperator(button_text);

            }
        });
        JavaCalculator.addComponentListener(new ComponentAdapter() {
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                removeLastChar(String.valueOf(textDISPLAY.getText()));

            }
        });
    }


    private void removeLastChar(String text) {
        text = text.substring(0, text.length() - 1);
        textDISPLAY.setText(text);
    }

    public static void main(String[] args) throws IOException {


        JFrame frame = new JFrame("Calculator") {
        };
        frame.setContentPane(new Calculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(440, 310));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("C:\\Users\\Коломбо\\Downloads\\calculator.png");
        frame.setIconImage(icon.getImage());
        frame.setResizable(false);


    }





}
