import java.io.*;
import java.util.*;
import java.lang.Math;

public class StudentAverages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sf = new Scanner(new File(
				"F:\\Workspace\\StudentAverages(File IO)\\StudentScores.in"));
		int maxIndx = -1;
		String text[] = new String[1000];
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
	
		String sj = "";

			for (int j = 0; j <= maxIndx; j++) {
				int num = 0;
				int count = 0;
				Scanner sc = new Scanner(text[j]);
				sj = sc.next();
				while(sc.hasNext()){
					num += sc.nextInt();
					count++;
				}
				num = (int)Math.round((double)num/count);
				System.out.println(sj + ", average = " + num );
			}
		}
	}


