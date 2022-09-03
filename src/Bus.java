import java.time.LocalDateTime;

public class Bus extends Vehicle {

    public Bus(int hgsNum, String name, String lastName, double balance) {
        super(hgsNum, name, lastName, balance);
        this.setVehicleClass(3);
    }

    @Override
    public void passOperation() {
        this.setBalance(getBalance() - 150);
        Manager.addIncome(150);
        this.setTime(LocalDateTime.now());
        passedVehicles.add(new Bus(this.getHgsNum(), this.getName(),this.getLastName(),this.getBalance()));
    }
}
