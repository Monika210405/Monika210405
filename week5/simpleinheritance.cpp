#include<iostream>

using namespace std;

class Parent
{
  Public:
    void displayBreed()
    {
      cout<<”I belong to the omnivore type.\nI belong to genus Homo.\n”;
    }
    void eat()
    {
      cout<<”I eat both plants and meat.\n”;
    }

};

class Child: public Parent
{
  public:
    void play()
    {
      cout<<”I play a lot.\nIt helps me to relax my body and sharpen my brain.\n”;
    }
    void skills()
    {
      cout<<”With skills i learn,I can do whatever i want.\n”;
    }
};

int main()
{
  //Parent obj;
  Child obj;
  obj.displayBreed();
  obj.eat();
  obj.play();
  obj.skills();
  return 0;
}
