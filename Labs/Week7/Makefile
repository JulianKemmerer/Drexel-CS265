FILES = prob1.java prob2.java prob3.java prob4.java

.PHONY : run

run :
	-@echo "Checking for files: $(FILES)"
	-@for i in $(FILES) ; do \
			if [ ! -r $$i ] ; then \
				echo "can't read $$i" ; \
			fi ; \
		done
	-@if [ ! -r build.xml ] ; then \
			echo "Can't find build.xml!" ; \
		else \
			echo -e "RUNNING YOUR FILES:\n" ; \
			j=1 ; \
			while [ $$j -lt 5 ] ; do \
				echo "prob$$j" ; \
				echo "=====" ; \
				ant prob$$j ; \
				j=`expr $$j + 1` ; \
			done ; \
		fi
	-@ \rm *.class
	-@ echo "Done!"

