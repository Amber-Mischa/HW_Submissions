//factorial
public int factorial(int n) {
  int pro = n;
  if(n ==1)
  {
    return n*1;
  }
  else
  {
    return n*=factorial(n-1);
  }
}

//bunnyEars
public int bunnyEars(int bunnies) {
  int ears =0;
  if(bunnies ==0)
  {
    return ears;
  }
  else
  {
    return bunnyEars(bunnies-1)+2;
  }
}

//fibonacci
public int fibonacci(int n) {
  int fib = 0;
  if(n == 0)
  {
    return fib;
  }
  else if(n==1)
  {
    return fibonacci(n-1)+1;
  }
  else
  {
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
