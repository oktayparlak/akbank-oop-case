import java.time.LocalDateTime;

public class Minibus extends Vehicle {

    public Minibus(int hgsNum, String name, String lastName, double balance) {
        super(hgsNum, name, lastName, balance);
        this.setVehicleClass(2);
    }

    @Override
    public void passOperation() {
        this.setBalance(getBalance() - 100);
        Manager.addIncome(100);
        this.setTime(LocalDateTime.now());
        passedVehicles.add(new Minibus(this.getHgsNum(), this.getName(),this.getLastName(),this.getBalance()));
    }
}
