package variant5;


import static org.junit.Assert.assertEquals;

class class1Test {

	class1 ob1 = new class1();
	
	@org.junit.jupiter.api.Test
	void testInteger() {
	 assertEquals(5, ob1.integerTask(35, 10));
	}
	
	@org.junit.jupiter.api.Test
	void testIf() {
		int masiv[]={1,1};
		int masiv1[] = ob1.ifTask(-5,0,5);
		for(int i = 0; i < 2; i++) {
			assertEquals(masiv[i],masiv1[i]);
		}
	}
	
	@org.junit.jupiter.api.Test
     void testForTask() {
		float masiv[] = new float[10];
		float k=0.1f;
		for (int i=0;i<10;i++)
		{
			masiv[i] = 21.5f*k;
			k+=0.1;
		}
		
		float masiv1[] = ob1.forTask(21.5f);
		for(int i=0;i<10;i++)
		{
			assertEquals(masiv[i],masiv1[i],0.001);
		}
	}
	
	public float[][] DataCaseTask(){
		float Object1[][] = {{28,3,4,7,0.001f},{35,1,22.5f,12.5f,0.001f},
				             {10.5f,4,105,10,0.001f},{7,2,10,3,0.001f}};;
		
				     
	    return Object1;
			
	}
	@org.junit.jupiter.api.Test
	void testCaseTask() {
		float Object2[][] = DataCaseTask();
		int j = 1;
		for(int i = 0; i<4;i++)
		{
		assertEquals(Object2[i][0],ob1.caseTask((int)Object2[i][j], Object2[i][j+1], Object2[i][j+2]),Object2[i][j+3]);
		
		}
	}
	
	@org.junit.jupiter.api.Test
	void testBooleanTask() {
		assertEquals(false,ob1.booleanTask(5,-2));
	}
	
	@org.junit.jupiter.api.Test
	void testWhileTask() {
		assertEquals(4,ob1.whileTask(16));
	}
	
	@org.junit.jupiter.api.Test
	void testMinMaxTask() {
		float m[] = {40,20,70,15};
		float v[] = {4,5,1,3};
		float result1[] = ob1.MinMaxTask(4,m,v);
		float result2[]= {70.0f,2f};
		for(int i=0;i<2;i++)
		{
			assertEquals(result2[i],result1[i],0.001f);
		}
	}
	
//	@org.junit.jupiter.api.Test
//	void testMatrix() {
//		float masiv1[]= {1,2,-3};
//		float Matrix1[][] = {{1,6,11},{2,7,12},{-3,2,7}};
//		float Matrix2[][] = ob1.MatrixTask(3, 3, 5,masiv1);
//		
//		for(int i = 1; i<=3;i++)
//		{
//			for (int j = 1; j <=3;j++)
//			{
//				System.out.print(Matrix1[i][j]);
//			}
//			System.out.println('\n');
//		}
//	}
	
	@org.junit.jupiter.api.Test
	void testMasiv() {
		int masiv1[] = {1,1,2,3,5,8,13};
		int masiv2[] = ob1.masivTask(7);
		for(int i = 0; i <7; i++)
		{
			assertEquals(masiv1[i],masiv2[i]);
		}
	}

}