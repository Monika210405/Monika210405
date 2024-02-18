#include<iostream>
#include "areaBox.h"
#include "volumeBox.h"
using namespace std;

int main()
{
  float length,breadth,height;
  cout<<"Enter the length, breadth, and height : ";
  cin>>length>>breadth>>height;
  
  area(length,breadth,height);
  volume(length,breadth,height);
}
