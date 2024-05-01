import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        Dimension frameSize = new Dimension(1024, 720);
        frame.setSize(frameSize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 1024, 720);
        JLabel text = new JLabel("زبان خود را انتخاب کنید-chose language");
        JButton english = new JButton("English");
        JButton farsi = new JButton("فارسی");
        p1.add(text);
        p1.add(english);
        p1.add(farsi);
        english.setBounds(0, 0, 340, 720);
        farsi.setBounds(680, 0, 340, 720);
        text.setBounds(340, 0, 340, 720);
        frame.add(p1);
        JPanel password = new JPanel();
        JPanel mainPage = new JPanel();
        JPanel passwordChangingPage = new JPanel();
        JPanel InventoryAnnouncementPage = new JPanel();
        JPanel CashWithdrawalPage = new JPanel();
        JPanel CardByCardPage = new JPanel();
        JPanel ResultPagee = new JPanel();
        //محتویات صفحه دوم را اینجا وارد مبکنبم
        JLabel pass = new JLabel("رمز خود را وارد کنید");
        password.add(pass);
        JTextField passwordd = new JTextField(15);
        password.add(passwordd);
        JButton confirm = new JButton("ثبت");
        password.add(confirm);
        //محتویات صفحه اصلی را وارد میکنیم
        JButton ChangePassword = new JButton("تغییر رمز");
        JButton CashWithdrawal = new JButton("برداشت وجه");
        JButton InventoryAnnouncement = new JButton("اعلام موجودی");
        JButton CardByCard = new JButton("کارت به کارت");
        mainPage.add(ChangePassword);
        mainPage.add(CashWithdrawal);
        mainPage.add(InventoryAnnouncement);
        mainPage.add(CardByCard);
        CashWithdrawal.setBounds(0, 0, 512, 360);
        CardByCard.setBounds(0, 360, 512, 360);
        ChangePassword.setBounds(512, 0, 512, 360);
        InventoryAnnouncement.setBounds(512, 360, 512, 360);
        //محتویات صفحه تغییر رمز را وارد میکنیم
        JLabel newpass = new JLabel("رمز جدید را وارد کنید");
        JTextField newpassword = new JTextField(15);
        JButton verification = new JButton("تایید");
        passwordChangingPage.add(newpassword);
        passwordChangingPage.add(newpass);
        passwordChangingPage.add(verification);
        newpass.setBounds(0, 0, 1024, 240);
        newpassword.setBounds(0, 240, 1024, 240);
        verification.setBounds(0, 480, 1024, 240);
        //محتویات صفحه موجودی
        JLabel Inventory = new JLabel("موجودی حساب شما :58350000ریال");
        InventoryAnnouncementPage.add(Inventory);
        //محتویات صفحه دریافت وجه
        JButton amount1 = new JButton("1500000");
        JButton amount2 = new JButton("500000");
        JButton amount3 = new JButton("1000000");
        JButton amount4 = new JButton("2000000");
        CashWithdrawalPage.add(amount1);
        CashWithdrawalPage.add(amount2);
        CashWithdrawalPage.add(amount3);
        CashWithdrawalPage.add(amount4);
        amount2.setBounds(0, 0, 512, 360);
        amount1.setBounds(512, 0, 512, 360);
        amount3.setBounds(0, 360, 512, 360);
        amount2.setBounds(512, 360, 512, 360);
        //محتویات صفحه کارت به کارت
        JLabel amount = new JLabel("مبلغ مورد نظر زا وارد کنید");
        JTextField amountOfMoney = new JTextField(15);
        JLabel cordNumber = new JLabel("شماره کارت مقصد را وارد کنید");
        JTextField DestinationCardNumber = new JTextField(15);
        JButton confimm = new JButton("ثبت");
        CardByCardPage.add(confimm);
        CardByCardPage.add(amount);
        CardByCardPage.add(amountOfMoney);
        CardByCardPage.add(cordNumber);
        CardByCardPage.add(DestinationCardNumber);
        amount.setBounds(0, 0, 1024, 144);
        amountOfMoney.setBounds(0, 144, 1024, 144);
        cordNumber.setBounds(0, 288, 1024, 144);
        DestinationCardNumber.setBounds(0, 432, 1024, 144);
        confimm.setBounds(0, 576, 1024, 144);
        //محتویات صفحه نتیجه
        JLabel Result = new JLabel("عملیات با موفقیت انجام شد");
        ResultPagee.add(Result);
        //کاربر با انتخاب زبان وارد صفحه دوم می شود
        english.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setBounds(p1.getBounds());
                frame.remove(p1);
                frame.add(password);
            }
        });
        farsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setBounds(p1.getBounds());
                frame.remove(p1);
                frame.add(password);
            }
        });
//با زدن رمز وارد صفحه اصلی می شود
        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPage.setBounds(password.getBounds());
                frame.remove(password);
                frame.add(mainPage);
            }
        });
        //اگر گزینه تغییر رمز را انتخاب کند
        ChangePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordChangingPage.setBounds(mainPage.getBounds());
                frame.remove(mainPage);
                frame.add(passwordChangingPage);
            }
        });
        //کاربر با زدن دکمه ثبت وارد صفحه نتیجه می شود
        verification.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(passwordChangingPage.getBounds());
                frame.remove(passwordChangingPage);
                frame.add(ResultPagee);
            }
        });
        //انتخاب اعلام موجودی
        InventoryAnnouncement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InventoryAnnouncementPage.setBounds(mainPage.getBounds());
                frame.remove(mainPage);
                frame.add(InventoryAnnouncementPage);
            }
        });
        //درخواست وجه
        CashWithdrawal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CashWithdrawalPage.setBounds(mainPage.getBounds());
                frame.remove(mainPage);
                frame.add(CashWithdrawalPage);
            }
        });
        //با انتخاب هر یک از مبالغ در صفحه وازد صفحه نتیجه می شویم
        amount1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(CashWithdrawalPage.getBounds());
                frame.remove(CashWithdrawalPage);
                frame.add(ResultPagee);
            }
        });
        amount2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(CashWithdrawalPage.getBounds());
                frame.remove(CashWithdrawalPage);
                frame.add(ResultPagee);
            }
        });

        amount3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(CashWithdrawalPage.getBounds());
                frame.remove(CashWithdrawalPage);
                frame.add(ResultPagee);
            }
        });
        amount4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(CashWithdrawalPage.getBounds());
                frame.remove(CashWithdrawalPage);
                frame.add(ResultPagee);
            }
        });
        //صفحه کارت به کارت
        CardByCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardByCardPage.setBounds(mainPage.getBounds());
                frame.remove(mainPage);
                frame.add(CardByCardPage);
            }
        });
        //با زدن دکمه ثبت توسط کاربر وارد صفحه نتیجه می شویم
        confimm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultPagee.setBounds(CardByCardPage.getBounds());
                frame.remove(CardByCardPage);
                frame.add(ResultPagee);
            }
        });
        frame.setVisible(true); }}






