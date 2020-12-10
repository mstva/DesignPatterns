package client

import fw "duck/behavior"

type MallardDuck struct {
	Duck
	DuckName string
}

func (md MallardDuck) init(duckName string) {
	md.DuckName = duckName
	FlyB = fw.FlyWithWings{DuckName: md.DuckName}
}
