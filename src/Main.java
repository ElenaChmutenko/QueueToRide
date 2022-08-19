import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        while (!queue.isEmpty()) {
            // pulls first person out of the queue
            Person person = queue.poll();
            // check out if the person has tickets,
            // the number of tickets is reduces and person rides attraction
            if (person.getTicketsN() > 0) {
                person.decreaseTicketsN();
                System.out.println(person + " has ridden attraction");
            }
            // if the person still has tickets, this person is pushes to the end of the queue
            if (person.isTicketsLeft()) {
                queue.offer(person);
            }
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
