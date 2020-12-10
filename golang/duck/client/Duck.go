package client

import (
	fb "duck/behavior"
	"fmt"
)

var FlyB fb.FlyBehavior

type Duck struct { Name string }

func (duck Duck) Display() { fmt.Println("I am a " + duck.Name) }

func (duck Duck) Swim() { fmt.Println(duck.Name + " is swimming") }

func (duck Duck) PerformFly() {
	FlyB.Fly()
}
