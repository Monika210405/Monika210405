#include <iostream>
#include <string>

int main() {
    std::string username;
    std::cout << "Please enter your name: ";
    std::getline(std::cin, username);
    std::cout << "Hello " << username << "!" << std::endl;
    return 0;
}
