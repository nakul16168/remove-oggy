package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<String> removeOggy(ArrayList<String> names) {
    	String sub = "oggy" ;
    	ArrayList<Integer> counter = new ArrayList<Integer>(); 
		for(int i = 0 ; i < names.size() ; i ++){
			
			if(names.get(i).substring(0 , sub.length()).equals(sub)){
				
				counter.add(1) ;
			}
			else{
				
				counter.add(0) ; 
			}
		}
		ArrayList<String> ans = new ArrayList<String>(); 
		
		for(int i = 0 ; i < counter.size(); i ++){
			
			if(counter.get(i) != 1){
				
				ans.add(names.get(i)) ;
			}
		}
		
		return ans;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        ArrayList<String> ans = removeOggy(names);
        if(oggyIsRemoved(ans)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
    
}

