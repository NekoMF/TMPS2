package contest

import (
	"fmt"
	"lab1/doggy"
	"time"
)

type NewContest struct {
	Prize int
	Date  time.Time
	Seats int
}

type ContestShowdown struct {
	NumberOfDogs int
	WorldRecord  bool
	Winner       doggy.Dog
}

type ContestResults struct {
	FinalSpeech      string
	MoneyTransaction string
}

func (c *NewContest) StartContest(d time.Time) {
	c.Prize = 3500
	c.Date = d
	c.Seats = 400

}

func (c *ContestShowdown) GetWinner(d [100]doggy.Dog) {
	c.Winner = d[DogEvaluation(d)]

	c.WorldRecord = false
	c.NumberOfDogs = 100

}

func DogEvaluation(d [100]doggy.Dog) int {
	var points [100]int
	var maxScore int = 0
	var index int

	for i := range d {
		points[i] = 200*d[i].Size + 5*d[i].Speed + 3*d[i].Power
		if maxScore <= points[i] {
			maxScore = points[i]
			index = i
		}

	}

	return index
}

func (c *ContestResults) AnnounceWinner(battle ContestShowdown) {
	fmt.Println(battle.Winner)
}
