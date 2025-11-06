import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

class Assignment {
	
	public static void main(String[] args) {
		
	}
}

class Question1 extends JFrame {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Calculator");

        JLabel n1 = new JLabel("N1: ");
        JLabel n2 = new JLabel("N2: ");
        JLabel r = new JLabel("Result");

        JTextField n1T = new JTextField(5);
        JTextField n2T = new JTextField(5);
        JTextField rT= new JTextField(5);

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");

        JPanel p = new JPanel();

        jFrame.add(p);

        p.add(n1);
        p.add(n1T);
        p.add(n2);
        p.add(n2T);
        p.add(r);
        p.add(rT);
        p.add(add);
        p.add(sub);


	add.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		 	int num1 = Integer.parseInt(n1T.getText().trim());
			int num2 = Integer.parseInt(n2T.getText().trim());
			rT.setText((num1 + num2) + "");
		}
	});

	sub.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1 = Integer.parseInt(n1T.getText().trim());
			int num2 = Integer.parseInt(n2T.getText().trim());
			rT.setText((num1 - num2) + "");
		}
	});

        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
    }
}

class Question2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size = scanner.nextInt();
        int tNum = scanner.nextInt();


        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        PartialSum[] threads = new PartialSum[tNum];

        int value = size / tNum;
        int rem = size % tNum;
        int start = 0, end = 0;

        for (int i = 0; i < tNum; i++) {

            if (i == 0) {
                end = value + rem;
            }
            if (i > 0) {
                start = end;
                end = start + value;
            }

            threads[i] = new PartialSum(arr, start, end);
            threads[i].start();
        }

        try {
            threads[tNum - 1].join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int total = 0;
        for (int i = 0; i < tNum; i++) {
            threads[i].join();
            total += threads[i].getSub();
        }

        System.out.println("Total sum: " + total);

    }

}

class PartialSum extends Thread {
    int[] arr;
    int start, end;
    int pSum;

    public PartialSum(int[] arr, int start, int end) {
        this.arr = arr;
        this.end = end;
        this.start = start;
        this.pSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            pSum += arr[i];
        }
        System.out.println(Thread.currentThread().getName() + ": " + "elements " + start + "-" + (end-1) + " -> partial sum = " + pSum);
    }

    public int getSub() {
        return pSum;
    }
}

