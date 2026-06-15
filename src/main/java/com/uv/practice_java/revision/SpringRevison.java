package com.uv.practice_java.revision;
public class SpringRevison {
    public static void main(String[] args) {
//       calling garbage collector but not guaranty
        System.gc();

        String name="ram";
        String s1 = new String("ram");
        String s2 = s1;
        String s3 = s1.intern();
        System.out.println(s2==s1);
        System.out.println(s3==s1);
        System.out.println(s3==name);
        System.out.println(s2.equals(s1));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(name));
    }
}
