package lab0;

import lab0.Variant5;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Variant5Test {

    Variant5 ob1 = new Variant5();
    public static float eps = 0.001f;
@Test(dataProvider = "integerTask")
    public void testInteger(int res1, int res2, int res3){
    assertEquals(ob1.integerTask(res1,res2),res3);
}

@DataProvider
    public Object[][] integerTask(){
    return new Object[][] {{35,10,5},{11,4,3},{6,3,0}};
}

@Test(dataProvider = "ifTask")
    public void testIf(int num1, int num2, int num3, int[] res){
    assertEquals(ob1.ifTask(num1,num2,num3),res);
}

@DataProvider
    public Object[][] ifTask(){
    int[] res1 = {2,1};
    int[] res2 = {0,2};
    int[] res3 = {2,0};
    return new Object[][] {{2,-6,-1,res1},{0,4,5,res2},{-4,-12,0,res3}};
}

@Test(dataProvider = "forTask")
    public void testFor(float count,float[] res){
    assertEquals(ob1.forTask(count),res,eps);
}

@DataProvider
    public Object[][] forTask(){
    float[] res1 = new float[10];
    float[] res2 = new float[10];
    float[] res3 = new float[10];

    for(int i = 1; i <= 10; i++)
    {
        res1[i-1] = 15*((float)i/10);
        res2[i-1] = 22.5f*((float)i/10);
        res3[i-1] = 40*((float)i/10);
    }

    return new Object[][] {{15,res1},{22.5f,res2},{40,res3}};
}

@Test(dataProvider = "booleanTask")
    public void testBoolean(int num1, int num2,boolean res){
    assertEquals(ob1.booleanTask(num1,num2),res);
}

@DataProvider
    public Object[][] booleanTask(){
    return new Object[][] {{0,5,true},{-9,-3,true},{5,-2,false}};
}

@Test(dataProvider = "caseTask")
    public void testCase(int num, float num1, float num2, float result){
    assertEquals(ob1.caseTask(num,num1,num2),result,eps);
}

@DataProvider
    public Object[][] caseTask(){
    return new Object[][] {{1,-5.3f,4,-1.3f},{2,6,-2.2f,8.2f},{3,5,4,20},{4,45,9,5},{5,43,11,0}};
}

@Test(dataProvider = "whileTask")
    public void testWhile(int num,int result){
    assertEquals(ob1.whileTask(num),result);
}

@DataProvider
    public Object[][] whileTask(){
    return new Object[][] {{32,5},{8,3},{44,-1}};
}

@Test(dataProvider = "arrayTask")
    public void testArray(int num, int[] res){
    assertEquals(ob1.arrayTask(num),res);
}

@DataProvider
    public Object[][] arrayTask(){
    int[] res1 = {1,1,2,3,5};
    int[] res2 = {1,1,2,3,5,8,13};
    int[] res3 = {1,1,2,3,5,8,13,21,34};

    return new Object[][] {{5,res1},{7,res2},{9,res3}};
    }

@Test(dataProvider = "minmaxTask")
public void tesMinMax(int num, float[][] in,float[] res){
    assertEquals(ob1.MinMaxTask(num,in),res,eps);
}

@DataProvider
    public Object[][] minmaxTask(){
    float[][] in1 = {{12,4},{10.5f,4},{42,6}};
    float[][] in2 = {{42,5},{24,4},{11,8},{35,5}};
    float[] res1={2,7};
    float[] res2={0,8.4f};
    return new Object[][] {{3,in1,res1},{4,in2,res2}};
}


@Test(dataProvider = "matrixTask")
public void testMatrix(int M, int N, float D, float[] mas, float[][] res){
    assertEquals(ob1.MatrixTask(M, N, D, mas),res);
}
    @DataProvider
    public Object[][] matrixTask() {

    float[] masiv1 = {3, 4, 1, -4};
    float[] masiv2 = {0, -4.4f, 1.4f};
    float[][] res1 = {{3, 6}, {4, 7}, {1, 4}, {-4, -1}};
    float[][] res2 = {{0, -3.5f, -7f, -10.5f}, {-4.4f, -7.9f, -11.4f, -14.9f}, {1.4f, -2.1f, -5.6f, -9.1f}};

    return new Object[][]{{4, 2, 3.0f, masiv1, res1},{3,4,-3.5f,masiv2,res2}};
}


}
