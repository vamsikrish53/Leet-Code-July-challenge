// https://leetcode.com/problems/single-number-iii/

public class Solution {
            public int[] singleNumber(int[] nums) {
                HashSet<Integer> h = new HashSet<>();
                for(int n : nums){
                    if(h.contains(n)) h.remove(n);
                    else h.add(n);
                }
                Object[] t =h.toArray();
                int[] result = new int[2];
                result[0] = (int)t[0];
                result[1] = (int)t[1];
                return result;
            }
        }
