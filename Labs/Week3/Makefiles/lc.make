
lc : foo.c
	-[ -f lc ] && \rm lc
	wc -l foo.c > lc

.PHONY : hey clean

hey :
	@echo "Kilroy was here"
	@echo "My name is $${USER}"

clean :
	-\rm lc
