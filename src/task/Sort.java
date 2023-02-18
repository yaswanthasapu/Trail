package task;

import java.sql.SQLOutput;
import java.util.*;



public class Sort {

    // ["$80", "$20", "$40", "$200", "$10"]
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("$80");
        list.add("$20");
        list.add("$40");
        list.add("$200");
        list.add("$10");
        list.add("$2000");

        System.out.println(list);

        ArrayList<Integer>list1=new ArrayList<>();
        for (String x :list){
            String str="";
            for (int i=1;i<x.length();i++){
                str += x.charAt(i);
            }
            int n =Integer.parseInt(str);
            list1.add(n);

        }
        int min = list1.get(0);
        int max=list1.get(0);
        for(int x : list1){
            if (x>max)max=x;
            if(x<min)min=x;
        }
        System.out.println(list1);
        System.out.println("Min Value " + min);
         System.out.println("Max Value " + max);


    }
   // ["$80", "$20", "$40", "$200", "$10"]
}
