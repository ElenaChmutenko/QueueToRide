import java.util.LinkedList;
import java.util.List;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {

            Person p = queue.peek();
            System.out.println(p);
            p.decreaseTicketsN();
            if (p.ifTicketsLeft()) {
                queue.add(p);
            }
            queue.remove(p);
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Bruce", "Allmighty", 6));
        clients.add(new Person("Denis", "Kirienko", 4));
        clients.add(new Person("Ivan", "Proc", 10));
        clients.add(new Person("Dimsas", "Milky", 9));
        clients.add(new Person("Vavi", "Maloy", 7));
        return clients;
    }
}
