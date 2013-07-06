cc=gcc
ccFlags=
trashDir=$$HOME/trash

.PHONY : run runAnagram testAnagram testRm runRm

run : testAnagram testRm

runAnagram : anagram sign squash
	./anagram

testAnagram : anagram sign squash
	./anagram

sign : sign.c
	$(cc) $(ccFlags) -osign sign.c

testRm : myRm
	./myRm
