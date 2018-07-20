package main

import (
	"fmt"
	rotatelogs "github.com/lestrrat-go/file-rotatelogs"
	"log"
)

func main() {

	log.Println("In main Function Start")
	logFile, err := rotatelogs.New("/tmp/TestMyLogger-%Y-%m-%d.log",
		rotatelogs.WithLinkName("/tmp/TestMyLogger.log"),
		rotatelogs.WithMaxAge(15*24*time.Hour),
		rotatelogs.WithRotationTime(24*time.Hour),
	)
	if err != nil {
		log.Println("Error while creating/reading log file ")
	}
	defer logFile.Close()
	log.SetOutput(logFile)
	log.Println("In main Function")
}