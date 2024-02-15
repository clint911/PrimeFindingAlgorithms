package ClintonImplementations;

import java.util.ArrayList;
import java.util.List;

public class TrialDivision {
 public static List<Integer> generatePrimeNumbers(int n) {
  //Creating an array list of prime numbers
  List<Integer> primes = new ArrayList<>();
  for (int num = 2; num <= n; num++) {
       if (isPrime(num)) {
        primes.add(num);
       }
  }
  return  primes;
 }
 public static  boolean isPrime(int num) {
  if (num < 2) {
   return  false;
  }
  for (int i = 2; i < Math.sqrt(num); i++) {
   if (num %  i == 0) {
    return  false;
   }
  }
  return true;
 }
 public static void main(String[] args) {
  List<Integer> primeNumbers = generatePrimeNumbers(1000);
  System.out.println(primeNumbers);
 }
}
