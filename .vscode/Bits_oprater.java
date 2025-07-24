/*Bits opreaters */


class Bits_oprater {
    public static void main(String[] args) {
       int a = 4 ;
       int b= 6 ; 
       
       System.out.println("a&b"+":" +(a&b));
       System.out.println("a|b"+":" +(a|b));
       System.out.println("a~"+":" +( ~a));
       System.out.println("a^b"+":" +(a^b));

       /* Post and Pre increment opraters */

       int i = 7;

       System.out.println(++i);
       /*output is 8 */
       System.out.println(i++);
       /* output is 8 and i value is 9 */
       System.out.println(i--);
       /* output is 9 */
       System.out.println(--i);
       /* output is 7 and i is 7 */
       
    }
}