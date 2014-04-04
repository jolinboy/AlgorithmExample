class matrixtest {
public static int oa=2;
public static int ob=-1;
public static int oc=4;
public static int od=-1;
public static int ocount=21;
public static void main(String args[]) {
matrix(oa, ob, oc, od, ocount);
}
public static void matrix(int a, int b, int c, int d, int count) {
int ua, ub, uc, ud, ucount;
ua=(a*2)+(b*4);
ub=(a*-1)+(b*-1);
uc=(c*2)+(d*4);
ud=(c*-1)+(d*-1);
ucount=count-1;
if(count==1) {
System.out.println("A : "+a+" | "+"B : "+b+" | "+"C : "+c+" | "+"D : "+d);
return; }
matrix(ua, ub, uc, ud, ucount);
}
}
