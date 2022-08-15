public class Person  {
    private String name;
    private String lastName;
    private int ticketsN;

    public Person(String name, String lastName, int ticketsN) {
        this.name = name;
        this.lastName = lastName;
        this.ticketsN = ticketsN;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTicketsN() {
        return ticketsN;
    }


    public boolean ifTicketsLeft() {
        if (ticketsN > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void decreaseTicketsN() {
        ticketsN--;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " has ridden attraction";
    }
}
