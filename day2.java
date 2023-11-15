public class day2 {
    public static void main(String[] args)

    {
        int x = 5;
        x += 3; // x =3 ,x=5+3

        System.out.println(x);

        int y = 5;
        y &= 2; // y=5 ,y=y&3 works in 0&1
        System.out.println(y);

        int z = 5;
        z |= 3;
        System.out.println(z); // z=5,z= z|3

        int a = 5;
        a ^= 3;
        System.out.println(a);

        int b = 5;
        b >>= 3; // bitwise operators
        System.out.println(b);

        int c = 5;
        c <<= 3;
        System.out.println(c);

        int d = 5;
        System.out.println(d > 3 && d < 10);

        // returns true because 5 is greater than 3 AND 5 is less than 10

        int e = 5;
        System.out.println(e > 3 || e < 4);

        // returns true because one of the conditions are true (5 is greater than 3, but
        // 5 is not less than 4)

        int f = 5;
        System.out.println(!(f > 3 && f < 10));
        // returns false because ! (not) is used to reverse the result

    }