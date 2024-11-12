#include <iostream>
using namespace std;

int main()
{
    int n;
    int k = 1;

    cout << "Enter the number of lines" << endl;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {

        for (int j = 1; j <= i; j++)
        {
            cout << k;
            cout << " ";
            k++;
        }
        cout << endl;
    }
    return 0;
}
