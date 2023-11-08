#include <cstring>
#include <iostream>
#include <map>
#include "selection.hpp"
#include "../util.hpp"

int main(int argc, char* argv[]) {
    if (argc < 4) {
        std::cerr << "Usage: " << argv[0] << " <algorithm> <unsorted> <sorted>" << std::endl;
        return 1;
    }
    std::map<std::string, void(*)(std::vector<int>&)> sort_funcs {
        { "selection", selection },
    };
    if (!sort_funcs.contains(argv[1])) {
        std::cerr << "Sorting algorithm " << argv[1] << " not implemented" << std::endl;
        return 1;
    }
    auto sort_func = sort_funcs.at(argv[1]);
    auto unsorted = Util::numbers(argv[2]);
    auto sorted = Util::numbers(argv[3]);
    sort_func(unsorted);
    if (unsorted.size() != sorted.size()) {
        std::cerr << "Expected " << sorted.size() << " elements, found " << unsorted.size() << std::endl;
        return 1;
    }
    if (unsorted != sorted) {
        std::cerr << "Elements not properly sorted" << std::endl;
        for (auto num : unsorted) {
            std::cerr << num << " ";
        }
        std::cerr << std::endl;
        return 1;
    }
    return 0;
}
