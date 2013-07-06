cc = gcc

.PHONY : clean

run : blah
	-./blah

blah : main.o bar.o
	$(cc) -oblah main.o bar.o

main.o : main.c bar.h
	$(cc) -c main.c

bar.o : bar.c bar.h
	$(cc) -c bar.c

clean :
	-\rm *.o
	-\rm blah
