/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry.laundry.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author HP
 */
public class Task4 {
    public static void main(String[] args) {
//        Given a sorted list of integers, square the elements and give the output in sorted order.
//                For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

        int [] arr =  {-9, -2, 0, 2, 3 };
        List<Integer> st = new ArrayList<>(); //Array list is been used to take care of the duplicate numbers

        for (int i = 0; i < arr.length; i++){
            int num = (int)Math.pow(arr[i],2);


            st.add(num);
        }
           Collections.sort(st); //use to sort method is use to sort the list of integers


        System.out.println(st);
    }
}
