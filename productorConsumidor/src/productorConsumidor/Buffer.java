package productorConsumidor;

import java.util.concurrent.CopyOnWriteArrayList;

public class Buffer {
    private CopyOnWriteArrayList<Character> contenido = new CopyOnWriteArrayList<Character>();
    private boolean disponible = false;

    public synchronized Character recoger()  {
        Character letra=contenido.get(0);
        contenido.remove(letra);
        disponible=false;
        return letra;

    }
    public void poner(char c){
       contenido.add(c);
       disponible=true;

    }
}
