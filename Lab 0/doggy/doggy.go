package doggy

import (
	"math/rand"
)

type Dog struct {
	Name  string
	Breed string
	Size  int
	Speed int
	Power int
}

var SeedName = [11]string{"Max", "Cooper", "Kobe", "Mac", "Tuzik", "Grivei", "Buddy", "Rex", "Barsik", "Laika", "Pufic"}
var SeedBreed = [2]string{"Quality", "Default"}

func GenerateDogs(amount int) [100]Dog {

	var a [100]Dog

	for i := 0; i < amount; i++ {

		a[i].Name = SeedName[rand.Intn(10)]
		a[i].Breed = SeedBreed[rand.Intn(2)]
		a[i].Size = rand.Intn(5)
		a[i].Speed = rand.Intn(100)
		a[i].Power = rand.Intn(500)

	}

	return a
}
