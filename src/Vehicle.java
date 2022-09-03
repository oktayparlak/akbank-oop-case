import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Vehicle {

    private int hgsNum;
    private String name;
    private String lastName;
    private double balance;
    private int vehicleClass;
    private LocalDateTime time = LocalDateTime.now();
    protected static ArrayList<Vehicle> passedVehicles = new ArrayList<>();

    public Vehicle(int hgsNum, String name, String lastName, double balance) {
        this.hgsNum = hgsNum;
        this.name = name;
        this.lastName = lastName;
        this.balance = balance;
    }

    public abstract void passOperation();

    public int getHgsNum() {
        return hgsNum;
    }

    public void setHgsNum(int hgsNum) {
        this.hgsNum = hgsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(int vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String getTime() {
        return "Tarih: " + time.toLocalDate() + "\nSaat: " + time.toLocalTime() + "\n";
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public static void listPassedVehicles() {
        for (Vehicle item : passedVehicles) {
            System.out.println(item.getTime() + "No:" + item.getHgsNum()
                    + " Ad: " + item.getName() + " Soyad: " + item.getLastName()
                    + "\nŞuanki bakiye: " + item.getBalance() + "\n");
        }
    }

}
