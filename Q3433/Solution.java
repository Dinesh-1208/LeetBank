/* 
   Problem: 3433
   Source: LeetCode
   Language: Java
*/

class Solution {

    static class Event {
        String type;
        int time;
        String data;

        Event(String type,int time,String data)  {
            this.type = type;
            this.time = time;
            this.data = data;
        }
    }
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        List<Event> list = new ArrayList<>();
        for (List<String> e : events) {
            list.add(new Event(e.get(0), Integer.parseInt(e.get(1)), e.get(2)));
        }

        Collections.sort(list, (a, b) -> {
            if (a.time != b.time) return a.time - b.time;
            if (a.type.equals("OFFLINE") && b.type.equals("MESSAGE")) return -1;
            if (a.type.equals("MESSAGE") && b.type.equals("OFFLINE")) return 1;
            return 0;
        });

        int[] mentions = new int[numberOfUsers];
        int[] offlineUntil = new int[numberOfUsers];

        for (Event e : list) {
            int t = e.time;

            if (e.type.equals("OFFLINE")) {
                int user = Integer.parseInt(e.data);
                offlineUntil[user] = t + 60;
            }
            else { 
                String msg = e.data;

                if (msg.equals("ALL")) {
                    for (int u = 0; u < numberOfUsers; u++) {
                        mentions[u]++;
                    }
                    continue;
                }

                if (msg.equals("HERE")) {
                    for (int u = 0; u < numberOfUsers; u++) {
                        if (offlineUntil[u] <= t) {
                            mentions[u]++;
                        }
                    }
                    continue;
                }

                String[] tokens = msg.split(" ");
                for (String tok : tokens) {
                    if (tok.startsWith("id")) {
                        int user = Integer.parseInt(tok.substring(2));
                        mentions[user]++;
                    }
                }
            }
        }
        return mentions;
    }
}