public class Human implements Conkursant{
    private Treadmill.Treadmills MaxR = Treadmill.Treadmills.NormalTreadmill;
    private Wall.Walls MaxJ = Wall.Walls.MiddleWall;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public boolean run(Treadmill.Treadmills t) {
        if (t.count <= MaxR.count)
        {
            System.out.println("Человек "+name+" успешно пробежал " + t.count + " дорожку");
            return true;
        }
        else
        {
            System.out.println("Человек "+name+" не смог пробежать " + t.count + " дорожку");
            return false;
        }
    }

    public boolean jump(Wall.Walls w) {
        if (w.count <= MaxJ.count)
        {
            System.out.println("Человек "+name+" успешно перепрыгнул " + w.count + " стену");
            return true;
        }
        else
        {
            System.out.println("Человек "+name+" не смог перепрыгнуть " + w.count + " стену");
            return false;
        }
    }
}
