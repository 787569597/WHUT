/*
 * �ж���������������Ƿ�Ϊ������
 * ��������֮�ʹ��ڵ�����
 * ��������ֻ��С�ڵ�����
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
		System.out.println("�����������߳�����������");
		
		for(int i=0; i<3; i++)
		{
			if(keyboard.hasNextInt())
			{
				a = keyboard.nextInt();
				if(a  <= 0)
				{
					System.out.println("����ı߳���Ϊ������");
					break;
				}
				else
				{
					 border[i] = a;
				}
			}
			else
			{
				System.out.println("����ı߳���Ϊ����");
				break;
			}
		}
		
		Arrays.sort(border);
		System.out.println("��������߳�Ϊ��"+border[0]+" "+border[1]+" "+border[2]);
		if(border[0]+border[1]>border[2] && border[2]-border[0] < border[1])
		{
			System.out.println("��������߳�����������");
			if(border[0]*border[0] +border[1]*border[1] == border[2]*border[2])
			{
				if(border[0] == border[1] || border[0] == border[2] ||border[1] == border[2])
				{
					System.out.println("��������Ϊ����ֱ��������");
				}
				else
				{
					System.out.println("��������Ϊֱ��������");
				}	
			}
			else if(border[0] == border[2])
				{
				System.out.println("��������Ϊ�ȱ�������");
				}
			else if(border[0] == border[1] || border[0] == border[2] ||border[1] == border[2])
			{
				System.out.println("��������Ϊ����������");
			}
			else
			{
				System.out.println("��������Ϊ��ͨ������");
			}
		}
		else
		{
			System.out.println("��������߳�������������");
		}
		
		
	}
	
	
}
