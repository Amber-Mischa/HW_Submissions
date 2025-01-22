//rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int[] copyNums = new int[3];
  copyNums[2] = nums[0];
  copyNums[1] = nums[2];
  copyNums[0] = nums[1];
  return copyNums;
}

//reverse3
public int[] reverse3(int[] nums) {
  int[] copyNums = new int[3];
  copyNums[0] = nums[2];
  copyNums[1] = nums[1];
  copyNums[2] = nums[0];
  return copyNums;
}

//maxEnd3
public int[] maxEnd3(int[] nums) {
  int[] copyNums = new int[3];
  if(nums[0] < nums[2])
  {
    for(int i =0; i<copyNums.length; i++)
    {
      copyNums[i] = nums[2];
    }
    
  }
  else
  {
    for(int i =0; i<copyNums.length; i++)
    {
      copyNums[i] = nums[0];
    }
    
  }
  return copyNums;
}

//sum2
public int sum2(int[] nums) {
  int[] copyNums = new int[nums.length];
  if(copyNums.length >=2)
  {
    int sum = nums[0] + nums[1];
    return sum;

  }
  else if(copyNums.length == 0)
  {
    return 0;
  }
  else
  {
    int singleSum = nums[0];
    return singleSum;
  }
}

//middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] newArr = new int[2];
  newArr[0] = a[1];
  newArr[1] = b[1];
  return newArr;
}

//makeEnds
public int[] makeEnds(int[] nums) {
  int[] newNums = new int[2];
  newNums[0] = nums[0];
  newNums[1] = nums[nums.length-1];
  return newNums;
}
