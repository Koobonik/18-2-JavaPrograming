package JavaExam.day12_07;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    Container contentPane;
    String [] fruits= {"apple", "banana", "kiwi", "mango", "pear",
            "peach", "berry", "strawberry", "blackberry"}; // 배열로 저장
    ImageIcon [] images = {new ImageIcon("src/images/icon1.png"), // 아아콘
            new ImageIcon("src/images/icon2.png"),
            new ImageIcon("src/images/icon3.png"),
            new ImageIcon("src/images/icon4.png")
    };
    ListEx() {
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        // 텍스트 리스트
        JList strList = new JList(fruits);
        contentPane.add(strList);

        // 이미지 리스트
        JList imageList = new JList();
        imageList.setListData(images);
        contentPane.add(imageList);

        //스크롤 리스트
        JList scrollList = new JList(fruits);
        contentPane.add(new JScrollPane(scrollList));

        setSize(300,300);
        setVisible(true);
    }
    public static void main(String [] args) {
        new ListEx();
    }
}
