/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudy.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author wimukthirajapaksha
 */
public class CloudyDay {

    /**
     * @param args the command line arguments
     */
//    x - city location, y - cloud location, 
    public static long maximumPeople(List<Long> p, List<Long> x, List<Long> y, List<Long> r) {
        Map<Long, Long> people = new TreeMap<>();
        Map<Long, Long> relaventCloudsForCities = new TreeMap<>();
        for (int i=0; i<p.size(); i++) {
            people.put(x.get(i), p.get(i));
            relaventCloudsForCities.put(x.get(i), 0l);
        }
        System.out.println(relaventCloudsForCities+" -");
        for (int i=0; i<y.size(); i++) {
            for (long j=y.get(i)-r.get(i); j<=y.get(i)+r.get(i); j++) {
                if (relaventCloudsForCities.containsKey(j)) {
                    relaventCloudsForCities.put(j, relaventCloudsForCities.get(j)+1);
                } else if (people.containsKey(j)) {
                    relaventCloudsForCities.put(j, 1l);
                }
            }
        }
        Iterator<Map.Entry<Long, Long>> it = relaventCloudsForCities.entrySet().iterator();
        long count = 0;
        long min = Long.MIN_VALUE;
        System.out.println(people);
        System.out.println(relaventCloudsForCities);
        while(it.hasNext()) {
            Map.Entry<Long, Long> i = it.next();
            long val = i.getValue();
            long key = i.getKey();
            if (val==1) {
                min = Math.max(min, people.get(key));
            } else if (val==0) {
                count+=people.get(key);
            }
        }
        System.out.println(people);
        System.out.println(relaventCloudsForCities);
        System.out.println(count+min);
        return 0;
    }
    
    public static void main(String[] args) {
        CloudyDay.maximumPeople(Arrays.asList(10l,100l), Arrays.asList(5l,100l), Arrays.asList(4l), Arrays.asList(1l));
    }
}
