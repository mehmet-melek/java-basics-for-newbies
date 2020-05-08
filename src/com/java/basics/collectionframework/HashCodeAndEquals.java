package com.java.basics.collectionframework;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by melek.
 */

class Player {

    private String  name;
    private Integer id;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "||ID:" + id + "  NAME:" + name + "||";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (!name.equals(player.name)) return false;
        return id.equals(player.id);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}

public class HashCodeAndEquals {

    public HashCodeAndEquals() {

        Set<Player> hashSet = new HashSet<Player>();

        Player playerOne  = new Player(1, "Mehmet");
        Player playerTwo  = new Player(2, "Melek");
        Player playerTree = new Player(3, "Sample");
        Player playerFour = new Player(1, "Mehmet");  // We can check is it equal >> override hashcode and equals method

        hashSet.add(playerOne);
        hashSet.add(playerTwo);
        hashSet.add(playerTree);
        hashSet.add(playerFour);

        for (Player p : hashSet) {
            System.out.println(p); // = System.out.println(p.toString());
        }
    }

}
