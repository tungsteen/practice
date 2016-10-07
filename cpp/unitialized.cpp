#include <iostream>
#include <string>

class Dog
{
public:
    Dog()
    {
        std::cout << "Bark!" << std::endl;
    }
};

int main()
{
    int x;
    Dog* d;

    // just compile warning
    std::cout << x << std::endl;
    std::cout << d << std::endl;

    return 0;
}
