#include "selection.hpp"
#include <iostream>

void selection(std::vector<int> &numbers) {
  for (int i = 0; i < numbers.size(); i++) {
    int min = i;
    for (int j = i; j < numbers.size(); j++) {
      int num = numbers.at(j);
      if (num < numbers.at(min)) {
        min = j;
      }
    }
    int swap = numbers.at(i);
    numbers.at(i) = numbers.at(min);
    numbers.at(min) = swap;
  }
}
