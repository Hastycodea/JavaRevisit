package Part5b;

public class Money {
    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public Money add(Money money) {
        this.amount += money.getAmount();
        return new Money(this.amount);
    }

    public boolean isLessThan(Money cash) {
        if (cash.getAmount() < this.amount) {
            return true;
        }
        return false;
    }

    public Money subtract(Money money) {
        double difference = this.amount - money.getAmount();
        if (difference < 0) {
            return money;
        }
        this.amount = (int) difference;
        Money cash = new Money(this.amount);

        return cash;
    }

    @Override
    public String toString() {
        return "The total amount is: " + this.amount;
    }

    public static void main(String[] args) {
        Money firstAccount = new Money(340);
        Money secondAccount = new Money(420);

        // adding two Money objects
        Money total = firstAccount.add(secondAccount);
        System.out.println(total.toString());
        System.out.println();

        // comparing isLessThan
        boolean result = secondAccount.isLessThan(firstAccount);
        System.out.println(result);

        // difference of Money object
        Money difference = firstAccount.subtract(secondAccount);
        System.out.println(difference.toString());

    }
}
