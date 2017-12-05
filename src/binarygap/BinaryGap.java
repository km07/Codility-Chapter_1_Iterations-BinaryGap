/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarygap;



/**
 *
 * @author km07
 */
public class BinaryGap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Result = "+solution(1041));
    }
    
    private static int solution(int number){
        if(number >2147483647 || number <5){
            return 0;
        }
        String s = Integer.toBinaryString(number);
        int max = 0;
        int count = 0;
        boolean start = false;
        for(char c : s.toCharArray()) {
            if(c=='1'){
                if(start){
                    if(count>max){
                        max = count;
                    }
                    count = 0;
                }else{
                    start = true;
                }
            }else{
                if(start){
                    count++;
                }
            }
        }
        return max;
    } 
}
