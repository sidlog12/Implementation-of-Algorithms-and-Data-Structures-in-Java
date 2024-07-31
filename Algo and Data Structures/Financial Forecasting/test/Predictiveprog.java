package test;
import java.util.*;
public class Predictiveprog {
	 private static final Map<Integer, Double> cache = new HashMap<>();

	    public static double computeFutureValue(double initialAmount, double annualRate, int years) {
	        if (years == 0) {
	            return initialAmount;
	        }

	        if (cache.containsKey(years)) {
	            return cache.get(years);
	        }

	        double result = computeFutureValue(initialAmount * (1 + annualRate), annualRate, years - 1);
	        cache.put(years, result);

	        return result;
	    }


}
