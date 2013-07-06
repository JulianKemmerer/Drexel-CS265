# Makefile to build markov text generator program from
# Chapter 3 of The Practice of Programming by Kernighan and Pike
#

RM = /bin/rm
OBJECTS = markov.o eprintf.o
DRIVER = markov.c
cc = gcc
FLAGS =

markov: $(OBJECTS) 
	$(cc) $(FLAGS) -o markov $(OBJECTS)

markov.o: $(DRIVER) eprintf.h
	$(cc) $(FLAGS) -c $(DRIVER) -o markov.o

eprintf.o: eprintf.c eprintf.h
	$(cc) $(FLAGS) -c eprintf.c

fun :
	@-for i in a b c ; do \
echo $$i ; done

clean:
	- $(RM) -f $(OBJECTS)
	- $(RM) -f markov
