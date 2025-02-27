import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;

public class NumberOperations {
	public static void main(String[] args) {
	
       ArrayList<Number> numbers = new ArrayList<Number>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));
       ArrayList<Number> old_numbers = (ArrayList<Number>)numbers.clone();
       
       byte a = 1; 
       short b = 3; 
       int c = 4;
       long f = 100L; 
       float d = 3.141f;
       double e = 5.5433d;    
       BigDecimal g = new BigDecimal("66.6");
       
       Collections.addAll(numbers,a, b, c, d, e, f, g);
       
       
       System.out.println("Всі числа: " + numbers);
       
       
       System.out.print("Виведення чисел у форматі цілих чисел: ");
       for(int i = 0; i < numbers.size(); i ++) {
    	   int comas = numbers.size() - i - 1;
   			if(comas > 0) {
   				System.out.print(numbers.get(i).intValue() + ", ");
   			}
   			else
   				System.out.print(numbers.get(i).intValue());
       }
       
       
       System.out.println("");
       
       
       System.out.print("Виведення чисел у форматі дробних чисел з 2ма знаками після коми (точки): ");
       for(int i = 0; i < numbers.size() ; i++ ) {
    	   int comas = numbers.size() - i - 1;
   				float t = numbers.get(i).floatValue();
   				if(comas > 0) {
   					System.out.printf("%.2f", t);
   					System.out.print(", ");
   				}
   				else
   					System.out.printf("%.2f", t);
	}
       
       System.out.println("");
       
       ArrayList<Byte> byte_numbers = new ArrayList<Byte>();
       ArrayList<Short> short_numbers = new ArrayList<Short>();
       ArrayList<Integer> int_numbers = new ArrayList<Integer>();
       ArrayList<Long> long_numbers = new ArrayList<Long>();
       ArrayList<Float> float_numbers = new ArrayList<Float>();
       ArrayList<Double> double_numbers = new ArrayList<Double>();
       ArrayList<BigDecimal> bigdecimal_numbers = new ArrayList<BigDecimal>();       
       for(Number num : numbers) {
           if (num instanceof Byte) {
               byte_numbers.add((Byte) num);
           } else if (num instanceof Short) {
               short_numbers.add((Short) num);
           } else if (num instanceof Integer) {
               int_numbers.add((Integer) num);
           } else if (num instanceof Long) {
               long_numbers.add((Long) num);
           } else if (num instanceof Float) {
               float_numbers.add((Float) num);
           } else if (num instanceof Double) {
               double_numbers.add((Double) num);
           } else if (num instanceof BigDecimal) {
               bigdecimal_numbers.add((BigDecimal) num);
           }
       }
       
       

       ArrayList<Integer> old_int_numbers = new ArrayList<Integer>();   
       for(Number num : old_numbers) {
    	   if (num instanceof Integer)
    		   old_int_numbers.add(num.intValue());
       }

}
}