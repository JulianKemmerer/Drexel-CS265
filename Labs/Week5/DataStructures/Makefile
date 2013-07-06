FILES = l4

.PHONY : run

run :
	-@echo "Checking for files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ ! -r $$i ] ; then \
				echo "can't read $$i" ; \
			else \
				cat "$$i" ; \
			fi \
		done
	-@ echo "Done!"

