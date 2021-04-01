import com.company.geeksforgeeks.medium.Solutions;
import com.company.geeksforgeeks.utility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.BDDMockito.given;

public class SolutionTest {

    private final Solutions solutions = new Solutions();

    /**
     * How to check if given four points form a square
     */
    @Test
    public void q1() {
        Assertions.assertTrue(
                solutions.q1(Point.p1, Point.p2, Point.p3, Point.p4)
        );
    }

    /**
     * Check if a string can be obtained by rotating another string 2 places
     */
    @Test
    public void q2() {
        String str1 = "geeks";
        String str2 = "eksge";
        Assertions.assertTrue(
                solutions.q2(str1, str2)
        );
        String string1 = "amazon";
        String string2 = "onamaz";

        Assertions.assertTrue(
                solutions.q2(string1, string2)
        );
        String string11 = "amqazon";
        String string22 = "onpamaz";
        Assertions.assertFalse(
                solutions.q2(string11, string22)
        );
    }

    /**
     * Find the nearest smaller numbers on left side in an array
     */
    @Test
    public void q3() {
        int[] arr = {1, 3, 0, 2, 5};
        int[] expectedResponse = {-1, 1, -1, 0, 2};
        int[] response = solutions.q3(arr);
        Assertions.assertArrayEquals(expectedResponse, response);
    }

    /**
     * Find if two rectangles overlap
     */
    @Test
    public void q4() {
        String str1 = "geeks";
        String str2 = "eksge";
        //solutions.q2();
        fail();
        /*Assertions.assertFalse(
                solutions.q3(string11, string22)
        );*/
    }

    /**
     * Pair with given product | Set 1 (Find if any pair exists)
     */
    @Test
    public void q5() {
        int arr[] = {10, 20, 9, 40};
        int x = 400;

        Assertions.assertTrue(
                solutions.q5(arr, x)
        );
    }

    /**
     * Position of rightmost set bit
     * Difficulty Level : Medium
     * Last Updated : 01 Oct, 2020
     * Write a one line function to return position of first 1 from right to left, in binary representation of an Integer.
     * <p>
     * <p>
     * I/P    18,   Binary Representation 010010
     * O/P   2
     * I/P    19,   Binary Representation 010011
     * O/P   1
     */
    @Test
    public void q6() {
        int x = 18;
        Assertions.assertEquals("2", solutions.q6(x, 0, ""));
    }


    /**
     * Print all possible strings that can be made by placing spaces
     * Difficulty Level : Medium
     * Last Updated : 21 Oct, 2020
     * Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them.
     * <p>
     * Input:  str[] = "ABC"
     * Output: ABC
     * AB C
     * A BC
     * A B C
     */
    @Test
    public void q7() {
        String[] x = {"A", "B", "C"};
        solutions.q7(x);
    }

    /**
     * Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
     * <p>
     * Examples:
     * <p>
     * Input: 102
     * Output: 152
     * Explantion: All the digits which are '0' is replaced by '5'
     * <p>
     * Input: 1020
     * Output: 1525
     * Explantion: All the digits which are '0' is replaced by '5'
     */
    @Test
    public void q8() {
        int expectedValue = solutions.q8(1020);
        Assertions.assertEquals("1525", expectedValue + "");
    }

    /**
     * Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
     * Example 1
     * The matrix
     * 1 0
     * 0 0
     * should be changed to following
     * 1 1
     * 1 0
     * <p>
     * Example 2
     * The matrix
     * 0 0 0
     * 0 0 1
     * should be changed to following
     * 0 0 1
     * 1 1 1
     * <p>
     * Example 3
     * The matrix
     * 1 0 0 1
     * 0 0 1 0
     * 0 0 0 0
     * should be changed to following
     * 1 1 1 1
     * 1 1 1 1
     * 1 0 1 1
     */
    @Test
    public void q9() {
        int mat[][] = {{1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0},};
        int[][] expectedValue = solutions.q9(mat, 3, 4);
        CommonUtility.printMatrix(expectedValue, 3, 4);

    }

