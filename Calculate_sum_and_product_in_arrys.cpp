#include <iostream>
#include <vector>
using namespace std;
int calculateSum(vector<int> &);
double calculateProduct(vector<int> &);

int main()
{
    vector<int> vec = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    // int sum = calculateSum(vec);
    double prod = calculateProduct(vec);

    // cout << "sum all numbers : " << sum << endl;
    cout << " product all numbers:" << prod << endl;

    return 0;
}
int calculateSum(vector<int> &vec)
{

    // base case of recursion
    if (vec.empty())
        return 0;

    else
    {
        int first = vec[0];
        vec.erase(vec.begin());
        return first + calculateSum(vec);
    }
}

double calculateProduct(vector<int> &vec)
{

    // base case of recursion
    if (vec.empty())
        return 1;

    else
    {

        int first = vec[0];
        vec.erase(vec.begin());
        return first * calculateProduct(vec);
    }
}
