import java.util.*;

public class _7interface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queen q = new Queen();
        q.moves();
        System.out.println("\n----------------------------------------------\n");
        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
        System.out.println();

        sc.close();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("\nup, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("\nup, down, left, right");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("\ninitially up by 1 or 2 steps, after up by 1 step");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("\nup, down, left, right, diagonal (by 1 step)");
    }
}

// Multiple Inheritance ---->
interface Herbivores {
    void eatGrass();
}

interface Carnivores {
    void eatMeat();
}

class Bear implements Herbivores, Carnivores {
    public void eatGrass() {
        System.out.println("Eats Grass");
    }

    public void eatMeat() {
        System.out.println("Eats Meat");
    }
}