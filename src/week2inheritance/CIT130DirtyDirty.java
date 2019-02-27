/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2inheritance;

/**
 *
 * @author douglas.whalen554
 */
public class CIT130DirtyDirty {


     
    public static void main(String[] args) {
         
// array to sum
int[] nums = {4,77,44,22,2};
int total = 0;

for(int tracker = 0; tracker < nums.length; tracker++) {
	total = total + nums[tracker];
}
System.out.println(total);

 } // close main

} // close class