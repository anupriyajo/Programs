package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubdomainVisitCount {
    public static void main(String args[]) {
        String s[] = {"900 google.mail.com",
                "50 yahoo.com",
                "1 intel.mail.com",
                "5 wiki.org"};
        List<String> l = subdomainVisits(s);
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < cpdomains.length; i++) {
            String y = cpdomains[i];
            String[] str = (y.split(" ")[1]).split("\\.");
            for (int j = 0; j < str.length; j++) {
                String x = y.substring(y.indexOf(str[j]));

                if (hm.containsKey(x)) {
                    hm.put(x, hm.get(x) + Integer.parseInt(y.split(" ")[0]));
                } else {
                    hm.put(x, Integer.parseInt(y.split(" ")[0]));
                }
            }
        }
        List<String> l = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            l.add(entry.getValue() + " " + entry.getKey());
        }
        return l;
    }
}