package lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample2_13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請問是要在第幾次處理結束迴圈呢?(1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("第" + i + "次的處理。");
			if(i == num)
				break;
		}
	}

}
