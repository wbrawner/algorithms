#include "util.hpp"
#include <algorithm>
#include <format>
#include <fstream>
#include <iostream>
#include <string>
#include <vector>

std::vector<std::string> Util::read_file(std::string path) {
  std::ifstream in{path};
  if (!in.is_open()) {
    auto message = std::format("Failed to read {}", path);
    std::cerr << message << std::endl;
    throw message;
  }

  std::vector<std::string> lines;
  std::string line;
  while (std::getline(in, line)) {
    lines.push_back(line);
  }
  in.close();
  return lines;
}

std::vector<int> Util::numbers(std::string path) {
  std::vector<int> numbers;
  for (auto line : read_file(path)) {
    int number = std::stoi(line);
    numbers.push_back(number);
  }
  return numbers;
}
