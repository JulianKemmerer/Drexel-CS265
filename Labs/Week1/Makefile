USER = kschmidt
FILES = vi_lab lab1 /home/$(USER)/public_html/index.html
.PHONY : run

run :
	-@echo "Checking for files: $(FILES)"
	-@for i in $(FILES) ; do \
			[ -r $$i ] || echo "can't find $$i" ; \
		done
	-@ echo "Done!"

