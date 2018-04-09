
#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {
  uint64_t n, k, A, B;
  cin >> n >> k >> A >> B;
  
  uint64_t step1 = (n-1)*A;

  // step2 
  uint64_t start = n;
  uint64_t dec = 0;
  uint64_t div = 0;
  while(true) {
    uint64_t amari = start%k;
    dec+=amari;
    start-=amari;
    div++;
    start = start/k;
    //cout << start << " "<< div << endl;
    if( start < k || k == 1) break;
  }
  if ( k != 1 ) {
    uint64_t step2 = (dec+start-1)*A + div*B;
    cout << min(step1, step2)<< endl;
  } else {
    cout << step1 << endl;
  }
}
