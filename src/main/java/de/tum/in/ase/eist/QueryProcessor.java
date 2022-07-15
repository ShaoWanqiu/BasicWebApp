package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Locale;

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
            String number=strings[1];
            String[] numbers=number.split(",");
            String number1=numbers[0].trim();
            String number2=numbers[1].trim();
            int n1=Integer.parseInt(number1);
            int n2=Integer.parseInt(number2);
            if(n1>n2){
                return String.valueOf(n1);
            }else{
                return String.valueOf(n2);
            }
        } else if(query.contains("plus")){
            String[] strings=query.split("\\s+");
            String number1=strings[2].trim();
            String number2=strings[4].trim();
            int n1=Integer.parseInt(number1);
            int n2=Integer.parseInt(number2);
            return String.valueOf(n1+n2);
        } else {
            return "";
        }
    }
}
