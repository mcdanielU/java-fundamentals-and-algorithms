package Collection;

import java.util.TreeSet;

class Coordinates implements Comparable<Coordinates>
{
private int x;
private int y;
public Coordinates(int x, int y)
{
    this.x = x;
    this.y = y;
}


    @Override
    public int compareTo(Coordinates p  ) {
        if(this.x < p.x)
        {
            return -1;
        } else if (this.x >p.x) {
            return 1;
        } else if (this.y > p.y) {
            return 1;
        } else if (this.y < p.y) {
            return -1;
        }
        return 0;
    }

    public String toString ()
    {
        return "X - Coord "+this.x+", Y - Coord "+this.y;
    }
}
public class TreeSetObjectComparable {

    public static void main(String[] args) {
        TreeSet<Coordinates> coor = new TreeSet<>();
        coor.add(new Coordinates(14, 15));
        coor.add(new Coordinates(16,17));
        coor.add(new Coordinates(12,13));

        System.out.println(coor);

    }
}
