//firstLast6()
public boolean firstLast6(int[] nums) {
  if(nums[nums.length-1] == 6)
  {
    return true;
  }
  else if(nums[0] == 6)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sameFirstLast()
public boolean sameFirstLast(int[] nums) {
  if(nums.length >=1)
  {
    if (nums[0] == nums[nums.length-1])
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


//makePi()
public int[] makePi() {
  int[] piArr = {3, 1, 4};
  return piArr;
}

//commonEnd()
public boolean commonEnd(int[] a, int[] b) {
  if(a[a.length-1] == b[b.length-1])
  {
    return true;
  }
  else if (a[0] == b[0])
  {
    return true;
  }
  else
  {
    return false;
  }
}

//sum3()
public int sum3(int[] nums) {
  int sum = nums[0] + nums[1] + nums[2];
  return sum;
}
