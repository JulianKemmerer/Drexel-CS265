# this example assumes that you have your program in 3 files (you needn't):
# 	main.c
# 	qsort.c
# 	qsort.h
#
# You can change the variables to suit yourself.
#
# Note that, since Python is interpreted, you only *need* the run target;
# 	you may provide a test target
#
# To build and test your code, from the command line, just type:
# 	$ make test
#

### VARIABLES ##############

# The name of your program (the executable), stored in a variable
EXE = sort1
# the filename holding your test input
INPUT = ../testInput


### TARGETS ##############

# this is the target *I* need to grade your project
run : $(EXE)
	./$(EXE)	# just run, no input.  I'll provide it.

# you can use this target to run your program w/test data input you provide
# If the executable is not built (or you made changes) it will compile your
# code
test : $(EXE)
	./$(EXE) < $(INPUT)

# this just builds (compiles) your program; doesn't run it
build : $(EXE)

# this target will link the object files together, name the executable
$(EXE): main.o qsort.o
	gcc -o $(EXE) main.o qsort.o

# this target just compiles the main.c source file; doesn't link
main.o : main.c qsort.h
	gcc -c main.c

# this target just compiles the qsort.c source file; doesn't link
qsort.o : qsort.h qsort.c
	gcc -c qsort.c

.PHONY : clean
clean :
	-\rm *.o
	-\rm $(EXE)

