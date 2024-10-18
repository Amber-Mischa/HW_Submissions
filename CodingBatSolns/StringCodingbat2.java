//makeOutWord
public String extraEnd(String str) 
{
  int lengthMissingTwo = str.length()-2;
  return str.substring(lengthMissingTwo) + str.substring(lengthMissingTwo) + str.substring(lengthMissingTwo);
}
//extraEnd
public String extraEnd(String str) 
{
  int lengthMissingTwo = str.length()-2;
  return str.substring(lengthMissingTwo) + str.substring(lengthMissingTwo) + str.substring(lengthMissingTwo);
}

/**
 * firstTwo
 * I got most of it to work at first but I didn't know about the if statement. I both hate and love if statments.
 **/
 public String firstTwo(String str) {
  int length = str.length();
  if(length > 2)
  {
    return str.substring(0,2);
  }
  else
  {
    return str;
  }
}


//withoutEnd
public String withoutEnd(String str) 
{
  return str.substring(1,str.length()-1);
}
