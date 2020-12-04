#include "RedheadDuck.h"

#include <utility>

RedheadDuck::RedheadDuck(string name) : Duck(std::move(name)) {}
