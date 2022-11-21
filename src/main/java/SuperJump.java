public interface SuperJump {
    public enum Walls { SuperWall(4);

        Walls(int count) {
            this.count = count;
        }

        public int count;
    }
}
