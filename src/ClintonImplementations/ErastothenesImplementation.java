package ClintonImplementations;
/*
 *Create a boolean array say from one to the max no(1 - 30) in our case
 * Next, find the sqrt(maxNo) and store in variable
 * Then set 1 to false, 2, 3 to true and start checking if the next nos are multiples of the already found primes
 * say, and set them to false, then go back to your number, move next, find if it's set to true or false, or if it's
 * a multiple set to false, move to next one, if not multiple is prime and then set it to true and continue with the
 * previous steps
 */
import java.util.*;
public class ErastothenesImplementation {
 public  static  List<Integer> sieveOfEratosthenes(int n) {
  //Creating a boolean array and initializing all values to true
  boolean[] isPrime = new boolean[n +1];
  Arrays.fill(isPrime, true);

  //0 and 1 are not prime nos so we mark them as false
  isPrime[0] = isPrime[1] = false;

  //start with the first prime number which is 2
  int p = 2;

  while (p * p <= n) {
   //If isPrime[p] is not changed then it is a prime number
   if (isPrime[p]) {
    //update all multiples of p
    for (int i = p * p; i <= n; i+= p) {
     isPrime[i] = false;
    }
   }
   //Move the next prime number
   p++;
  }
  //Collect all prime numbers into a list
  List<Integer> primes = new ArrayList<>();
  for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
       primes.add(i);
      }
  }
  return primes;
 }
public static void main(String[] args) {
  int limit = 30;
  List<Integer> primeNumbers = sieveOfEratosthenes(limit);
  System.out.println(primeNumbers);
}













}
