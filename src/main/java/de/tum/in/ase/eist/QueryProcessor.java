package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "ShaoWanqiu";
        } else if(query.contains("largest")){
            String[] strings=query.split(":");
            String number=strings[2].trim();
            String[] numbers=number.split(",");
            int maxNumber=0;
            for (String s : numbers) {
                int n = Integer.parseInt(s.trim());
                if (n > maxNumber) {
                    maxNumber = n;
                }
            }
            return String.valueOf(maxNumber);
        } else if(query.contains("plus")){
            String[] strings=query.split("\\s+");
            String number1=strings[3].trim();
            String number2=strings[5].trim();
            int n1=Integer.parseInt(number1);
            int n2=Integer.parseInt(number2);
            return String.valueOf(n1+n2);
        } else {
            return "";
        }
    }
}
