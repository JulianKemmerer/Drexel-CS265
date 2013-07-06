cc=gcc
CC=g++

csv1 : csvgetline1.o
	$(cc) -o $@ $<

csvgetline1.o : csvgetline1.c
	$(cc) -c $<

csv2 : csvgetline2.o
	$(cc) -o $@ $<

csvgetline2.o : csvgetline2.c
	$(cc) -c $<

CSV : csvgetline.o
	$(CC) -o $@ $<

csvgetline.o : csvgetline.cpp
	$(CC) -c $<

.PHONY : clean
clean :
	-\rm *.o
	-\rm csv1
	-\rm csv2
	-\rm CSV

