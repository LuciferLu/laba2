public class Robot implements Conkursant{
    private Treadmill.Treadmills MaxR = Treadmill.Treadmills.SuperTreadmill;
    private Wall.Walls MaxJ = Wall.Walls.LowWall;
    private SuperJump.Walls SupJ = SuperJump.Walls.SuperWall;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public boolean run(Treadmill.Treadmills t) {
        if (t.count <= MaxR.count)
        {
            System.out.println("Робот "+name+" успешно пробежал " + t.count + " дорожку");
            return true;
        }
        else
        {
            System.out.println("Робот "+name+" не смог пробежать " + t.count + " дорожку");
            return false;
        }
    }

    public boolean jump(Wall.Walls w) {
        if (w.count <= MaxJ.count) {
            System.out.println("Робот " + name + " успешно перепрыгнул " + w.count + " стену");
            return true;
        }
        if (w.count <= SupJ.count) {
            System.out.println("Робот " + name + " использовал супер прыжок и успешно перепрыгнул " + w.count + " стену");
            SupJ.count = MaxJ.count;
            return true;
        }
        else {
            System.out.println("Робот " + name + " не смог перепрыгнуть " + w.count + " стену");
            return false;
        }
    }
}

