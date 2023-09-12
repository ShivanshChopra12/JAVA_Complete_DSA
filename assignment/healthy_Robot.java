package assignment;

import java.util.*;

class healthy_Robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T_robots = scanner.nextInt();
        long[][] b = new long[T_robots + 1][2];

//        	 0  1       0-> key 1->value
//      1 { {39,1},
//      2   {20,0},
//      3   {21,0},
//      4   {12,0} }
        
        
        int idx = 1;
        while (idx <= T_robots) {
            b[idx][0] = scanner.nextLong(); // power
            b[idx][1] = scanner.nextLong(); // direction
            idx++;
        }

        Stack<Long> left = new Stack<>();
        Stack<Long> right = new Stack<>();
        List<Pair<Long, Long>> answer = new ArrayList<>();

        idx = T_robots;
        while (idx >= 1) {
            if (b[idx][1] == 0) {
                left.push(b[idx][0]);
            } else {
                long r = b[idx][0];

                while (!left.isEmpty() && r >= 1) {
                    if (r > left.peek()) {
                        r = r - left.peek();
                        left.pop();
                    } else {
                        long l = left.peek();
                        l = l - r;
                        r = 0;
                        left.pop();
                        left.push(l);
                    }
                }

                if (r >= 1) {
                    answer.add(new Pair<>(r, 1L));
                }
            }
            idx--;
        }

        while (!left.isEmpty()) {
            System.out.println(left.peek() + " " + "0");
            left.pop();
        }

        int g = answer.size();
        idx = g - 1;
        while (idx >= 0) {
           System.out.println(answer.get(idx).getKey() + " " + answer.get(idx).getValue());
            idx--;
        }
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
