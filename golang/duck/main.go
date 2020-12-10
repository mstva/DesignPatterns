package main

import c "duck/client"

func main() {

	var mallard = c.MallardDuck{DuckName: "MallardDuck"}
	mallard.Display()
	mallard.Swim()
	mallard.PerformFly()
}