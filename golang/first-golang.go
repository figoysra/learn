package main

import "fmt"

func main() {
	// Number
	fmt.Println("Angka", 3)

	// float
	fmt.Println("Angka Float", 3.5)

	// bool
	fmt.Println("Benar", true)

	//string
	fmt.Println("String Figo")

	//Menghitung jumlah karakter di string
	fmt.Println(len("Figo"))

	// Mengambil karakter pada posisi di tentu
	fmt.Println("Figo"[0])

	// variable
	var name string
	name = "Figo"
	fmt.Println(name)
	// or 
	var age = 21
	fmt.Println(age)
	// or
	country := "Jakarta"
	fmt.Println(country)
	//or
	var(
		first_name string,
		last_name string
	)

	
}
