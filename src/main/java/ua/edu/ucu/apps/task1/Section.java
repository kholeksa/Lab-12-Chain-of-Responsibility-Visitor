package ua.edu.ucu.apps.task1;

public abstract class Section {
    private int denomination;
    private Section next;

    public Section(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Section next) {
        this.next = next;
    }

    private boolean hasNext() {
        return next != null;
    }

    public void process(int amount) {
        int quantity = amount / denomination;
        int left = amount % denomination;
        if (quantity > 0) {
            System.out.println("Denomination: " + denomination + " Quantity: " + quantity);
        }
        if (left > 0 && hasNext()) {
            next.process(left);
        } else if (left > 0) {
            System.out.println("Can't process " + left);
        }
    }
}
