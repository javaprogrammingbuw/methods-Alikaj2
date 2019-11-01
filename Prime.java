public class Prime {
    public static void main(String[] args) {
        int number = 11;
        int number2 = 9;
        boolean result = isPrime(number);
        System.out.println(result);
        int j = findDoublette(number2);
        System.out.println("Doubblet are " + j + " and " + (j+2));
    }

    //Method checking if number is prime
    public static boolean isPrime (int number) {
        boolean status = false;
        for (int i = 3; i<number; i++ ){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Method finds the first doublette
    public static int findDoublette (int number2) {
        for (int j= number2; j < Integer.MAX_VALUE ; j++ ) {
            if (isPrime(j) && isPrime(j+2)) {
                return j;
            }
        }

        return -1;
    }
		
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
		
	
}
