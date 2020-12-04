#include "MollardDuck.h"

#include <utility>

MollardDuck::MollardDuck(string name) : Duck(std::move(name)) {}