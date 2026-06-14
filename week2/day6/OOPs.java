// Playable.java
package music;

public interface Playable {
    void play();
}
// Veena.java
package music.string;

import music.Playable;

public class Veena implements Playable {

    public void play() {
        System.out.println("Playing Veena");
    }
}
// Saxophone.java
package music.wind;

import music.Playable;

public class Saxophone implements Playable {

    public void play() {
        System.out.println("Playing Saxophone");
    }
}
// Test.java
package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
