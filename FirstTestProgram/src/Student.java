import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtSname;
    private JButton calButton;
    private JTextField txtM1;
    private JTextField txtM2;
    private JTextField txtM3;
    private JTextField txtTotal;
    private JTextField txtGrade;
    private JLabel Main;
    private JPanel Mains;
    private JTextField txtPer;
    private JTextField txtom1;
    private JTextField txtom2;
    private JTextField txtom3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Mains);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,total,totalob,ob1,ob2,ob3;
                //float avg;
                float per;

                m1 = Integer.parseInt(txtM1.getText());
                m2 = Integer.parseInt(txtM2.getText());
                m3 = Integer.parseInt(txtM3.getText());
                ob1 = Integer.parseInt(txtom1.getText());
                ob2 = Integer.parseInt(txtom2.getText());
                ob3 = Integer.parseInt(txtom3.getText());

                totalob = ob1+ob2+ob3;

                total=m1+m2+m3;

                txtTotal.setText(String.valueOf(totalob));

             /*   avg = totalob/3;
                txtAvg.setText(String.valueOf(avg));*/

                per = (float) totalob*100/total;
                txtPer.setText(String.valueOf(per+ "%"));


                if(per > 50){

                    txtGrade.setText("Pass");

                }
                else {
                    txtGrade.setText("Fail");
                }


            }
        });
    }
}
