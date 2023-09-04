int* twoSum(int* nums, int numsSize, int target, int* returnSize){
     int t;
    returnSize = (int *)malloc(2 * sizeof(int));

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = i + 1; j < numsSize; j++)
        {
            t = nums[i]+nums[j];
            if(t==target){
                returnSize[0]=i;
                returnSize[1]=j;
                
            }
        }
    }

    return returnSize;
}