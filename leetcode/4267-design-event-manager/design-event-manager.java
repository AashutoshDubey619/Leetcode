class EventManager {

    class Pair {
        int id, priority;

        Pair(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    PriorityQueue<Pair> pq;
    HashMap<Integer, Integer> map;

    public EventManager(int[][] events) {
        map = new HashMap<>();

        pq = new PriorityQueue<>((a, b) -> {
            if (a.priority == b.priority)
                return a.id - b.id;   
            return b.priority - a.priority; 
        });

        for (int[] e : events) {
            pq.add(new Pair(e[0], e[1]));
            map.put(e[0], e[1]);
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        pq.add(new Pair(eventId, newPriority));
    }

    public int pollHighest() {

        while (!pq.isEmpty()) {

            Pair top = pq.poll();

            if (!map.containsKey(top.id))
                continue; 

            if (map.get(top.id) != top.priority)
                continue; 

            map.remove(top.id);
            return top.id;
        }

        return -1;
    }
}