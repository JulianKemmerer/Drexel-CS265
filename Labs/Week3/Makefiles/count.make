
linecount : foo.c
	-[ -e linecount ] && rm linecount
	-wc -l foo.c > linecount

.PHONY : hey
hey :
	echo $$USER

