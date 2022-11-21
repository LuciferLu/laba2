public class Cat implements Conkursant{
    private Treadmill.Treadmills MaxR = Treadmill.Treadmills.FastTreadmill;
    private Wall.Walls MaxJ = Wall.Walls.HighWall;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public boolean run(Treadmill.Treadmills t) {
        if (t.count <= MaxR.count)
        {
            System.out.println("Кошка "+name+" успешно пробежала " + t.count + " дорожку");
            return true;
        }
        else
        {
            System.out.println("Кошка "+name+" не смогла пробежать " + t.count + " дорожку");
            return false;
        }
    }

    public boolean jump(Wall.Walls w) {
        if (w.count <= MaxJ.count)
        {
            System.out.println("Кошка "+name+" успешно перепрыгнула " + w.count + " стену");
            return true;
        }
        else
        {
            System.out.println("Кошка "+name+" не смогла перепрыгнуть " + w.count + " стену");
            return false;
        }
    }
}