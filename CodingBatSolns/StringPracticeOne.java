//helloName code
public String helloName(String name) {
  return "Hello "+name+"!";
  //forgot to add the ! and the space after Hello to make it give "Hello (name)!" initially
  //worked out in the end (also tried making a main method at first, which was a pain...)
}

//makeAbba
public String makeAbba(String a, String b) {
  return a+b+b+a;
  //easy without any spaces
}

//makeTags
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"</"+tag+">";
  //kinda complicated with all the different components 
}


//firsthalf
public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
  /* knew I needed a substring couldn't figure out how to get half
   * 3 doesn't work cause it isn't always 6. And 1/2 doesn't even register as a proper number to use
   * str.length just printed out the whole string
   * tried starting with a different number and it printed the rest of the word
   * finally tried using str.length/2 and that worked. 
   * Why was that so difficult to think of????
   */
}

