package lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample2_14 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("�n���L�ĴX�����B�z�O?(1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10; i++)
		{
			if(i == num)
				continue;
			System.out.println("��" + i + "�����B�z�C");
			
		}
	}

}
