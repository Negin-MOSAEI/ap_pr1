
//bray ide hal az shayan zare komak gereftam.
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main extends JFrame {
    private static int actn = 0;
    private static String s1 = "";
    private static String s2 = "";
    private static String operation = "";

    static void res() {
        float x = Float.parseFloat(s1),y = Float.parseFloat(s2);
        if (operation.equals("_"))
            x -= y;
        if (operation.equals("+"))
            x += y;
        if (operation.equals("*"))
            x *= y;
        if (operation.equals("/"))
            x /= y;
        s1 =String.valueOf(x);
        operation = "";
        s2 = "";
        actn=0;
    }
    public static void act(int a){
        int l = '.'+a;
        char ch = (char)l;
        if (operation!="") {
            s2 += ch;
            actn=3;
        }
        else {
            s1 += ch;
            actn=1;
        }
    }
    public static void opr(int a){
        if (operation!=""&&actn%2!=0) {
            res();
        }
        actn=2;
        int l = '*'+a;
        char ch = (char)l;
        operation = ""+ch;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension frameSize = new Dimension(1024, 720);
        frame.setSize(frameSize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,4,5,5));
        p1.setBounds(0, 0, 1024, 700);
        JLabel result = new JLabel("");
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton sum = new JButton("+");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton minus = new JButton("_");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton multiplication = new JButton("*");
        JButton demcimal = new JButton(".");
        JButton num0 = new JButton("0");
        JButton eqoul = new JButton("=");
        JButton division = new JButton("/");
        JButton del = new JButton("Del");
        JButton clr = new JButton("Clr");
        JButton negetive = new JButton("-");
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (actn%2!=0) {
                    act(2);
                    result.setText(s1 + operation + s2);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
        demcimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (actn%2!=0) {
                    act(0);
                    result.setText(s1 + operation + s2);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(3);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(4);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(5);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(6);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();

            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(7);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(8);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(9);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(10);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                act(11);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opr(3);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }

        });
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opr(1);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }

        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opr(0);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }

        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opr(5);
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        eqoul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation!="" && actn%2!=0)
                    res();
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation="";
                s1 = "";
                s2 = "";
                actn=0;
                result.setText("");
                frame.revalidate();
                frame.repaint();
            }
        });
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (actn == 1)
                    s1 = s1.substring(0, s1.length() - 1);
                if (actn == 2){
                    operation = "";
                    actn = 1;
                }
                if(actn==3){
                    s2 = s2.substring(0, s2.length() - 1);
                    if(s2.length()==0)
                        actn=2;
                }
                result.setText(s1 + operation + s2);
                frame.revalidate();
                frame.repaint();
            }
        });

        p1.add(result);
        p1.add(num1);
        p1.add(num2);
        p1.add(num3);
        p1.add(num4);
        p1.add(num5);
        p1.add(num6);
        p1.add(num7);
        p1.add(num8);
        p1.add(num9);
        p1.add(sum);
        p1.add(minus);
        p1.add(multiplication);
        p1.add(demcimal);
        p1.add(num0);
        p1.add(negetive);
        p1.add(clr);
        p1.add(del);
        p1.add(division);
        p1.add(eqoul);
        frame.add(p1);
        frame.setVisible(true);
    }
}
