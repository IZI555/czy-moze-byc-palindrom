import java.util.*;

public class main 
{
	public static void wypisztab(int[] a)
	{
		for(int i = 0;i<a.length;i++)
			System.out.print(" "+a[i]);
		
		System.out.println("");
	} 
	
	public static void main(String[] args)
	{
		//napisz program kt�ry sprawdzi czy z podanego ci�gu znak�w mo�na utworzy� palindrom.
		Scanner in = new Scanner(System.in);
	System.out.println("podaj ciag znakow ktory moze utworzyc palindrom");
	String x = in.next();
	System.out.println(x);
	int alfabet[] = new int[25];
    char wyraz[] = x.toCharArray();
    for(int i = 0;i<wyraz.length; i++)
    {
    	 alfabet[(((int)wyraz[i])-97)]++;
    }
    
    wypisztab(alfabet);
    
    int parz=0;
    int nieparz=0;
	
	for(int i = 0; i<alfabet.length;i++)
	{
		if(alfabet[i]%2!=0)
		{
			nieparz++;
		}
		else
		{
			parz++;
		}
	}
	
	
	if(nieparz>1)
	{
		System.out.println("wyraz nie moze byc palindromem");
	}
	else
	{
		System.out.println("wyraz moze byc palindromem");
	}
	

	
	
	}
}
	
	
