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
 * I got most of it to work but I didn't know if I needed the if statment 
 * for the words with less than 2 characters.
 **/
 


//withoutEnd
public String withoutEnd(String str) 
{
  return str.substring(1,str.length()-1);
}
