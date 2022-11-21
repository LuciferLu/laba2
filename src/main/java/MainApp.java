public class MainApp {
    public static void main(String[] args) {
        Obstacle[] ob = new Obstacle[]{
                new Wall(Wall.Walls.LowWall),
                new Wall(Wall.Walls.SuperWall),
                new Treadmill(Treadmill.Treadmills.SlowTreadmill),
                new Wall(Wall.Walls.MiddleWall),
                new Treadmill(Treadmill.Treadmills.NormalTreadmill),
                new Wall(Wall.Walls.HighWall),
                new Treadmill(Treadmill.Treadmills.FastTreadmill),
                new Wall(Wall.Walls.SuperWall),
                new Treadmill(Treadmill.Treadmills.SuperTreadmill)
        };

        Conkursant[] Cont = new Conkursant[] {
                new Cat("Мона"),
                new Human("Саня"),
                new Robot("Маркус")
        };

        for(Conkursant a: Cont)
        {
            for(Obstacle o: ob)
            {
                if(!o.contest(a)) break;
            }
        }
    }
}
