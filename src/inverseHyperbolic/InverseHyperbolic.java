package inverseHyperbolic;

public class InverseHyperbolic 
{
	
	/**
     * @param x input
     * @return argument of the hyperbolic sine
     */
    public static double argsinh(double x)
    {
        return Math.log(x + Math.sqrt(x*x + 1));
    }

    /**
     * @param x input
     * @return  if x >= 1: argument of the hyperbolic cosine in an array with format [arg1, arg2]
     * otherwise null
     */
    public static double[] argcosh(double x) 
    {
        return x >= 1 ? new double[] {Math.log(x + Math.sqrt(x*x - 1)), Math.log(x - Math.sqrt(x*x - 1))} : null; 
    }

    /**
     * @param x input
     * @return if if x < 1 and x > -1 argument of the hyperbolic tangent
     * otherwise NaN
     */
    public static double argtanh(double x)
    {
    	return Math.abs(x) < 1 ? Math.log((1 + x)/(1 - x))/2 : Double.NaN;
    }

    /**
     * @param x input
     * @return  if x > 1 and x < -1: argument of the hyperbolic cotangent
     * otherwise NaN
     */
    public static double argcoth(double x)
    {
        return Math.abs(x) > 1 ? Math.log((x + 1)/(x - 1))/2 : Double.NaN;
    }

    /**
     * @param x input
     * @return  if x > 0 y x <= 1 argument of the hyperbolic secant in an array with format [arg1, arg2]
     * otherwise null
     */
    public static double[] argsech(double x)
    {
        return x > 0 && x <= 1 ? new double[] {Math.log((1 + Math.sqrt(1 - x*x))/x ), Math.log((1 - Math.sqrt(1 - x*x))/x )} : null;
    }

    /**
     * @param x input
     * @return  if x != 0: argument of the hyperbolic cosecant
     * otherwise NaN
     */
    public static double argcsch(double x)
    {
        if(x > 0)
            return Math.log((1 + Math.sqrt(x*x + 1))/x);
        else if(x < 0)
            return Math.log((1 - Math.sqrt(x*x + 1))/x);
        else return Double.NaN;
    }

}
