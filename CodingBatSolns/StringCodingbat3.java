//doubleChar
public String doubleChar(String str) {
  String doubleChar = "";
  String newStr = "";
  for(int i = 0; i<str.length(); i++)
  {
    doubleChar = str.substring(i,i+1) +str.substring(i,i+1);
    newStr = newStr + doubleChar;
  }
  return newStr;
}
