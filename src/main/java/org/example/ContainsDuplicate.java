import java.util.HashSet;

class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 2};
        System.out.println(solution.containsDuplicate(nums)); // Output: true
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums) {
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}