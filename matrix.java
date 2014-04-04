public int matrix(int a, int b, int c, int d, int count) {
a=a*a+b*c;
b=a*b+b*d;
c=a*c+c*d;
d=b*c+d*d;
count -= count;
if(count==0) {
System.out.println("A : "+a+"B : "+b+"C : "+c+"D : "+d);
return; }
matrix(a, b, c, d, count);

