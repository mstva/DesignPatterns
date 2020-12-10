package behavior

type FlyBehavior interface {
	Fly()
}

type FlyWithWings struct {
	DuckName string
}

type FlyNoWay struct {
	DuckName string
}

func (fw FlyWithWings) Fly() {
	println(fw.DuckName + " is flying with wings")
}

func (fn FlyNoWay) Fly() {
	println(fn.DuckName + " is not flying")
}


