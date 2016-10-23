/*************************************************************************
	> File Name: DisplayPicture.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月23日 星期日 13时23分58秒
 ************************************************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleJFrame {
    public SimpleJFrame() {
        JFrame jf = new JFrame("SimpleJFrame application");
        Icon icon = new ImageIcon("photo.jpg");
        JLabel label = new JLabel("图片显示", icon, JLabel.CENTER);
        JButton button = new JButton("关闭");
        label.setVerticalTextPosition(JLabel.BOTTOM);
        Container cp = jf.getContentPane();
        cp.add(label,BorderLayout.CENTER);
        cp.add(button,BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        jf.setBounds(200, 100, 400, 300);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new SimpleJFrame();
    }
}

