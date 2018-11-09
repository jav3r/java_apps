package code;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reader extends JFrame {
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, p, m, mp, d, equal, clean;
    JTextField t;
    eHandler handler = new eHandler();
    Boolean plus = false;
    Boolean minus = false;
    Boolean multiply = false;
    Boolean divide = false;
    Boolean sec = false;
    int out, out2, result;
    String result2;

    public Reader() {
        setTitle("Programm");

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        p = new JButton("+");
        m = new JButton("-");
        mp = new JButton("*");
        d = new JButton("/");

        equal = new JButton("=");
        clean = new JButton("C");

        t = new JTextField("", 10);

        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(p);
        add(m);
        add(mp);
        add(d);
        add(equal);
        add(clean);
        add(t);

        b0.addActionListener(handler);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);

        p.addActionListener(handler);
        m.addActionListener(handler);
        mp.addActionListener(handler);
        d.addActionListener(handler);

        clean.addActionListener(handler);
        equal.addActionListener(handler);

    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if(e.getSource() == b0) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "0");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "0");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "0");
                    }
                }

                if(e.getSource() == b1) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "1");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "1");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "1");
                    }
                }

                if(e.getSource() == b2) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "2");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "2");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "2");
                    }
                }

                if(e.getSource() == b3) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "3");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "3");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "3");
                    }
                }

                if(e.getSource() == b4) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "4");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "4");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "4");
                    }
                }

                if(e.getSource() == b5) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "5");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "5");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "5");
                    }
                }

                if(e.getSource() == b6) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "6");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "6");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "6");
                    }
                }

                if(e.getSource() == b7) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "7");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "7");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "7");
                    }
                }

                if(e.getSource() == b8) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "8");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "8");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "8");
                    }
                }

                if(e.getSource() == b9) {
                    if(plus || minus || multiply || divide) {
                        if(sec) {
                            t.setText(t.getText() + "9");
                        } else {
                            t.setText("");
                            t.setText(t.getText() + "9");
                            sec = true;
                        }
                    } else {
                        t.setText(t.getText() + "9");
                    }
                }

                if(e.getSource() == p) {
                    out = Integer.parseInt(t.getText());
                    t.setText("+");
                    plus = true;
                    minus = false;
                    multiply = false;
                    divide = false;
                }

                if(e.getSource() == m) {
                    out = Integer.parseInt(t.getText());
                    t.setText("-");
                    plus = false;
                    minus = true;
                    multiply = false;
                    divide = false;
                }

                if(e.getSource() == mp) {
                    out = Integer.parseInt(t.getText());
                    t.setText("*");
                    plus = false;
                    minus = false;
                    multiply = true;
                    divide = false;
                }

                if(e.getSource() == d) {
                    out = Integer.parseInt(t.getText());
                    t.setText("/");
                    plus = false;
                    minus = false;
                    multiply = false;
                    divide = true;
                }

                if(e.getSource() == clean) {
                    t.setText("");
                    out = 0;
                    out2 = 0;
                    plus = false;
                    minus = false;
                    multiply = false;
                    divide = false;
                    sec = false;
                }

                if(e.getSource() == equal) {
                    out2 = Integer.parseInt(t.getText());

                    if(plus) {
                        result = out + out2;
                    }

                    if(minus) {
                        result = out - out2;
                    }

                    if(multiply) {
                        result = out * out2;
                    }

                    if(divide) {
                        result = out / out2;
                    }

                    result2 = Integer.toString(result);
                    t.setText(result2);

                    plus = false;
                    minus = false;
                    multiply = false;
                    divide = false;
                    sec = false;
                }

            } catch(Exception ex) {JOptionPane.showMessageDialog(null, "Ошибка!");}
        }
    }


}