#include <iostream>
using namespace std;
typedef struct complex{
	int real, img;
}complex;

complex add_complex(complex &num1, complex &num2){
	complex res;
  	res.real = num1.real + num2.real;
  	res.img = num1.img + num2.img;
  	return res;
}

complex sub_complex(complex &num1, complex &num2){
	complex res;
  	res.real = num1.real - num2.real;
  	res.img = num1.img - num2.img;
  	return res;
}

complex mul_complex(complex &num1, complex &num2){
	complex res;
  	res.real = (num1.real*num2.real) - (num1.img*num2.img);
  	res.img = (num1.real*num2.img) + (num1.img*num2.real);
  	return res;
}

int main() 
{
	complex num1, num2, res;
  	int sel;
  	cin >> sel;
  	cin >> num1.real >> num1.img;
  	cin >> num2.real >> num2.img;
	switch(sel){
        case 1:
            res = add_complex(num1, num2);
            if(res.img < 0)
                cout << res.real << res.img << "i"<<endl;
            else
                cout << res.real <<"+" <<res.img << "i"<<endl;
            break;     
        case 2:
            res = sub_complex(num1, num2);
            if(res.img < 0)
                cout << res.real << res.img << "i"<<endl;
            else
                cout << res.real <<"+" <<res.img << "i"<<endl;
            break;

        case 3:
            res = mul_complex(num1, num2);
            if(res.img < 0)
                cout << res.real << res.img << "i"<<endl;
            else
                cout << res.real <<"+" <<res.img << "i"<<endl;
            break;	
        default:
            cout << "Invalid choice"<< endl;
            break;
    } 
  	return 0;
}