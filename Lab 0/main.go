package main

import (
	"lab1/contest"
	"lab1/doggy"
	"math/rand"
	"time"
)

func main() {
	rand.Seed(time.Now().UnixNano())

	var Fluffy contest.NewContest

	Fluffy.StartContest(time.Now())

	var dogs [100]doggy.Dog = doggy.GenerateDogs(5)

	var FluffyShowdown contest.ContestShowdown
	FluffyShowdown.GetWinner(dogs)

	var FluffyResults contest.ContestResults
	FluffyResults.AnnounceWinner(FluffyShowdown)

}
