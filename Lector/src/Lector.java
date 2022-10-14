import java.util.concurrent.*;

public class Lector implements Callable<String> {

    public String call() throws Exception {
        String textoLeido="Me gustan las peliculas de accion";
        Thread.sleep(1000);
        return textoLeido;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lector lector=new Lector();
        ExecutorService servicioEjecucion=
                Executors.newSingleThreadExecutor();
        Future<String> result= servicioEjecucion.submit(lector);
        String texto =result.get();
        if(result.isDone()){
            System.out.println(texto);
            System.out.println("Proceso finalizado");
        }else if(result.isCancelled()){
            System.out.println("Proceso cancelado");
        }
        servicioEjecucion.shutdown();
    }
}
