package Concurreny_LLD_Problems;

import java.util.concurrent.Semaphore;

class DiningPhilosopher {
    private Semaphore semaphore;
    private Semaphore[] forkSemaphore;

    public DiningPhilosophers() {
        // Allowing four out of five philosophers to join the table. 
        semaphore = new Semaphore(4);
        forkSemaphore = new Semaphore[5];
        for(int i = 0; i < 5 ; i++) {
            forkSemaphore[i] = new Semaphore(1);
        }
    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                            Runnable pickLeftFork,
                            Runnable pickRightFork,
                            Runnable eat,
                            Runnable putLeftFork,
                            Runnable putRightFork) throws InterruptedException {
                        
        semaphore.acquire();

        int leftIndex = philosopher;
        int rightIndex = (philosopher + 1) % 5; 

        Semaphore leftForkSemaphore = forkSemaphore[leftIndex];
        Semaphore rightForkSemaphore = forkSemaphore[rightIndex];

        // Make the philosopher eat their sphagetti when given a chance. 
        leftForkSemaphore.acquire();
        rightForkSemaphore.acquire();

        // Perform the eating process.
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();

        // After finishing the sphagetti, drop / put away the left fork and right fork.
        putLeftFork.run();
        leftForkSemaphore.release();
        putRightFork.run();
        rightForkSemaphore.release();

        // Allowing other philosopher to consume their sphagetti by giving them chance.
        semaphore.release();
  }
}

public class DiningPhilosopherProblem {
    
}
