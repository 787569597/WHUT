package triangle;
import java.util.*;

public class Test2 {
	
	static Scanner keyboard = new Scanner(System.in);
	static int sales[] = new int[3];
	static int a;
	static int sale;	//销售额
	static double money;	//佣金
	
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
					System.out.println("请输入您卖出"+(i+1)+"#商品的数量");
					a = keyboard.nextInt();
					if(a  <= 0 || a > 70 + i*10)
					{
						System.out.println("您卖出的"+(i+1)+"#商品数量不合格");
						break;
					}
					else
					{
						 sales[i] = a;
					}
				}
				else
				{
					System.out.println("您卖出的"+(i+1)+"#商品数量不合格");
					break;
				}
			}
		 sale = 45 * sales[0] + 30 * sales[1] + 25 * sales[2];
		System.out.println("您这个月的销售额为:"+sale);
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
		 
		 System.out.println("您这个月的佣金为:"+money);
	 }
}
