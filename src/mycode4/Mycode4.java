/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode4;

/**
 *
 * @author LENOVO
 */
public class Mycode4 {

    /**
     * @param args the command line arguments
     */
   

 public static void main(String[] args) {
String[] arr = { "L", "M", "N","O" }; //line l1
    arr[0] = arr[1]; //line l2
    arr[1] = "P"; //line l3
    for (String str : arr) {
        System.out.print(str + " ");
    }}
}
    

