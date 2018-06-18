import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BugLife {

	public void dfs()
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
			for(int j  = 0 ; j < k ; j++){
				line = bi.readLine();
				array = line.split(" ");
				int x_1 = Integer.parseInt(array[0]);
				int y_1 = Integer.parseInt(array[1]);
			}
		}
	}

}
