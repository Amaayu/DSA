#include <iostream>
using namespace std;

int main()
{

    int n;
    cout << "Enter the length of pertern : ";
    cout << endl;
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i; j++)
        { // space print
            cout << " ";
            for (int k = 0; k < i; k++)
            { // stare print

                cout << k;
            }
        }
        cout << endl;
    }

    return 0;
}
