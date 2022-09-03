import java.time.LocalDateTime;

public class Automobile extends Vehicle {

    public Automobile(int hgsNum, String name, String lastName, double balance) {
        super(hgsNum, name, lastName, balance);
        this.setVehicleClass(1);
    }

    @Override
    public void passOperation() {
        this.setBalance(getBalance() - 50);
        Manager.addIncome(50);
        this.setTime(LocalDateTime.now());
        passedVehicles.add(new Automobile(this.getHgsNum(), this.getName(),this.getLastName(),this.getBalance()));
    }
}
