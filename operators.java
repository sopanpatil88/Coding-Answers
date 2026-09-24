class operators {
    public static void main(String[] args) {
        // int a = 27;                             3
        // int b = 4;
        // int x = a/b;
        // int y = a% b;
        // System.out.println(x);  //6
        // System.out.println(y);   //3
        // System.out.println(x+y);  // 9

        System.out.println("__________");

        // int a = 7;                              4
        // int b = 2;
        // double x = a/b;
        // double y = (double) a/b;

        // System.out.println(x);
        // System.out.println(y);

        // int a = 4;                               9
        // int b= 3;
        // int res = a++ * ++b;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(res);

        // int x = 10;                            10 
        // int a = x--;
        // int b = --x;
        // int c = x--;
        // System.out.println(x);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // int a = 5;
        // int b = 10;                          20
        // a++;
        // b--;
        // int c = a++ + ++b;
        // c += 5;
        // double d = c/2;
        // int e = (int) (c/2.0);
        // int res = (e > 10) ? e : e+5;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(res);

        // double d = 25.89;
        // int i = (int) d;                  17
        // byte b = (byte) i;
        // System.out.println(d);
        // System.out.println(i);
        // System.out.println(b); 

        // int x = 130;
        // byte b = (byte) x;
        // System.out.println(x);             //18
        // System.out.println(b);
        // x = 260;
        // b = (byte) x;
        // System.out.println(x);
        // System.out.println(b);

        // int a = 10;
        // double b = 3.5;
        // double x = a+b;                   // 19
        // int y = (int) ( a+b);
        // System.out.println(x);
        // System.out.println(y);

        // int x =10;                      // 13
        // int res = (x++ > 10) ? ++x : x++;
        // System.out.println(x);
        // System.out.println(res);

        // char ch = 'A';
        // int x = ch + 5;                  //14
        // char y = (char) (ch + 5);
        // System.out.println(x);
        // System.out.println(y);

        // int a = 5;
        // int x = a++;
        // int y = ++a;                    //7

        // System.out.println(a);
        // System.out.println(x);
        // System.out.println(y);

        // int a = 5;
        // int b = a++ + ++a + a++;          //8
        // System.out.println(a);
        // System.out.println(b);

        // int x = 10;
        // x += 5;                    //5
        // x *= 3;
        // x -= 7;
        // x /= 2;

        // System.out.println(x);


        // int x = 25;
        // x %= 7;
        // x += 3;                // 6
        // x *= 2;

        // System.out.println(x);

        // int a= 66;
        // char ch1 = (char) a;   // 15
        // char ch2= (char) (a+2);
        // System.out.println(ch1);
        // System.out.println(ch2);

        // byte b = 20;
        // int i = b;
        // double d = i;           // 16

        // System.out.println(b);
        // System.out.println(i);
        // System.out.println(d);

        // int a = 15;
        // int b = 10;
                                         //11
        // boolean x = a > b;
        // boolean y = a == b;
        // boolean z = a != b;

        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        // int a = 25;
        // int b = 40;
        // int res = a> b ? a:b;
        // System.out.println(res);

        // int a = 4;
        // int b = 7;
        // boolean x = a++ < b && ++a == 6;
        // int c = x ? a+ b++ : b- a++;
        // boolean y = b > c || a==7;
        // System.out.println(a+ " " + b + " " + c + " " + x + " " + y);

        // byte a = 120;
        // int b = a+10;
        // short c= (short) (b*300);
        // char d = (char) c;
        // int e  = d + (byte) c;
        // System.out.println(b + " " + c + " " + d + " " + e);

        // int a = 9;
        // double b = 4.8;
        // double x = a% 2==1 ? a : b;
        // int y = (int) (x*2);
        // char z = (char) (y+60);
        // System.out.println(x + " " + y + " " +z );

        // int a = 5,b= 2,c=3;
        // int x = a + b * c - a % b;
        // int y = (a+b) * c -a % b;
        // int z = (a+b) *(c-a) % b;

        // System.out.println(x + " " + y + " " + z);

        // int a = 4;
        // int x = a++ + ++a * a--;
        // int y = --a + a++ * ++a;
        // System.out.println(a + " " + x + " " + y);

        // int a = 3,b=5,c=7;
        // boolean x = a++ < b && ++b < c || c-- > a;
        // boolean y = !(a==b) && (b++ >= c || --c < a);
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y);

        // byte a = 100;
        // a += 30;
        // a *= 2;
        // a -= 50;
        // int b = a;
        // short c = (short) (b * 5);
        // System.out.println(a + " " + b + " " + c);

        // int a = 12,b = 5;
        // double c = 2.5;
        // int x = (int) (a/c);
        // boolean y = x++ < b || ++a % 3 == 1;
        // double z = y ? a+c: b-c;
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y + " " + z);

        // int a = 6,b=10,c=14;
        // int x = a++ < b ? ++b : --c;
        // int y = b > c ? c++ : a++;
        // int z = x > y ? x-y : y-x;
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y + " " + z);

        // byte a = 127;
        // a++;
        // int b = a+130;
        // boolean x = a<0;
        // boolean y = b > 100;
        // System.out.println(a + " " + b + " " + x + " " + y);

        // double a = 514.99;
        // int b = (int) a;
        // short c = (short) b;
        // byte d = (byte) c;
        // char e = (char) d;
        // int f = e+d;
        // System.out.println(b + " " +c + " " + d + " " + (int) e + " " + f);

        // int a = 3, b = 4, c=5;
        // int x = a += b *= c;
        // int y = c -= a /= 2;
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y);

        // int a = 7;
        // float b = 2.5f;
        // double c = 4.2;
        // double x = a++ % 3 == 1 ? b * ++a : c / --a;
        // int y = (int) x + (a > 8 ? 2 : 3);
        // System.out.println(a + " " + b + " " + c + " " + x + " " +y);

        // int a = 2, b = 4, c = 6;
        // boolean x = a++ > 5 && ++b > 4 || c-- == 6;
        // boolean y = (a > 2 || ++b > 10) && (--c < a);
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y); 

        // byte a = 10;
        // int b = 20;
        // double c = 3.5;
        // a += b++ % 7;
        // int x = (int) (c * ++a);
        // boolean y = x > b && (a++ < 15 || ++b > 25);
        // double z = y ? x/2.0 : b-c;
        // System.out.println(a + " " + b + " " + c + " " + x + " " + y + " " + z) ; 

        // char ch = 'H';
        // byte a = 120;
        // int b = ch + a++;
        // double c = (double) (b % 10) / 4;
        // boolean x = (++a < 0) || (b++ > 190 && ++ch > 'H');
        // int d = x ? (int)(c * 10) : (int)ch-a;
        // System.out.println(ch + " " + a + " " + b + " " + c + " " + x + " " + d) ; 

        // int a = 6;
        // int b = 10;
        // int c = 14;
        // double d = 2.5;
        // boolean x = (a++ < b && b++ < c) || (--c < a);
        // int p = (int) (d*a) + b%3;
        // double q = x ? p+d : (c-- * d)-d;
        // System.out.println(a + " " + b + " " + c + " " + d + " " + x + " " + p + " " + q) ; 

        // int a = 11;
        // int b= 4;
        // boolean x = a % b == 3;
        // boolean y = a/b > 2;
        // boolean z= x && y;
        // System.out.println(x + " " + y + " " + z);

        // int a = 6;
        // int b = 9;
        // int c = 12;

        // boolean x  = a < b && b < c || a==c;
        // boolean y = !(a> b) && (c%b == 3);
        // System.out.println(x + " " + y);








    }
}