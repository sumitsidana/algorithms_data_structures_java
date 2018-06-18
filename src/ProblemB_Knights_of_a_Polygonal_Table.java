import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ProblemB_Knights_of_a_Polygonal_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>knightPosPow = new LinkedHashMap<Integer,Integer>();
		Map<Integer,Integer>knightPosCoins = new LinkedHashMap<Integer,Integer>();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		for(int i = 0 ; i < n ; i++){
			int power = scn.nextInt();
			knightPosPow.put(i,power);
		}
		for(int i = 0 ; i < n ; i++){
			int numCoins = scn.nextInt();
			knightPosCoins.put(i,numCoins);
		}

		knightPosCoins = knightPosCoins.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						Map.Entry::getValue, 
						(x,y)-> {throw new AssertionError();},
						LinkedHashMap::new
						));


		for (Map.Entry<Integer,Integer> entry : knightPosPow.entrySet()) {

			int pos = entry.getKey();
			int pow = entry.getValue();
			int index = 0;
			int totalCoins = knightPosCoins.get(pos);;
			for (Map.Entry<Integer,Integer> inner_entry : knightPosCoins.entrySet()) {
				int inner_pos = inner_entry.getKey();
				int numCoins = inner_entry.getValue();
				int inner_pow = knightPosPow.get(inner_pos);
				if(pow > inner_pow){
					index ++;
					totalCoins +=numCoins;
					if(index >= k){
						break;
					}
				}

			}
			System.out.print(totalCoins+" ");


		}



	}

}
