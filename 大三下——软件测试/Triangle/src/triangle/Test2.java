package triangle;
import java.util.*;

public class Test2 {
	
	static Scanner keyboard = new Scanner(System.in);
	static int sales[] = new int[3];
	static int a;
	static int sale;	//���۶�
	static double money;	//Ӷ��
	
	public static void main(String[] arg)
	{
		GetSales();
		GetMoney(GetSales());
	}
	
	 static int GetSales()
	{

		 for(int i=0; i<3; i++)
			{
				if(keyboard.hasNextInt())
				{
					System.out.println("������������"+(i+1)+"#��Ʒ������");
					a = keyboard.nextInt();
					if(a  <= 0 || a > 70 + i*10)
					{
						System.out.println("��������"+(i+1)+"#��Ʒ�������ϸ�");
						break;
					}
					else
					{
						 sales[i] = a;
					}
				}
				else
				{
					System.out.println("��������"+(i+1)+"#��Ʒ�������ϸ�");
					break;
				}
			}
		 sale = 45 * sales[0] + 30 * sales[1] + 25 * sales[2];
		System.out.println("������µ����۶�Ϊ:"+sale);
		return sale;
	}
	 
	 static void GetMoney (int sale)
	 {
		 if(sale < 1000) 
		 {
			 money = sale * 0.1;
		 }
		 else if(sale >= 1000 && sale < 1800)
		 {
			 money = 100 + (sale-1000) * 0.15;
		 }
		 else
		 {
			 money = 220 + (sale - 1800) * 0.2;
		 }
		 
		 System.out.println("������µ�Ӷ��Ϊ:"+money);
	 }
}
