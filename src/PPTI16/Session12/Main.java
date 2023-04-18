package PPTI16.Session12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Main extends JFrame implements ActionListener
{
    private JLabel label = new JLabel("0");
    private String[] btnLabels = new String[] {
            "AC", "x2", "%", "+",
            "7", "8", "9", "-",
            "4", "5", "6", "x",
            "1", "2", "3", "/",
            "0", ".", "+-", "="
    };
    private JButton[] buttons = new JButton[] {
            new JButton("ac"),
    };
    private JPanel panel = new JPanel(new GridLayout(5, 4));

    private HashMap<String, Operation> operations = new HashMap<>();

    private Operation pendingOperation = null;
    private Double oldValue = 0.0;
    public Main(){
        operations.put("+", new OperationBinary() {
            @Override
            public Double doOperation(Double a, Double b) {
                return a + b;
            }
        });
        operations.put("-", (OperationBinary)(a, b) -> a - b); // lambda function
        operations.put("x", (OperationBinary)(a, b) -> a * b);
        operations.put("/", (OperationBinary)(a, b) -> a / b);
        operations.put("%", (OperationUnary)(a) -> a / 100);
        operations.put("x2", (OperationUnary)(a) -> a * a);

        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        add(label, BorderLayout.NORTH);
        add(panel);

        for (String l: btnLabels) {
            JButton btn = new JButton(l);
            btn.addActionListener(this);
            panel.add(btn);
        }

        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton btn) {
            String l = btn.getText();
            if (Character.isDigit(l.charAt(0))) {
                setLabel(l);
            } else if (l.equals(".") && !label.getText().contains(".")) {
                setLabel(l);
            } else if (l.equals("=")) {
                Double value = Double.parseDouble(label.getText());
                Double result = 0.0;
                if (pendingOperation instanceof OperationBinary op) {
                    result = op.doOperation(oldValue, value);
                }
                label.setText(result.toString());
            } else {
                Operation op = operations.get(l);
                Double value = Double.parseDouble(label.getText());
                if (op instanceof OperationBinary) {
                    pendingOperation = op;
                    oldValue = value;
                    label.setText("0");
                } else if (op instanceof OperationUnary opu){
                    Double result = opu.doOperation(value);
                    label.setText(result.toString());
                }
            }
        }
    }

    void setLabel(String str){
        if(label.getText().equals("0") && !str.equals(".")) {
            label.setText(str);
        } else {
            label.setText(label.getText() + str);
        }
    }

}

interface Operation
{

}

interface OperationUnary extends Operation
{
    Double doOperation(Double a);
}

interface OperationBinary extends Operation
{
    Double doOperation(Double a, Double b);
}
