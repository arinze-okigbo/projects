class IntegerArrayHandler {
    private Integer[] numbers;

    public IntegerArrayHandler(Integer[] numbers) {
        this.numbers = numbers;
    }

    public int getSum() {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}

class DoubleArrayHandler {
    private Double[] numbers;

    public DoubleArrayHandler(Double[] numbers) {
        this.numbers = numbers;
    }

    public double getSum() {
        double sum = 0.0;
        for (Double num : numbers) {
            sum += num;
        }
        return sum;
    }
}

class GenericArrayHandler<T> {
    private T[] numbers;

    public GenericArrayHandler(T[] numbers) {
        this.numbers = numbers;
    }

    // Generic method to calculate sum
    public double getSum() {
        double sum = 0.0;
        for (T num : numbers) {
            if (num instanceof Integer) {
                sum += (Integer) num;
            } else if (num instanceof Double) {
                sum += (Double) num;
            }
        }
        return sum;
    }

    // Generic method to find maximum value
    public T getMax() {
        T max = numbers[0];
        for (T element : numbers) {
            if ((max instanceof Integer) && (element instanceof Integer)) {
                if ((Integer) element > (Integer) max) {
                    max = element;
                }
            } else if ((max instanceof Double) && (element instanceof Double)) {
                if ((Double) element > (Double) max) {
                    max = element;
                }
            }
        }
        return max;
    }


	public T getSecondLargest() {
        T max = numbers[0];
        T second = numbers[0];
        for (T element : numbers) {
            if ((max instanceof Integer) && (element instanceof Integer)) {
                if ((Integer) element > (Integer) max) {
                	second = max;
                    max = element;
                }
            } else if ((max instanceof Double) && (element instanceof Double)) {
                if ((Double) element > (Double) max) {
                	second = max;
                    max = element;
                }
            }
        }
        return second;
    }

}

public class Generics{
    public static void main(String[] args) {
        Integer[] intNumbers = {3, 10, 4, 1, 15, 9};
        Double[] doubleNumbers = {3.1, 2.4, 5.6, 1.9};

        // Testing the non-generic approach
        IntegerArrayHandler intArrayHandler = new IntegerArrayHandler(intNumbers);
        DoubleArrayHandler doubleArrayHandler = new DoubleArrayHandler(doubleNumbers);
        System.out.println("Sum of Integer Array(non-generic): " + intArrayHandler.getSum());
        System.out.println("Sum of Double Array(non-generic): " + doubleArrayHandler.getSum());

        //Testing the generic appraoch
        GenericArrayHandler<Integer> intHandler = new GenericArrayHandler<>(intNumbers);
        GenericArrayHandler<Double> doubleHandler = new GenericArrayHandler<>(doubleNumbers);
        System.out.println("Sum of Integer Array(generic): " + intHandler.getSum());
        System.out.println("Sum of Double Array(generic): " + doubleHandler.getSum());

        //Testing generic method getMax() 
        System.out.println("Max of Integer Array(generic): " + intHandler.getMax());
        System.out.println("Max of Double Array(generic): " + doubleHandler.getMax());

        //Testing generic method getSecondLargest() 
        System.out.println("2nd Largest of Integer Array(generic): " + intHandler.getSecondLargest());
        System.out.println("2nd largest of Double Array(generic): " + doubleHandler.getSecondLargest());
    }
}
