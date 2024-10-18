/**
 * cigarParty
 */
public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend == true)
  {
    if(cigars >=40)
    {
      return true;
    }
  }
  else
  {
    if(cigars >=40 && cigars <=60)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  return false;
}



/**
 * dateFashion
 */
public int dateFashion(int you, int date) {
  if(date <= 2 || you <= 2)
  {
    return 0;
  }
  else if(date >= 8 || you >= 8)
  {
    return 2;
  }
  else
  {
   return 1;
  }
}


/**
 * squirrelPlay
 * I did this like 3 times before I got the == thing.
 */
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer==false)
  {
    if(temp>=60 && temp <=90)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  else
  {
    if(temp>=60 && temp <=100)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}


/**
 * caughtSpeeding
 * I hated this why is this a thing...It wouldn't read the true or false for the isBirthday 
 * if statment because I didn't do ==.
 */
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday==true)
  {
    if(speed < 66)
    {
      return 0;
    }
    else if(speed >85)
    {
      return 2;
    }
    else
    {
      return 1;
    }
  }
  else
  {
      if(speed < 61)
    {
      return 0;
    }
    else if(speed >80)
    {
      return 2;
    }
    else
    {
      return 1;
    }
  }
}


/**
 * sortaSum
 * This is a lot harder than it looked. At first it just returned 20 because I accidentally put always return 20...
 */
public int sortaSum(int a, int b) {
  int sum = a+b;
  if (sum >=10 && sum<=19)
  {
   return 20;
  }
  else
  {
    return sum;
  }
}
}
