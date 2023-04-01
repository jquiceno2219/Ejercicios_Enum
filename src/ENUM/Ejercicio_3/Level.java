package ENUM.Ejercicio_3;

public enum Level {
        HIGH (5),
        SUPER (4),
        IMPROVABLE (3),
        MID (2),
        LOW (1);
        private final int lvlCode;
        Level(int lvlCode) {
            this.lvlCode = lvlCode;
        }
        public int getlvlCode() {
            return this.lvlCode;
        }
}
