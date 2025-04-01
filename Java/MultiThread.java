// MultiThread concept
// class A extends Thread {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Ankit Roy");
//         }

//     }
// }

// class MultiThread {
//     public static void main(String[] args) {
//         A t = new A();
//         t.start();

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Ani Roy");
//         }

//     }
// }

// Total take time 5 sec in run.
class A extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ankit Roy");
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {

        }

    }
}

class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ani Roy");
            Thread.sleep(1000);
        }

    }
}

// Total take time 10 sec run in time(sleep method)
// class A extends Thread {

// public void fun() {
// try {
// for (int i = 1; i <= 5; i++) {
// System.out.println("Ankit Roy");
// Thread.sleep(1000);
// }
// } catch (InterruptedException i) {

// }

// }
// }

// class MultiThread {
// public static void main(String[] args) throws InterruptedException {
// A t = new A();
// t.fun();

// for (int i = 1; i <= 5; i++) {
// System.out.println("Ani Roy");
// Thread.sleep(1000);
// }

// }
// }
