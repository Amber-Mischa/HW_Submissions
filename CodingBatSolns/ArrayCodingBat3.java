//has23
public boolean has23(int[] nums) {
  int[] copyNums = nums;
  if(copyNums[1] == 2 || copyNums[1]==3)
  {
    return true;
  }
  else if (copyNums[0] == 2 || copyNums[0] ==3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//no23
public boolean no23(int[] nums) {
  int[] copyNums = nums;
  if(copyNums[1] == 2 || copyNums[1]==3)
  {
    return false;
  }
  else if (copyNums[0] == 2 || copyNums[0] ==3)
  {
    return false;
  }
  else
  {
    return true;
  }

}

//makeLast
public int[] makeLast(int[] nums) {
  int[] copyNums = new int[nums.length*2];
  copyNums[copyNums.length-1] = nums[nums.length-1];
  return copyNums;
}

//double23
public boolean double23(int[] nums) {
  int[] copyNums = nums;
  if(copyNums.length == 2)
  {
    if(copyNums[0] == 2 && copyNums[copyNums.length-1] ==2)
    {
      return true;
    }
    else if(copyNums[0] == 3 && copyNums[copyNums.length-1] == 3)
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
    return false;
  }
  
}

//fix23
public int[] fix23(int[] nums) {
  int[] copyNums = new int[nums.length];
  for(int i = 0; i<copyNums.length; i++)
  {
    copyNums[i] = nums[i];
  }
  for(int j = 0; j<copyNums.length; j++)
  {
    if(copyNums[j] ==2) 
    {
      if(copyNums[j+1] == 3)
      {
        copyNums[j+1] = 0;
      }
      
    }
  }
  return copyNums;
}

//start1
public int start1(int[] a, int[] b) {
  int[] copyA = a;
  int[] copyB = b;
  int count = 0;
  if(copyA.length >=1)
  {
    if(copyA[0] == 1)
    {
      count++;
    }
  }
  if(copyB.length >=1)
  {
    if(copyB[0] ==1)
    {
      count++;
    }
  }
  return count;
}

//biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  int[] copyA = a;
  int[] copyB = b;
  int sumA = copyA[0] + copyA[1];
  int sumB = copyB[0] + copyB[1];
  if(sumB > sumA)
  {
    return copyB;
  }
  else
  {
    return copyA;
  }
}

//makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] newNums = new int[2];
  int[] copyNums = nums;
  
  if(copyNums.length == 2)
  {
    return copyNums;
  }
  else
  {
    int half = (copyNums.length/2)-1;
    newNums[0] = copyNums[half];
    newNums[1] = copyNums[half+1];
    return newNums;
  }
}

//plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] combineAB = new int[4];
  for(int i = 0; i<2; i++)
  {
    combineAB[i] = a[i];
  }
  for(int j = 0; j<2; j++)
  {
    combineAB[j+2] = b[j];
  }
  return combineAB;
}

//swapEnds
public int[] plusTwo(int[] a, int[] b) {
  int[] combineAB = new int[4];
  for(int i = 0; i<2; i++)
  {
    combineAB[i] = a[i];
  }
  for(int j = 0; j<2; j++)
  {
    combineAB[j+2] = b[j];
  }
  return combineAB;
}

//midThree
//I have no idea how this works...
public int[] midThree(int[] nums) {
  int[] copyNums = nums;
  int[] mid = new int[3];
  int half = copyNums.length/2;
  if(copyNums.length == 3)
  {
    return copyNums;
  }
  else
  {
    mid[1] = copyNums[half];
    mid[2] = copyNums[half+1];
    mid[0] = copyNums[half-1];
    return mid;
  }
}

//maxTriple
public int maxTriple(int[] nums) {
  int[] copyNums = nums;
  int maxNum = 0;
  int half = copyNums.length/2;
  if(copyNums[0] > copyNums[copyNums.length-1] && copyNums[0] > copyNums[half])
  {
    maxNum = copyNums[0];
  }
  else if(copyNums[half] > copyNums[copyNums.length-1] && copyNums[half] > copyNums[0])
  {
    maxNum = copyNums[half];
  }
  else if(copyNums[copyNums.length-1] > copyNums[0] && copyNums[copyNums.length-1] > copyNums[half])
  {
    maxNum = copyNums[copyNums.length-1];
  }
  return maxNum;
}

//frontPiece
public int[] frontPiece(int[] nums) {
  int[] copyNums = nums;
  int[] firstTwo = new int[2];
  if(copyNums.length <=2)
  {
    return copyNums;
  }
  else
  {
    for(int i = 0; i <firstTwo.length; i++)
    {
      firstTwo[i] = copyNums[i];
    }
    return firstTwo;
  }
}

//unlucky1
//I hate this.
public boolean unlucky1(int[] nums) {
  int[] copyNums = nums;
  boolean check = false;
  if(copyNums.length >1)
  {
    for(int i = 0; i < 2; i++)
    {
      if(copyNums[i] == 1)
      {
        if(copyNums[i+1] == 3)
        {
          check = true;
        }
      }
    }
    if(copyNums.length > 2)
    {
      for(int j = copyNums.length-2; j < copyNums.length-1; j++ )
    {
      if(copyNums[j] == 1)
      {
        if(copyNums[j+1] == 3)
        {
          check = true;
        }
      }
    }
    }
    
  }  
  return check;
}
