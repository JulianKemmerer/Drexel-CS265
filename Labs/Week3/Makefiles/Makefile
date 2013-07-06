cc = gcc
EXE = foo
JAVAC = javac
JRE = java
PAGER = less
TEST_OUT = test.out
EXP_OUT = expected.out
.PHONY : clean run-py run-c red run-java save-java test-java

foo.o : foo.c foo.h
	$(cc) -c foo.c

main.o : main.c foo.h
	$(cc) -c main.c

$(EXE) : foo.o main.o
	$(cc) -o$(EXE) main.o foo.o

run-c : $(EXE)
	./$(EXE)

run-py : foo.py
	python foo.py

read : 
	if [ -e 'README' ]; then echo "#!/bin/bash" >> read; echo "cat README | $(PAGER)" >> read; chmod +x read ; echo "readme exists" ; fi

foo.class : foo.java
	$(JAVAC) foo.java

run-java : foo.class
	$(JRE) foo

save-java : foo.class
	$(JRE) foo > $(TEST_OUT)

test-java : $(TEST_OUT) $(EXP_OUT)
	if diff $(TEST_OUT) $(EXP_OUT) &> /dev/null ; then echo "passed!" ; else echo "Not the same!" ; fi

clean : 
	rm *.o *.class $(EXE) $(TEST_OUT)
