#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    // Using endl manipulator to end the line
    cout << "Hello" << endl;
    cout << "World" << endl;
    // Using ends manipulator to insert a null character
    cout << "Hello" << ends;
    cout << "World" << endl;
    // Using ws manipulator to consume any leading white space
    string name;
    getline(cin>>ws,name);
    cout<<name<<endl;
    // Using flush manipulator to flush the output buffer
    cout << "Hello";
    cout.flush();
    cout << "World" << endl;
    // Using setw and setfill manipulators to set width and fill character
    cout << setw(10) << setfill('*') << "Hello" << setw(10) << setfill('*') << "World" << endl;
    // Using setprecision manipulator to set floating-point precision
    double pi = 3.14159265358979323846;
    cout << setprecision(5) << pi << endl;
    return 0;
}
