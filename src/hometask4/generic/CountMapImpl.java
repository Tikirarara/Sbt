package hometask4.generic;

import hometask4.generic.CountMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {
    private final Map<T, Integer> map = new HashMap<>();

    @Override
    public void add(T t) {
        if (map.containsKey(t)) {
            map.put(t, getCount(t)+1);
        } else {
            map.put(t, 1);
        }
    }

    @Override
    public int getCount(T t) {
        return map.get(t);
    }

    @Override
    public int remove(T t) {
        int countBefore = getCount(t);
        map.remove(t);
        return countBefore;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap source) {
        Set<T> set = source.toMap().keySet();
        for(T key : set) {
            if (map.containsKey(key)) {
                map.put(key, this.getCount(key) + source.getCount(key));
            } else {
                this.add(key);
            }
        }
    }

    @Override
    public Map toMap() {
        return this.map;
    }

    @Override
    public void toMap(Map destination) {
        Set<T> set = this.map.keySet();
        for(T key : set) {
            if (destination.containsKey(key)) {
                destination.put(key, (int)destination.get(key)+this.getCount(key));
            } else {
                destination.put(key, this.getCount(key));
            }
        }
    }
}
