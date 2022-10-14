import java.util.concurrent.*;

public class TareaCallable implements Callable<Integer> {
    private int numero;
    public TareaCallable(int numero) {
        this.numero = numero;
        }
    public Integer call() throws Exception {
        Thread.sleep(3000);
        for(int i=numero-1;i>1;i--){
            if(numero%i==0){
                return i;
            }
        }
        throw new Exception("El numero es primo");

    }
    public static void main(String[] args){
        try{
            TareaCallable ec=new TareaCallable(10);
            ExecutorService servicioEjecucion=
                    Executors.newSingleThreadExecutor();
            Future<Integer> result=servicioEjecucion.submit(ec);
            while (!result.isDone()){
                System.out.println("Esperando..");
                Thread.sleep(1000);
            }
            System.out.println("el numero es divisible entre: " +result.get());
            servicioEjecucion.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }

