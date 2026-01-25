import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;

class Fall23 {

}


// QUESTION NO. (a)


 class CashPay extends Payment {
     @Override
     public double getCharge() {
        return 0;
     }
 }

class CreditCardPay  extends Payment{

    @Override
    public double getCharge() {
        return 2.5/100;
    }
}

class CheckPay  extends Payment {

    @Override
    public double getCharge() {
        return 10;
    }
}

interface Transaction {
    public void give();
    public void receive();
}

abstract class Payment implements Transaction{
    double amount;
    String currency ="BDT";

    @Override
    public void give(){
                //Write code here
        double charge = amount * getCharge();
        double tax = amount * getTax();
        amount = charge + tax;
        System.out.println(currency+" "+amount+" is paid");
    }

    @Override
    public void receive() {
        System.out.println("[Nothing to receive]");
    }

    public abstract double getCharge();

    public double getTax(){
                    //write your code here
        return (15.6 / 100);
    }
}



// QUESTION NO. (b)


interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Rectangle{
//write your code here

    public Square(double base) {
        super(base, base);
    }
}

class ShapeTest{
    //write code for draw method here

    static void draw(Shape shape) {
        System.out.println("drawing over " + shape.getArea() + " area");
    }

//    public static void main(String[] args) {
//        Shape r = new Rectangle(5,6);
//        Shape s = new Square(3);
//        draw(r);
//        draw(s);
//    }
}



//
//class FileDemo {
//
//    public static void main(String[] args) throws IOException {
//
//        File file = new File("input.txt");
//        File srcFile = new File("src/data.txt");
//        File dir = new File(".");
//
//        System.out.println(file.exists());
//        System.out.println(srcFile.exists());
//        System.out.println(file.canWrite());
//        System.out.println(file.getAbsolutePath());
//
//        for (String fileName : dir.list()) {
//            System.out.println(fileName.toString().trim());
//        }
//
//
//        FileOutputStream fout = new FileOutputStream("output.txt", false);
//        for (int i = 0; i < 1000; i++) {
//            fout.write("SADIK is cool (respect++)\n".getBytes(StandardCharsets.UTF_8));
//        }
//        fout.close();
//
//
//        FileInputStream fin = new FileInputStream("output.txt");
//        System.out.println("File opened successfully!");
//        fin.close();
//
//
//        FileReader fr = new FileReader("output.txt");
//        int c;
//        while((c = fr.read()) != -1) System.out.print((char)c);
//        fr.close();
//
//
//        FileWriter fw = new FileWriter("input.txt", true);
//        fw.write("Very cool joba pogram!\n");
//        fw.close();
//
//
//        BufferedReader bf = new BufferedReader(new FileReader("output.txt"));
//        while (bf.readLine() != null) {
//            System.out.println(bf.readLine());
//        }
//        bf.close();
//
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedText.txt", true));
//        for (int i = 0; i < 100; i++) {
//            bw.write("SADIK is now extra COOL (respect+++)");
//            bw.newLine();
//        }
//        bw.close();
//
//    }
//}
//
 

class Question3 {
	
	public static void main(String[] args) {

//		System.out.println("Hello from NeoVim!");

		int minValue = Integer.MAX_VALUE;

		try (BufferedReader br = new BufferedReader(new FileReader("question3.txt")))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
				try {
					int num = Integer.parseInt(line.trim());
					if (num < minValue) {minValue = num;}
				} catch (Exception e) {
                    System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
//            System.out.println(e.getMessage());
		}

		System.out.println("Min val: " + minValue);
	}

}



class Emp {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        try (BufferedWriter b = new BufferedWriter(new FileWriter("employee.txt"))) {
            for (int i = 0; i < n; i++) {
                s.nextLine();
                String name = s.nextLine();
                int id = s.nextInt();

                int[] scr = new int[6];

                for (int j = 0; j < 6; j++) {
                    scr[j] = s.nextInt();
                }

                int sum = 0;
                for (int val : scr) {
                    sum += val;
                }

                double avg = sum / 6.0;

                b.write("Employee" + (i + 1) + " " + "name " + name + "\n" +
                        "Employee" + (i + 1) + " " + "ID " + id + "\n" +
                        "Employee" + (i + 1) + " " + "average " + avg + "\n");
            }


            double inc = 0;
            try (BufferedReader r = new BufferedReader(new FileReader("employee.txt"))) {
                String line = r.readLine();
                if (line.contains("average")) {
                    String parts[] = line.split(" ");
                    inc = Double.parseDouble(parts[2]);

                    if (inc > 75) {
                        try (FileWriter w = new FileWriter("increment.txt")) {
                            if (line.contains("name")) {
                                String names[] = line.split(" ");
                                w.write(names[2]);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}



class GEmp {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = s.nextInt();

        // Writing employee info into employee.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("employee.txt"))) {

            for (int i = 1; i <= n; i++) {
                s.nextLine(); // clear buffer

                System.out.print("Enter name of employee " + i + ": ");
                String name = s.nextLine();

                System.out.print("Enter ID of employee " + i + ": ");
                int id = s.nextInt();

                System.out.println("Enter last 6 months' performance scores:");
                int sum = 0;
                for (int j = 0; j < 6; j++) {
                    sum += s.nextInt();
                }

                double avg = sum / 6.0;

                bw.write(name + "\n");
                bw.write(id + "\n");
                bw.write(avg + "\n");
            }
        }

        // (c) Find employees whose avg > 75 and store in increment.txt
        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
             BufferedWriter inc = new BufferedWriter(new FileWriter("increment.txt"))) {

            String name;
            while ((name = br.readLine()) != null) {
                String id = br.readLine();
                double avg = Double.parseDouble(br.readLine());

                if (avg > 75) {
                    inc.write(name + "\n");
                }
            }
        }

        // (d) Find employee(s) with maximum score
        String maxName = "";
        double maxAvg = -1;

        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {

            String name;
            while ((name = br.readLine()) != null) {
                String id = br.readLine();
                double avg = Double.parseDouble(br.readLine());

                if (avg > maxAvg) {
                    maxAvg = avg;
                    maxName = name;
                }
            }
        }

        System.out.println("\nEmployee with maximum average score:");
        System.out.println(maxName + "  -->  " + maxAvg);
    }
}


class Employee {
    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
}




class Test {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("Rahim", 25));
        list.add(new Employee("Karim", 30));
        list.add(new Employee("Sakib", 22));

//        // Comparator using Anonymous Class (sort by age)
//        Collections.sort(list, new Comparator<Employee>\() {
//            public int compare(Employee e1, Employee e2) {
//                return e1.age - e2.age;  // ascending by age
//            }
//        });

        for(Employee e : list){
            System.out.println(e.name + " " + e.age);
        }
    }
}






