package lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample2_13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("�аݬO�n�b�ĴX���B�z�����j��O?(1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("��" + i + "�����B�z�C");
			if(i == num)
				break;
		}
	}

}
