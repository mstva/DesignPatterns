package main

import "fmt"

type Duck struct { Name string }

type MollardDuck struct { Duck }

type RedheadDuck struct { Duck }

func (duck *Duck) quack()  { fmt.Printf("%s is quacking\n", duck.Name) }

func (duck *Duck) swim()  { fmt.Printf("%s is swimming\n", duck.Name) }

func (duck *Duck) display()  { fmt.Printf("I am a %s\n", duck.Name) }

func main() {
	mollard := MollardDuck{}
	mollard.Name = "Mollard Duck"
	mollard.display()
	mollard.quack()
	mollard.swim()

	redhead := RedheadDuck{}
	redhead.Name = "Redhead Duck"
	redhead.display()
	redhead.quack()
	redhead.swim()
}