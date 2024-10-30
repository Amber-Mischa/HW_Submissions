//alarmClock()
public String alarmClock(int day, boolean vacation) 
{
  if (vacation != true)
  {
    if (day ==6 || day ==0)
    {
      return "10:00";
    }
    else
    {
      return "7:00";
    }
  }
  else
  {
    if (day ==6 ||day ==0)
    {
      return "off";
    }
    else
    {
      return "10:00";
    }
  }
}


//in1To10
public boolean in1To10(int n, boolean outsideMode) 
{
  if (outsideMode == true)
  {
    if(n<=1 || n>=10)
    {
      return true;
    }
    return false;
  }
  else
  {
    if (n>=1 && n <=10)
    {
      return true;
    }
    return false;
  }
}


//old35()
public boolean old35(int n) 
{
  if ((n%3 == 0 && n%5 != 0) || (n%5 == 0 && n%3 != 0))
  {
    return true;
  }
  return false;
}
