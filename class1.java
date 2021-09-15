package variant5;

public class class1 {
	public static int integerTask(int A, int B)
	{
		return A%B;
	}
	
	public static int[] ifTask(int A, int B, int C)
	{			
		
		int count1 = 0, count2 = 0;
		int array[]=new int[2];
		if(A<0) 
		{
			count1++;
		}
		else if (A>0)
		{
			count2++;
		}
		
		if(B<0) 
		{
			count1++;
		}
		else if (B>0)
		{
			count2++;
		}
		
		if(C<0) 
		{
			count1++;
		}
		else if (C>0)
		{
			count2++;
		}
	    
		array[0] = count1;
		array[1] = count2;
		return array;
	}
	
	public static float[] forTask(float count) {
		float array[]=new float[10];
		float k=0;
		k+=0.1;
		for(int i=0; i < 10; i++)
		{
			array[i] =count*k;
			k+=0.1;
		}
		return array;
	}
	
	public static boolean booleanTask(int A, int B)
	{
		return (A==0) || (B <-2);
	}
	
	public static float caseTask(int N, float A, float B)
	{
		switch(N) {
		case 1: return A+B;
		case 2: return A-B;
		case 3: return A*B;
		case 4: return A/B;
		default: return 0;		
		}
	
	}
	
	public static int whileTask(int N) {
		int K=0;
		while((Math.pow(2, K) != N) && Math.pow(2, K) < N)
		{
			K++;
			if (Math.pow(2, K) > N)
			{
				return -1;
			}
		}
		
		return K;
	
	}
	
	public static float[] MinMaxTask(int N,float m[],float v[])
	{
		float result[]=new float[2];
		float P = m[0]/v[0];
		int max_index = 0;
		for (int i = 1; i < N;i++)
		{
			if(m[i]/v[i] > P)
			{
				P = m[i]/v[i];
				max_index = i;
			}
		}
		
		result[0]=P;
		result[1]=max_index;
		return result;
		
	}
	
	
	public static float[][] MatrixTask(int M, int N, float D, float[] masiv){
		float Matrix[][] = new float[M][N];
		for (int i = 0; i<M;i++)
		{
			Matrix[0][i] = masiv[i];
		}
		
		for(int j = 1;j<N;j++)
		{
			for(int i = 0; i<M;i++)
			{
				Matrix[i][j]=Matrix[i][j-1]+D;
			}
		}
		
		return Matrix;
	}
	
	public static int[] masivTask(int N)
	{
		int masiv[]= new int[7];
		masiv[0] = 1;
		masiv[1] = 1;
		for (int i = 2;i<N;i++)
		{
			masiv[i] = masiv[i-1]+masiv[i-2];
		}
		
		return masiv;
	}
	public static void main(String args[]) {
	
	}
	
	
}
