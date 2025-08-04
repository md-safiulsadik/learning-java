
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class Manager {
    private ArrayList<Integer> points;
    
    public Manager() {
        this.points = new ArrayList<>();
    }
    
    public void addPoint(int value) {
        if (value <= 100 && value >= 0) {
            this.points.add(value);
        }
    }
    
    public double getAverage() {
        if (this.points.isEmpty()) return -1;
        
        int sum = 0;
        
        for (Integer point : this.points) {
            sum += point;
        }
        
        return (double) sum / this.points.size();
    }
    
    public double getPassAverage() {
        if (this.points.isEmpty()) return -1;
        
        int sum = 0;
        int numOfPoint = 0;
        
        for (Integer point : this.points) {
            if (point >= 50) {
                sum += point;
                numOfPoint++;
            }
        }
        
        return (double) sum / numOfPoint;
    }
    
    public double getPassPercent() {
        if (this.points.isEmpty()) return -1;
        
        int numOfPassPoint = 0;
        
        for (Integer point : this.points) {
            if (point >= 50) {
                numOfPassPoint++;
            }
        }
        
        return (numOfPassPoint / (double) this.points.size()) * 100;
    }
    
    public void grades() {
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int fail = 0;
        
        for (Integer point : this.points) {
            if (point <= 100 && point >= 90) {
                five++;
            }else if (point < 90 && point >= 80) {
                four++;
            }else if (point < 80 && point >= 70) {
                three++;
            }else if (point < 70 && point >= 60) {
                two++;
            }else if (point < 60 && point >= 50) {
                one++;
            } else {
                fail++;
            }
        }
        
        this.printGrade(5, five);       
        this.printGrade(4, four);
        this.printGrade(3, three);
        this.printGrade(2, two);
        this.printGrade(1, one);
        this.printGrade(0, fail);
    }
    
    public void printGrade(int grade, int numOfGrade) {
        System.out.print(grade +": ");
        for (int i = 0; i < numOfGrade; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