    /**
     * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
     * <p>
     * <p>
     * Array
     * <p>
     * Rotation of the above array by 2 will make array
     * <p>
     * <p>
     * ArrayRotation1
     */
    @Test
    public void q10() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int expected[] = {4, 5, 6, 1, 2, 3};
        int[] expectedValue = solutions.q10(arr, 3);
        Assertions.assertArrayEquals(expectedValue, expected);

    }

    /**
     * Build Lowest Number by Removing n digits from a given number
     * Difficulty Level : Hard
     * Last Updated : 04 Sep, 2019
     * Given a string ‘str’ of digits and an integer ‘n’, build the lowest possible number
     * by removing ‘n’ digits from the string and not changing the order of input digits.
     * Examples:
     * <p>
     * Input: str = "4925043", n = 3
     * Output: "2043"
     * <p>
     * Input: str = "765028321", n = 5
     * Input: str = "765028321", n = 5
     * Output: "0221"
     * <p>
     * Input: str = "121198", n = 2
     * Output: "1118"
     * <p>
     * // Approach
     * Rule if next number is bigger so remove next num
     * stack -- 4, 9
     */
    @Test
    public void q11() {
        String number = "4325043";
        String lowest = "2043";
        String expectedValue = solutions.q11(number, 3);
        Assertions.assertEquals(expectedValue, lowest);

    }


    /**
     * Calculate the angle between hour hand and minute hand
     * Difficulty Level : Easy
     * Last Updated : 29 Sep, 2020
     * This problem is known as Clock angle problem where we need to find angle between hands of an analog clock at a given time.
     * Examples:
     * <p>
     * Input:
     * h = 12:00
     * m = 30.00
     * Output:
     * 165 degree
     * <p>
     * Input:
     * h = 3.00
     * m = 30.00
     * Output:
     * hr ----> .5 degree in one min -- 15
     * min----> 6 degree in one min ---180 from 12
     * <p>
     * * h = 11.00  - 12
     * * m = 00.00
     * 30
     */
    @Test
    public void q12() {
        Assertions.assertEquals(75, solutions.q12(3, 30));
        Assertions.assertEquals(165, solutions.q12(12, 30));
        Assertions.assertEquals(32.5, solutions.q12(9, 55));

    }


    /**
     * Check if all bits of a number are set
     * Difficulty Level : Easy
     * Last Updated : 28 Jun, 2018
     * Given a number n. The problem is to check whether every bit in the binary representation of the given number is set or not. Here 0 <= n.
     * <p>
     * Examples :
     * <p>
     * Input : 7
     * Output : Yes
     * (7)10 = (111)2
     * <p>
     * Input : 14
     * 12348
     * 01011
     * Output : No
     */
    @Test
    public void q13() {
        Assertions.assertTrue(solutions.q171(7));
        Assertions.assertFalse(solutions.q171(14));
    }

    /**
     * Check if a given Binary Tree is SumTree
     * Difficulty Level : Medium
     * Last Updated : 18 Jan, 2021
     * Write a function that returns true if the given Binary Tree is SumTree else false.
     * A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes present in
     * its left subtree and right subtree.
     * An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.
     * <p>
     * Following is an example of SumTree.
     * <p>
     * 26
     * /   \
     * 10     3
     * /    \     \
     * 4      6      3
     */
    @Test
    public void q14() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);

        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);
        Assertions.assertTrue(solutions.q15(tree));
    }

    /**
     * Check if a number can be expressed as a^b | Set 2
     * Difficulty Level : Easy
     * Last Updated : 20 Nov, 2020
     * You have given a number n. Check if a number can be represented in the form of pow(a, b) (a^b).
     * <p>
     * Examples:
     * <p>
     * Input : 4
     * Output : Yes
     * 22 = 4
     * <p>
     * Input : 12
     * Output : No
     */
    @Test
    public void q15() {
        Assertions.assertTrue(solutions.q15(4));
        // Assertions.assertFalse(solutions.q16(7));
    }

    /**
     * Check if two trees are Mirror
     * <p>
     * <p>
     * Given two Binary Trees, write a function that returns true if two trees are mirror of each other,
     * else false. For example, the function should return true for following input trees.
     */
    @Test
    public void q16() {
        BinaryTree tree = new BinaryTree();
        Node a = new Node(1);
        Node b = new Node(1);
        a.left = new Node(2);
        a.right = new Node(3);
        a.left.left = new Node(4);
        a.left.right = new Node(5);

        b.left = new Node(3);
        b.right = new Node(2);
        b.right.left = new Node(5);
        b.right.right = new Node(4);
        Assertions.assertTrue(solutions.q16(a, b));
        // Assertions.assertFalse(solutions.q16(7));
    }

    /**
     * Count ‘d’ digit positive integers with 0 as a digit
     * Difficulty Level : Easy
     * Last Updated : 18 May, 2018
     * Given a number d, representing the number of digits of a positive integer. Find the total count of positive integer (consisting of d digits exactly) which have at-least one zero in them.
     * <p>
     * Examples:
     * <p>
     * Input : d = 1
     * Output : 0
     * There's no natural number of 1 digit that
     * contains a zero.
     * <p>
     * Input : d = 2
     * Output : 9
     * The numbers are, 10, 20, 30, 40, 50, 60,
     * 70, 80 and 90.
     */
    @Test
    public void q17() {
        Assertions.assertEquals(2439, solutions.q17(4));
    }


    /**
     * Count number of bits to be flipped to convert A to B
     * <p>
     * Last Updated : 23 Apr, 2020
     * Given two numbers ‘a’ and b’. Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.
     * Example :
     * <p>
     * Input : a = 10, b = 20
     * Output : 4
     * Binary representation of a is 00001010
     * Binary representation of b is 00010100
     * We need to flip highlighted four bits in a
     * to make it b.
     * <p>
     * Input : a = 7, b = 10
     * Output : 3
     * Binary representation of a is 00000111
     * Binary representation of b is 00001010
     * We need to flip highlighted three bits in a
     * to make it b.
     */
    @Test
    public void q18() {
        Assertions.assertEquals(4, solutions.q18(10, 20));
    }

    /**
     * Count number of occurrences (or frequency) in a sorted array
     * Difficulty Level : Medium
     * Last Updated : 10 Sep, 2018
     * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)
     * Examples:
     * <p>
     * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
     * Output: 4 // x (or 2) occurs 4 times in arr[]
     * <p>
     * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
     * Output: 1
     * <p>
     * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
     * Output: 2
     * <p>
     * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
     * Output: -1 // 4 doesn't occur in arr[]
     */
    @Test
    public void q19() {
        int arr[] = {1, 1, 2, 2, 2, 2,
                3, 4, 7, 8, 8};
        Assertions.assertEquals(4, solutions.q19(arr, 2));
    }

    /**
     * Count all possible groups of size 2 or 3 that have sum as multiple of 3
     * Difficulty Level : Medium
     * Last Updated : 19 Dec, 2018
     * Given an unsorted integer (positive values only) array of size ‘n’, we can form a group of two or three, the group should be such that the sum of all elements in that group is a multiple of 3. Count all possible number of groups that can be generated in this way.
     * Examples:
     * <p>
     * Input: arr[] = {3, 6, 7, 2, 9}
     * Output: 8
     * // Groups are {3,6}, {3,9}, {9,6}, {7,2}, {3,6,9},
     * //            {3,7,2}, {7,2,6}, {7,2,9}
     * <p>
     * <p>
     * Input: arr[] = {2, 1, 3, 4}
     * Output: 4
     * // Groups are {2,1}, {2,4}, {2,1,3}, {2,4,3}
     * <p>
     * Will solve with combination
     */
    @Test
    public void q20() {
        int arr[] = {1, 1, 2, 2, 2, 2,
                3, 4, 7, 8, 8};
        Assertions.assertEquals(4, solutions.q20(arr, 2));
    }

    /**
     * Count all possible paths from top left to bottom right of a mXn matrix
     * Difficulty Level : Medium
     * Last Updated : 28 Aug, 2020
     * The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down
     * <p>
     * Examples :
     * <p>
     * Input :  m = 2, n = 2;
     * Output : 2
     * There are two paths
     * (0, 0) -> (0, 1) -> (1, 1)
     * (0, 0) -> (1, 0) -> (1, 1)
     * <p>
     * Input :  m = 2, n = 3;
     * Output : 3
     * There are three paths
     * (0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
     * (0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
     * (0, 0) -> (1, 0) -> (1, 1) -> (1, 2)
     */
    @Test
    public void q21() {
        Assertions.assertEquals(3, solutions.q21(1, 1, 2, 3));
        Assertions.assertEquals(3, solutions.q211(2, 3));

    }

    /**
     * Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value.
     * Expected Time Complexity is O(n2).
     * <p>
     * Examples:
     * <p>
     * Input : arr[] = {-2, 0, 1, 3}
     * sum = 2.
     * Output : 2
     * Explanation :  Below are triplets with sum less than 2
     * (-2, 0, 1) and (-2, 0, 3)
     * <p>
     * Input : arr[] = {5, 1, 3, 4, 7}
     * sum = 12.
     * Output : 4
     * Explanation :  Below are triplets with sum less than 12
     * (1, 3, 4), (1, 3, 5), (1, 3, 7) and
     * (1, 4, 5)
     */
    @Test
    public void q22() {
        Integer arr[] = {5, 1, 3, 4, 7};
        Assertions.assertEquals(4, solutions.q22(arr, 12));
    }

    /**
     * Count words that appear exactly two times in an array of words
     * Difficulty Level : Easy
     * Last Updated : 06 Nov, 2020
     * Given an array of n words. Some words are repeated twice, we need count such words.
     * Examples:
     * <p>
     * Input : s[] = {"hate", "love", "peace", "love",
     * "peace", "hate", "love", "peace",
     * "love", "peace"};
     * Output : 1
     * There is only one word "hate" that appears twice
     * <p>
     * Input : s[] = {"Om", "Om", "Shankar", "Tripathi",
     * "Tom", "Jerry", "Jerry"};
     * Output : 2
     * There are two words "Om" and "Jerry" that appear
     * twice.
     * Source : Amazon Interview
     */
    @Test
    public void q23() {
        String arr[] = {"hate", "love", "peace", "love",
                "peace", "hate", "love", "peace",
                "love", "peace"};
        Assertions.assertEquals(1, solutions.q23(arr, 2));
    }


    /**
     * Equilibrium index of an array is an index such that the sum of elements
     * at lower indexes is equal to the sum of elements at higher indexes.
     * For example, in an array A:
     * <p>
     * Example :
     * <p>
     * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
     * Output: 3
     * 3 is an equilibrium index, because:
     * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
     * <p>
     * Input: A[] = {1, 2, 3}
     * Output: -1
     */
    @Test
    public void q24() {
        Integer arr[] = {-7, 1, 5, 2, -4, 3, 0};
        Assertions.assertEquals(3, solutions.q24(arr));
        Assertions.assertEquals(3, solutions.q24(new Integer[]{1, 7, 3, 6, 5, 6}));
    }

    /**
     * Input : arr[] = {1, 0, 1, 0, 0, 1, 0, 1,
     * 1, 0, 1, 1, 0, 0, 1}
     * <p>
     * maxDistSoFar 0 -1, 2
     * maxDistNow 0 - 1,0, 1, 2
     * solution
     * Output : 1
     * To convert the whole array into 1s, one iteration
     * is required. Between indexes i=2 and i=5, the zero
     * at i=3 would be converted to '1' due to its neighbours
     * at i=2 similarly the zero at i=4 would be converted
     * into '1' due to its neighbor at i=5, all this can
     * be done in a single iteration. Similarly all 0's can
     * be converted to 1 in single iteration.
     * <p>
     * Input : arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0,
     * 1, 1, 1, 1, 0, 0, 0, 1}
     * Output : 2
     */
    @Test
    public void q25() {
        Integer arr[] = {1, 0, 1, 0, 0, 1, 0, 1,
                1, 0, 1, 1, 0, 0, 1};
        Assertions.assertEquals(1, solutions.q25(arr));
    }

    /**
     * Find first and last positions of an element in a sorted array
     * Difficulty Level : Easy
     * Last Updated : 28 Dec, 2020
     * Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.
     * Examples:
     * <p>
     * Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
     * x = 5
     * Output : First Occurrence = 2
     * Last Occurrence = 5
     * <p>
     * Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }
     * x = 7
     * Output : First Occurrence = 6
     * Last Occurrence = 6
     */
    @Test
    public void q26() {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        Assertions.assertArrayEquals(new int[]{2, 5}, solutions.q26(arr, 5));
    }

    /**
     * iven an array of integers, find all combination of four elements in the
     * array whose sum is equal to a given value X.
     * For example, if the given array is {10, 2, 3, 4, 5, 9, 7, 8} and
     * X = 23, then your function should print “3 5 7 8” (3 + 5 + 7 + 8 = 23).
     */

    @Test
    public void q27() {
        Integer arr[] = {10, 20, 30, 40, 1, 2};
        int X = 91;
        solutions.q27(arr, X);
    }

    /**
     * Given a sorted array consisting 0’s and 1’s. The problem is to find
     * the index of first ‘1’ in the sorted array. It could be possible that the array consists of only 0’s or only 1’s. If 1’s are not present in the array then print “-1”.
     * <p>
     * Examples :
     * <p>
     * Input : arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
     * Output : 6
     * The index of first 1 in the array is 6.
     * <p>
     * Input : arr[] = {0, 0, 0, 0}
     * Output : -1
     * 1's are not present in the array.
     */
    @Test
    public void q28() {
        int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        Assertions.assertEquals(6, solutions.q28(arr));
    }

    /**
     * Find the Number Occurring Odd Number of Times
     * Difficulty Level : Easy
     * Last Updated : 09 Mar, 2021
     * Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.
     * Examples :
     * <p>
     * Input : arr = {1, 2, 3, 2, 3, 1, 3}
     * Output : 3
     * <p>
     * Input : arr = {5, 7, 2, 7, 5, 2, 5}
     * Output : 5
     */
    @Test
    public void q38() {
        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        Assertions.assertEquals(3, solutions.q38(arr));
    }

    /**
     * Find two prime numbers with given sum
     * Difficulty Level : Medium
     * Last Updated : 18 Apr, 2019
     * Given an even number (greater than 2 ), print two prime numbers whose sum will be equal to given number. There may be several combinations possible. Print only first such pair.
     * <p>
     * An interesting point is, a solution always exist according to Goldbach’s conjecture.
     * <p>
     * Examples :
     * <p>
     * Input: n = 74
     * Output: 3 71
     * <p>
     * Input : n = 1024
     * Output: 3 1021
     * <p>
     * Input: n = 66
     * Output: 5 61
     * <p>
     * Input: n = 9990
     * Output: 17 9973
     */
    @Test
    public void q39() {
        Assertions.assertArrayEquals(new int[]{3, 71}, solutions.q39(74));
    }


    @Test
    public void q40() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        solutions.printPaths(tree.root);
    }

    /**
     * Maximum sum such that no two elements are adjacent
     * Difficulty Level : Medium
     * Last Updated : 26 Jul, 2019
     * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.
     * <p>
     * Examples :
     * <p>
     * Input : arr[] = {5, 5, 10, 100, 10, 5}
     * Output : 110
     * <p>
     * Input : arr[] = {1, 2, 3}
     * Output : 4
     * <p>
     * Input : arr[] = {1, 20, 3}
     * Output : 20
     */
    @Test
    public void q41() {
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        Assertions.assertEquals(110, solutions.q41(arr));
    }

    /**
     * Rearrange positive and negative numbers in O(n) time and O(1) extra space
     * Difficulty Level : Medium
     * Last Updated : 09 Nov, 2020
     * An array contains both positive and negative numbers in random order. Rearrange the array elements so
     * that positive and negative numbers are placed alternatively. Number of positive and negative numbers
     * need not be equal. If there are more positive numbers they appear at the end of the array. If there
     * are more negative numbers, they too appear in the end of the array.
     * <p>
     * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be
     * [9, -7, 8, -3, 5, -1, 2, 4, 6]
     * <p>
     * Note: The partition process changes relative order of elements. I.e. the order of the appearance of
     * elements is not maintained with this approach. See this for maintaining order of appearance of elements
     * in this problem.
     * <p>
     * The solution is to first separate positive and negative numbers using partition process of QuickSort.
     * In the partition process, consider 0 as value of pivot element so that all negative numbers are placed
     * before positive numbers. Once negative and positive numbers are separated, we start from the first negative
     * number and first positive number,
     * and swap every alternate negative number with next positive number.
     */
    @Test
    public void q42() {
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        solutions.q42(arr)
        ;

    }

    /**
     * Reverse an array upto a given position
     * Difficulty Level : Easy
     * Last Updated : 14 Oct, 2019
     * Given an array arr[] and a position in array, k. Write a function name reverse (a[], k)
     * such that it reverses subarray arr[0..k-1]. Extra space used should be O(1) and
     * time complexity should be O(k).
     * <p>
     * Example:
     * <p>
     * Input:
     * arr[] = {1, 2, 3, 4, 5, 6}
     * k = 4
     * <p>
     * Output:
     * arr[] = {4, 3, 2, 1, 5, 6}
     * We strongly recommend you to minimize your browser and try this yourself first.
     * <p>
     * Below is the implementation for the same.
     */
    @Test
    public void q56() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int expected[] = {4, 3, 2, 1, 5, 6};
        Assertions.assertArrayEquals(expected, solutions.q56(arr, 4));
    }

    @Test
    public void q57() {
        Assertions.assertEquals("w4a3d1e1x6", solutions.q57("wwwwaaadexxxxxx"));
    }


    @Test
    public void testGS() {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 0, 0, 1),
                Arrays.asList(0, 1, 1, 1),
                Arrays.asList(1, 0, 0, 1)
        );


        int i = solutions.countConnections(matrix);
        assertEquals(8, i);
    }


    /**
     * Tiling Problem
     * Difficulty Level : Easy
     * Last Updated : 19 Dec, 2020
     * Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to
     * tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally i.e.,
     * as a 1 x 2 tile or vertically i.e., as 2 x 1 tile.
     *
     * Examples:
     *
     * Input: n = 4
     *
     * Output: 3
     *
     * Explanation:
     *

     * For a 2 x 4 board, there are 3 ways
     *
     * All 4 vertical
     * All 4 horizontal
     * 2 vertical and 2 horizontal
     * Input: n = 3
     *
     * Output: 2
     *
     * Explanation:
     *
     * We need 2 tiles to tile the board of size  2 x 3.
     *
     * We can tile the board using following ways
     *
     * Place all 3 tiles vertically.
     * Place 1 tile vertically and remaining 2 tiles horizontally.
     */
    @Test
    public void tilingProblem() {

        int i = solutions.tilingProblem(3);
        assertEquals(2, i);
    }

    @Test
    public void heightOfTree() {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right.left = new Node(10);
        tree.root.left.right = new Node(5);

        int i = solutions.heightOfTree(tree.root);
        assertEquals(4, i);
    }


}
