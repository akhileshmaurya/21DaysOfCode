package main

import (
	"bytes"
	"crypto/sha256"
	"strconv"
	"time"
	"log"
)


type CryptoBlock struct {
	Timestamp     int64
	Data          []byte
	PrevBlockHash []byte
	Hash          []byte
}

func main(){
	log.Println("In Main Function");
}
