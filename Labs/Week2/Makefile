LAB = lab2
FILES = count.bash reextend organiseMusic
.PHONY : run

run :
	-@[ -r $(LAB) ] || echo "can't find $(LAB)"
	-@echo "Checking files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ -r $$i ] ; then \
				echo "$$i..." ; \
				bash -n $$i ; \
			else \
				echo "can't find $$i" ; \
			fi ; \
		done
	-@echo "Done!"

