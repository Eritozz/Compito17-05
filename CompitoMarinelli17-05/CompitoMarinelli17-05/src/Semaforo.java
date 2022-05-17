public class Semaforo {
    int valore;

    public Semaforo(int val){
        valore = val;
    }

    public synchronized void occupa(){
        while(valore == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valore--;
    }

    public synchronized void libera(){
        notify();
        valore++;
    }
}
