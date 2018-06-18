import java.util.*;

public class ProblemA_Fingerprints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		List<Integer>sequence = new ArrayList<Integer>();
		List<Integer>signatures = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			int temp = scn.nextInt();
			sequence.add(temp);
		}
		for(int i = 0 ; i < m ; i++){
			int temp = scn.nextInt();
			signatures.add(temp);
		}
		for(int i = 0 ; i < n ; i++){
			int num_to_be_checked = sequence.get(i);
			if(signatures.contains(num_to_be_checked)){
				System.out.print(num_to_be_checked+" ");
			}
		}

	}
}
