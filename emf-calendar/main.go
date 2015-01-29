package main

import (
	"bufio"
	"os"
	"strings"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		if strings.HasPrefix(scanner.Text(), "Content-Type: text/calendar") {
			os.Exit(0)
		}
	}
	if err := scanner.Err(); err != nil {
		os.Exit(-1)
	}

	os.Exit(1)
}
