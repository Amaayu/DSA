#include <iostream>
#include <vector>
using namespace std;

// vector<int> arryRevers(vector<int> &, int);

vector<int> arryRevers(vector<int> &vec, int size)
{
    int start = 0, end = size - 1, temp = 0;
    for (int i = 0; start <= end; i++)
    {
        temp = vec[start];
        vec[start] = vec[end];
        vec[end] = temp;
        start++;
        end--;
    }
}
int main()
{
    vector<int> vec = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    arryRevers(vec, 9);
    for (int val : vec)
    {
        cout << val << ",";
    }
    return 0;
}