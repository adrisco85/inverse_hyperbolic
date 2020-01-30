package inverseHyperbolicTest;

import static org.junit.Assert.*;
import inverseHyperbolic.InverseHyperbolic;

import org.junit.Test;

import randomArnaldo.Random;

public class InverseHyperbolicTest 
{

	private int testNumber = (int)1e8;
	
	@Test
	public void test_argsinh() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = Math.sinh(x);
			assertEquals(x, InverseHyperbolic.argsinh(y),1e-6);
		}		
	}
	
	@Test
	public void test_argcosh() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = Math.cosh(x);
			if(x > 0)
				assertEquals(x, InverseHyperbolic.argcosh(y)[0],1e-6);
			else
				assertEquals(x, InverseHyperbolic.argcosh(y)[1],1e-6);
		}		
	}
	
	@Test
	public void test_argtanh() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = Math.tanh(x);
			assertEquals(x, InverseHyperbolic.argtanh(y),1e-6);
		}		
	}
	
	@Test
	public void test_argcoth() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = 1/Math.tanh(x);
			assertEquals(x, InverseHyperbolic.argcoth(y),1e-6);
		}		
	}
	
	@Test
	public void test_argsech() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = 1/Math.cosh(x);
			if(x > 0)
				assertEquals(x, InverseHyperbolic.argsech(y)[0],1e-6);
			else
				assertEquals(x, InverseHyperbolic.argsech(y)[1],1e-6);
		}		
	}
	
	@Test
	public void test_argcsch() 
	{
		for(int i = 0; i < testNumber; i++)
		{
			double x = Random.getRandomDouble(-10, 10);
			double y = 1/Math.sinh(x);
			assertEquals(x, InverseHyperbolic.argcsch(y),1e-6);
		}		
	}

}





