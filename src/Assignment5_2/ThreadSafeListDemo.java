
import java.util.ArrayList;

public class ThreadSafeListDemo {

    public static void main(String[] args) {

        SafeList list = new SafeList();

        AddWorker[] addWorkers = new AddWorker[4];

        for (int i = 0; i < addWorkers.length; i++) {
            addWorkers[i] = new AddWorker(list, 1000, i);
            addWorkers[i].start();
        }

        for (int i = 0; i < addWorkers.length; i++) {
            try {
                addWorkers[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Size after adding: " + list.size());

        RemoveWorker[] removeWorkers = new RemoveWorker[4];

        for (int i = 0; i < removeWorkers.length; i++) {
            removeWorkers[i] = new RemoveWorker(list, 500);
            removeWorkers[i].start();
        }

        for (int i = 0; i < removeWorkers.length; i++) {
            try {
                removeWorkers[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Size after removing: " + list.size());
    }
}

class SafeList {

    private ArrayList<String> items = new ArrayList<String>();

    public synchronized void add(String item) {
        items.add(item);
    }

    public synchronized int size() {
        return items.size();
    }

    public synchronized String removeLast() {
        if (items.size() > 0) {
            return items.remove(items.size() - 1);
        }

        return null;
    }
}

class AddWorker extends Thread {

    private SafeList list;
    private int numberOfItems;
    private int workerNumber;

    public AddWorker(SafeList list, int numberOfItems, int workerNumber) {
        this.list = list;
        this.numberOfItems = numberOfItems;
        this.workerNumber = workerNumber;
    }

    public void run() {
        for (int i = 0; i < numberOfItems; i++) {
            list.add("Item " + workerNumber + "-" + i);
        }
    }
}

class RemoveWorker extends Thread {

    private SafeList list;
    private int numberOfItems;

    public RemoveWorker(SafeList list, int numberOfItems) {
        this.list = list;
        this.numberOfItems = numberOfItems;
    }

    public void run() {
        for (int i = 0; i < numberOfItems; i++) {
            list.removeLast();
        }
    }
}
