import java.math.*;

public class temp {
    public static void main(String[] args) {
        BigDecimal s1, s2, s3, s4, s5, s6, s7;
        BigDecimal t1, t2, t3, t4, t5, t6, t7;

        BigDecimal t = new BigDecimal("123.12345678");
        
        s1 = t.divide(BigDecimal.valueOf(1),4,0);
        s2 = t.divide(BigDecimal.valueOf(1),4,1);
        s3 = t.divide(BigDecimal.valueOf(1),4,2);
        s4 = t.divide(BigDecimal.valueOf(1),4,3);
        s5 = t.divide(BigDecimal.valueOf(1),4,4);
        s6 = t.divide(BigDecimal.valueOf(1),4,5);
        s7 = t.divide(BigDecimal.valueOf(1),4,6);
        
        t1 = t.divide(BigDecimal.valueOf(1),5,0);
        t2 = t.divide(BigDecimal.valueOf(1),5,1);
        t3 = t.divide(BigDecimal.valueOf(1),5,2);
        t4 = t.divide(BigDecimal.valueOf(1),5,3);
        t5 = t.divide(BigDecimal.valueOf(1),5,4);
        t6 = t.divide(BigDecimal.valueOf(1),5,5);
        t7 = t.divide(BigDecimal.valueOf(1),5,6);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
    }
}

