#include<iostream>
using namespace std;

int findkey(int a, int b, int c){
	int th, th1, th2, th3;
	int h, h1, h2, h3;
 	int t, t1, t2, t3;
 	int u, u1, u2, u3;
  	int result{0};
  	if((a>=1000 && a<=9999) && (b>=1000 && b<=9999) && (c>=1000 && c<=9999)){
        th1 = a/1000;
        th2 = b/1000;
        th3 = c/1000;
        if(th1<=th2 && th1<=th3) th = th1;
      	else if(th2<=th1 && th2<=th3) th= th2;
      	else th = th3;
      	result = result + th*1000;
        h1 = (a/100) %10;
        h2 = (b/100) %10;
        h3 = (c/100) %10;
        if(h1>=h2 && h1>=h3) h = h1;
      	else if(h2>=h1 && h2>=h3) h= h2;
      	else h = h3;
      	result = result + h*100;
        t1 = (a/10) %10;
        t2 = (b/10) %10;
        t3 = (c/10) %10;
        if(t1<=t2 && t1<=t3) t = t1;
      	else if(t2<=t1 && t2<=t3) t= t2;
      	else t = t3;
      	result = result + t*10;
      	u1 = a%10;
        u2 = b%10;
        u3 = c%10;
        if(u1>=u2 && u1>=u3) u = u1;
      	else if(u2>=u1 && u2>=u3) u= u2;
      	else u = u3;
      	result = result + u;
    }
  	return result;
}

int main()
{
	int a, b, c, result;\
    cin >> a>> b>> c;
  	result = findkey(a, b, c);
  	cout << result << endl;
  	return 0;
}