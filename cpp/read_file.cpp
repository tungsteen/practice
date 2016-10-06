#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
    int nmb;
    string line;
    ifstream myfile ("../data/numbers.txt");
    if (myfile.is_open())
    {
        while ( getline (myfile, line) )
        {
            try
            {
                nmb = stoi(line);
                cout << nmb << endl;
            }
            catch (exception e)
            {
                cout << line << " cant be parsed" << endl;
            }
        }
        myfile.close();
    }
    else 
    {
        cout << "cant open file" << endl;
    }
    return 0;
}
