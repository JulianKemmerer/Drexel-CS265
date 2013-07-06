FILES = l6

.PHONY : run

run :
	-@echo "Checking for files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ ! -r $$i ] ; then \
				echo "can't read $$i" ; \
			else \
				echo "Looking at $$f:" ; \
				cat "$$i" ; \
			fi ; \
		done
	-@ echo "Done!"

