public class Treadmill implements Obstacle {
    public enum Treadmills {
        SlowTreadmill(1), NormalTreadmill(2), FastTreadmill(3), SuperTreadmill(4);

        Treadmills(int count) {
            this.count = count;
        }

        public int count;
    }
    public Treadmills t;

    public Treadmill(Treadmills t) {
        this.t = t;
    }
    public boolean contest(Conkursant a) {return a.run(t);}
}
