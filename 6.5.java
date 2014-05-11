//cci150 6.5

typical worst case balancing problem.

say worst case is n, after first try worst case
should be n-1.

now we pick floor k, if egg breaks then worst case
is 1+k-1 which is k, so f(n)=k and f(n-k)=k-1

the most balanced strategy is the using the same
strategy, thus if in the first try the egg doesnt
break we should choose floor k+k-1. in this way,
each time the egg doesnt break we go up 1 less
floors than the previous move, and we get this 
series:

> k, k-1, k-2, ..., 3, 2, 1

the sum `(k+1)*k/2` should be greater for equal to
100. the min int of k is 14

conclusion:

each time we go up 14, 13, 12, 11, ... floors till the
first egg breaks then we can guarrantee the worst case
to be 14 tries.
