package br.com.fabianafarias;

import java.util.Arrays;
import java.util.HashMap;

public class ContagemDeParesDeAnagramas {
    public static void main(String[] args) {
        subString("Geek for Geeks");
    }

    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        int ContagemDeParesDeAnagramas = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            ContagemDeParesDeAnagramas += (n * (n-1))/2;
        }
        System.out.println(ContagemDeParesDeAnagramas);
    }
}