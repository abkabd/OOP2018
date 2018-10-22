package Problem5;

public class MinMax {
    static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("%d %d", x, y);
        }
    }


    static Pair minmax(int values[]){
        int mn =  (int)1e9;
        int mx = -(int)1e9;
        for(int i: values) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        return new Pair(mn, mx);
    }
}
