#ifndef UTIL_H
#define UTIL_H

#include <vector>
#include <iostream>

inline void print(const std::vector<int> &list)
{
    std::cout << "[";
    for (size_t i = 0; i < list.size(); i++)
    {
        std::cout << list[i];
        if (i + 1 < list.size())
            std::cout << ", ";
    }
    std::cout << "]\n";
}

#endif