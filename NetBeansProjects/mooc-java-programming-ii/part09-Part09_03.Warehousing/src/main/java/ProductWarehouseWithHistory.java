/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author md-safiulsadik
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double returnAmount = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return returnAmount;
    } 
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
    
    public String history() {
        return this.changeHistory.toString();
    }
}
