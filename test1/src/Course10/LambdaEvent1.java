package Course10;

import java.awt.event.*; // 使用事件必須載入 event 套件
import javax.swing.*; // 撰寫 Swing 視窗必須載入

class MyJFrame extends JFrame { // MyJFrame 繼承自 JFrame
    private JPanel contentPane; // 宣告 JPanel 容器物件 contentPane

    // MyJFrame 建構式
    public MyJFrame() {
        setTitle("事件處理"); // 指定視窗標題
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定視窗的預設關閉行為
        setBounds(100, 100, 200, 150); // 指定視窗位置和大小
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null); // 不使用版面配置

        // 建立 button 按鈕
        JButton button = new JButton("事件來源");
        // 註冊 button 事件傾聽者，並實作 actionPerformed() 方法
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 顯示對話方塊
                JOptionPane.showMessageDialog(null, "處理事件");
            }
        });

        button.setBounds(50, 40, 90, 25); // 指定按鈕的位置與大小
        contentPane.add(button); // button 按鈕放入容器中
        setVisible(true); // 顯示視窗
    }
}

public class LambdaEvent1 {
    public static void main(String[] args) {
        MyJFrame f = new MyJFrame();
    }
}
