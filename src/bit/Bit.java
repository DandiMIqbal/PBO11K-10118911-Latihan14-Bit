/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60;/* 60 = 0011 1100 */
int b = 13;/* 13 = 0000 1101 */
int c = 0;
c = a & b;
/* 12 = 0000 1101 */
System.out.println("a & b = " + c);
c = a | b;
/* 12 = 0011 1101 */
System.out.println("a | b = " + c);
c = a ^ b;
/* 12 = 0011 0001 */
System.out.println("a ^ b = " + c);
c = ~a;
/* 12 = 1100 0011 */
System.out.println("~a = " + c);
c = a << 2;
/* 12 = 1101 0000 */
System.out.println("a << 2 = " + c);
c = a >> 2;
/* 12 = 0000 1111 */
System.out.println("a >> 2 = " + c);
    }
    
}
