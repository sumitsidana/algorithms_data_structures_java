import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class CodeChef_Cookoff_ProbA {
	//public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line = bi.readLine();
		int T = Integer.parseInt(line);
		for(int i = 0 ; i < T ; i++){
			line = bi.readLine();
			String [] array = line.split(" ");
			int n = Integer.parseInt(array[0]);
			int k = Integer.parseInt(array[1]);

			Map<Integer,Integer> points = new LinkedHashMap<Integer,Integer>();
			for(int j  = 0 ; j < n ; j++){
				line = bi.readLine();
				array = line.split(" ");
				int x_1 = Integer.parseInt(array[0]);
				int y_1 = Integer.parseInt(array[1]);
				points.put(x_1, y_1);
			}
			int count = 0;
			for (Map.Entry<Integer,Integer> entry : points.entrySet()) {
				int x_1_1 = entry.getKey();
				int x_1_2 = entry.getValue();
				for (Map.Entry<Integer,Integer> inner_entry : points.entrySet()) {
					int x_2_1 = inner_entry.getKey();
					int x_2_2 = inner_entry.getValue();
					if((x_1_1 > x_2_1 && x_1_1 > x_2_2) || (x_1_1 < x_2_1 && x_1_2 < x_2_1) ){
						count++;
						//						System.out.println(x_1_1+" "+x_1_2+" "+x_2_1+" "+x_2_2);
					}
				}
			}
			System.out.println(count/2);
		}



	}

}
