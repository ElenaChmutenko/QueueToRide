import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            // pulls first person out of the queue
            Person person = queue.peek();
            // ticket check: if person has no ticket, person leaves the queue
            if (!person.ifTicketsLeft()) {
                queue.remove(person);
                continue;
            }
            person.decreaseTicketsN();
            StringBuilder sb = new StringBuilder(person.toString());
            sb.append(" has ridden attraction");
            System.out.println(sb);
            // if the person still has tickets, added to the end of the queue
            if (person.ifTicketsLeft()) {
                queue.offer(person);
            }
            // person leaves the queue
            queue.poll();
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Bruce", "Allmighty", 6));
        clients.add(new Person("Denis", "Kirienko", 0));
        clients.add(new Person("Ivan", "Proc", 10));
        clients.add(new Person("Dimsas", "Milky", 9));
        clients.add(new Person("Vavi", "Maloy", 7));
        return clients;
    }
}
