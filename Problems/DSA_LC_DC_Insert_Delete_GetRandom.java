package Problems;

import java.util.*;

public class DSA_LC_DC_Insert_Delete_GetRandom {


    class RandomizedSet {
        private ArrayList<Integer> list;
        private Map<Integer, Integer> map;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        public boolean search(int val) {
            return map.containsKey(val);
        }

        public boolean insert(int val) {
            if (search(val)) return false;

            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!search(val)) return false;

            int index = map.get(val);
            list.set(index, list.get(list.size() - 1));
            map.put(list.get(index), index);
            list.remove(list.size() - 1);
            map.remove(val);

            return true;
        }

        public int getRandom() {
            Random rand = new Random();
            return list.get(rand.nextInt(list.size()));
        }
    }


}


class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;
    Random random;

    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        random=new Random();
    }

    public boolean insert(int val) {

        if(map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;


    }

    public boolean remove(int val) {

        if(!map.containsKey(val)) {
            return false;
        }

        int idx=map.get(val);
        int lastIdx=list.size()-1;

        if(idx!=lastIdx) {
            list.set(idx, list.get(lastIdx));
            map.put(list.get(lastIdx), idx);
        }
        map.remove(val);
        list.remove(lastIdx);
        return true;


    }

    public int getRandom() {

        return list.get(random.nextInt(list.size()));



    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */