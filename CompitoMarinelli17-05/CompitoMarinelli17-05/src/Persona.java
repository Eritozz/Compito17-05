public class Persona extends Thread {
    String nome;
    Spogliatoio spogliatoio;
    int tempo = 0;
    
    public Persona(String n, Spogliatoio sp){
        nome =  n;
        spogliatoio=sp;
    }

    


    public void run(){
        
        spogliatoio.usa(nome);
        System.out.println(nome + " entra in pista e inizia");
        long inizio = System.nanoTime();
        try {
            Thread.sleep((long)(Math.random() * 1000));
        } 
         catch (InterruptedException e) {
        }
        long fine = System.nanoTime();
        System.out.println(nome+ " esce dalla pista ");
        spogliatoio.usa(nome);
        
        tempo = (int)((fine-inizio)/1000000);

    }



   

    

        
}
