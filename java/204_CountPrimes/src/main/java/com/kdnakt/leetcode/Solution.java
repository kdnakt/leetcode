package com.kdnakt.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * Constraints:
 * 0 <= n <= 5 * 10 ^ 6
 */
public class Solution {

    public int countPrimes(int n) {
        if (n  < 2) return 0;
        int res = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i, primes)) {
                res++;
                primes.add(i);
            }
        }
        return res;
    }

    boolean isPrime(int i, List<Integer> primes) {
        for (Integer p : primes) {
            if (i % p == 0) return false;
        }
        return true;
    }
}
