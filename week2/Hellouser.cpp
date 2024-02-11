#include <iostream>
#include <string>

int main() {
    std::string username;

    // Prompting the user to enter their name
    std::cout << "Please enter your name: ";
    std::getline(std::cin, username);

    // Displaying the greeting message
    std::cout << "Hello " << username << "!" << std::endl;

    return 0;
}
