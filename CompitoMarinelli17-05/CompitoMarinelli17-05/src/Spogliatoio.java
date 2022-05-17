public class Spogliatoio extends Thread{
    Semaforo s1;

    public Spogliatoio(){

    }

    public void usa(String g){
        System.out.println(g+ " entra nello spogliatoio e si cambia");

        System.out.println(g+" esce dallo spogliatoio");
    }


    
}
