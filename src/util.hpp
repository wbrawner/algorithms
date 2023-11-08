#ifndef UTIL_HPP
#define UTIL_HPP
#include <string>
#include <vector>

class Util {
public:
  static std::vector<std::string> read_file(std::string path);
  static std::vector<int> numbers(std::string path);
};

#endif
