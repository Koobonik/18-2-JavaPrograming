package JavaExam.MouserMove;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame {
    JLabel la;

    MouseListenerEx(){
        setTitle("마우스 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        setLayout(null);
        contentPane.addMouseListener(new MyMouseListener());

        la = new JLabel("하이");
        la.setSize(50,50);
        la.setLocation(30,30);
        contentPane.add(la);

        setSize(200,200);
        setVisible(true);
    }
    class MyMouseListener implements MouseListener{

        @Override
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }


        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public static void main(String []args){
        new MouseListenerEx();
    }
}
