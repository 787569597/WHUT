/*
 * 判断输入的三个整数是否为三角形
 * 满足两边之和大于第三边
 * 满足两边只差小于第三边
 */



package triangle;
import java.util.*;

public class text 
{

	public static void main(String[] args)
	{
		int border[] = new int[3]; 
		int a;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入三条边长（整数）：");
		
		for(int i=0; i<3; i++)
		{
			if(keyboard.hasNextInt())
			{
				a = keyboard.nextInt();
				if(a  <= 0)
				{
					System.out.println("输入的边长不为正整数");
					break;
				}
				else
				{
					 border[i] = a;
				}
			}
			else
			{
				System.out.println("输入的边长不为整数");
				break;
			}
		}
		
		Arrays.sort(border);
		System.out.println("输入的三边长为："+border[0]+" "+border[1]+" "+border[2]);
		if(border[0]+border[1]>border[2] && border[2]-border[0] < border[1])
		{
			System.out.println("输入的三边长构成三角形");
			if(border[0]*border[0] +border[1]*border[1] == border[2]*border[2])
			{
				if(border[0] == border[1] || border[0] == border[2] ||border[1] == border[2])
				{
					System.out.println("该三角形为等腰直角三角形");
				}
				else
				{
					System.out.println("该三角形为直角三角形");
				}	
			}
			else if(border[0] == border[2])
				{
				System.out.println("该三角形为等边三角形");
				}
			else if(border[0] == border[1] || border[0] == border[2] ||border[1] == border[2])
			{
				System.out.println("该三角形为等腰三角形");
			}
			else
			{
				System.out.println("该三角形为普通三角形");
			}
		}
		else
		{
			System.out.println("输入的三边长不构成三角形");
		}
		
		
	}
	
	
}
