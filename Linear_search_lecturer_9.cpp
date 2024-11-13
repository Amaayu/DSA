#include <iostream>
#include <vector>
using namespace std;
int linearSearch(vector<int> &vec, int target);
int main()
{
  vector<int> vec = {4, 82, 45, 23, 98, 65, 76, 45};
  int target = 76;

  int value = linearSearch(vec, target);

  cout << value << endl;
}
int linearSearch(vector<int> &vec, int target)
{
  short int a = 0;
  for (int valu : vec)
  {
    a++;
    if (valu == target)
      return a - 1;
  }
  return -1;
}