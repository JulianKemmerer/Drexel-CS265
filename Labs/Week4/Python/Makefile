LAB = l4
FILES = s1.py s2.py id.py id2.py parsePhoneNrs.py
.PHONY : run

run :
	-@[ -r $(LAB) ] || echo "can't find $(LAB)"
	-@echo "Checking files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ ! -r $$i ] ; then \
				echo "can't find $$i" ; \
			fi ; \
		done
	-@echo "Done!"

