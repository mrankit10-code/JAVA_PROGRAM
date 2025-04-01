// class A extends Thread {
//     public void run() {

//         String n = Thread.currentThread().getName();
//         for (int i = 1; i <= 3; i++) {
//             System.out.println(n);
//         }

//     }
// }

// public class ThreadScedular {
//     public static void main(String[] args) {
//         A t1 = new A();
//         A t2 = new A();
//         A t3 = new A();

//         t1.setName("Thread1");
//         t2.setName("Thread2");
//         t3.setName("Thread3");

//         t1.start();
//         t2.start();
//         t3.start();
//     }

// }

// join(); method use 

class A extends Thread {
    public void run() {

        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }

    }
}

public class ThreadScedular {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException i) {

        }
        t1.start();
        t3.start();
    }

}

// suspend() & resume() method uses

// class A extends Thread {
// public void run() {

// String name = Thread.currentThread().getName();
// for (int i = 1; i <= 3; i++) {
// System.out.println(name);
// }

// }
// }

// public class ThreadScedular {
// public static void main(String[] args) throws InterruptedException {
// A t1 = new A();
// A t2 = new A();
// A t3 = new A();

// t1.setName("Ankit");
// t2.setName("Aman");
// t3.setName("Surya");

// t1.start();

// t2.start();
// t2.suspend();

// t3.start();

// t2.resume();
// }

// }
